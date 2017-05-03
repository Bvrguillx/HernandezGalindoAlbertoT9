package main;

import java.util.*;

import exceptions.*;
import models.*;

public class pruebecillas {

	public static void main(String[] args) throws ColaExceededSizeException {
		ArrayList<Integer> miLista = new ListaOrdenada<Integer>((Integer a, Integer b) -> (b - a));

		for (int indice = 0; indice < 100; indice++) {
			miLista.add(indice);
		}

		System.out.print("TAMAÑO ACTUAL DE LA LISTA: ");
		System.out.println(miLista.size());
		System.out.println();
		System.out.println(miLista);
		System.out.println();

		try {
			miLista.add(100);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			miLista.add(20, 80);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			miLista.add(1, 80);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println();
		try {
			miLista.remove(69); // PUEDES QUITARLE EL QUE QUIERAS JT, PERO NUNCA
								// MAS DE 100, YA QUE SI LO INTENTAS
								// SALTARA UNA EXCEPCION DEL TIPO
								// (IndexOutOfBoundsException) ;)
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(miLista);
		System.out.println();
		System.out.print("AHORA VEREMOS EL TAMAÑO DE LA LISTA: ");
		System.out.println(miLista.size());
		System.out.println();
		try {
			miLista.clear();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.print("AHORA LE TAMAÑO DE LA LISTA DESPUES DEL CLEAR: ");
		System.out.println(miLista.size());
		System.out.println();
		System.out.println("ELEGANCIA ES MI APELLDIO... Atentamente: Bvrguillx");
	}

}
