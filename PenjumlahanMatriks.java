package LtihanUKL;
import java.util.Scanner;

public class PenjumlahanMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("============= PROGRAM PENJUMLAHAN MATRIKS =============");
        
        System.out.print("Masukkan jumlah baris matriks : ");
        int baris = input.nextInt();
        
        System.out.print("Masukkan jumlah kolom matriks : ");
        int kolom = input.nextInt();
        
        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];
        
        System.out.println(" ");
        System.out.println("Masukkan elemen matriks A : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A [" + i + "][" + j + "] : ");
                matriksA[i][j] = input.nextInt();
            }
        }

        System.out.println(" ");

        System.out.println("Masukkan elemen matriks B : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B [" + i + "][" + j + "] : ");
                matriksB[i][j] = input.nextInt();
            }
        }

        //penjumlahan matriks
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        //hasil penjumlahan
        System.out.println(" ");
        System.out.println("Hasil penjumlahan matriks A dan B adalah : ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }

    }
}
