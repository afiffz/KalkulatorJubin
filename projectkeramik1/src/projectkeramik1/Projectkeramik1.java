/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkeramik1;

/**
 *
 * @author afiff
 */
public class Projectkeramik1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Keramik A = new Keramik();
        A.ukuran = 30*30;
        A.isi = 10;
        A.harga = 54000;
        A.hitungKeramik();
        A.hitungBox();
        A.hitungHarga();
        
        Keramik B = new Keramik();
        B.ukuran = 40*40;
        B.isi = 5;
        B.harga = 65000;
        B.hitungKeramik();
        B.hitungBox();
        B.hitungHarga();
        
        Keramik C = new Keramik();
        C.ukuran = 30*40;
        C.isi = 8;
        C.harga = 60000;
        C.hitungKeramik();
        C.hitungBox();
        C.hitungHarga();
    }  
}
