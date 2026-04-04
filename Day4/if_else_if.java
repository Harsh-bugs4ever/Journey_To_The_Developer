public class if_else_if {
    public static void main(String[] args) {
        int x = 8;
        int y = 7;
        int z = 6;

        if (x>y && x>z)
            System.out.println(x+" is grater than "+ y + z);
        else if(y>x && y>z)
            System.out.println(y+" is greate than"+ x + z);
        else
            System.out.println(z+" is greater than "+ x + y);
    }
}
