package com.project.writenow.bean;

/**
 * Created by Minky on 2015/11/24.
 */
public class ChapterBean {
    public int id;
    public int createUserId;
    public String createTime;
    public String updateTime;
    public int preChapter;
    public int nextChapter;
    public String content;
    public int markCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(int createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public int getPreChapter() {
        return preChapter;
    }

    public void setPreChapter(int preChapter) {
        this.preChapter = preChapter;
    }

    public int getNextChapter() {
        return nextChapter;
    }

    public void setNextChapter(int nextChapter) {
        this.nextChapter = nextChapter;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMarkCount() {
        return markCount;
    }

    public void setMarkCount(int markCount) {
        this.markCount = markCount;
    }
}
