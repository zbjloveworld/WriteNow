package com.project.writenow.action;

import com.project.writenow.util.RetMessage;

/**
 * Created by Minky on 2015/11/22.
 */
public class UserAction {
    public String login(){
        return RetMessage.LOGIN_SUCCESS;
    }

    public String register(){
        return RetMessage.REGISTER_SUCCESS;
    }
}
