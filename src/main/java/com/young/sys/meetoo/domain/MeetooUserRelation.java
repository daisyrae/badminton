package com.young.sys.meetoo.domain;

public class MeetooUserRelation {
    private Integer id;

    private Integer fanUserId;

    private Integer followUserId;

    private Integer status;

    private String createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFanUserId() {
        return fanUserId;
    }

    public void setFanUserId(Integer fanUserId) {
        this.fanUserId = fanUserId;
    }

    public Integer getFollowUserId() {
        return followUserId;
    }

    public void setFollowUserId(Integer followUserId) {
        this.followUserId = followUserId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}