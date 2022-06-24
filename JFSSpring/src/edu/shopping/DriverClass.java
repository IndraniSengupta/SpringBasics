package edu.shopping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
	
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml"); //xml based configuration
		ProdPojo prod=(ProdPojo) context.getBean("prodPojoBean"); //fetch the bean(mention the bean)|
		                                                            //|we save the bean in a variable named "obj"
		Acc account=(Acc)context.getBean("AccBean"); 
		prod.setId(10);  //SETTING THE PROPERTIES IN DRIVER CLASS||WE CAN ALSO SET IT IN XML USING PROPERTY TAG
		account.setName("Indrani Sengupta");
		account.setAccNo(76432);
		account.setBankBalance(20000);
		
		

		System.out.println("PRODUCT ID: "+prod.getId());
		System.out.println("PRODUCT PRICE: "+prod.getPrice());
		System.out.println("PRODUCT NAME :"+prod.getProdName());
		System.out.println("ACCOUNT HOLDER: "+account.getName());
		System.out.println("ACCOUNT DETAILS: "+account);
		
		User Indrani=(User) context.getBean("UserBean");
		System.out.println(Indrani);
		
		//MAIN MOTIVE-CREATING A OBJECT TROUGH XML USING BEAN...NOT CREATING IBJECT DIRECTTLY
		//SCOPE="SINGLETON"-THE CLASS CAN HAVE ONLY 1 OBJECT
		//SCOPE="PROTOTYPE"-THE CLASS CAN HAVE DIFFERENT INSTANCE/OBJECT FOR DIFFERENT IDs
		//WHAT ARE THE TWO TYPES OF IOC CONTAINERS-APPLICATION CONTEXT &BEAN FACTORY
		//we are using apllicaion context here..Now if we want to change it to bean factory..just to improve the speed..I dont want backup..i need a fresh one..we use the command "lazy-init=true" as bean factory is very lazy...it only creates a bean when we tell it to create a bean

		
		
	}

}
