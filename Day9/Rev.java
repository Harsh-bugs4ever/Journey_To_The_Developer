//here i will explain the difference between class and object and method beautifully
class name{
    String name; // so in classi can use instance variable such as string and use it to call in an object
    int marks ;// same goes with number i can use int marks to use it in object
    public int Roll_no(int roll){
        return 16;
    }
}
public class Rev {
    public static void main(String[] args) {
        name n1 = new name();// creating an object using class
        n1.name="Harsh";//using instance variable
        n1.marks=54;
        n1.Roll_no(15);//even i'm usin 15 here it will still going to return 16 because i have alloted 16 in method thats why so instead of using number use just variable
        System.out.println("Name: " + n1.name);
        System.out.println("Marks: " + n1.marks);
        System.out.println("Roll No: " + n1.Roll_no(15));//using print statement to call the method and instance variable btw i can use print stst in method as well
    }
    
}
