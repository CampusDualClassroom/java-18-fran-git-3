package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static void main(String[] args) {
		// Suponiendo que queremos crear un array de 10 elementos
		int size = 10;

		// Llamamos al método para crear e inicializar el array
		int[] array = createAndInitializeArray(size);

		// Mostramos los valores del array en una sola línea
		showInlineArray(array);
	}

	// Método para crear e inicializar un array de enteros con números naturales
	public static int[] createAndInitializeArray(int size) {
		int[] array = new int[size]; // Crear el array

		// Inicializar el array con números naturales
		for (int i = 0; i < size; i++) {
			array[i] = i + 1; // Llenar el array con 1, 2, 3, ..., N
		}

		return array; // Devolver el array inicializado
	}

	// Método para mostrar el array en una sola línea
	public static void showInlineArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(" "); // Espacio entre los números
			}
		}
		System.out.println(); // Nueva línea al final
	}
}
