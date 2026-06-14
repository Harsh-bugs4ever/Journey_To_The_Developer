public class str {
    public static void main(String[] args) {
        String name = new String();
        System.out.println(name);//it will print nothing cause nothing is inside string

        String name1 = new String("Harsh");
        System.out.println(name1); //here i have given the value to string
        System.out.println(name1.hashCode());// we can see hashcode pf a string

        System.out.println("Hello and Welcome to programming "+ name1);//concatenation

        String num = "number";// it will work because string will create obkect from itself we dont have to mention class and create object
    //we can use name1.chatAt(index)and name1.concat(name) to know index element and concanete
    }
    
}
