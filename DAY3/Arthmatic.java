

public class Arthmatic{
    public static void main(String[] args) {
        //Addition
        int a = 10;                                                         
        int b = 20;
        int result1 = a+b;
        System.out.println(result1);
        
        //modulo
        int num1 = 7;
        int num2 = 5;
        int result2 = num1%num2;
        System.out.println(result2);

        // assigning a new value to existing number

        int num3 = 4;
        num3 = num3 + 4;

        //instead of using above format we can use

        num2 += 5;
        System.out.println(num2);

        //Increment
        int r = 15;
        r ++;
        ++r;
        System.out.println(r);

        //Decrement
        int q = 15;
        q--;
        --q;
        System.out.println(q);

        //Difference between pre and post Increment and Decrement
        int num5 = 16;
        int result14 = --num5;
        int result15 = num5--;
        System.out.println(result14);
        System.out.println(result15);

        int num6 = 7;
        int result8 = ++num6;
        int result9 = num6++;
        System.out.println(result8);
        System.out.println(result9);
    }

}