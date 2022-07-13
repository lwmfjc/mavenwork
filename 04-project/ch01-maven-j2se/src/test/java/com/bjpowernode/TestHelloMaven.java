package com.bjpowernode;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {
    @Test
    public void testAddNumber1(){
        HelloMaven helloMaven=new HelloMaven();
        int res=helloMaven.addNumber(10,20);
        Assert.assertEquals(30,res);
    }
    @Test
    public void testAddNumber2(){
        HelloMaven helloMaven=new HelloMaven();
        int res=helloMaven.addNumber(30,20);
        Assert.assertEquals(50,res);
    }
}
