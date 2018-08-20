/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TugasPraktikum {
    public static void main(String[] args) {
         String Nama  = "TOKO ADITYA";
         Scanner scanner = new Scanner(System.in);
          String namabarang;
          System.out.print("Nama Barang    : ");
          namabarang = scanner.next();
          int harga ;
          System.out.print("Masukkan Harga : ");
          harga = scanner.nextInt();
           int jumlah ;
          System.out.print("Jumlah Barang  : ");
          jumlah = scanner.nextInt();
          
         
    System.out.println(Nama);
 
    System.out.println("\nNama Barang :" +namabarang );
    System.out.println("Harga Barang  :" +harga );
    System.out.println("Jumlah Barang : " +jumlah );

       
       System.out.println("Setelah di Diskon");
 int D, hargaTotal, a; 
 D = harga * jumlah;
       if(D > 500000) {
           a = D/100*50;
           hargaTotal = D - a;
        System.out.println("Kode Barang          : 070403");
        System.out.println("diskon 50%");
        System.out.println("Harga sebelum diskon : Rp"+D);
        System.out.println("Harga setelah diskon : Rp"+hargaTotal);
        
    } else if(D > 200000) {
           a = D/100*20;
           hargaTotal = D - a;
        System.out.println("Kode Barang          : 070403");
        System.out.println("diskon 20%");
        System.out.println("Harga sebelum diskon : Rp"+D);
        System.out.println("Harga setelah diskon  : Rp"+hargaTotal);
    }  else if 
        (D > 100000) {
           a = D/100*10;
           hargaTotal = D-a;
        System.out.println("Kode Barang          : 070403");
        System.out.println("diskon 10%");
        System.out.println("Harga sebelum diskon : Rp"+D);
        System.out.println("Harga setelah diskon  : Rp"+hargaTotal);

}
    }
}
