package DemoCollection;

import java.util.HashSet;
import java.util.Set;

public class DemoCollectionSet {

    public static void main(String[] args) {
        //khai báo kiểu dữ liệu set
        //ko lưu dc dữ liệu trùng lặp

        Set<String> menu = new HashSet<>();

        //Thêm dữ liệu
        menu.add("Dashboard");
        menu.add("Custom");
        menu.add("Project");
        menu.add("Project");

        System.out.println("Các phần tử của set");
        System.out.println("\t"+menu+"\n");
        //Duyệt giá trị trong set

        


    }
}
