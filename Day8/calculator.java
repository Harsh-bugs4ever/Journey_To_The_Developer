//this is for object and class
class calc
{
    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}
public class calculator {
    public static void main(String[] args) {
        calc c = new calc();

        int result = c.add(4,5); //We can put variables as well e.g n1 and n2

        System.out.println(result);
    }
    
}
