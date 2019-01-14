package com.young.sys.badminton.service;

import com.young.sys.badminton.dao.ClubMapper;
import com.young.sys.badminton.dao.ClubMemberMapper;
import com.young.sys.badminton.dao.UserMapper;
import com.young.sys.badminton.domain.Club;
import com.young.sys.badminton.domain.ClubMember;
import com.young.sys.badminton.domain.User;
import com.young.sys.badminton.model.ClubModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author huyang8
 * // TODO: 2018/10/9  俱乐部service服务类
 */
@Service
public class ClubService {

    @Resource
    private ClubMapper clubMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private ClubMemberMapper clubMemberMapper;

    @Resource
    private ClubPhotoService clubPhotoService;

    public List<Club> selectAll(){
        return clubMapper.selectAll();
    }

    public Club selectById(Integer id){
        return clubMapper.selectById(id);
    }

    public Club selectByUserId(Integer userId){
        return clubMapper.selectByUserId(userId);
    }

    public void insert(Club club){
        clubMapper.insert(club);
    }

    public void update(Club club){
        clubMapper.update(club);
    }

    public void deleteById(Integer id){
        clubMapper.deleteById(id);
    }

    public ClubModel selectModelById(Integer id){
        Club club = clubMapper.selectById(id);
        ClubModel clubModel = new ClubModel();
        clubModel.setUser(userMapper.selectById(club.getUserId()));
        clubModel.setClub(club);
        clubModel.setClubMemberList(clubMemberMapper.selectByClubId(club.getId()));
        clubModel.setClubPhotoList(clubPhotoService.selectByClubId(club.getId()));
        return clubModel;
    }

    public ClubModel selectModelByUserId(Integer userId){
        Club club = clubMapper.selectByUserId(userId);
        if(club!=null){
            User user = userMapper.selectById(userId);
            List<ClubMember> clubMemberlist = clubMemberMapper.selectByClubId(club.getId());
            ClubModel clubModel = new ClubModel();
            clubModel.setUser(user);
            clubModel.setClub(club);
            clubModel.setClubMemberList(clubMemberlist);
            return clubModel;
        }else{
            return null;
        }
    }

    public List<ClubModel> selectAllClubModel(){
        List<ClubModel> clubModelList = new ArrayList<>();
        List<Club> clubList = clubMapper.selectAll();
        if(clubList!=null&&clubList.size()>0){
            for(Club club : clubList){
                clubModelList.add(selectModelById(club.getId()));
            }
        }
        return clubModelList;
    }
}
