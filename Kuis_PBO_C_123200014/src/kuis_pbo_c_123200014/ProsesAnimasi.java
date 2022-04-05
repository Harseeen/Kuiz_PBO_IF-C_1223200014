/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis_pbo_c_123200014;

import lomba.animasi;

/**
 *
 * @author LENOVO
 */
public class ProsesAnimasi implements animasi{
    double alur,konten,kreatifA,sinema;
    String nama,sekolah;
    double hasil;
    public ProsesAnimasi(String nama, String sekolah) {
        this.nama = nama;
        this.sekolah = sekolah;
    }

    public ProsesAnimasi(double alur, double konten, double kreatif, double sinema) {
        this.alur = alur;
        this.konten = konten;
        this.kreatifA = kreatif;
        this.sinema = sinema;
    }

    @Override
    public double alur() {
        alur = (alur*15)/100;
        return alur;
    }

    @Override
    public double konten() {
        konten = (konten*35)/100;
        return konten;
    }

    @Override
    public double kreatif() {
        kreatifA = (kreatifA*35)/100;
        return kreatifA;
    }

    @Override
    public double sinema() {
        sinema = (sinema*15)/100;
        return sinema;
    }

    @Override
    public void hasil() {
        hasil = alur + konten + kreatifA + sinema;
    }
}
