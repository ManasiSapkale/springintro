package com.springinto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
  

	public static void main( String[] args )
    {
    	
		ApplicationContext bf=new ClassPathXmlApplicationContext("spring.xml");
//    	
//    		
    		bike b=(bike)bf.getBean("bi");
    	System.out.println(b.getId()+" "+b.getName());
    
        	
    
    
    }
}
