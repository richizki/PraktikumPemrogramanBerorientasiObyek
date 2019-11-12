/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

/**
 *
 * @author jaringan
 */
public class Latihan1 {

    private int[] angka = new int[7];
    private int[] index = new int[7];
    private double mean;
    private int maks,  min;

    public int[] getAngka() {
        return angka;
    }

    public void setAngka(int[] angka) {
        this.angka = angka;
    }

    public int getMaks() {
        return maks;
    }

    public void setMaks(int[] angka) {
        maks = angka[0];
        for (int i = 0; i < angka.length; i++) {
            if (maks < angka[i]) {
                maks = angka[i];
            }
        }
        this.maks = maks;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int[] angka) {
        int i;
        min = angka[0];
        for (i = 0; i < angka.length; i++) {
            if (min > angka[i]) {
                min = angka[i];
            }
        }
        this.min = min;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(int[] angka) {
        int i;
        for (i = 0; i < angka.length; i++) {
            mean += angka[i];
        }
        mean = (mean / 7);
        this.mean = mean;
    }

    public int[] getIndex() {
        return index;
    }

    public void setIndex(int index) {
        int i;
        for (i = 0; i < angka.length; i++) {
            if (angka[i] == index) {
                this.index[i] = i;
            }
        }
    }

    public void tampilindex(int[] index) {
        int i;
        for (i = 0; i < index.length; i++) {
            if (index[i] != 0) {
                System.out.print(index[i]);
                System.out.print(" ");
            }
        }
        System.out.println("");
    }

    public void tampil(String a) {
        System.out.println(a);
    }

    public void tampil(int a[]) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += ", " + a[i];
            }
        }
        System.out.println(data);
    }

    public void tampil(double a) {
        System.out.println(a);
    }

    public void enter(String b) {
        System.out.println("");
    }
}
