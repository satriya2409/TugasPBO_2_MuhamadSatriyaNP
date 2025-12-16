package Soal6;


public class SegitigaPythagoras {
    public static void main(String[] args) {
        double a = 5;
        double b = 7;

        double c = Math.sqrt((a * a) + (b * b));
        double keliling = a + b + c;

        System.out.println("Sisi miring (c) = " + c);
        System.out.println("Keliling segitiga = " + keliling);
    }
}


