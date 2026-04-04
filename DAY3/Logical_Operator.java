public class Logical_Operator {
    public static void main(String[] args) {
        //And
        int a = 5;
        int b = 6;
        int x = 2;
        int y = 5;
        boolean result1 = a<b && x>y;
        System.out.println(result1);

        //OR
        boolean result2 = a<b || x>y;
        System.out.println(result2);

        //NOT
        System.out.println(!result2);
    }
    
}
