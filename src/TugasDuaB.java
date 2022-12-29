import java.util.Scanner;
public class TugasDuaB {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int umur;
        String pendidikan, kemauan, bersedia;

        System.out.println("Masukan umur");
        umur = keyboard.nextInt();

        if ( 17 <= umur ) {
            if ( umur <= 27) { System.out.println("Lulus"); }
            else { System.out.println("Umur tidak masuk syarat"); }
        } else { System.out.println("Umur tidak masuk syarat"); }

        System.out.println("Pendidikan SMA/SMK, D3, D4/S1 (Contoh: S1)");
        pendidikan = keyboard.nextLine();

        if ( pendidikan == "SMA"){
            System.out.println("Lulus");
        } else if (pendidikan == "SMK") {
            System.out.println("Lulus");
        } else if (pendidikan == "D3") {
            System.out.println("Lulus");
        } else if (pendidikan == "D4") {
            System.out.println("Lulus");
        } else if (pendidikan == "S1") {
            System.out.println("Lulus");
        } else {System.out.println("Pendidika tidak memenuhi syarat");}

        System.out.println("Punya kemauan kuat ? Ya/Tidak (contoh: Ya");
        kemauan = keyboard.nextLine();
        if (kemauan == "Ya"){
            System.out.println("Lulus");
        } else if (kemauan == "Tidak") {
            System.out.println("Gagal");
        } else {System.out.println("Masukan Jawaban yang benar");}

        System.out.println("Bersedia kerja sebagai IT Consultan ? Ya/Tidak (Contoh: Tidak");
        bersedia = keyboard.nextLine();
        if (bersedia == "Ya"){
            System.out.println("Lulus");
        } else if (bersedia == "Tidak") {
            System.out.println("Gagal");
        } else {System.out.println("Masukan Jawaban yang benar");}
    }
}
