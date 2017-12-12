package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.Entity.Student;

public class ClientApp {

	public static void main(String[] args) throws Exception {
		//get the configuration of spring bean
	ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	//get the bean or call the bean
		Object ob1=ctx.getBean("stud");
//call the domain or entity class for operations
//downcaat to student type
		Student t1=(Student)ob;
		System.out.println("\n************************************************************************************************************");
		System.out.println("\n\n\t"+ob);
		
		System.out.println("\n\n\t\tPROGRAM BY PRATIK DIMBLE");
	}//main() close
}//class close
