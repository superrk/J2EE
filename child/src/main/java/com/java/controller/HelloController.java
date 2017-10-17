package com.java.controller;

import com.jfinal.core.Controller;

/**
 * @author: rongkai  Date: 2017/10/17 Time: 10:34 Version: 1.0
 */
public class HelloController extends Controller {
	public void index(){
		renderText("hi");
	}
	public void login(){
		System.out.println("你好");
		renderText("Hello world");
	}
}
