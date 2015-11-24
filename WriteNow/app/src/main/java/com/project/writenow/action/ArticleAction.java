package com.project.writenow.action;

import com.project.writenow.bean.ArticleBean;
import com.project.writenow.bean.ChapterBean;
import com.project.writenow.bean.TagBean;

import java.util.List;

/**
 * Created by Minky on 2015/11/24.
 */
public class ArticleAction {
    /*
    根据点赞数和标签获取文章列表
    tags：标签
    index：页码，从0开始
    limit：每页文章数
     */
    public List<ArticleBean> getArticlesByMarkCount(List<TagBean> tags,int index,int limit){
        return null;
    }

    /*
    创建文章，返回创建好的文章
     */
    public ArticleBean createArticle(ArticleBean article){
        return null;
    }

    /*
    修改文章
     */
    public ArticleBean updateArticle(ArticleBean article){
        return null;
    }

    /*
    增加章节
     */
    public ChapterBean createChapter(int createUserId,int preChapter,int nextChapter,String content){
        return null;
    }
}
