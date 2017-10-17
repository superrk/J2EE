package com.java.config;

import com.java.controller.HelloController;
import com.jfinal.config.*;
import com.jfinal.template.Engine;

/**
 * @author: rongkai  Date: 2017/10/17 Time: 10:36 Version: 1.0
 */
public class DemoConfig extends JFinalConfig {
	@Override
	public void configConstant(Constants me) {
		me.setDevMode(true);
	}

	@Override
	public void configRoute(Routes me) {
		me.add("/hello", HelloController.class);
	}

	@Override
	public void configEngine(Engine me) {

	}

	@Override
	public void configPlugin(Plugins me) {

	}

	@Override
	public void configInterceptor(Interceptors me) {

	}

	@Override
	public void configHandler(Handlers me) {

	}
}
