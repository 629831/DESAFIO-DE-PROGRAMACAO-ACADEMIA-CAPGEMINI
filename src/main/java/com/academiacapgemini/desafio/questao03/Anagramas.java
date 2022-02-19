package com.academiacapgemini.desafio.questao03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagramas {
	
	public static int anagram(String palavra) {

		Map<String, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < palavra.length(); i++) {

			for (int j = i; j < palavra.length(); j++) {

				char[] substr = palavra.substring(i, j + 1).toCharArray();
				Arrays.sort(substr);
				String nova = new String(substr);

				if (hashMap.containsKey(nova)) {
					hashMap.put(nova, hashMap.get(nova) + 1);
				} else {
					hashMap.put(nova, 1);
				}
			}

		}

		int paresAnagram = 0;

		for (String nova : hashMap.keySet()) {

			int i = hashMap.get(nova);
			paresAnagram += (i * (i - 1)) / 2;
		}

		return paresAnagram;
	}
}

