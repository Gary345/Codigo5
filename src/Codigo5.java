import java.util.Scanner;
// importar scanner

public class Codigo5 {
	//metodo  main
	public static void main(String[] args) {
		//agregar argumento
		 Scanner s = new Scanner(System.in);
		 //cmbiar comilla simple por coillas dobles
		 System.out.print("Introduzca un número:");
		 // cambiar nextLine por nextint y String por int
		    int ni = s.nextInt();
		    int c = ni;
		    int afo = 0;
		    int noAfo = 0;
		    
		    while (ni > 0) {
		    	// el int no es necesario
			  int digito = (ni % 10);
		      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afo++;
		      } else {
				noAfo++;
				ni /= 10;
		    }
		      
		    if (afo > noAfo) {
		    	//es println no prinln
		      System.out.println("El " + c + " es un número afortunado.");
		    } else {
		      System.out.println("El " + c + " no es un número afortunado.");
		    }
		    //agregué un break ya que si metes un 7 continua en el bucle
		    break;
		  }
		
	}
	

}
