package com.ips.demo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		fghfghgfh;
		int d=50;
		return application.sources(TutorApplication.class);
		// change1
		//asd
		// change2
		// change 7
		// change 11
		// chnage 13
	}

}
