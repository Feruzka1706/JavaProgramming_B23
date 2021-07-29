package day37_CustomClass;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BreakTasks {
    public static void main(String[] args) {
        ArrayList<String> country =new ArrayList<>();
        country.addAll(Arrays.asList("Uzbekistan", "USA", "Russia", "Germany", "Norway", "Kazakhstan", "Afghanistan", "Canada") );
        System.out.println(country);
        country.removeIf(each-> each.length()>=10);

        System.out.println(country);

        System.out.println("----------------------------------------------------");

        LocalDate[] dates={LocalDate.of(2020,3,20), LocalDate.of(2015,4,15),
                           LocalDate.of(2019,06,17),LocalDate.of(1993,6,17),
                          LocalDate.now(),LocalDate.of(2021,8,15)};

        ArrayList<LocalDate> result=new ArrayList<>(Arrays.asList(dates) );

        result.removeIf(p-> p.isBefore(LocalDate.of(2016,8,15) ) );
        System.out.println(result);


        System.out.println("-------------------------------------------------------------------------");

        ArrayList<String> jobTitles =new ArrayList<>(Arrays.asList("SDET", "QA", "DevOPS","Developer","Product Owner","Doctor","Artist"));
        jobTitles.retainAll(Arrays.asList("SDET","QA"));
        System.out.println(jobTitles);

    }
}
/*
task01:
            1. create an Array of string called country names

            2. write a program that can remove all the country names that have length of 10 or greater

    task02:
            1. create an Array of LocalDate
            2. write a program that can remove all the dates before August-15-2016

    task03:
            1. create an Array of String called jobTitles
            2. write a program that only keeps the jobTitles that are: SDET and QA
 */