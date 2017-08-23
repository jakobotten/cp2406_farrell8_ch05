import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class PastPresentFuture {
    public static void main(String[] args) {
        int day;
        int month;
        int year;
        int currentDay;
        int currentMonth;
        int currentYear;
        String output;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a day: ");
        day = input.nextInt();
        System.out.println("Enter a month: ");
        month = input.nextInt();
        System.out.println("Enter a year: ");
        year = input.nextInt();

        DateFormat yearFormat = new SimpleDateFormat("yyyy");
        DateFormat monthFormat = new SimpleDateFormat("MM");
        DateFormat dayFormat = new SimpleDateFormat("dd");

        Date currentDate = new Date();
        currentYear = Integer.parseInt(yearFormat.format(currentDate));
        currentMonth = Integer.parseInt(monthFormat.format(currentDate));

        if (year != currentYear)
            output = "not this year";
        else if (month < currentMonth)
            output = "in an earlier month this year";
        else if (month > currentMonth)
            output = "in a later month this year";
        else
            output = "this month";
        System.out.println(output);

    }
}
