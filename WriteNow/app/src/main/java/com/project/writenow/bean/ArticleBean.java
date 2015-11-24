package com.project.writenow.bean;

import java.util.List;

/**
 * Created by Minky on 2015/11/24.
 */
public class ArticleBean {
    public int id;
    public int createUserId;
    public String createTime;
    public String updateTime;
    public List<ChapterBean> chapters;
    public int markCount;
    public List<TagBean> tags;
    public String title;
    public String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarkCount() {
        return markCount;
    }

    public void setMarkCount(int markCount) {
        this.markCount = markCount;
    }

    public List<ChapterBean> getChapters() {
        return chapters;
    }

    public void setChapters(List<ChapterBean> chapters) {
        this.chapters = chapters;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(int createUserId) {
        this.createUserId = createUserId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<TagBean> getTags() {
        return tags;
    }

    public void setTags(List<TagBean> tags) {
        this.tags = tags;
    }
}
