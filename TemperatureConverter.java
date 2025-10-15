public class TemperatureConverter {
    public static void main(String[] args) {
        // Example inputs
        double celsius = 25.0;     // temperature in Celsius
        double fahrenheit = 77.0;  // temperature in Fahrenheit

        // Celsius to Fahrenheit (implicit)
        double CtF = celsius * 9 / 5 + 32;
        System.out.println(celsius + "°C = " + CtF + "°F");

        // Fahrenheit to Celsius (explicit)
        double FtC = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F = " + FtC + "°C");
    }
}