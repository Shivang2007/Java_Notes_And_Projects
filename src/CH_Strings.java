import java.util.Scanner;


public class CH_Strings{
    static void main(String[] args) {
//         String name = new String("Hello");
//         String name = "Sh";
//         System.out.print("My name is: ");
//         System.out.print(name);

        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);  // C jaisa
        System.out.format("The value of a is %d and value of b is %f", a, b); // format aur printf same type ke hai
        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
        String st = sc.nextLine();
        System.out.println(st);
    }
}
