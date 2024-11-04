/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 * NAMA  : DIVIA FAIQOTUL CAHYATI
 * PRODI : SISTEM INFORMASI
 * NIM   : 23176021
 * Deskripsi Program : Program ini akan menampilkan bilangan kelipatan 3,5
 */

public class KelipatanTigaSetengah {
    public static void main(String[] args) {
        // inisialisasi variabel awal
        double bilangan = 3.5;

        // Loop untuk mencetak kelipatan 3.5
        while (bilangan <= 35.0) {
            System.out.println("x: " + bilangan);
            bilangan += 3.5; // Tambah 3.5 pada setiap iterasi
        }
    }
}

