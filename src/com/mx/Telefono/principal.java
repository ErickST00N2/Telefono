package com.mx.Telefono;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono telefono1 = new Telefono("HUAWEI", "P30 LITE", 40000, 128, 16);
		Telefono telefono2 = new Telefono("Motorola", "Moto G60s", 2000, 128, 6);
		Telefono telefono3 = new Telefono("SAMSUNG", "Galaxy A10", 4000, 128, 6);
		Telefono telefono4 = new Telefono("Xiaomi", "POCOPhoneF6", 5000, 512, 16);
		Telefono telefono5 = new Telefono("Xiami", "Redmi 13", 13000, 256, 12);
		Telefono telefono6 = new Telefono("Sanmsung", "Grand Prime", 5000, 64, 8);
		Telefono telefono7 = new Telefono("Google", "Pixel 3", 4500, 128, 4);
		Telefono telefono8 = new Telefono("Xiaomi", "Redmi 13c", 3500, 128, 6);
		Telefono telefono9 = new Telefono("MOTOROLA", "Z300 X", 3800, 128, 8);
		Telefono telefono10 = new Telefono("SAMSUNG", "X110", 3800, 128, 16);
		Telefono telefono11 = new Telefono("Samsung", "A50", 5000, 128, 4);

		// crear un objeto auxiliar
		Telefono telefono = null;

		// Crear Lista
		List<Telefono> telefonos = new ArrayList<Telefono>();

		telefonos.add(telefono1);
		telefonos.add(telefono2);
		telefonos.add(telefono3);
		telefonos.add(telefono4);
		telefonos.add(telefono5);
		telefonos.add(telefono6);
		telefonos.add(telefono7);
		telefonos.add(telefono8);
		telefonos.add(telefono9);
		telefonos.add(telefono10);
		telefonos.add(telefono11);

		System.out.println("los datos de la lista son: \n " + telefonos);

		// buscar un elemento especifico en la lista
		telefono = telefonos.get(4);
		System.out.println("este es el telefono: \n" + telefono);

		// editar un elemento en la lista
		telefono = telefonos.get(4);
		telefono.setMemoria(128);
		telefono.setPrecio(3000);
		telefonos.set(4, telefono);
		System.out.println("Los datos actualizados son: \n " + telefonos);

		// Eliminar un elemento en la lista
		telefono = telefonos.get(5);
		telefonos.remove(5);
		System.out.println("Elemento eliminado: \n" + telefono);
		System.out.println(telefonos);

		/*
		 * //eliminar todo telefonos.clear(); //validar si esta vacia la lista if
		 * (telefonos.isEmpty()) { System.out.println("La lista esta vacia"); }else {
		 * System.out.println("la lista es: " + telefonos); }
		 */

		// Contar el tamaño de nuestra lista
		System.out.println("El tamanio de nuestra lista es: " + telefonos.size());

		System.out.println();
		///////////////////////////////////////////////////////////////////////////////////

		// Creamos las variables que utilizaremos
		// Scanner:
		Scanner scan = null;

		// Menu:
		int menuP = 0, menuS = 0, indice = 0;

		// Telefono:
		String marca, modelo;
		int precio, memoria, ram;

		do {
			// Menu
			System.out.println("------ MENU ------");
			System.out.println("1.- Agregar nuevo registro");
			System.out.println("2.- Mostrar la lista");
			System.out.println("3.- Editar");
			System.out.println("4.- Buscar un elemento");
			System.out.println("5.- Eliminar un elemento");
			System.out.println("6.- Contar todos los elementos de la lista");
			System.out.println("7.- Salir del menu");
			System.out.println("ELIGEN UNA OPCION");
			scan = new Scanner(System.in);
			menuP = scan.nextInt();

			switch (menuP) {
			case 1:
				// Agregar un nuevo telefono

				System.out.println("1.- Agregar");

				System.out.println("Escribe la marca del telefono: ");
				scan = new Scanner(System.in);
				marca = scan.next();

				System.out.println("Escribe el modelo del telefono: ");
				scan = new Scanner(System.in);
				modelo = scan.nextLine();

				System.out.println("Escribe el precio del telefono: ");
				scan = new Scanner(System.in);
				precio = scan.nextInt();

				System.out.println("Escribe la memoria del telefono : ");
				scan = new Scanner(System.in);
				memoria = scan.nextInt();

				System.out.println("Escribe la RAM del telefono: ");
				scan = new Scanner(System.in);
				ram = scan.nextInt();

				// Pasamos los valores obtenidos a traves de nuestro objeto de telefono
				telefono = new Telefono(marca, modelo, precio, memoria, ram);

				// Agregamos a la lista
				telefonos.add(telefono);
				System.out.println("El registro del telefono fue exitoso"); // Mensaje de exitoso
				break;

			case 2:
				// Imprimimos la lista
				System.out.println("2.- Mostrar la lista");
				System.out.println("La lista es: " + telefonos);
				break;

			case 3:
				// Actualizar los valores de un elemento dentro de una lista
				System.out.println("3.- Editar elemento");

				// Pedimos la posicion del elemento de la lista que sera actualizada su
				// informacion
				System.out.println("Escribe el indice a editar \n" + "NOTA: EL INDICE MAXIMO QUE EXISTE POR AHORA ES: "
						+ (telefonos.size() - 1));
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				telefono = telefonos.get(indice);

				// Entramos a un menu secundario
				do {
					System.out.println("Que valor actualizaras?");
					System.out.println("1.- editar marca del telefono");
					System.out.println("2.- editar modelo del telefono");
					System.out.println("3.- editar precio del telefono");
					System.out.println("4.- editar memoria del telefono");
					System.out.println("5.- editar ram del telefono");
					System.out.println("6.- Salir");
					scan = new Scanner(System.in);
					menuP = scan.nextInt();

					switch (menuP) {
					case 1:
						System.out.println("1.- editar marca del telefono");
						System.out.println("Escribe la marca del telefono: ");
						scan = new Scanner(System.in);
						marca = scan.nextLine();
						telefono.setMarca(marca);
						break;

					case 2:
						System.out.println("2.- editar modelo del telefono");
						System.out.println("Escribe el modelo del telefono: ");
						scan = new Scanner(System.in);
						modelo = scan.nextLine();
						telefono.setModelo(modelo);
						break;

					case 3:
						System.out.println("3.- editar precio del telefono");
						System.out.println("Escribe el precio del telefono: ");
						scan = new Scanner(System.in);
						precio = scan.nextInt();
						telefono.setPrecio(precio);
						break;

					case 4:
						System.out.println("4.- editar memoria del telefono");
						System.out.println("Escribe la memoria del telefono : ");
						scan = new Scanner(System.in);
						memoria = scan.nextInt();
						telefono.setMemoria(memoria);
						break;

					case 5:
						System.out.println("5.- editar ram del telefono");
						System.out.println("Escribe la RAM del telefono: ");
						scan = new Scanner(System.in);
						ram = scan.nextInt();
						telefono.setRam(ram);
						break;

					case 6:
						System.out.println("Hasta pronto!");

						menuS = 6;
						break;
					}

				} while (menuS != 6);

				// Actualizamos el telefono en la posicion definida por el usuario
				telefonos.set(indice, telefono);
				System.out.println("Los datos actualizados son: \n " + telefonos);

				menuS = 3;
				menuP = 3;

				break;

			case 4:
				System.out.println("4.- Buscar un elemento");

				// Pedimos la posicion del elemento de la lista
				System.out.println("Escribe el indice a buscar \n" + "NOTA: EL INDICE MAXIMO QUE EXISTE POR AHORA ES: "
						+ (telefonos.size() - 1));
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				telefono = telefonos.get(indice);

				// imprimir elemento encontrado
				System.out.println("El elemento encontrado es:  " + telefono);

				break;

			case 5:
				System.out.println();
				System.out.println("5.- Eliminar un elemento");

				// Pedimos la posicion del elemento de la lista
				System.out.println("Escribe el indice a eliminar \n"
						+ "NOTA: EL INDICE MAXIMO QUE EXISTE POR AHORA ES: " + (telefonos.size() - 1));
				scan = new Scanner(System.in);
				indice = scan.nextInt();
				telefono = telefonos.remove(indice);

				// imprimir elemento encontrado
				System.out.println("El elemento fue eliminado exitosamente");

				break;
			case 6:
				System.out.println();
				System.out.println("El tamaño de la lista es: " + telefonos.size());
				break;
			case 7:
				System.out.println();
				System.out.println("Hasta Pronto!");

				menuS = 6;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: ");
			}
		} while (menuS != 6);

	}

}
