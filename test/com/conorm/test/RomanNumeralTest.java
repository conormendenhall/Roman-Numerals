package com.conorm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.conorm.roman.RomanNumeral;

public class RomanNumeralTest {

	@Test
	public void shouldReturnIWhenPassed1() {
		
		String actual = "I";
		String expected = RomanNumeral.convert(1);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnIIWhenPassed2() {
		
		String actual = "II";
		String expected = RomanNumeral.convert(2);
		
		assertEquals(actual, expected);
	}

	@Test
	public void shouldReturnIVWhenPassed4() {
		
		String actual = "IV";
		String expected = RomanNumeral.convert(4);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnVWhenPassed5() {
		
		String actual = "V";
		String expected = RomanNumeral.convert(5);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnVIWhenPassed6() {
		
		String actual = "VI";
		String expected = RomanNumeral.convert(6);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnIXWhenPassed9() {
		
		String actual = "IX";
		String expected = RomanNumeral.convert(9);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnXWhenPassed10() {
		
		String actual = "X";
		String expected = RomanNumeral.convert(10);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnXIVWhenPassed14() {
		
		String actual = "XIV";
		String expected = RomanNumeral.convert(14);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnXIXWhenPassed19() {
		
		String actual = "XIX";
		String expected = RomanNumeral.convert(19);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnXXWhenPassed20() {
		
		String actual = "XX";
		String expected = RomanNumeral.convert(20);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnXLWhenPassed40() {
		
		String actual = "XL";
		String expected = RomanNumeral.convert(40);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnLIVWhenPassed54() {
		
		String actual = "LIV";
		String expected = RomanNumeral.convert(54);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnLXIXWhenPassed69() {
		
		String actual = "LXIX";
		String expected = RomanNumeral.convert(69);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnXCWhenPassed90() {
		
		String actual = "XC";
		String expected = RomanNumeral.convert(90);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnCXLIXWhenPassed149() {
		
		String actual = "CXLIX";
		String expected = RomanNumeral.convert(149);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnCDXCIXWhenPassed494() {
		
		String actual = "CDXCIV";
		String expected = RomanNumeral.convert(494);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnDXCIXWhenPassed599() {
		
		String actual = "DXCIX";
		String expected = RomanNumeral.convert(599);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnCMWhenPassed900() {
		
		String actual = "CM";
		String expected = RomanNumeral.convert(900);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnMMWhenPassed2000() {
		
		String actual = "MM";
		String expected = RomanNumeral.convert(2000);
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void shouldReturnMDCCCLXXXVIIIWhenPassed1888() {
		
		String actual = "MDCCCLXXXVIII";
		String expected = RomanNumeral.convert(1888);
		
		assertEquals(actual, expected);
	}
	
}
