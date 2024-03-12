/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbopert5;

/**
 *
 * @author azkiy
 */
import java.util.Scanner;
public class Pbopert5 {
    public static boolean adalahRibuan(int angka) {
        return angka >= 1000 && angka <= 9999;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1 = input.nextInt();
        int angka2 = input.nextInt();
        int angka3 = input.nextInt();

        boolean hasil1 = adalahRibuan(angka1);
        boolean hasil2 = adalahRibuan(angka2);
        boolean hasil3 = adalahRibuan(angka3);
        
        System.out.println("Apakah " + angka1 + " ribuan? " + hasil1);
        System.out.println("Apakah " + angka2 + " ribuan? " + hasil2);
        System.out.println("Apakah " + angka3 + " ribuan? " + hasil3);
    }
}
