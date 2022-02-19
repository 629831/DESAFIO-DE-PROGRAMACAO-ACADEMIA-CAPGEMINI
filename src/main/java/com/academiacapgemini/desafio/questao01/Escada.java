package com.academiacapgemini.desafio.questao01;

public class Escada {
	
	public String mountEscada(int stepsCount) {
		StringBuilder escada = new StringBuilder();
		String asterisk = "*";
		String emptySpace = " ";

		for (int counterAsc = 1; counterAsc <= stepsCount; counterAsc++) {
			int numberOfEmptySpaces = stepsCount - counterAsc;
			String emptySpaces = emptySpace.repeat(numberOfEmptySpaces);
			String asterisks = asterisk.repeat(counterAsc);
			escada.append(emptySpaces).append(asterisks).append("\n");
		}
		return escada.toString();
	}
}