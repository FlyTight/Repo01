package com.bishe.Jour.bean;

import java.util.Date;

public class Journalism {
    private Integer titleId;

    private Integer sortId;

    private String title;

    private String content;

    private Date createTime;

    private Date updateTime;

    private Integer titleStatus;

    public Integer getTitleId() {
        return titleId;
    }

    public void setTitleId(Integer titleId) {
        this.titleId = titleId;
    }

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getTitleStatus() {
        return titleStatus;
    }

    public void setTitleStatus(Integer titleStatus) {
        this.titleStatus = titleStatus;
    }

    @Override
    public String toString() {
        return "Journalism{" +
                "titleId=" + titleId +
                ", sortId=" + sortId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", titleStatus=" + titleStatus +
                '}';
    }
}