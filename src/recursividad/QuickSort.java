package recursividad;

import java.util.ArrayList;

import cards.BusCard;

/**
 * Clase que establece el metodo recursivo de ordenacion QuickSort
 * Emplearemos este clase para ordenar las tajetas  de bus segun el saldo que tengan de menor a mayor
 * 
 */
public class QuickSort {
	/**
	 * 
	 * @param listaBus arrayList que contiene las tarjeta de bus del sistema
	 * @param izq indice del primer elemento
	 * @param der indice del ultimo elemento
	 * 
	 */
	
	public static void quicksortSaldo(ArrayList <BusCard> listaBus, int izq, int der) 
	{ 
		  int pivote=listaBus.get(izq).getSaldo(); 
		  int i=izq; 
		  int j=der; 
		  BusCard aux;
		 
		  while(i<j)
		  {            
		     while(listaBus.get(i).getSaldo() <= pivote && i<j)
		     {
		    	 i++;
		     }
		     
		     while(listaBus.get(j).getSaldo() > pivote)
		     {
		    	 j--;         
		     }
		     
		     if (i<j) 
		     {                                       
		         aux= listaBus.get(i);                 
		         listaBus.set(i, listaBus.get(j));
		         listaBus.set(j, aux);
		     }
		   }
		   BusCard aux1 = listaBus.get(izq);
		   listaBus.set(izq, listaBus.get(j)); 
		   listaBus.set(j, aux1);
		   
		   if(izq<j-1)
		      quicksortSaldo(listaBus,izq,j-1);
		   
		   if(j+1 <der)
		      quicksortSaldo(listaBus,j+1,der);
		   
		}
	

}
