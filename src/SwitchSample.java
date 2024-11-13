
public class SwitchSample {

    public static void main(String[] args) {
        int score = 59;
        
        int rank = ranking(score);
        switch(rank) {
            case 0 :
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.print("赤点です。補修を行います");
                break;
            case 6 :
            case 7 :
                System.out.print("合格です");
                break;
            case 8 :
            case 9 :
                System.out.print("よくできました！");
                break;
            case 10 :
                System.out.print("満点です！ご褒美をあげます！");
                break;
                default:
                    System.out.print("点数は0以上100以内で入力してください");
                    break;
        }
    }
    public static int ranking(int score) {
        if(score < 0) {
            return -1;
        }else if(score>100) {
            return 11;
        }else {
            return score / 10;
        }
    }
}
