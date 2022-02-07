package articulo;

import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Articulo a = new Articulo();

		System.out.println("Introduzca el nombre: ");
		a.setNombre(sc.nextLine());
		System.out.println("Introduzca precio-.-.");
		a.setPrecio(sc.nextDouble());
		System.out.println("Introduzca cantidad.-");
		a.setCuantosQuedan(sc.nextInt());
		System.out.println(a.toString());


		Articulo a1 = new Articulo("Naran3jas",3.5,70);
		Articulo a2 = new Articulo("Naranjas",4.7,90);
		System.out.println(a1.toString());

		if (!a1.equals(a2)){
		System.out.println("No es el mismo artículo");
		}else {
		System.out.println("Es el mismo artículo");
		sc.close();
		}

		}

		}

