package com.lti.junitdemo;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.junitDemo.MyApp;
import com.lti.junitDemo.Product;
import com.lti.junitDemo.ProductDao;

class MyAppTesr {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void testShow() {
		MyApp m = new MyApp();
		String msg = m.show();
		Assertions.assertEquals("Hello Maven",msg);
	}

//	@Test	
//	public void testForNull(){
//		String str1 = null;
//		String str2 = "Abs";
//		Assertions.assertNotNull(str1);
//	}

	@Test
	public void testAddProducts() {
		ProductDao dao = new ProductDao();
		Product p1 = new Product(101,"Mobile");
		//dao.addProduct(p1);
		Assertions.assertEquals(true, dao.addProduct(p1));
	}

	@Test
	public void testBrandName(){
		
		Product p1 = new Product(101,"Mobile");
		Assertions.assertEquals("LTI Infotech", p1.getBrandName());

	}

	@BeforeAll // once before running all test cases 
	public static void init() {		
		System.out.println("BeforeAll init() method called");
	}
	//sum = 0;
	
	@BeforeEach // before each and every test case 
	public void initEach() {
		System.out.println(" BEfore each");
		//sum = 0;
	}
	@AfterEach
	public void after1() {
		System.out.println(" After Each");
		
	}

	@AfterAll
	public static void testLast() {
		System.out.println("After All init() method called");
	}
}