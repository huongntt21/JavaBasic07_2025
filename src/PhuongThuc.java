public class PhuongThuc {

    public double sum;
    public double res;
    //Hàm không trả về
    public void cong2so(){

        int a = 5;
        int b = 10;
        sum = a + b;
        System.out.println(sum);

    }

    public double nhan2so() {
        int a = 5;
        int b = 10;
        res = a * b;
        return res;

    }

    public void loginCRM(){
        System.out.println("xin chào");
        System.out.println("trang crm");
    }

    public static void main(String[] args) {

        PhuongThuc phuongThuc = new PhuongThuc();
        phuongThuc.cong2so();
        phuongThuc.nhan2so();
        phuongThuc.loginCRM();
    }
}
