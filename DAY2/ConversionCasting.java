public class ConversionCasting {
    public static void main(String[] args){
       byte b = 12;
       int a = b; /*byte is directly getting converted into 
                   into int cause in have higher range i.e Type conversion*/
       
        int c =12;
        byte y = (byte)c;//Type casting explicit mention

        int d = 257;
        byte k = (byte)d;//modulo wala thing

        float f = 5.6f;
        int t = (int)f;

        //Type Promotion
        byte b1 = 10;
        byte b2 = 30;
        int result = b1*b2;
        System.out.println(result);
        System.out.println(t);
        System.out.println(a);
        System.out.println(y);
        System.out.println(k);

    }
}
