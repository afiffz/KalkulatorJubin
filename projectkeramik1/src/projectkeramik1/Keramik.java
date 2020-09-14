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
public class Keramik {
    int luas = 1000000, ukuran, isi, harga;
    
    void hitungKeramik(){
        int bijian;
        bijian = this.luas / this.ukuran;
        System.out.println("Jumlah Keramik yang dibutuhkan : " + bijian + " pcs");
    }
    void hitungBox(){
        int box;
        box = (this.luas / this.ukuran)/this.isi;
        System.out.println("Sebanyak " + box + " box");
    }
    void hitungHarga(){
        int total;
        total = ((this.luas / this.ukuran)/this.isi) * this.harga;
        System.out.println("Jadi Harga keramik yakni Rp." + total);
    }
}
