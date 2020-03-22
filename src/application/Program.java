package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da matriz (linha vs coluna): ");
		int linha = sc.nextInt(), coluna = sc.nextInt();
		int[][] mtz = new int[linha][coluna];
				
		System.out.printf("Digite a matriz de tamanho %d,%d: %n", linha,coluna);
		for (int i=0; i<linha; i++) {
			for (int j=0; j<coluna; j++) {
				mtz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite um número inteiro que pertence a matriz: ");
		int test = sc.nextInt();
		
		for (int i=0; i<linha; i++) {
			for (int j=0; j<coluna; j++) {
				if (mtz[i][j] == test) {
					System.out.println();
					System.out.printf("Position %d,%d: ", i, j);
					System.out.println();
					if (j-1 >= 0) {
						System.out.printf("Left: %d%n", mtz[i][j-1]);
					}
					if (j+1 < mtz[i].length){
						System.out.printf("Right: %d%n", mtz[i][j+1]);
					}
					if (i-1 >= 0) {
						System.out.printf("Up: %d%n", mtz[i-1][j]);
					}
					if (i+1 < mtz.length) {
						System.out.printf("Down: %d%n", mtz[i+1][j]);
					}
					
				}
			}
		}
		sc.close();
	}

}