package com.young.sys.badminton.api;

import com.young.sys.badminton.domain.ClubMember;
import com.young.sys.badminton.model.AjaxResult;
import com.young.sys.badminton.service.ClubMemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author huyang8
 * TODO: 2018/12/24  俱乐部成员api
 */
@Controller
@RequestMapping("/api/clubMember")
public class ClubMemberApi extends BaseApi{

    @Resource
    private ClubMemberService clubMemberService;

    @RequestMapping("/selectByClubId.do")
    @ResponseBody
    public AjaxResult selectByClubId(Integer clubId) {
        return successData(clubMemberService.selectModelByClubId(clubId));
    }

    @RequestMapping("/joinClub.do")
    @ResponseBody
    public AjaxResult joinClub(Integer userId,Integer clubId) {
        ClubMember clubMember = new ClubMember();
        clubMember.setClubId(clubId);
        clubMember.setUserId(userId);
        clubMember.setMemberLevel(0);
        clubMemberService.insert(clubMember);
        return success();
    }
}