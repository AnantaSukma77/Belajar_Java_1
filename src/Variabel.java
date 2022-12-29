import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Variabel {
    public static void main(String[] args) {
//        int umur = 30; //primitif
//        Integer umurBaru = umur; //bukan primitif (object)
//
//        Float umurFloat = umurBaru.floatValue();
//        long umurKecil = umurFloat.longValue();
////        String coba = umurBaru.toString();
////        System.out.println(coba);
////        System.out.println(umurBaru);
//        System.out.println(umurKecil);
            Scanner scanner = new Scanner(System.in);
            // dd/MM/yyyy
            System.out.print("Input dob : ");
            String input = scanner.nextLine();

            LocalDate localDate = LocalDate.parse(input, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if(localDate.isAfter(LocalDate.now())){ //max
                System.out.print("Invalid Input");
            } else {
                System.out.println(localDate);
            }
    }
}
