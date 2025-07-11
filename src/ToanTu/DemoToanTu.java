package ToanTu;

public class DemoToanTu {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        double d,e,f;

        //Toán tử số học
        System.out.println("a/b bằng: " + (a%b));
        System.out.println("a/b bằng: "+ (a/b));
        System.out.println(a++);
        System.out.println(a);

        //Toán tử so sánh
        System.out.println("So sánh a > b:"+ (a>b));
        System.out.println((a>b)&&(a<b));
        System.out.println((a>b)||(a<b));
    }
}
