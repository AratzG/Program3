package recursividad;

import java.util.ArrayList;

import cards.BankCard;


/**
 * Clase que establece el metodo recursivo de ordenacion MergeSort
 * Emplearemos este clase para ordenar las tajetas segun el dinero que tengan de mayor a menor
 * 
 */
public class MergeSort 
{
	/**
	 * 
	 * @param listaBanca arrayList que contiene las tarjeta de banco del sistema
	 * @param izq indice del primer elemento
	 * @param der indice del ultimo elemento
	 * 
	 */
	public static void mergesort(ArrayList <BankCard> listaBanca,int izq, int der)
	{
	    if (izq<der)
	    {
            int m=(izq+der)/2;
            mergesort(listaBanca, izq, m);
            mergesort(listaBanca, m+1, der);
            
            merge(listaBanca, izq, m, der);
			
   
	    }
	}

	/**
	 * Realiza la ordenacion para que las tarjetas queden ordenadas por saldo
	 * @param listaBanca arrayList que contiene las tarjeta de banco del sistema a ordenar
	 * @param izq indice del primer elemento
	 * @param m indice medio
	 * @param der indice del ultimo elemento
	 */
	public static void merge(ArrayList <BankCard> listaBanca, int izq, int m, int der)
	{
	   int i, j, k;
	   BankCard [] B = new BankCard [listaBanca.size()]; //Creacion de un array auxiliar
	   
	   for (i=izq; i<=der; i++)     //Introduce las mitades en el array auxiliar
	   {
		   B[i]=listaBanca.get(i);
	   }
       
	   i=izq; j=m+1; k=izq;
             
	   while (i<=m && j<=der)       //copia el siguiente elemento que sea mayor
	   {
		   if (B[i].getDinero() > B[j].getDinero())
		   {
			   listaBanca.set(k++, B[i++]);
		   }
		   
		   else
		   {
			   listaBanca.set(k++, B[j++]);
		   }
	   }
		 
	   while (i<=m)                //introduce los elementos en la primera mitad
	   {
		   listaBanca.set(k++, B[i++]);
	   }
	}



}