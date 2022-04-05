/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis_pbo_c_123200014;

import lomba.surat;

/**
 *
 * @author LENOVO
 */
public class ProsesSurat implements surat{
    double struktur,isi,kreatifS,bahasa,hasil;
    String nama,sekolah;
    public ProsesSurat(double struktur, double isi, double kreatifS, double bahasa, String nama, String sekolah) {
        this.struktur = struktur;
        this.isi = isi;
        this.kreatifS = kreatifS;
        this.bahasa = bahasa;
        this.nama = nama;
        this.sekolah = sekolah;
    }
    
    @Override
    public double struktur() {
        struktur = (struktur*10)/100;
        return struktur;
    }

    @Override
    public double isi() {
        isi = (isi*40)/100;
        return isi;
    }

    @Override
    public double kreatif() {
        kreatifS = (kreatifS*30)/100;
        return kreatifS;
    }

    @Override
    public double bahasa() {
        bahasa = (bahasa*20)/100;
        return bahasa;
    }

    @Override
    public void hasil() {
        hasil = struktur + isi + kreatifS + bahasa;
        if (hasil < 85) {
            System.out.println("Maaf " + nama + " dari " + sekolah + " tidak lolos seleksi Lomba MENULIS SURAT");
        }
        else if (hasil >= 85 ) {
            System.out.println("Selamat " + nama + " dari " + sekolah + " lolos seleksi Lomba MENULIS SURAT");
        }
    }
    
}
