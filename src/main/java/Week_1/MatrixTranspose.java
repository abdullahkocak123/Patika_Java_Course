package Week_1;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {

        //Kullanıcıdan kaç satır ve sütunluk matris oluşturacağı bilgisini alıyoruz;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matrix için satır sayısı belirtin: ");
        int row = scanner.nextInt();
        System.out.print("Matrix için sütun sayısı belirtin: ");
        int column = scanner.nextInt();

        //Kullanıcıdan matris değerlerini alıp bir matrise atıyoruz;
        int[][] firstMatrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print((i + 1) + ". satır " + (j + 1) + ". sütun :");
                firstMatrix[i][j] = scanner.nextInt();
            }
        }

        //Transpoz matrix oluşturup değerleri çeviriyoruz;
        int[][] transposeMatrix = new int[column][row];
        for (int i = 0; i < transposeMatrix.length; i++) {
            for (int j = 0; j < transposeMatrix[0].length; j++) {
                transposeMatrix[i][j] = firstMatrix[j][i];
            }
        }

        //İlk matrisi ekrana yazdırıyoruz;
        System.out.println("Girdiğiniz matrix:");
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[0].length; j++) {
                System.out.print(firstMatrix[i][j] + "");
            }
            System.out.println();
        }

        //Transpoz matrisi ekrana yadırıyoru;
        System.out.println("Transpoz matrix:");
        for (int i = 0; i < transposeMatrix.length; i++) {
            for (int j = 0; j < transposeMatrix[0].length; j++) {
                System.out.print(transposeMatrix[i][j] + "");
            }
            System.out.println();
        }

    }
}
