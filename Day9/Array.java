public class Array {
    public static void main(String[] args) {
        int nums[]={3,7,2,4};//here the value is directly assignn to array

        int num1[]=new int[4];//array without value 
        num1[0]= 4;//alloting the value to array
        num1[1]= 5;
        num1[2]= 6;
        num1[3]= 7;

        nums[1]=6;//to change the value of array

        System.out.println(nums[0]);// to print the value of array
        
        for (int i=0;i<=3;i++){
            System.out.println(num1[i]);//using for loop to print array
        }
    }
}
