package com.juxta.services;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created  on 3/27/2018.
 */
@Service
public class LogOffService {

    public boolean logOffSession(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        boolean response = false;

        try {
            httpServletRequest.getSession().invalidate();
            response = true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return response;
    }

}
