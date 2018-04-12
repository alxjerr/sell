package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 	 SpringBoot项目的Bean装配默认规则是根据Application类所在的包位置从上往下扫描！
	 “Application类”是指SpringBoot项目入口类。这个类的位置很关键：
	 如果Application类所在的包为：com.boot.app，则只会扫描com.boot.app包及其所有子包，
 	 如果service或dao所在包不在com.boot.app及其子包下，则不会被扫描！
	 即, 把Application类放到dao、service所在包的上级，com.boot.Application
 */

@SpringBootApplication
public class SellApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellApplication.class, args);
	}
}
