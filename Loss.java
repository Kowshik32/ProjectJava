import java.util.ArrayList;
public class Loss extends product_Info {
    ArrayList<Integer> total = new ArrayList<>();
    ArrayList<Integer> price1 = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();
    ArrayList<Integer> quantity = new ArrayList<>();
    int total2 = 0;

    void LosserLongin() {
        System.out.println("Enter Username: ");
        String user = scanner.nextLine();
        if (user.equals(info.getL_username())) {
            System.out.println("Enter Password: ");
            String pass = scanner.nextLine();
            if (pass.equals(info.getL_password())) {
                while (true) {
                    System.out.println("1.View product");
                    System.out.println("2.Search product");
                    System.out.println("3.Exit");
                    int choice = scanner.nextInt();
                    if (choice == 1) {
                        view1();
                        name.clear();
                        price1.clear();
                        quantity.clear();
                        total.clear();
                        total2 = 0;
                        System.out.println("Press 1 TO Continue: ");
                        scanner.next();

                    } else if (choice == 2) {
                        search();
                    } else if (choice == 3) {
                        return;
                    } else System.out.println("Invalid Choice");
                }
            } else System.out.println("Invalid Password");
        } else System.out.println("Invalid Username");
    }

    void view1() {
        view();
        return;
    }

    void search() {
        scanner.nextLine();
        System.out.println("Enter The Search Item name");
        String name = scanner.nextLine();
        if (product_list.contains(name)) {
            System.out.println("Yesss!found");
        }
        else
        {
            System.out.println("Not found !");
        }

    }
}

