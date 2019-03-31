package com.slokam.first.stringutil;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

//@Component(this is used to create bean in configurable way)
//@ComponentScan(this is not used to create bean in configurable way

public class StringUtil {
	public void test(){
		System.out.println("Hello, I am from stringUtil....");
	}

}
