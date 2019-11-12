/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

/**
 *
 * @author jaringan
 */
public class Latihan1Main {

    public static void main(String[] args) {
        Latihan1 ob = new Latihan1();
        int angka[] = {-4, -6, -3, -4, -2, -3, -3};
        ob.tampil("Angka : ");
        ob.setAngka(angka);
        ob.tampil(ob.getAngka());
        ob.tampil("===============================");


        ob.enter("");
        ob.tampil("Nilai Maks : ");
        ob.setMaks(angka);
        ob.tampil(ob.getMaks());
        ob.tampil("===============================");


        ob.enter("");
        ob.tampil("Nilai Min : ");
        ob.setMin(angka);
        ob.tampil(ob.getMin());
        ob.tampil("===============================");


        ob.enter("");
        ob.tampil("Hasil rata-rata deret angka : ");
        ob.setMean(angka);
        ob.tampil(ob.getMean());
        ob.tampil("===============================");


        ob.enter("");
        ob.setIndex(-3);
        ob.tampil("-3 terletak pada index ");
        ob.tampilindex(ob.getIndex());
    }
}
