import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q7 {
    public static void main(String[] args) {


        LocalDate today = LocalDate.now();


        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");


        System.out.println(today.format(formatter));
    }
}
