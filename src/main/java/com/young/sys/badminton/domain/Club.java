package com.young.sys.badminton.domain;

public class Club {
    private Integer id;

    private String clubName;

    private Integer clubUserId;

    private String clubLogo;

    private String clubMemo;

    private String clubAddress;

    private String clubQqGroup;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public Integer getClubUserId() {
        return clubUserId;
    }

    public void setClubUserId(Integer clubUserId) {
        this.clubUserId = clubUserId;
    }

    public String getClubLogo() {
        return clubLogo;
    }

    public void setClubLogo(String clubLogo) {
        this.clubLogo = clubLogo;
    }

    public String getClubMemo() {
        return clubMemo;
    }

    public void setClubMemo(String clubMemo) {
        this.clubMemo = clubMemo;
    }

    public String getClubAddress() {
        return clubAddress;
    }

    public void setClubAddress(String clubAddress) {
        this.clubAddress = clubAddress;
    }

    public String getClubQqGroup() {
        return clubQqGroup;
    }

    public void setClubQqGroup(String clubQqGroup) {
        this.clubQqGroup = clubQqGroup;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}