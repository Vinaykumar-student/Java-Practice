import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){
        LocalDate localDate=LocalDate.now();
        LocalTime localTime=LocalTime.now();
        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("DD MM YYYY HH:mm:ss");
        String date=dateTime.format(dateTimeFormatter);
        System.out.println(date);
        System.out.println(dateTime);
        System.out.println(localTime);
        System.out.println(localDate);

    }
}
