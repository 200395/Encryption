import java.util.Scanner;
public class Decipher
{
    private static String end= "abcdefghijklmnopqrstuvwxyz";
    private static String start = "qwertyuiopasdfghjklzxcvbnm";
    //Swapping the alphabelt and cipher
    private static String value = "";
    public static void DecipherEncrypted()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password");
        String ciphering = sc.nextLine();
        
        for(int i = 0; i < ciphering.length(); i++)
        {
            for(int j = 0; j < start.length(); j++)
            {
                if(ciphering.charAt(i) == start.charAt(j))
                {
                    value += end.charAt(j);
                }
            }
        }
        System.out.println(value);
    }
}
