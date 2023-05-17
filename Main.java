import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Founder founder = new Founder();
        Loss loss = new Loss();
        founder.add();
        while (true){
            System.out.println("1..Founder");
            System.out.println("2.Losser");
            System.out.println("3.Exit");
            System.out.println("Enter Your Choice: ");
            int choice = scanner.nextInt();
            switch (choice){
                case 1: founder.founderLogin();
                    break;
                case 2: loss.LosserLongin();
                    break;
                case 3: return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}