/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

/**
 *
 * @author jaringan
 */
public class Grandparent {

    private String judul,  aktor,  sutradara,  publisher,  kategori,  stok,  jml;

    public String getAktor() {
        return aktor;
    }

    public void setAktor(String aktor) {
        this.aktor = aktor;
    }

    public String getJml() {
        return jml;
    }

    public void setJml(String jml) {
        this.jml = jml;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        if (kategori.equals("SU")) {
            this.kategori = "Semua Umur";
        } else if (kategori.equals("D")) {
            this.kategori = "Semua Umur";
        } else if (kategori.equals("R")) {
            this.kategori = "Remaja";
        } else if (kategori.equals("A")) {
            this.kategori = "Anak-Anak";
        }
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }
}
