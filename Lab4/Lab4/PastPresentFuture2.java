import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture2 {
        public static void main(String[] args) {
            int day;
            int month;
            int year;

            String output;
            Scanner input = new Scanner(System.in);

            System.out.println("Enter a day: ");
            day = input.nextInt();
            System.out.println("Enter a month: ");
            month = input.nextInt();
            System.out.println("Enter a year: ");
            year = input.nextInt();

            LocalDate inputDate = LocalDate.of(year,month,day);
            LocalDate today = LocalDate.now();
            today.withDayOfMonth(inputDate.getDayOfMonth());
            if (today.getYear() != inputDate.getYear())
                output = "not this year";
            else if (today.getMonth() == inputDate.getMonth())
                output = "this month";
            else if (today.isAfter(inputDate))
                output = "in an earlier month this year";
            else
                output = "in a later month this year";

            System.out.println(output);


        }
}
