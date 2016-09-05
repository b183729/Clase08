package test;

import java.io.FileNotFoundException;

import org.junit.Assert;
import org.junit.Test;

import polinomio.Polinomio;

public class PolinomioTests {

	@SuppressWarnings("deprecation")
	@Test
	public void ProbarPolinomio() throws FileNotFoundException
	{
		
		Polinomio p = new Polinomio("Polinomio.in");
		Assert.assertEquals(6, p.evaluarMSucesivas(2), 0.01); // 1*2*2 + 1*2 + 0 = 6
		
		Polinomio p2 = new Polinomio("Polinomio2.in");
		Assert.assertEquals(49, p2.evaluarMSucesivas(2), 0.01); // 4*2*2*2 + 3*2*2 + 2*2 + 1 = 32+12+4+1 = 49
	}
}
