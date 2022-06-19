/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apasih;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private String angkatan;
    private String jenis;

    public Mahasiswa(String nama, String nim, String angkatan, String jenis) {
        this.nama = nama;
        this.nim = nim;
        this.angkatan = angkatan;
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }
    

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return nim;
    }

}

