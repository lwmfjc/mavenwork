package com.bjpowernode;
//导入包
import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven{
	@Test
	//定义多个独立的测试方法，每个方法都是独立的
	public void testAddNumber(){
		System.out.println("执行了测试方法testAddNumber");
		HelloMaven hello=new HelloMaven();
		int res=hello.addNumber(10,20);
		//把计算结果res交给junit判断
		//期望值，实际值
		Assert.assertEquals(30,res);
		
	}
}