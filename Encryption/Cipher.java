import java.util.Scanner;
public class Cipher extends Decipher 
{
    private static String start = "abcdefghijklmnopqrstuvwxyz";//alphabelt
    private static String end = "qwertyuiopasdfghjklzxcvbnm";//Cipher
    private static String value = "";//Empty 
    public static void CipherEncryption()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password");
        String ciphering = sc.nextLine();//Input
        
        for(int i = 0; i < ciphering.length(); i++)//first loop checking input 
        {
            for(int j = 0; j < start.length(); j++)//second loop checking alaphabelt
            {
                if(ciphering.charAt(i) == start.charAt(j))//matching input and alphabelt
                {
                    value += end.charAt(j);//Translate to cipher
                }
            }
        }
        System.out.println(value);
    }
}
