package Soal4;


public class OperasiMatematika {
     public static void main(String[] args) {
        // Deklarasi variabel
        int x = 22;
        int y = 33;

        // Operasi aritmetika
        int tambah = x + y;
        int kurang = x - y;
        int kali = x * y;
        double bagi = (double) x / y; // gunakan double agar hasil pembagian desimal

        // Tampilkan hasil
        System.out.println("=== Program Operasi Dua Bilangan ===");
        System.out.println("Nilai x = " + x);
        System.out.println("Nilai y = " + y);
        System.out.println("Penjumlahan (x + y) = " + tambah);
        System.out.println("Pengurangan (x - y) = " + kurang);
        System.out.println("Perkalian  (x * y) = " + kali);
        System.out.println("Pembagian  (x / y) = " + bagi);
    }
}

