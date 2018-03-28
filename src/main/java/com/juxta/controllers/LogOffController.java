package com.juxta.controllers;

import com.juxta.services.LogOffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Lakshman Bhupathi on 3/27/2018.
 */

@RestController
public class LogOffController {

    @Autowired
    private LogOffService logOffService;

    @RequestMapping(value = "/logOff", method = RequestMethod.GET)
    public boolean logOffController(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        return logOffService.logOffSession(httpServletRequest, httpServletResponse);
    }
}
