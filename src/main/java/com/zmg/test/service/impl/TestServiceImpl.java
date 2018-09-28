package com.zmg.test.service.impl;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zmg.test.dao.TestDao;
import com.zmg.test.service.TestService;
@Service
@Transactional
public class TestServiceImpl implements TestService {
	
	@Resource
	private TestDao testDao;

	@Override
	public String show() {
		return "Hello ZMG";
	}

	@Override
	public List<Map<String, Object>> getTestList() {
		return testDao.getTestList();
	}
	
	
}
