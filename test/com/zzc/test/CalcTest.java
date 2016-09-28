package com.zzc.test;

import static org.junit.Assert.*;
import org.junit.Test;
import com.zzc.www.Calculator;

public class CalcTest {

	@Test
	public void testGetValue1() {
		int x=10,y=20;
		int expected=30;
		int actual=new Calculator().getValue(x,y);
		assertEquals(expected,actual);
	}
	@Test
	public void testGetValue2() {
		int x=30,y=20;
		int expected=10;
		int actual=new Calculator().getValue(x,y);
		assertEquals(expected,actual);
	}

}
