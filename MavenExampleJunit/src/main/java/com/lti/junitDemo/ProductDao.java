package com.lti.junitDemo;

import java.util.ArrayList;
import java.util.List;



public class ProductDao {

	List<Product> myList= new ArrayList<Product>();

	public boolean addProduct(Product product)
	{
		if(product.getPrdId() == 0 && product.getPrdName()== null)
		{
			System.out.println("first if ");
			throw new IllegalArgumentException();
		}

		if(myList.contains(product))		
		{
			System.out.println("second if ");
			return false;
		}
		else
		{
			System.out.println("else");
			myList.add(product);
			return true;
		}


	}
}