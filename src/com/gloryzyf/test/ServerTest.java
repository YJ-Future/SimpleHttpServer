package com.gloryzyf.test;

import java.io.IOException;

import com.gloryzyf.httpserver.SimpleHttpServer;

public class ServerTest {

	public static void main(String []args){
		SimpleHttpServer server=new SimpleHttpServer();
		SimpleHttpServer.setBasePath("G:\\server");
		SimpleHttpServer.setPort(2222);
		try {
			server.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//客戶端使用浏览器 url: http://localhost:2222/123.png
	}
}
