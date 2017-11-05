package com.mike.task.jspBoot.web.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class GeneratorImp implements Generator {

	@Override
	public String accountGenerator() {
		Random random = new Random();
		
		StringBuilder sb = new StringBuilder(12);
	    
	    for (int i = 0; i < 18; i++) {
	        sb = sb.append((random.nextInt(10)));
	        
	    }
	    
		return sb.toString();
	}
}
