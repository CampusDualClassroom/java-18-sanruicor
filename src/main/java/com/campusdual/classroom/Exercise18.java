package com.campusdual.classroom;

import com.campusdual.util.Utils;


public class Exercise18 {
	public static int[] createAndInitializeArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = i + 1;
		}
		return array;
	}

	public static void showInlineArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.println(array[i]);
				break;
			} else {
				System.out.print(array[i] + " ");
			}
		}
	}



	public static void main(String[] args) {

		int size = Utils.integer("Introduce el tamaño del array: ");
		int [] intArray = createAndInitializeArray(size);
		showInlineArray(intArray);
	}
}
