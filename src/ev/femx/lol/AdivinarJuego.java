package ev.femx.lol;


import java.util.Scanner;

public class AdivinarJuego {

	/**
	 * Construir un programa que simule el juego de la advinanza de un numero 
	 * el programa debe generar un numero aleatorio entre 1 100
	 * @author alvar_000
	 *
	 */

	public static final int INTENTOS = 5;
		
		public static int pedirNumero() 
		{
			int numero_introducido = 0;
			Scanner scanner = null;
			scanner = new Scanner(System.in);
			numero_introducido = scanner.nextInt();
			return numero_introducido;
		}
		
		public void mostrarResultado(int contador, int numero_aleatorio){
			if(contador==0){
				System.out.println("Has ganado el numero "+numero_aleatorio);
			}else if(contador >= INTENTOS){
				System.out.println("Se han agotado los intentos el numero era "+numero_aleatorio);
			}
		}
		
		public static void main(String[] args) {
			int numero_introducido = 0;
			int numero_aleatorio = (int) (100 * Math.random() + 1);
			int contador = 0;
			
			boolean adivinado=false;
			AdivinarJuego ejercicio = null;    
			ejercicio = new AdivinarJuego();
			
			do {
				System.out.println("Adivina el numero");
				
				numero_introducido = pedirNumero();
				contador++;
				if (numero_introducido == numero_aleatorio) {
					System.out.println("Enhorabuena has acertado");
					adivinado=true;
				} else if (numero_introducido > numero_aleatorio) {
					System.out.println("El numero a adivinar es  menor");
				} else if (numero_introducido < numero_aleatorio) {
					System.out.println("El  numero a adivinar es mayor");
				}
			} while ((numero_introducido!= numero_aleatorio) && (contador<INTENTOS));
			
			
			ejercicio.mostrarResultado(contador, numero_aleatorio);
		}
			
	}
	
	

