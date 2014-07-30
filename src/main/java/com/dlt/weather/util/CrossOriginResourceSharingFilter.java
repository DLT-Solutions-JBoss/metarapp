package com.dlt.weather.util;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.Filter;

public class CrossOriginResourceSharingFilter implements Filter {
        public void destroy() {
        }

        public static String VALID_METHODS = "DELETE, HEAD, GET, OPTIONS, POST, PUT";

        public void doFilter(ServletRequest req, ServletResponse resp,
                        FilterChain chain) throws ServletException, IOException {
                HttpServletRequest httpReq = (HttpServletRequest) req;
                HttpServletResponse httpResp = (HttpServletResponse) resp;
                try {
                        // No Origin header present means this is not a cross-domain request
                        String origin = httpReq.getHeader("Origin");
                        // DfLogger.debug(this.getClass(),"doFilter(): origin " + origin,
                        // null, null);
                        if (origin == null) {
                                // DfLogger.debug(this.getClass(),"doFilter(): origin == null ",
                                // null, null);
                                // Return standard response if OPTIONS request w/o Origin header
                                if ("OPTIONS".equalsIgnoreCase(httpReq.getMethod())) {
                                        httpResp.setHeader("Allow", VALID_METHODS);
                                        httpResp.setStatus(200);
                                        return;
                                }
                        } else {
                                // DfLogger.debug(this.getClass(),"doFilter(): origin != null ",
                                // null, null);
                                // This is a cross-domain request, add headers allowing access
                                // String validOrigins =
                                // ReadProperties.getInstance().getString("VALID_ORIGINS");
                                String validOrigins = "http://sportsroster-dltjbossmw.rhcloud.com";
                                // DfLogger.debug(this.getClass(),"doFilter(): validOrigins " +
                                // validOrigins, null, null);
                                if (validOrigins.indexOf(origin) > -1) {
                                        httpResp.setHeader("Access-Control-Allow-Origin", origin);
                                        httpResp.setHeader("Access-Control-Allow-Methods",
                                                        VALID_METHODS);
                                        // DfLogger.debug(this.getClass(),"doFilter(): header set",
                                        // null, null);
                                        String headers = httpReq
                                                        .getHeader("Access-Control-Request-Headers");
                                        if (headers != null)
                                                httpResp.setHeader("Access-Control-Allow-Headers",
                                                                headers);

                                        // Allow caching cross-domain permission
                                        httpResp.setHeader("Access-Control-Max-Age", "3600");
                                }
                        }
                        // DfLogger.debug(this.getClass(),"doFilter(): if origin complete",
                        // null, null);
                        // Pass request down the chain, except for OPTIONS
                        if (!"OPTIONS".equalsIgnoreCase(httpReq.getMethod())) {
                                // DfLogger.debug(this.getClass(),"doFilter(): chain.doFilter",
                                // null, null);
                                chain.doFilter(req, resp);
                        }
                } catch (Exception eee) {
                        // DfLogger.error(this.getClass(),"doFilter(): error " +
                        // eee.getMessage(), null, null);
                }
        }

        public void init(FilterConfig config) throws ServletException {
                // DfLogger.error(this.getClass(),"doFilter(): CrossOriginRequestSharingFilter initialized",
                // null, null);
        }

}
