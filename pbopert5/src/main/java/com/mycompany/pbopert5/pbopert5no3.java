/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbopert5;
import java.util.Scanner;

public class pbopert5no3 {

    // Metode untuk mencetak pola bintang
    public static void cetakPolaBintang(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        if (N < 1 || N > 1000) {
            System.out.println("Nilai N harus antara 1 dan 1000.");
        } else {
            // Memanggil prosedur cetakPolaBintang
            cetakPolaBintang(N);
        }

        input.close();
    }
}
