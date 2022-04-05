/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuis_pbo_c_123200014;

/**
 *
 * @author Harsin
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int pilih;
        double alur,konten,kreatifA,sinema;
        double struktur,isi,kreatifS,bahasa;
        String nama,sekolah;
        System.out.println("---------------------------------------------");
        System.out.println("| Lomba Apresiasi Pahlawan Wanita Indonesia |");
        System.out.println("---------------------------------------------");
        System.out.println("| Input Kategori Lomba                      |");
        System.out.println("| 1. Animasi (Tim)                          |");
        System.out.println("| 2. Menulis Surat (Individu)               |");
        System.out.println("---------------------------------------------");
        System.out.print("Pilih : ");
        pilih = keyboard.nextInt();
        
        if (pilih == 1) {
            System.out.println("--------------------");
            System.out.println("| Form Pendaftaran |");
            System.out.println("--------------------");
            System.out.print("Masukan Nama   : ");
            nama = keyboard.next();
            
            System.out.print("Asal Sekolah   : ");
            sekolah = keyboard.next();
            
            System.out.println("--------------------");
            System.out.println("|  Form Penilaian  |");
            System.out.println("--------------------");
            System.out.println("Ket: Nilai dari 1-100");
            System.out.print("Nilai Alur Cerita   : ");
            alur = keyboard.nextDouble();
            System.out.print("Nilai Konten        : ");
            konten = keyboard.nextDouble();
            System.out.print("Nilai Kreativitas   : ");
            kreatifA = keyboard.nextDouble();
            System.out.print("Nilai Sinematografi : ");
            sinema = keyboard.nextDouble();
            
            System.out.println("============");
            System.out.println("|   Menu   |");
            System.out.println("============");
            System.out.println("| 1. Tampil |");
            System.out.println("| 2. Edit   |");
            System.out.println("| 3. Exit   |");
            System.out.println("============");
            pilih = keyboard.nextInt();
            if (pilih == 1) {
                ProsesAnimasi ProsesAnimasi = new ProsesAnimasi (alur,konten,kreatifA,sinema);
                System.out.println("Nilai Akhir : " + ProsesAnimasi.hasil);
                if (ProsesAnimasi.hasil < 85) {
                    System.out.println("Keterangan : GAGAL");
                    System.out.println("MOHON MAAF, " + nama + " dari " + sekolah + " belum berhasil lolos seleksi LOMBA ANIMASI");
                }
                else if (ProsesAnimasi.hasil >= 85) {
                    System.out.println("Keterangan : BERHASIL");
                    System.out.println("SELAMAT! " + nama + " dari " + sekolah + " berhasil lolos seleksi LOMBA ANIMASI");
                }
            }
        }
        
        else if (pilih == 2) {
            System.out.println("--------------------");
            System.out.println("| Form Pendaftaran |");
            System.out.println("--------------------");
            System.out.print("keyboard Nama   : ");
            nama = keyboard.nextLine();
            System.out.print("Asal Sekolah : ");
            sekolah = keyboard.nextLine();
            
            System.out.println("--------------------");
            System.out.println("|  Form Penilaian  |");
            System.out.println("--------------------");
            System.out.println("Ket: Nilai dari 1-100");
            System.out.print("Nilai Struktur                : ");
            struktur = keyboard.nextDouble();
            System.out.print("Nilai Isi                     : ");
            isi = keyboard.nextDouble();
            System.out.print("Nilai Kreativitas             : ");
            kreatifS = keyboard.nextDouble();
            System.out.print("Nilai Penerapan Kaidah Bahasa : ");
            bahasa = keyboard.nextDouble();
        }
        
        
        
    }
}
