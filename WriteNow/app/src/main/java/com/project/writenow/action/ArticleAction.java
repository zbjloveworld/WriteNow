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
    ���ݵ������ͱ�ǩ��ȡ�����б�
    tags����ǩ
    index��ҳ�룬��0��ʼ
    limit��ÿҳ������
     */
    public List<ArticleBean> getArticlesByMarkCount(List<TagBean> tags,int index,int limit){
        return null;
    }

    /*
    �������£����ش����õ�����
     */
    public ArticleBean createArticle(ArticleBean article){
        return null;
    }

    /*
    �޸�����
     */
    public ArticleBean updateArticle(ArticleBean article){
        return null;
    }

    /*
    �����½�
     */
    public ChapterBean createChapter(int createUserId,int preChapter,int nextChapter,String content){
        return null;
    }
}
