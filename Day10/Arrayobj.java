//Array of objects
class Student
{
    int rollno;
    String name;
    int marks;
}
public class Arrayobj {
    public static void main(String[] args) 
    {
        Student s1 = new Student();
        s1.rollno=29;
        s1.name= "Harsh";
        s1.marks=95;

        Student s2 = new Student();
        s2.rollno=30;
        s2.name= "Raj";
        s2.marks=97;

        Student s3 = new Student();
        s3.rollno=27;
        s3.name= "Arun";
        s3.marks=88;

        Student Students []= new Student[3]; //we are creating an array ehich can hold student references it cannot create object of students
        Students[0] = s1;
        Students[1] = s2;
        Students[2] = s3;

        // for (int i=0; i<Students.length; i++)
        // {
        //     //System.out.print(Students[i]+" "); it will print address rather then value
        //     System.out.println(Students[i].name+":"+ Students[i].rollno+":"+Students[i].marks);
        // }
        for(Student s :Students)
        {
            System.out.println(s.name+" : "+s.rollno+" : "+s.marks);
        }
    }
    
}
