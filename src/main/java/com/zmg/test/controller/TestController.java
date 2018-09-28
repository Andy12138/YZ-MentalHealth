package com.zmg.test.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zmg.test.service.TestService;

@RestController
public class TestController {
	
	private static final Logger LOG = Logger.getLogger(TestController.class);

	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/show")
	public String show() {
		try {
			return testService.show();
		} catch (Exception e) {
			LOG.error("show",e);
		}
		return null;
	}
	
	@RequestMapping(value = "/getTestList")
	public List<Map<String, Object>> getTestList() {
		try {
			return testService.getTestList();
		} catch (Exception e) {
			LOG.error("getTestList",e);
		}
		return null;
	}
}
