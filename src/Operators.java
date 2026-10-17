public class Operators
{
    public static void main(String[] args)
    {
        // 1. Arithmetic Operators
        int a = 4;
        int b = 6 % a; // Modulo Operator
        System.out.println(b);
        System.out.println(4.8%1.1);  // Returns Decimal Remainder

        // 2. Assignment Operators
        b = 9;
        b *= 3;
        System.out.println(b);

        // 3. Comparison Operators
        System.out.println(64<6);

        // 4. Logical Operators
        System.out.println(64>5 && 64>98);
        System.out.println(64>5 || 64>98);

        // 5. Bitwise Operators
        System.out.println(2&3);
        //        10
        //        11
        //        ----
        //        10


        // Precedence & Associativity

        a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
        b = 60/5-34*2;
        /*
            = 12-34*2
            =12-68
            =-56
         */

        System.out.println(a);
        System.out.println(b);

        // Quick Quiz
        int x =6;
        int y = 1;
        int k = x * y/2;
        System.out.println(k);

        b = 9;
        int c = 7;
        a = 10;
        k = (b*b - 4*a*c)/(2*a);
        System.out.println(k);

        /* byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b); */


        // Increment and Decrement Operators
        int i = 56;
        // int b = i++; // first b is assigned i (56) then i is incremented
        int j = 67;
        c = ++j; // first j is incremented then c is assigned j (68)
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        y = 7;
        System.out.println( ++y *8);
        char ch = 'a';
        System.out.println(++ch);

    }
}
