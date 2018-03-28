package com.juxta.filter;

import com.juxta.DAO.AdminDAO;
import org.jboss.logging.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static com.juxta.constants.CommonConstants.AUTH;
import static com.juxta.constants.CommonConstants.ROLE;
import static com.juxta.constants.CommonConstants.SUCCESSFUL;

/**
 * Created by Lakshman Bhupathi on 3/27/2018.
 */
public class AuthorisationFilter implements Filter {
    private static final Logger logger = Logger.getLogger(AuthorisationFilter.class);


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.debug(" In INIT() of " + this.getClass().getName());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        HttpSession httpSession = request.getSession();

        final String authLevel = (String) httpSession.getAttribute(AUTH);
        if (authLevel != null && authLevel.equals(SUCCESSFUL)) {
            final String role = (String) httpSession.getAttribute(ROLE);
            response.addHeader(ROLE,role);
        }

        filterChain.doFilter(request, response);

    }

    @Override
    public void destroy() {
        logger.debug(" In destroy() of " + this.getClass().getName());
    }
}
