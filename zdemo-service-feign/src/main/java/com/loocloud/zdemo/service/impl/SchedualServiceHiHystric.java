package com.loocloud.zdemo.service.impl;

import org.springframework.stereotype.Service;

import com.loocloud.zdemo.service.SchedualServiceHi;
@Service
public class SchedualServiceHiHystric implements SchedualServiceHi {

	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry "+name;
	}

}
