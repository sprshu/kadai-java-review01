
public class JavaProgrammingBasicSummary {

    public static void main(String[] args) {
        add(45,13);
        double result=add(12.3,4.8);
        System.out.println("double型の加算"+ result);
    }
    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("int型の加算"+result);
    }
    
    public static double add(double num1,double num2) {
        double result=num1+num2;
        return result;
    }
    public class SampleEnum {
        // 列挙型Genderの定義
        public static enum Gender {
            MALE,
            FEMALE
        }

        public static void main (String[] args) {
            
            // Gender型の変数の宣言と初期化
            Gender gender0 = Gender.MALE;
            Gender gender1 = Gender.FEMALE;
            
            // genderの利用
            System.out.println(gender0);
            System.out.println(gender1);

            // 採番された数値を取得したい場合は 変数名.ordinal() と書く
            System.out.println(gender0.ordinal());
            System.out.println(gender1.ordinal());
        }
    }

}

