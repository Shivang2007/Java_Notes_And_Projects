import java.util.Scanner;


public class CH_Strings{
    static void main(String[] args) {
//        String name = new String("Hello");
//        String name = "Sh";
//        System.out.print("My name is: ");
//        System.out.print(name);
//        int a = 6;
//        float b = 5.6454f;
//        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);  // C jaisa
//        System.out.format("The value of a is %d and value of b is %f", a, b); // format aur printf same type ke hai
//        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
//        String st = sc.nextLine();
//        System.out.println(st);

        String name = "Shivang";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     Shivang     ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(1));  // string index number 1 se end tak
        System.out.println(name.substring(1,5)); // index 1 se 4 tak jayega 5 include nahi hoga

        System.out.println(name.replace('h', 'p'));
        System.out.println(name.replace("h", "ier"));

        System.out.println(name.startsWith("Shi"));
        System.out.println(name.endsWith("ng"));

        System.out.println(name.charAt(4));

        String modifiedName = "Shivangangang";
        System.out.println(modifiedName.indexOf("ang"));
        System.out.println(modifiedName.indexOf("ang", 4));
        System.out.println(modifiedName.lastIndexOf("ang", 7));

        System.out.println(name.equals("Shivang"));
        System.out.println(name.equalsIgnoreCase("ShiVaNg"));

        System.out.println("This am escape sequence\tdouble quote");
    }
}
