public class Rev {
    public static void main(String[] args) {
        int arr[] [] = new int [4] [4];
        for(int i=0; i<4 ; i++)
        {
            for(int j=0; j<4; j++) //Always remember for forloop it should start from o so instead of using <= use <
            {
                arr[i] [j] = (int)(Math.random()*10);
            }
        }

        for(int i=0; i<4; i++)
        {
            for(int j =0; j<4; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
        System.out.println();
        }
    }
}
