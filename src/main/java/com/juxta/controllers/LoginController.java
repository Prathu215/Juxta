package com.juxta.controllers;

import com.juxta.models.LoginModel;
import com.juxta.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created on 3/26/2018.
 */
@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String verifyCredentials(@RequestBody LoginModel loginModel, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        return loginService.verifyCredentials(loginModel,httpServletRequest,httpServletResponse);
    }

}
