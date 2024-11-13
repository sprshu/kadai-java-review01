
public class Review01 {

    public static void main(String[] args) {
        int num1 = 1500; //商品価格
        double num2 = 0.1; //消費税率
        double result = tax(num1,num2);
        System.out.print(num1 + "円の商品の税込価格は" + (int)(num1 + result) + "円(消費税は" + (int)result + "円)です。");
        
    }
    
    public static double tax(int num1, double num2) {
        double num = num1 * num2;
        return num;
    }
}
