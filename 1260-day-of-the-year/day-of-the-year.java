import java.time.LocalDate;
class Solution {
    public int dayOfYear(String date) {
        LocalDate d=LocalDate.parse(date);
        return d.getDayOfYear();
        // int year=Integer.parseInt(date.substring(0,4));
        // int month=Integer.parseInt(date.substring(5,7));
        // int day=Integer.parseInt(date.substring(8,10));
        // int days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        // if((year%400==0)||(year%4==0&&year%100!=0)){
        //     days[1]=29;
        // }
        // int dayNumber=day;
        // for(int i=0;i<month-1;i++){
        //     dayNumber=dayNumber+days[i];
        // }
        // return dayNumber;
    }
}