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
	
	public Polinomio (double[] coef){
		this.grado=coef.length -1;		//REVISAR:No me acuerdo si definir asi es valido.
		this.coeficientes[]=new double[coef.length];
		for(int i=0;i<this.coeficientes.length;i++)
			coeficientes[i]=coef[i];
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
	

	double Horner(int c double x){
		if (c==0)
		return this.coeficientes[c]
		else
		return (coeficientes[c]+Horner(c-1,x)*x)
	}
	
	
	double evaluarRecursiva (double x ){ //analisis 30 min, implementacion 45 min. TODO: testear
		//Usando Metodo de Horner.
		int c=this.grado;
		return Horner(c,x);
		
	}
	
	double evaluarPDinamica (double x )//Vamos a hacerlo por Horner creando polinomios por cada paso. let the world burn!
	{
		if (this.coeficientes.length > 1){
			double aux[]= new double[this.coeficientes.length-1];
			for(int i=0;i<aux.length;i++)
				aux[i]=this.coeficientes[i];
			}
		else
			return this.coeficientes[0];
		return this.coeficientes[this.length]+x* (new Polinomio(aux).evaluarPDinamica(x))
	}
	
	double evaluarMejorada (double x )//FALTA HACER
	{
		return x;
	}
	

	
	
	
}
