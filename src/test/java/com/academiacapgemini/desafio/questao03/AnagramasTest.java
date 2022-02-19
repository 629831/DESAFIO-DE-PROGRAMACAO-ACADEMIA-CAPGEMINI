package com.academiacapgemini.desafio.questao03;

import org.junit.Assert;
import org.junit.Test;

public class AnagramasTest {
	
	@Test
    public void anagram() {
        String palavra = "ifailuhkqq";
        int result = Anagramas.anagram(palavra);
        Assert.assertEquals(3, result);
	}
}
