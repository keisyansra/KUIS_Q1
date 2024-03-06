package KUIS;

import java.util.Scanner;

public class Mobil14 {
    String nama;
    double cc, pajak, hargaBeli, perawatan, biayaTotal, tahunProduksi;

    public double hitungPajak() {
        if (cc > 1500) {
           return pajak = hargaBeli*0.10;
            
        } else {
            return pajak = hargaBeli*0.075;
        }
    }

    public double hitungBiayaPerawatan() {
        if (tahunProduksi < 2010) {
            return perawatan = hargaBeli*0.08;
        } else {
            return perawatan = hargaBeli*0.05;
        }
    }

    public double hitungBiayaTotal() {
        return pajak+perawatan;
    }

    public void printData() {
        System.out.println("Nama Mobil: " +nama);
        System.out.println("CC: " +cc);
        System.out.println("Harga Beli: " + String.format("%.0f", hargaBeli));
        System.out.println("Tahun Produksi: " + String.format("%.0f", tahunProduksi));
        System.out.println("Biaya Pajak: " + String.format("%.0f", hitungPajak()));
        System.out.println("Biaya Perawatan: " + String.format("%.0f", hitungBiayaPerawatan()));
        System.out.println("Total Keseluruhan: " + String.format("%.0f", hitungBiayaTotal()));
    }

    public void printDataBiayaTertinggi(Mobil14[] mobilArray) {
        Mobil14 mobilTertinggi = mobilArray[1];
        double biayaTertinggi = mobilTertinggi.hitungBiayaTotal();
    
        for (int i = 1; i < mobilArray.length; i++) {
            if (mobilArray[i].hitungBiayaTotal() > biayaTertinggi) {
                mobilTertinggi = mobilArray[i];
                biayaTertinggi = mobilTertinggi.hitungBiayaTotal();
            }
        }

        System.out.println("Data Mobil dengan Biaya Tertinggi:");
        mobilTertinggi.printData();
    }
        
    

    public static void main(String[] args) {
        Mobil14[] totalHarga = new Mobil14[4];
        Scanner sc = new Scanner(System.in);

        System.out.println("---- INFORMASI MOBIL ----");

        for (int i=1; i < 4; i++) {
        totalHarga[i] = new Mobil14();
        System.out.println("Biaya Total Mobil ke " +i);

        System.out.print("Masukkan nama mobil : ");
        sc.nextLine();
        totalHarga[i].nama = sc.nextLine();

        System.out.print("Masukkan harga beli : ");
        totalHarga[i].hargaBeli = sc.nextDouble();

        System.out.print("Masukkan tahun produksi mobil : ");
        totalHarga[i].tahunProduksi = sc.nextDouble();

        System.out.print("Masukkan cc mobil : ");
        totalHarga[i].cc = sc.nextDouble();

        System.out.println("---- BIAYA YANG HARUS DIKELUARKAN ----");
        totalHarga[i].printData();

        System.out.println("---- BIAYA MOBIL TERTINGGI -----");
        totalHarga[i].printDataBiayaTertinggi(totalHarga);
        
        System.out.println(" ");

        

        }
    }
}
