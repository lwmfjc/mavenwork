package com.bjpowernode;
//�����
import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven{
	@Test
	//�����������Ĳ��Է�����ÿ���������Ƕ�����
	public void testAddNumber(){
		System.out.println("ִ���˲��Է���testAddNumber");
		HelloMaven hello=new HelloMaven();
		int res=hello.addNumber(10,20);
		//�Ѽ�����res����junit�ж�
		//����ֵ��ʵ��ֵ
		Assert.assertEquals(30,res);
		
	}
}