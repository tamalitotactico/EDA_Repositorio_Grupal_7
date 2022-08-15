package eda07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HashDemo {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 char resp;
		 int res;
	      Hashtable hash=new Hashtable();
	     
	      System.out.println("Se hara un registro de usuarios, los cuales tendran que brindar\nsu id, email y su nombre.\nQue accion desea realizar(Ingrese el número):");
	      do {
	      System.out.println("1.-Insertar\n2.-Eliminar\n3.-Obtener\n4.-Contiene id\n5.-Contiene nombre\n6.-Tamaño\n7.-Eliminar tabla\n8.-Obtener suma de hashcodes\n9.-Mostrar tabla");
	      System.out.print("Número del menú:");
	      res=sc.nextInt();
	      if(res==1) {
	    	  boolean continua;
	    	  int id=0;
	    	  String nombre,email;
	    	  do {
	    	  try {
	    		  continua=false;
	    		  System.out.println("Ingrese su id:");
		    	  id=sc.nextInt();
	          } catch (InputMismatchException ex) {
	              System.out.println("Debe ingresar obligatoriamente un número entero.");
	              sc.next();
	              continua=true;
	          }
	    	  }while(continua);
	    	  System.out.println("Ingrese su nombre:");
	    	  nombre=sc.next();
	    	  System.out.println("Ingrese su email:");
	    	  email=sc.next();
	    	  User temp=new User(id,nombre,email);
	    	  hash.put(temp);
	      }
	      else if(res==2) {
	    	  String key;
	    	  System.out.println("Ingrese el nombre del usuario que desea eliminar:");
	    	  key=sc.next();
	    	  hash.remove(key);
	      }
	      else if(res==3) {
	    	  String key;
	    	  System.out.println("Ingrese el nombre del usuario que desea obtener sus datos:");
	    	  key=sc.next();
	    	  hash.get(key);
	      }
	      else if(res==4) {
	    	  int id=0;
	    	  boolean continua;
	    	  do {
		    	  try {
		    		  continua=false;
		    		  System.out.println("Ingrese la id que desea verificar su existencia:");
			    	  id=sc.nextInt();
		          } catch (InputMismatchException ex) {
		              System.out.println("Debe ingresar obligatoriamente un número entero.");
		              sc.next();
		              continua=true;
		          }
		          }while(continua);
	    	  if(hash.containsValue(id)) 
	    		  System.out.println("Si se encontro coincidencia");
	    	  else
	    		  System.out.println("No se encontro coincidencia");
	    	  ;
	      }
	      
	      else if(res==5) {
	    	  String nomb;
	    	  System.out.println("Ingrese el nombre que desea verificar su existencia:");
	    	  nomb=sc.next();
	    	  if(hash.containsKey(nomb)) 
	    		  System.out.println("Si se encontro coincidencia");
	    	  else
	    		  System.out.println("No se encontro coincidencia");
	    	  ;
	      }
	      else if(res==6) {
	    	  hash.size();
	      }
	      else if(res==7) {
	    	  hash.clear();
	      }
	      else if(res==8) {
	    	  System.out.println("La suma de los hashcodes de todos los usuarios es "+hash.hashCode());
	      }
	      else if(res==9) {
	    	  System.out.println("La tabla:");
	    	  System.out.println(hash);
	      }
	      else if(res!=1||res!=2||res!=3||res!=4||res!=5||res!=6||res!=7||res!=8||res!=9) {
	    	  System.out.print("Esa opción no existe en el menú");
	      }
	      resp=pregunta("\nDesea utilizar alguna opcion del menú más:",sc);
	      }while(resp !='n');
	   }	
	 public static char pregunta(String preg,Scanner teclado) {
	        char resp;
	        System.out.println(preg + " (s/n)");
	        resp = teclado.next().toLowerCase().charAt(0);
	        while (resp != 's' && resp != 'n') {
	            System.out.println("Error! solo se admite S o N");
	            resp = teclado.next().toLowerCase().charAt(0);
	        }
	        return resp;
	    }
}