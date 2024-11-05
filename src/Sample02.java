package src;

public class Sample02 {
    public static void main(String[] args) {
        int num1 = 1500;//商品価格
        double num2 = 0.1;//消費税
        double result = tax(num1,num2);
        System.out.println(num1 + "円の商品の税込価格は" + (int)(num1 + result) + "円(消費税は" + result + "円)です。");
    }
    public static double tax(int num1,double num2) {
        double num = num1 * num2;
        return num;
    }

}
