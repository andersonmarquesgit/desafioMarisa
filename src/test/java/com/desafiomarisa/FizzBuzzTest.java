package com.desafiomarisa;

import org.junit.Test;

import junit.framework.TestCase;

public class FizzBuzzTest extends TestCase {

	private FizzBuzzSingleton instancia = FizzBuzzSingleton.getFizzBuzzSingleton();
			
	@Test
	public void testFizzBuzzCriarSingleton() {
		assertNotNull(instancia);
	}
	
	@Test
	public void testCountFizzBuzz() {
		int countFizz = 0;
		int countBuzz = 0;
		int countFizzBuzz = 0;
		
		instancia.listarFizzBuzz().clear();
		instancia.createFizzBuzz(6);
		for (FizzBuzz fizzBuzz : instancia.listarFizzBuzz()) {
			switch (fizzBuzz.getDesc()) {
			case "Fizz":
				countFizz++;
				break;
			case "Buzz":
				countBuzz++;
				break;
			case "FizzBuzz":
				countFizzBuzz++;
				break;
			default:
				break;
			}
		}
		
		assertNotNull(instancia.listarFizzBuzz());
		assertEquals(countFizz, 2);
		assertEquals(countBuzz, 1);
		assertEquals(countFizzBuzz, 0);
	}
	
	@Test
	public void testNumFizzBuzz() {
		instancia.listarFizzBuzz().clear();
		instancia.createFizzBuzz(50);
		assertEquals(instancia.findByNum(50).getDesc(), "Buzz");
		assertEquals(instancia.findByNum(50).getNum(), 50);
	}
}
