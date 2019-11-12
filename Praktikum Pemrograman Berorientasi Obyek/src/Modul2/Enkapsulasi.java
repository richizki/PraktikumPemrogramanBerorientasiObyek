package Modul2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaringan
 */
public class Enkapsulasi {

    private String nama;
    private int stok,  hargasatuan,  hargatotal,  totalsemua, total;
    private int penjumlahan;

    public void print(String a) {
        System.out.println(a);
    }

    public void enter(String b) {
        System.out.println(b);
    }

    public int getHargasatuan() {
        return hargasatuan;
    }

    public void setHargasatuan(int hargasatuan) {
        this.hargasatuan = hargasatuan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHargatotal() {
        return hargatotal;
    }

    public int setHargatotal() {
        hargatotal = hargasatuan * stok;
        return hargatotal;
    }

    public int getTotalsemua() {
        return totalsemua;
    }

    public int setTotalsemua(int hargatotal) {
        totalsemua += hargatotal;
    return totalsemua;
    }


}
