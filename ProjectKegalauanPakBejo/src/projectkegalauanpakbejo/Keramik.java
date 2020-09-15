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
   /* membuat ATRIBUT */
   int hargaA = 54000;
   int hargaB = 65000;
   int hargaC = 60000;
   int panjangA = 30, lebarA = 30;
   int panjangB = 40, lebarB = 40;
   int panjangC = 30, lebarC = 40;
   int jumlahKeramikAPerBox = 10;
   int jumlahKeramikBPerBox = 5;
   int jumlahKeramikCPerBox = 8;
   int luasRumah = 1000000;

    /* membuat METHODS */
    int hitungLuasKeramikA(){
        int luasA;
        luasA = this.panjangA * this.lebarA;
        return luasA;
    }
    int hitungLuasKeramikB(){
        int luasB;
        luasB = this.panjangB * this.lebarB;
        return luasB;
    }   
    int hitungLuasKeramikC(){
        int luasC;
        luasC = this.panjangC * this.lebarC;
        return luasC;
    }   
    int hitungHargaKeramikA(){
        int totalKeramik,totalBox,totalHarga;
        totalKeramik = this.luasRumah / this.hitungLuasKeramikA();
        totalBox = totalKeramik / this.jumlahKeramikAPerBox;
        totalHarga = totalBox * this.hargaA;
        System.out.println("Total harga keramik A : Rp " + totalHarga);
        return totalHarga;
    }
    int hitungHargaKeramikB(){
        int totalKeramik,totalBox,totalHarga;
        totalKeramik = this.luasRumah / this.hitungLuasKeramikB();
        totalBox = totalKeramik / this.jumlahKeramikBPerBox;
        totalHarga = totalBox * this.hargaB;
        System.out.println("Total harga keramik B : Rp " + totalHarga);
        return totalHarga;
    }
    int hitungHargaKeramikC(){
        int totalKeramik,totalBox,totalHarga;
        totalKeramik = this.luasRumah / this.hitungLuasKeramikC();
        totalBox = totalKeramik / this.jumlahKeramikCPerBox;
        totalHarga = totalBox * this.hargaC;
        System.out.println("Total harga keramik C : Rp " + totalHarga);
        return totalHarga;
    }
}

