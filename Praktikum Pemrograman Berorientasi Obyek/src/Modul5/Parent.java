/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author jaringan
 */
public class Parent extends Grandparent {

    private String input;
    private int jmlfilm;
    private String judul,  aktor,  sutradara,  publisher,  kategori,  stok,  jml;
    BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));

    protected void tampil(String a) {
        System.out.print(a);
    }


    protected void inputfilm() throws IOException {

        JOptionPane.showMessageDialog(null, "Masukkan data film! \nPastikan Input dengan Huruf Kapital!");
        input = JOptionPane.showInputDialog("Masukkan judul film!");
        super.setJudul(input);
        input = JOptionPane.showInputDialog("Masukkan Aktor film!");
        super.setAktor(input);
        input = JOptionPane.showInputDialog("Masukkan Suradara film!");
        super.setSutradara(input);
        input = JOptionPane.showInputDialog("Masukkan Publisher film!");
        super.setPublisher(input);
        input = JOptionPane.showInputDialog("Masukkan Kategori film!");
        super.setKategori(input);
        input = JOptionPane.showInputDialog("Masukkan Stok film!");
        super.setStok(input);
        this.tampil("\nData Film :");
        this.display();
        input = JOptionPane.showInputDialog("\nApa anda ingin melakukan input? YA / TIDAK? \n");

        if (input.equals("TIDAK")) {
            this.tampil("\n");
            System.exit(0);
        } else if (input.equals("YA")) {
            this.inputfilm();
        }
    }

    protected void display() {
        this.tampil("\nJudul     : " + super.getJudul());
        this.tampil("\nAktor     : " + super.getAktor());
        this.tampil("\nSutradara : " + super.getSutradara());
        this.tampil("\nPublisher : " + super.getPublisher());
        this.tampil("\nKategori  : " + super.getKategori());
        this.tampil("\nStok      : " + super.getStok());
        this.tampil("\n==================================\n");
    }
}
