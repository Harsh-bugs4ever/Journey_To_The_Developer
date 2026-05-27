//In this code we will learn method overloading
class calculator
{
    public int add(int n1 , int n2)
    {
            return n1+n2;
    }
    public int add(int n1 , int n2 , int n3)
    {
        return n1+n2+n3;
    }
}
public class Overloading {
    public static void main(String[] args) {
        calculator obj = new calculator();
        int res1 = obj.add(4,5);
        System.out.println(res1);
        
        int res2 = obj.add(4,7,9);
        System.out.println(res2);
    }
    
}
//methods with same name but differenet parameters so according to
//main method it will execute that method according to the number of parameters added in main method

