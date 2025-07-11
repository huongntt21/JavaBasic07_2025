package DieuKienIfElse;

public class DemoIf {
    public static void main(String[] args) {
        int age =20;
        String address = "Hà Nội";
        String header = "Login CMS";
        //So sánh dùng hàm equals
        //So sánh chưa dùng hàm contains
        if ((age==18) && address.equals("HN")){
            System.out.println("Đi nghĩa vụ qsu");
        }

        if (header.contains("CRM")){
            System.out.println("Đi tởi trang ");
        }
    }
}
