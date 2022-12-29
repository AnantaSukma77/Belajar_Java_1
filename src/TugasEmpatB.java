import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TugasEmpatB {
    public static void main(String[] args) {
        LocalDateTime currentDate = LocalDateTime.now();
        LocalDateTime dob = LocalDateTime.of(1998, 12, 3, 0, 0, 0);
        System.out.println(dob);

        Long umur = ChronoUnit.DAYS.between(dob, currentDate);
        System.out.println(umur);
        System.out.println(Period.between(dob.toLocalDate(), currentDate.toLocalDate()).getYears());
        System.out.println( currentDate.getYear() - dob.getYear());
    }
}
