import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from user :- ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = num + num2;
        System.out.println(num3);

        float f = sc.nextFloat();
        System.out.println(f);

        double d = sc.nextDouble();
        System.out.println(d);

        char c = sc.next().charAt(0);
        System.out.println(c);

        byte b = sc.nextByte();
        System.out.println(b);

        boolean bool = sc.hasNextInt();
        System.out.println(bool);

        System.out.println("Taking Input from user :- ");
        String str = sc.next(); // only reads first word of a line
        System.out.println(str);
        
        String str2 = sc.nextLine(); // Reads entire line
        System.out.println(str2);


        System.out.println("What is your name");
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");
    }
}
