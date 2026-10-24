public class Conditional_Statements {
    public static void main(String[] args) {
        int age;
        age = 30;
        if (age < 18) {
            System.out.println("Less than 18");
        }
        else if (age == 18) {
            System.out.println("Equal tp18");
        }
        else {
            System.out.println("More than 18");
        }

        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;
        if (a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
       }

        System.out.println("For Logical OR...");

        if (a || b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For Logical NOT");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);


        System.out.println("For Switch Case");
        int num;
        num = 10;
        switch(num){
            case 5:   // break nahi hoga to bache hue sare case execute ho jayenge
                System.out.println("5");
                break;
            case 10:
                System.out.println("10");
                break;
            case 15:
                System.out.println("15");
                break;
            default:
                System.out.println("default");
        }

        String var = "Saurabh";


        switch (var) {
            case "Shubham" -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case "Saurabh" -> System.out.println("You are going to join a Job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");
    }
}
