//understanding the method
class computer
{
    public void playMusic()
    {
            System.out.println("music is playing");
    }

    public String getMeAPen(int cost)//int pen what input method accepts so we can even use logic to implement this method like if pen>=10 then this method will executes
    {
        if(cost>=10)
            return "pen";
        else
            return"Nothing";

    }
}
public class Demo
{
    public static void main(String[] args) 
    {
        computer obj = new computer();
        obj.playMusic();

        String str = obj.getMeAPen(1);// so we have to store it into string value because without storing it you cannot print it and check whther iff satisfies or not
        System.out.println(str);
    }
}
