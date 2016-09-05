package polinomio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Polinomio {

	
	int grado;
	private double[] coeficientes;
	
	public Polinomio ( String archivoin ) throws FileNotFoundException
	{
		Scanner scan = new Scanner(new File(archivoin));
		
		grado = scan.nextInt(); // leo el grado que es la primer linea
		coeficientes = new double[grado+1]; //si grado es 2, tengo 3 elementos por el num. indep.
		for(int i=0; i<=grado; i++)
		{
			coeficientes[i] = scan.nextDouble(); // y despues voy leyendo los numeros correspondientes a cada coeficiente
		}
		scan.close();
	}
	
	public double evaluarMSucesivas(double x ) //YA ESTA HECHA Y TESTEADA
	{
		double res = 0;
		double mult = 1;
		
		for(int i=0; i<=grado; i++)
		{
			for(int j=1; j<=grado-i; j++)
			{
				mult*=x;
			}
			res+= coeficientes[i] * mult;
			mult=1; // reseteo el mult
		}
		
		return res;
	}
	
	double evaluarRecursiva (double x ) //FALTA HACER
	{
		return x;
	}
	
	double evaluarPDinamica (double x )//FALTA HACER
	{
		return x;
	}
	
	double evaluarMejorada (double x )//FALTA HACER
	{
		return x;
	}
	

	
	
	
}
