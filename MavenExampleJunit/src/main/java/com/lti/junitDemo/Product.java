package com.lti.junitDemo;

public class Product {

	
		// TODO Auto-generated method stub
    private int prdId;
    private String prdName;
    private String brandName ="Lti Infotech";
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Product(int prdId, String prdName) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
	
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", brandName=" + brandName + "]";
	}
 
 
	}


