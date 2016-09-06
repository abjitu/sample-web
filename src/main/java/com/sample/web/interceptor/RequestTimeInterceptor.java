package com.sample.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.MDC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RequestTimeInterceptor extends HandlerInterceptorAdapter {
	private static final Logger LOG = LoggerFactory.getLogger(RequestTimeInterceptor.class);

	private final static String REQUEST_START_TIME = "requestStartTime";

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		LOG.trace("inside preHandle");
		addRequestStartTime(request);
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		long startTime = (Long) request.getAttribute(REQUEST_START_TIME);
		long endTime = System.currentTimeMillis();

		long executeTime = endTime - startTime;

		LOG.info("Request Served in {} milli seconds", executeTime);
	}

	private void addRequestStartTime(HttpServletRequest request) {
		long startTime = System.currentTimeMillis();
		MDC.put("CONTEXT_ID", RandomStringUtils.randomAlphanumeric(6) + startTime);
		request.setAttribute(REQUEST_START_TIME, startTime);

		LOG.debug("Request start time is {}", startTime);
	}

}