package buscandoNombres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Scanner;

public class Lista {
	private int n;
	private Nombre[] nom;
	private String aux;
	
	public Lista(String path) throws FileNotFoundException
	{
		Scanner scan = new Scanner(new File(path));
		nom =new Nombre[scan.nextInt()];
		n= scan.nextInt();
		Collection <Nombre> Cl;
		
		 while(scan.hasNext())
		 {
			 aux=scan.nextLine();
			 //BUSCAR AUX EN NOMBRE[].nom
			 for (Nombre idx )
			 
			 
			 
			 //nom[i]=new Nombre(scan.nextLine());
			 //nom[i].comparar(n);
			 //nom[i].setNombre(scan.nextLine());
					
			 //vec[i]=scan.nextDouble();
			i++;
		 }
		 scan.close();
	}

}
