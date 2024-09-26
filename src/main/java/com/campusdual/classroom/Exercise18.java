package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	// Método para crear e inicializar un array con los primeros N números naturales
	public static int[] createAndInitializeArray(int N) {
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = i + 1; // Inicializa con los primeros N números naturales
		}
		return array;
	}

	// Método para mostrar los elementos del array en una línea .
	public static void showInlineArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int N = 10;
		int[] array = createAndInitializeArray(N);
		showInlineArray(array);
	}
}
