
public class OrSample {

    public static void main(String[] args) {
        int scoreSansu=80;
        int scoreKokugo=80;
        
        if(scoreSansu >= 60 && scoreKokugo >=60) {
            System.out.print("合格してます！");
        }else if(scoreSansu >= 60 || scoreKokugo >= 60) {
            System.out.print("算数か国語どちらかが補修対象です");
        }else {
            System.out.print("赤点です。補修を行います");
        }
    }

}
