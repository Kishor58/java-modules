package Java8Features;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Date_And_Time_Api {
    public static void main(String[] args) {
        LocalDate date= LocalDate.now();
        System.out.println(date);

        LocalTime time=LocalTime.now();
        System.out.println(time);

        LocalDate birthday=LocalDate.of(2000,04,02);
        LocalDate today=LocalDate.now();

        Period p=Period.between(birthday,today);

        System.out.printf("Age  is %d years %d months %d Days ",p.getYears(),p.getMonths(),p.getDays());

    }
}
