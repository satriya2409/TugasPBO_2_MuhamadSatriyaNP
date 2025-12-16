
package soal1;

public class Increment {
      public static void main(String[] args) {
        int x = 10;

        System.out.println("Nilai awal x = " + x);

        // Post-increment: nilai x digunakan dulu, baru ditambah 1
        System.out.println("Hasil post-increment (x++) = " + (x++));
        System.out.println("Nilai x setelah post-increment = " + x);

        // Pre-increment: nilai x ditambah dulu, baru digunakan
        System.out.println("Hasil pre-increment (++x) = " + (++x));
        System.out.println("Nilai x setelah pre-increment = " + x);
    }
}



