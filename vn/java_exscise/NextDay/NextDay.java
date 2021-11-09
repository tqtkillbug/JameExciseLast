package com.java_exscise.NextDay;


public class NextDay {
    private int day;
    private int month;
    private int year;
    private int maxDayInMonth;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean checkLeapYear() {
        return year % 4 == 0 && year % 100 != 0;
    }

    @Override
    public String toString() {
        return "{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public void checkmonth() {
        if (day > 0 && day < 31 || month > 0 && month < 12){
            switch (month) {
                case 2:
                    if (checkLeapYear()) {
                        maxDayInMonth = 29;
                    } else {
                        maxDayInMonth = 28;
                    }
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    maxDayInMonth = 31;
                    break;
                default:
                    maxDayInMonth = 30;
            }
        }
    }
       public String CheckDay(){
           checkmonth();
           switch (month) {
               case 2:
                 if(maxDayInMonth == 28 || maxDayInMonth == 29){
                     day = 1;
                     month += 1;
                 } else{
                     day += 1;
                 }
                 break;
               case 1:
               case 3:
               case 5:
               case 7:
               case 8:
               case 10:
               case 12:
                    if (maxDayInMonth == 31){
                        day = 1;
                        month += 1;
                    } else{
                        day += 1;
                    }
                   break;
               default:
                   if(maxDayInMonth == 30){
                       day = 1;
                       month += 1;
                   } else{
                       day += 1;
                   }
           }
           if(day == 31 && month == 12){
               day = 1;
               month = 1;
               year += 1;
           }
           return "Next Day: " + day + "/" + month + "/" + year;
       }

}


