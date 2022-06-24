package edu.shopping;

public class User {
	
	
	int age;
	ProdPojo p1;  //THIS IS A DATATYPE OF PRODUCT POJO(user defined type)
	User(int age,ProdPojo p1){
		
		this.age=age;
		this.p1=p1;
	}
	@Override
	public String toString() {
		return "User [age=" + age + ", p1=" + p1 + "]";
	}

}
