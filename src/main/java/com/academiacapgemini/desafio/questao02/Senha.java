package com.academiacapgemini.desafio.questao02;

public class Senha {

	private static final int MIN_NUM_CHAR = 6;

	public int checkSenha(String senha) {
		int addCharacters = 0;
		String upperLetters = "(.*)[A-Z](.*)";
		String lowerLetters = "(.*)[a-z](.*)";
		String specialCharacters = "(.*)[!@#$%^&*()+-](.*)";
		String digits = "(.*)[0-9](.*)";
		
		if (!senha.matches(upperLetters))
			addCharacters++; // Nenhuma letra maiúscula

		if (!senha.matches(lowerLetters))
			addCharacters++; // Nenhuma letra minúscula

		if (!senha.matches(specialCharacters))
			addCharacters++; // Nenhum digíto

		if (!senha.matches(digits))
			addCharacters++; // Nenhum caractere especial

		return Math.max(MIN_NUM_CHAR - senha.length(), addCharacters);
	}
}
