package com.academiacapgemini.desafio.questao02;

import org.junit.Assert;
import org.junit.Test;

public class SenhaTest {
	
	  @Test
	  public void check(){
	    Senha senha = new Senha();
	    int allComplete = senha.checkSenha("D4ni%o");  
	    int expected = 0;

	    Assert.assertEquals(expected,allComplete);

	    int noLowerLetters = senha.checkSenha("D4NI%O");  
	    expected = 1;
	    Assert.assertEquals(expected,noLowerLetters);

	    int noUpperLetters = senha.checkSenha("d4ni%o");  
	    expected = 1;
	    Assert.assertEquals(expected,noUpperLetters);

	    int noDigits = senha.checkSenha("Dani%o");  
	    expected = 1;
	    Assert.assertEquals(expected,noDigits);

	    int noSpecialCharacters = senha.checkSenha("D4nilo");  
	    expected = 1;
	    Assert.assertEquals(expected,noSpecialCharacters);

	    int smallPassword = senha.checkSenha("D4ni%");  
	    expected = 1;
	    Assert.assertEquals(expected,smallPassword);

	  }

}
