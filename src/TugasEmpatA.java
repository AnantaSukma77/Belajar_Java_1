import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
public class TugasEmpatA {
    public static void main(String[] args) {

//        String output;
        LocalDate awal = LocalDate.parse("2022-12-12");
        System.out.println(awal.format(DateTimeFormatter.ofPattern("dd MMMM yyy")));
//        LocalDateTime currentDate = LocalDateTime.now();

//        //Mon, 12 December, 22
//        output = currentDate.format(DateTimeFormatter.ofPattern(
//                "dd MMMM yy"
//        ));
//        System.out.println(output);
    }
}
