/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;

/**
 *
 * @author jaringan
 */
public class MainMatriks {

    public static void main(String[] args) {
        Matriks obj = new Matriks();
        int a[][] = {{1, 2}, {3, 5}, {6, 7}};
        int b[][] = {{8, 9}, {10, 11}, {12, 13}};

        obj.cetakin("A");
        obj.cetakmatrik(a);

        obj.cetak("");
        obj.cetakin("B");
        obj.cetakmatrik(b);

        obj.cetak("");
        obj.cetak("Dengan menggunakan objek dan enkapsulasi (setter getter), matrik A dan B dijumlahkan sehingga menghasilkan matrik :");
        obj.cetakin("C");
        obj.setHasiljumlah(a, b);
        obj.cetakmatrik(obj.getHasiljumlah());

        obj.cetak("");
        obj.cetak("Dengan menggunakan objek dan enkapsulasi (setter getter), matrik C pada no.1 dikalikan dengan 0.5 :");
        obj.setHasilkali(obj.getHasiljumlah(), 0.5);
        obj.cetakmatrik(obj.getHasilkali());
    }
}
