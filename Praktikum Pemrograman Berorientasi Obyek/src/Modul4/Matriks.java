/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4;

/**
 *
 * @author jaringan
 */
public class Matriks {

    private int[][] A;
    private int[][] B;
    private int[][] hasiljumlah;
    private double hasilkali[][];

    public int[][] getA() {
        return A;
    }

    public int[][] getB() {
        return B;
    }

    public void setA(int[][] A) {
        this.A = A;
    }

    public int[][] getHasiljumlah() {
        return hasiljumlah;
    }

    public double[][] getHasilkali() {
        return hasilkali;
    }

    public void setB(int[][] B) {
        this.B = B;
    }

    public void setHasiljumlah(int[][] a, int[][] b) {
        this.hasiljumlah = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                hasiljumlah[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    public void setHasilkali(int[][] a, double b) {
        this.hasilkali = new double[hasiljumlah.length][hasiljumlah[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                hasilkali[i][j] = hasiljumlah[i][j] * b;
            }
        }

    }

    public void cetak(String a) {
        System.out.println(a);
    }

    public void cetakin(String b) {
        System.out.print(b);
    }

    public void cetakmatrik(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("   " + a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void cetakmatrik(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("   " + a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
