package Soal9;

public class KonveksiSuhu {
    public static void main(String[] args) {
        double C = 10;  // Suhu dalam Celsius
        double F = 55;  // Suhu dalam Fahrenheit
        double R = 5;   // Contoh suhu dalam Reamur (tambahan opsional)

        // Konversi suhu
        double celsiusToFahrenheit = (C * 9 / 5) + 32;
        double fahrenheitToCelsius = (F - 32) * 5 / 9;
        double celsiusToReamur = C * 4 / 5;
        double reamurToCelsius = R * 5 / 4;
        double fahrenheitToReamur = (F - 32) * 4 / 9;
        double reamurToFahrenheit = (R * 9 / 4) + 32;

        // Output hasil konversi
        System.out.println("Celsius ke Fahrenheit = " + celsiusToFahrenheit);
        System.out.println("Fahrenheit ke Celsius = " + fahrenheitToCelsius);
        System.out.println("Celsius ke Reamur = " + celsiusToReamur);
        System.out.println("Reamur ke Celsius = " + reamurToCelsius);
        System.out.println("Fahrenheit ke Reamur = " + fahrenheitToReamur);
        System.out.println("Reamur ke Fahrenheit = " + reamurToFahrenheit);
    }
}
