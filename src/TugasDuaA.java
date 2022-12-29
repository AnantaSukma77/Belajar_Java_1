import java.util.Scanner;

public class TugasDuaA {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double diameter, rusuk, luas, volume;

        System.out.println("Masukan panjang diameter");
        diameter = keyboard.nextDouble();

        System.out.println("Masukan panjang rusuk");
        rusuk = keyboard.nextDouble();

        luas = 3.14 * diameter * diameter / 4;
        volume = rusuk * rusuk * rusuk;

        System.out.println("Luas lingkaran adalah " + luas + " dan volume kubus adalah " + volume);
    }
}
