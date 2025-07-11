public class Bien {
    String address = "Cần Thơ"; //Biền toàn cục
    static String sdt = "028625666";
    //Hàm 1
    public void sayHello() {
        int n = 10 ; // Biến cục bộ
        System.out.println("n la" + n);
    }

    //Hàm 2
    public void getInfo(){
        System.out.println(address);
    }




    public static void main(String[] args) {
        int number1 = 123;
        int number2 = 345;
        String name = "Hương";
// in giá trị ra màn hình


        System.out.println(number1);
        System.out.println(number2);
        System.out.println(name);


    }
}
