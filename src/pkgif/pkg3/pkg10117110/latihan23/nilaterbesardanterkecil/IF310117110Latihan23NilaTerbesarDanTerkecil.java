
/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Nilai Terbesar dan Terkecil dari data yang user inputkan
 */

package pkgif.pkg3.pkg10117110.latihan23.nilaterbesardanterkecil;

import java.util.Scanner;

public class IF310117110Latihan23NilaTerbesarDanTerkecil {
    
    public static void main(String[] args) {
  
        String Petugas;
        int BanyakMhs, terendah, tertinggi, x;
        Scanner scan = new Scanner(System.in);

        
        
         
        System.out.println("===Program Nilai Terbesar dan Terkecil Mahasiswa===");
        System.out.print("Masukan Nama Petugas : ");
        Petugas = scan.next();
        
        System.out.print("Masukan Banyaknya Nilai Mahasiswa : ");
        BanyakMhs = scan.nextInt();
        
        int[] Nilai= new int [100];
        
        
        for(x=1; x<=BanyakMhs; x++){
        System.out.print("Masukan Nilai Mahasiswa ke- "+x+":");
        Nilai[x] = scan.nextInt();
        

        }   
        
        // Variabel min max
        tertinggi=Nilai[0];
        terendah=Nilai[0];
        
  for (x=1; x<=BanyakMhs; x++){
      if(Nilai[x]<terendah){
          terendah=Nilai[x];
      }else if (Nilai[x]>tertinggi){
          tertinggi=Nilai[x];
          
      }
  }
        System.out.println("");
        System.out.println("");
        System.out.println("Bilangan Terbesar adalah : " +tertinggi);
        System.out.println("Bilangan Terkecil adalah : " +terendah);
        System.out.println("Petugas : " +Petugas);



          


    
}
}