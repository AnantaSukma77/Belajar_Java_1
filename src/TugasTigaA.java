import java.util.Scanner;

public class TugasTigaA {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukan angka 0 sampai 9 dan kita lihat data yang ditemukan");
        int index = keyboard.nextInt();

        String[] myNum = {"Jepang", "Korea", "Indonesia", "Cina", "Malaysa", "Belanda", "Arab", "Irak", "Iran", "Amerika"};

        for (int i = 0; i < myNum.length; i++){
            if ( i == index){
                System.out.println("Hasil " + myNum[i]);
            }
        }
    }
}