import java.util.Scanner;
public class TugasSatuA {
    public static void main(String[] args) {
        String nama, kata;
        kata = "Selamat datang di bootcamp Kawah Edukasi, ";
        Scanner keyboard = new Scanner(System.in);
        nama = keyboard.nextLine();
        System.out.println(kata + nama);
    }
}