package StaticJava;

public class LoginPage {
    public static void main(String[] args) {
        WebUI.openUrl("https://crm.anhtester.com/admin/authentication");
        WebUI.setText(WebUI.email);
        WebUI.setText(WebUI.password);
        WebUI.clickElement("");
    }
}
