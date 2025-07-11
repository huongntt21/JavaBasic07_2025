package StaticJava;

public class WebUI
{
    public static String url ="https://crm.anhtester.com/admin/authentication";
    public static String email ="admin02@mailinator.com";
    public static String password ="123456";
    public static void openUrl(String url){
        System.out.println(url);
    }

    public static void clickElement(String elementName){
        System.out.println("Click Element: "+ elementName);
    }

    public static void setText(String text){
        System.out.println("Set Text: " + text);
    }

    public static String getElementText(String elementName){
        return "text";
    }

    public static void main(String[] args) {
        openUrl(url);
        setText(email);
        setText(password);
        clickElement("Login");
    }
}
