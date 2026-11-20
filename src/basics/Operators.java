package basics;

public class Operators {
    public static void main(String[] args){

        //arithmetic operators
        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        //Unary operators
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        // Compound assignments
        a += 5;
        System.out.println(a);

        a -= 3;
        System.out.println(a);

        a *= 2;
        System.out.println(a);

        a /= 4;
        System.out.println(a);

        a %= 4;
        System.out.println(a);

        // Comparison operations
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        //Boolean operator
        Boolean x = true;
        Boolean y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);

        //instanceof operator

        Object obj = "Hello";
        System.out.println(obj instanceof String);
        System.out.println(obj instanceof Integer);




    }
}
