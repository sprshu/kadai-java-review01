
public class AndSample {

    public static void main(String[] args) {
        int score = 59;
        if(score == 100) {
            System.out.print("満点です！ご褒美をあげます");
        }else if(score >=80 && score <=99) {
            System.out.print("よくできました");
        }else if(score >60 && score <=79) {
            System.out.print("合格です");
        }else {
            System.out.print("赤点です。補修を行います");
        }
    }

}
