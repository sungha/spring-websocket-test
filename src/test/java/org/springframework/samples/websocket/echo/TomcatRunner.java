package org.springframework.samples.websocket.echo;


import java.io.File;

import org.apache.catalina.startup.Tomcat;


public class TomcatRunner {

	public static void main(String[] args) throws Exception {
		Tomcat tomcat = new Tomcat();

		tomcat.setPort(8080);
		tomcat.addWebapp("/spring-websocket-test", new File("src/main/webapp").getAbsolutePath());

		tomcat.start();
		tomcat.getServer().await();
	}
}
