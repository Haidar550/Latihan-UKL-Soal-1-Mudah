package UKL;

import java.util.Scanner;

public class HitungBiayaPengiriman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan berat paket (kg): ");
        double berat = scanner.nextDouble();
        
        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = scanner.nextDouble();
        
        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = scanner.nextDouble();
        
        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = scanner.nextDouble();
        double volume = panjang * lebar * tinggi;
        
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }
        double biayaBerat = berat * biayaPerKg;
        double biayaVolumeTambahan = 0;
        final double BatasVolume = 100; 
        final double BiayaTambah = 50000;
        
        if (volume > BatasVolume) {
            biayaVolumeTambahan = BiayaTambah;
            System.out.println("Akan dikenakan biaya tambahan sebesar Rp " + (int)biayaVolumeTambahan);
            System.out.println("Karena volume paket Anda adalah " + (int)volume + " cm³");
        }
        
        double totalBiaya = biayaBerat + biayaVolumeTambahan;
        System.out.println("Total Biaya  : Rp " + (int)totalBiaya);
        scanner.close();
    }
}
