package com.odde.tdd;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CaculateBudget {

    private BudgetRepo budgetRepo;
    private Budget budget;
    public int caculateBudget(String startTime,String endTime){
        List<Budget> listBudget = budgetRepo.findAll();

        LocalDate startDateTime = LocalDate.parse(startTime,DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate endDateTime = LocalDate.parse(endTime,DateTimeFormatter.BASIC_ISO_DATE);
        Period timePeriod = Period.between(startDateTime,endDateTime);
        int yearDuration = timePeriod.getYears();
        int[] year = new int[yearDuration+1];
        for(int i = 0; i<= yearDuration; i++){
            year[i] = startDateTime.getYear()+i;

        }
        int totalMonths = (int) timePeriod.toTotalMonths();
        String[] months = new String[totalMonths+1];
        int startMonth = startDateTime.getMonthValue();
        int k =0;
        for(int j = 0; j< year.length;j++){
            if(startDateTime.getYear() == year[j]){
                for(int i = startMonth; i<=12;i++){
                    months[k] = String.valueOf(year[j])+"-"+String.format("%02d" , String.valueOf(i));
                    k++;
                }
            }else if(year[j]< endDateTime.getYear()){
                for(int i = 1; i<=12;i++){
                    months[k] = String.valueOf(year[j])+"-"+String.format("%02d" , String.valueOf(i));
                    k++;
                }
            }else if(year[j] == endDateTime.getYear()){
                for(int i = 1; i<=endDateTime.getMonthValue();i++){
                    months[k] = String.valueOf(year[j])+"-"+ String.format("%02d" , String.valueOf(i)) ;
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
                        String.valueOf(months[i]),DateTimeFormatter.ISO_LOCAL_DATE
                ).getDayOfMonth();
            }
        }
        int budgetTotal = 0;

        return budgetTotal;
    }
}
