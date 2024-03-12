/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbopert5;
import java.util.Scanner;

public class pbopert5no2 {
    public static boolean adalahPrima(int angka) {      
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukan batas akhir: ");
        int batasAkhir = input.nextInt();

        System.out.print("Bilangan prima " + batasAwal + 
                " sd " + batasAkhir + " adalah: ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (adalahPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();    
        System.out.print("Bilangan komposit " + batasAwal + 
                " sd " + batasAkhir + " adalah: ");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!adalahPrima(i) && i > 1) { 
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
        input.close();
    }
}