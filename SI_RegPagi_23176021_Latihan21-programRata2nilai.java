/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 * NAMA  : DIVIA FAIQOTUL CAHYATI
 * PRODI : SISTEM INFORMASI
 * NIM   : 23176021
 * Deskripsi Program : Program ini digunakan untuk menghitung rata-rata nilai  mahasiswa
 */
import java.util.Scanner;
public class programRata2nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input jumlah mahasiswa
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();

        // Array untuk menyimpan nilai mahasiswa
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        int totalNilai = 0;

        // Meminta input nilai setiap mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilaiMahasiswa[i] = input.nextInt();
            totalNilai += nilaiMahasiswa[i];
        }

        // Menghitung rata-rata nilai
        double rataRata = (double) totalNilai / jumlahMahasiswa;

        // Menampilkan hasil
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
    }
}

