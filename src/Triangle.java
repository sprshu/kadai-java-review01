
public class Triangle {

    public static void main(String[] args) {
        int a = 8;
        int b = 4;
        int c = 5;
        
        if (a == 5&&b == 5&&c == 5) {
            System.out.print("正三角形です");
        }else if(a==8&&b==5&&c==5) {
            System.out.print("二等辺三角形です");
        }else
            System.out.print("不等辺三角形です");
    }
}