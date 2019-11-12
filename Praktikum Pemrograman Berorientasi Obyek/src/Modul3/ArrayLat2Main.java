/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3;

/**
 *
 * @author jaringan
 */
public class ArrayLat2Main {

    public static void main(String[] args) {
        ArrayLat2 obj = new ArrayLat2();

        int[] bil = {4, 7, 8, 6, 7, 2, 7};
        obj.cetak("Deret bilangan asli : ");
        obj.cetakbilangan(bil);
        obj.cetak("\nNomor 1");
        obj.cetak("Deret bilangan setelah 7 diganti dengan 3 : ");
        obj.setGanti(bil, 7, 3);
        obj.cetakbilanganganti(obj.getGanti());

        obj.cetak("\nNomor 2");
        obj.cetak("Deret bilangan setelah dikali dengan 0.5 : ");
        obj.setPerkalian(obj.getGanti(), 0.5);
        obj.cetakkali(obj.getPerkalian());
    }
}
