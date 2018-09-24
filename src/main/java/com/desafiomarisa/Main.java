package com.desafiomarisa;

public class Main {

	public static void main(String[] args) {
		FizzBuzzSingleton instancia = FizzBuzzSingleton.getFizzBuzzSingleton();
		instancia.createFizzBuzz(100);
		
		for (FizzBuzz fizzBuzz : instancia.listarFizzBuzz()) {
			System.out.println(fizzBuzz.getDesc());
		}
	}

}
