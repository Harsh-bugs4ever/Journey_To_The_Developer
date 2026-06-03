public class math {
    public static void main(String[] args) {
        int nums[] [] = new int[3] [4]; //Creating MD array
        
        for(int i=0; i<3; i++){
             for(int j=0; j<4; j++){

                nums[i] [j] = (int) (Math.random()*10);//using math class and type casting to assign random values
            }
        }

        for(int i=0; i<3; i++){
             for(int j=0; j<4; j++){

                System.out.print(nums[i][j]+" ");

            }
            System.out.println();//for new line
        }
        //Using of Enhanced for loop
        for (int n[]:nums)
        {
            for (int m :n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}