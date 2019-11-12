package Modul2;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaringan
 */
public class Main {

    public static void main(String[] args) {
        Enkapsulasi ob = new Enkapsulasi();
        ob.setNama("Vespa");
        ob.setStok(10);
        ob.setHargasatuan(10000000);
        ob.setHargatotal();
        ob.print("Nama Motor : " + ob.getNama());
        ob.print("Stok : " + ob.getStok());
        ob.print("Harga Satuan : " + ob.getHargasatuan());
        ob.print("Harga Vespa : " + ob.getHargatotal());
        ob.setTotalsemua(ob.getHargatotal());
        ob.enter("");

        ob.setNama("Scoopy");
        ob.setStok(15);
        ob.setHargasatuan(10000000);
        ob.setHargatotal();
        ob.print("Nama Motor : " + ob.getNama());
        ob.print("Stok : " + ob.getStok());
        ob.print("Harga Satuan : " + ob.getHargasatuan());
        ob.print("Harga Scoopy : " + ob.getHargatotal());
        ob.setTotalsemua(ob.getHargatotal());
        ob.enter("");

        ob.setNama("Vario");
        ob.setStok(20);
        ob.setHargasatuan(12000000);
        ob.setHargatotal();
        ob.print("Nama Motor : " + ob.getNama());
        ob.print("Stok : " + ob.getStok());
        ob.print("Harga Satuan : " + ob.getHargasatuan());
        ob.print("Harga Vario : " + ob.getHargatotal());
        ob.setTotalsemua(ob.getHargatotal());
        ob.enter("");

        ob.setNama("Supra");
        ob.setStok(30);
        ob.setHargasatuan(10000000);
        ob.setHargatotal();
        ob.print("Nama Motor : " + ob.getNama());
        ob.print("Stok : " + ob.getStok());
        ob.print("Harga Satuan : " + ob.getHargasatuan());
        ob.print("Harga Supra : " + ob.getHargatotal());
        ob.setTotalsemua(ob.getHargatotal());
        ob.enter("");
        
        ob.print("Total harga : " + ob.getTotalsemua());
    }
}
