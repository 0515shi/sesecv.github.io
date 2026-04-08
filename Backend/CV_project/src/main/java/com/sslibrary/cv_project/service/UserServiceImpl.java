package com.sslibrary.cv_project.service;

import com.sslibrary.cv_project.dao.User_dao;
import com.sslibrary.cv_project.entity.MsgContent;
import com.sslibrary.cv_project.entity.ReqVoByUserMsg;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    User_dao userDao; //mapper to db

    public String addContactMe(ReqVoByUserMsg reqVoByUserMsg, HttpSession session){

        userDao.insert(reqVoByUserMsg.getName(), reqVoByUserMsg.getEmail(), reqVoByUserMsg.getInquiry());

        return "SUCCESS";
    }
}
