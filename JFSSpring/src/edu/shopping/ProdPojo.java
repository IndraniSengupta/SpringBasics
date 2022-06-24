package edu.shopping;



public class ProdPojo {
	
	int id;
	String prodName;
	double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProdPojo [id=" + id + ", prodName=" + prodName + ", price=" + price + "]";
	}
	
	}
	
	


