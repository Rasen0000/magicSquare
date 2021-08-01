package com.magic;

//M = n(n*n+1)/2
import java.util.Scanner;

public class DemoApplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите нечетное число: ");
		int n = in.nextInt(); //вводится число n, это количество столбцов и строк
		int[][] magicSquare = new int[n][n]; //создается двухмерный массив n

		int number = 1; //задается первое число
		int row = 0; //количество строк
		int column = n / 2; //количество столбцов
		int curr_row; //текущая строка
		int curr_col; //текущий столбей
		while (number <= n * n) { // пока произведение n*n больше или равно числу
			magicSquare[row][column] = number;//строки и столбцы заполняются числом
			number++;//число увеличивается на 1
			curr_row = row; //текущее количество строк = строкам
			curr_col = column; //текущее количество столбцов = столбцам
			row -= 1; //строка уменьшается на 1
			column += 1; //столбец увеличивается на 1
			if (row == -1) { // если строка = -1
				row = n - 1; //то строка равна число уменьшенное на 1
			}
			if (column == n) { //если столбец равен числу
				column = 0; //то столбец равен 0
			}
			if (magicSquare[row][column] != 0) {//если строки и столбцы не равны нулю
				row = curr_row + 1; //строка это текущая строка + 1
				column = curr_col; //столбец это текущий столбец
				if (row == -1) { //если строка равна -1
					row = n - 1; //то строка равна число - 1
				}
			}
		}

		for (int i = 0; i < magicSquare.length; i++) {  //i заполняется до длинны квадрата
			for (int j = 0; j < magicSquare.length; j++) { //j заполняется до длинны квадрата
				System.out.print(magicSquare[i][j] + " "); //выводится на экран
			}
			System.out.println();
		}
	}

}
