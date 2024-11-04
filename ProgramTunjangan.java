/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 * NAMA  : DIVIA FAIQOTUL CAHYATI
 * PRODI : SISTEM INFORMASI
 * NIM   : 23176021
 * Deskripsi Program : Program ini akan menghitung jumlah tunjangan jika seorang karyawan di perusahaan sudah menikah
 */
    import java.util.Scanner;

public class ProgramTunjangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("============ Program Tunjangan ============");

        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = input.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum): ");
        String status = input.next();

        double tunjangan = 0;

        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        } else {
            tunjangan = 0;
        }

        double totalGaji = gajiPokok + tunjangan;

        System.out.println("\n======== Hasil Perhitungan Gaji Anda ========");
        System.out.println("Gaji Pokok\t\t: Rp " + gajiPokok);
        System.out.println("Tunjangan\t\t: Rp " + tunjangan);
        System.out.println("Total Gaji\t\t: Rp " + totalGaji);

        input.close();
    }
}

