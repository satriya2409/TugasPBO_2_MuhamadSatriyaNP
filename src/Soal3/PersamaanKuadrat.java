package Soal3;


public class PersamaanKuadrat {
    public static void main(String[] args) {
        // Diketahui
        double a = 2;
        double b = 10;
        double c = 5;

        // Rumus diskriminan (b^2 - 4ac)
        double D = (b * b) - (4 * a * c);

        // Tampilkan hasil
        System.out.println("=== Program Persamaan Kuadrat ===");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c);
        System.out.println("Hasil dari b^2 - 4ac = " + D);
    }
}

