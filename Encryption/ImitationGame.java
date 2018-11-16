import java.util.Scanner;
public class ImitationGame extends Cipher 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Encrypt or Decrypt password");
        String options = sc.nextLine();
        
        if(options.equals("Encrypt")||(options.equals("encrypt")))//or
        {
            CipherEncryption();//running cipher
        }
        else if(options.equals("Decrypt")||(options.equals("decrypt")))//or 
        {
            DecipherEncrypted();//running decipher
        }
        else
        {
            System.out.println("was not an option, try again");
        }
    }
}
