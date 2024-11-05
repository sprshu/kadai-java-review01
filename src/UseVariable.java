
public class UseVariable {

    public static void main(String[] args) {
        int number1=1;
        String str1;
        str1="abc";
        System.out.println(number1);
        System.out.println(str1);
        int number2=100;
        String str2="xyz";
        System.out.println(number2);
        System.out.println(str2);
        
        int secondsPerDay=24*60*60; //１日の秒数 = 24時間 x 60分 x 60秒
        System.out.println(secondsPerDay);
        
        int hoursPerDay=24;
        int minutesPerHour=60;
        int secondsPerMinutes=60;
        int secondsPerDay2=hoursPerDay*minutesPerHour*secondsPerMinutes;
        
        System.out.println(secondsPerDay2);
        
        String str="何らかのデータ";
        str="別の何か";
        System.out.println(str);
    }

}
