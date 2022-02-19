package com.academiacapgemini.desafio.questao01;

import org.junit.Assert;
import org.junit.Test;

public class EscadaTest {
	
	  @Test
	  public void mount() {
			Escada escada = new Escada();
			int steps = 6;
			String expected = "     *\n" + "    **\n" + "   ***\n" + "  ****\n" + " *****\n" + "******\n";

			String mountedEscada = escada.mountEscada(steps);
			Assert.assertEquals(expected, mountedEscada);

			steps = 2;
			expected = " *\n" + "**\n";

			mountedEscada = escada.mountEscada(steps);
			Assert.assertEquals(expected, mountedEscada);

			steps = 4;
			expected = "   *\n" + "  **\n" + " ***\n" + "****\n";

			mountedEscada = escada.mountEscada(steps);
			Assert.assertEquals(expected, mountedEscada);

			steps = 5;
			expected = "    *\n" + "  **\n" + " ***\n" + " ****\n" + " *****\n"; 

			mountedEscada = escada.mountEscada(steps);
			Assert.assertEquals(expected, mountedEscada);
	  }


}
