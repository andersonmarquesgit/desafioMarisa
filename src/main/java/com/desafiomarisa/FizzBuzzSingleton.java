package com.desafiomarisa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzzSingleton {
	
	private static FizzBuzzSingleton instancia = null;
	private List<FizzBuzz> fizzBuzzList;
	
	private FizzBuzzSingleton() {
		fizzBuzzList = new ArrayList<FizzBuzz>();
	} 
	
	public static FizzBuzzSingleton getFizzBuzzSingleton() {
		if (instancia == null) {
			instancia = new FizzBuzzSingleton();
		}
		
		return instancia;
	}
	
	public void adicionarFizzBuzz(FizzBuzz fizzBuzz) {
		this.fizzBuzzList.add(fizzBuzz);
	}
	
	public void removerAluno(FizzBuzz fizzBuzz) {
		this.fizzBuzzList.remove(fizzBuzz);
	}
	
	public List<FizzBuzz> listarFizzBuzz() {
		return this.fizzBuzzList;
	}
	
	public void createFizzBuzz(int n) {
		for (int i = 1; i <= n; i++) {
			//Números divisíveis por 3 deve aparecer como 'Fizz' ao invés do número;
			if (i % 3 == 0) {
				fizzBuzzList.add(new FizzBuzz(i, "Fizz"));
			}
			//Números divisíveis por 5 devem aparecer como 'Buzz' ao invés do número;
			if (i % 5 == 0) {
				fizzBuzzList.add(new FizzBuzz(i, "Buzz"));
			}
			//Números divisíveis por 3 e 5 devem aparecer como 'FizzBuzz' ao invés do número'.
			if (i % 3 == 0 && i % 5 == 0) {
				fizzBuzzList.add(new FizzBuzz(i, "FizzBuzz"));
			}
		}
	}

	public FizzBuzz findByNum(int num) {
		return this.listarFizzBuzz().stream()
				  .filter(fizzBuzz -> num == fizzBuzz.getNum())
				  .findAny()
				  .orElse(null);
	}
}
