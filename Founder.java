import java.util.Scanner;

public class Founder extends product_Info {
    Scanner scanner = new Scanner(System.in);
    void founderLogin(){
        System.out.println("Enter Username: ");
        String username = scanner.nextLine();
        if(username.equals(info.getF_username())){
            System.out.println("Enter Password: ");
            String pass = scanner.nextLine();
            if(pass.equals(info.getF_password())){
                while (true) {
                    System.out.println("1.View post");
                    System.out.println("2.Upload post");
                    System.out.println("3.Delete post");
                    System.out.println("4.Exit");
                    System.out.println("Enter Your Choice");
                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            view();
                            System.out.println("Press 1 TO Continue: ");
                            scanner.next();
                            break;
                        case 2:
                            founderAdd();
                            System.out.println("Press 1 TO Continue: ");
                            scanner.next();
                            break;
                        case 3:
                            founderRemove();
                            System.out.println("Press 1 TO Continue: ");
                            scanner.next();
                            break;
                        case 4:
                            return;
                    }
                }
            }else System.out.println("Invalid Password");
        }else System.out.println("Invalid Username");
    }
    void founderAdd(){
        System.out.println("How Many Post To Add: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<size; i++){
            System.out.println("Enter Name or Unique code: ");
            product_list.add(scanner.nextLine());
            System.out.println("Enter Product discription: ");
            product_dis.add(scanner.nextLine());
            System.out.println("Enter Your Mobile Number: ");
            contact_n.add(scanner.nextLine());
        }
        System.out.println("post upload successfully");
    }
    void founderRemove(){
        scanner.nextLine();
        System.out.println("Enter The name of the product You want to remove: ");
        String name = scanner.nextLine();
        if(product_list.contains(name)){
            int index=product_list.indexOf(name);
            System.out.println("Post delete "+name);
            product_list.remove(name);
            product_dis.remove(index);
        }
    }
}

