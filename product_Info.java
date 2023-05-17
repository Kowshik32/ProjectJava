import java.util.ArrayList;
import java.util.Scanner;

public abstract class product_Info {
    Scanner scanner = new Scanner(System.in);
    Login_Info info = new Login_Info();
    static ArrayList<String> product_list = new ArrayList<>();
    static ArrayList<String> product_dis = new ArrayList<>();
    static  ArrayList<String> contact_n = new ArrayList<>();
    void add(){
        product_list.add("A");
        product_list.add("B");
        product_dis.add("hi.........");
        product_dis.add("hlw........");
        contact_n.add("0144456");
        contact_n.add("12352");
    }

    static void view(){
        for(int i=0; i<product_list.size(); i++){
            System.out.printf("%d.Name: %s    Discription:%s      Number: %s\n",i+1,product_list.get(i),product_dis.get(i),contact_n.get(i));
        }
    }
}
