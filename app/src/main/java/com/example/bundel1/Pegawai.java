package com.example.bundel1;

import java.io.Serializable;

public class Pegawai implements Serializable {

    private String Namanya;
    private String alamat;
    private String NoHp;
    private String pekerjaan;
    private String LamaKerja;
    private String AsalSekolah;
    private String kompetensi;

    public Pegawai(String namanya, String alamat, String noHp, String pekerjaan, String lamaKerja, String asalSekolah, String kompetensi) {
        Namanya = namanya;
        this.alamat = alamat;
        NoHp = noHp;
        this.pekerjaan = pekerjaan;
        LamaKerja = lamaKerja;
        AsalSekolah = asalSekolah;
        this.kompetensi = kompetensi;
    }

    public String getNamanya() {
        return Namanya;
    }

    public void setNamanya(String namanya) {
        Namanya = namanya;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHp() {
        return NoHp;
    }

    public void setNoHp(String noHp) {
        NoHp = noHp;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getLamaKerja() {
        return LamaKerja;
    }

    public void setLamaKerja(String lamaKerja) {
        LamaKerja = lamaKerja;
    }

    public String getAsalSekolah() {
        return AsalSekolah;
    }

    public void setAsalSekolah(String asalSekolah) {
        AsalSekolah = asalSekolah;
    }

    public String getKompetensi() {
        return kompetensi;
    }

    public void setKompetensi(String kompetensi) {
        this.kompetensi = kompetensi;
    }
}
