package com.odde.tdd;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        LocalDate startDateTime = LocalDate.parse("2017-05-10",DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate endDateTime = LocalDate.parse("2018-09-10",DateTimeFormatter.ISO_LOCAL_DATE);
        Period timePeriod = Period.between(startDateTime,endDateTime);
        int yearDuration = timePeriod.getYears();
        int[] year = new int[yearDuration+1];
        for(int i = 0; i<= yearDuration; i++){
            year[i] = startDateTime.getYear()+i;

        }
        int totalMonths = (int) timePeriod.toTotalMonths();
        String[] months = new String[totalMonths+1];
        int startMonth = startDateTime.getMonthValue();
        System.out.println("startMonth"+startMonth);
        int k =0;
        for(int j = 0; j< year.length;j++){
            if(startDateTime.getYear() == year[j]){
                for(int i = startMonth; i<=12;i++){
                    months[k] = String.valueOf(year[j])+"-"+String.format("%02d" , i);
                    k++;
                }
            }else if(year[j]< endDateTime.getYear()){
                for(int i = 1; i<=12;i++){
                    months[k] = String.valueOf(year[j])+"-"+String.format("%02d" , i);
                    k++;
                }
            }else if(year[j] == endDateTime.getYear()){
                for(int i = 1; i<=endDateTime.getMonthValue();i++){
                    months[k] = String.valueOf(year[j])+"-"+String.format("%02d" , i);
                    k++;
                }
            }
        }

        int[] days = new int[totalMonths+1];
        for(int i = 0; i < days.length; i++){
            if(i==0){
                days[i] = startDateTime.getDayOfMonth();
            }else if(i==days.length-1){
                days[i] = endDateTime.getDayOfMonth();
            }else {
                days[i] = LocalDate.parse(
                        String.valueOf(months[i]),DateTimeFormatter.ofPattern("yyyy-MM")
                ).getDayOfMonth();
            }
        }
        System.out.println(Arrays.toString(days));
        System.out.println(Arrays.toString(months));
//        System.out.println(timePeriod);
//        System.out.println(timePeriod.getYears());
//        System.out.println(timePeriod.toTotalMonths());
//        System.out.println(Arrays.toString(year));

    }
}
