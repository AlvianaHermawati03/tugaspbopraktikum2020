/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkegalauanpakbejo;

/**
 *
 * @author Masterpiece
 */
public class Keramik {
    // ATRIBUT
    int panjang;
    int lebar;
    int harga;
    int luasRumah;
    int jumlahKeramikPerBox;
    String namaKeramik;
    
    //CONSTRUCTOR
    Keramik(){
        this.panjang = 30;
        this.lebar = 30;
        this.harga = 54000;
        this.jumlahKeramikPerBox = 10;
        this.luasRumah = 1000000;
        this.namaKeramik = "A";
    }
    Keramik(int x){
        this.panjang = x;
        this.lebar = 40;
        this.harga = 65000;
        this.jumlahKeramikPerBox = 5;
        this.luasRumah = 1000000;
        this.namaKeramik = "B";
    }
    Keramik(int x, int y){
        this.panjang = x;
        this.lebar = y;
        this.harga = 60000;
        this.jumlahKeramikPerBox = 8;
        this.luasRumah = 1000000;
        this.namaKeramik = "C";
    }
    
    // METHOD NON VOID
    int luasKeramik(){
        int luasKeramik;
        luasKeramik = this.panjang * this.lebar;
        return luasKeramik;
    }
    
    // METHOD VOID
    void hargaKeramik(){
        int totalKeramik,totalBox,totalHarga;
        totalKeramik = this.luasRumah / this.luasKeramik();
        totalBox = totalKeramik / this.jumlahKeramikPerBox;
        totalHarga = totalBox * this.harga;
        System.out.println("Total harga keramik " + this.namaKeramik + " : Rp " + totalHarga);
    }
}
