package com.sslibrary.cv_project.service;


import com.sslibrary.cv_project.entity.ReqVoByUserMsg;
import jakarta.servlet.http.HttpSession;

public interface UserService{
    String addContactMe(ReqVoByUserMsg reqVoByUserMsg, HttpSession session);
}
