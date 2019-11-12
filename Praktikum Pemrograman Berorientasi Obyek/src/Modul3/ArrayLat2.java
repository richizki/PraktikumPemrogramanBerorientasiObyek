/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

/**
 *
 * @author jaringan
 */
public class ArrayLat2 {

    private int angka[];
    private int ganti;
    private double perkalian[];

    public int[] getAngka() {
        return angka;
    }

    public void setAngka(int[] angka) {
        this.angka = angka;
        angka =null;

    }

    public void setGanti(int[] angka1, int ganti,int pengganti) {
        this.angka = new int [angka1.length];
        for (int i = 0; i < angka1.length; i++) {
            if (angka1[i] == ganti) {
                angka[i] = pengganti;
            } else {
                angka[i]=angka1[i];
            }
//            System.out.println(angka[i]);
        }
    }

    public int [] getGanti() {
        return angka;
    }

    public void setPerkalian(int[] angka, double bil) {
        this.perkalian = new double [angka.length];
        for (int i = 0; i < angka.length; i++) {
            perkalian[i] = (double) ((angka[i]) * (bil));
//            System.out.println(perkalian[i]);
        }
    }

    public double [] getPerkalian() {
        return perkalian;
    }

    public void cetak(String a) {
        System.out.println(a);
    }

    public void cetakbilangan(int[] angka) {
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println("");
    }

    public void cetakbilanganganti(int [] angka) {
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
        System.out.println("");
    }

    public void cetakkali(double [] perkalian) {
        for (int i = 0; i < perkalian.length; i++) {
            System.out.print(perkalian[i] + " ");
        }
        System.out.println("");
    }
}