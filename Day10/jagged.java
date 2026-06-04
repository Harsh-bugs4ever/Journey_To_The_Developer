public class jagged {
    public static void main(String[] args)
    {
        int nums [] [] = new int [4] []; //Jagged array
        nums[0] = new int [3];//Assigning the number
        nums[1] = new int [2];//of element in each row array
        nums[2] = new int [4];
        nums[3] = new int [3];
        for(int i =0; i<nums.length; i++)//for lengh
        {
            for(int j=0; j<nums[i].length; j++)//each rows own length
            {
                nums[i][j]=(int)(Math.random()*10);
            }
        }

        for(int n[]: nums)//gets each row
        {
            for(int m:n)//gets element of each row
            {
                System.out.print(m+" ");
            }
        System.out.println();
        }
    }
}
