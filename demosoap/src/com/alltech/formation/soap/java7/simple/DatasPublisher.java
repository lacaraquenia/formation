package com.alltech.formation.soap.java7.simple;

import javax.xml.ws.Endpoint;

public class DatasPublisher {
	
	public static final String URI = "http://localhost:8888/datas" ;
			
	public static void main(String[] args) {
		DatasSoapJava7WS impl = new DatasSoapJava7WS();
		
		Endpoint endpoint = Endpoint.publish(URI, impl);
		
		boolean status = endpoint.isPublished();
		
		System.out.println("Web Service disponible ? " + status);
		
		
	}
}
