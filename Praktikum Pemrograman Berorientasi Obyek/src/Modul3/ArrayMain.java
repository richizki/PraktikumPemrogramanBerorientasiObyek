/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

/**
 *
 * @author jaringan
 */
public class ArrayMain {

    public static void main(String[] args) {
        Array ob = new Array();
        String mahasiswa[] = {"Dono", "Danu", "Dana", "Dini", "Doni"};
        int deret[] = {2, 5, 6, 9, 7};
        ob.tampil("Daftar Mahasiswa : ");
        ob.setMhs(mahasiswa);
        ob.tampil(ob.getMhs());
        ob.tampil("===============================");
        ob.tampil("Deret : ");
        ob.setDeret(deret);
        ob.tampil(ob.getDeret());
        ob.tampil("Hasil penjumlahan deret : ");
        ob.setPenjumlahan(deret);
        ob.tampil(ob.getPenjumlahan());


        ob.hapus();
        mahasiswa = null;
        deret = null;
        ob = null;
    }
}
