
public class IfElseIfSample {

    public static void main(String[] args) {
        int score = 100;
        if(score == 100) {
            System.out.print("満点です！ご褒美をあげます！");
        }else if(score >=80) {
            System.out.print("よくできました！");
        }else if(score >=60) {
            System.out.print("合格です！");
        }else
            System.out.print("赤点です。。。。補修を行います");
    }
}
