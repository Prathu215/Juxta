package com.juxta.services;

import com.juxta.models.LoginModel;
import com.juxta.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.juxta.constants.CommonConstants.AUTH;
import static com.juxta.constants.CommonConstants.UNSUCCESSFUL;
import static com.juxta.constants.CommonConstants.SUCCESSFUL;
import static com.juxta.constants.CommonConstants.ROLE;

/**
 * Created on 3/27/2018.
 */
@Service
public class LoginService {

    @Autowired
    private AdminRepository adminRepository;

    public String verifyCredentials(LoginModel loginModel, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        String result = UNSUCCESSFUL;

        try {
            if (loginModel.getPassword().equals(adminRepository.getPassword(loginModel.getEmail()))) {
                httpServletRequest.getSession().setAttribute(AUTH, SUCCESSFUL);
                httpServletRequest.getSession().setAttribute(ROLE, adminRepository.getRole(loginModel.getEmail()));
                return SUCCESSFUL;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
