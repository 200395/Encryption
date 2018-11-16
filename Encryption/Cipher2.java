import java.util.Scanner;
public class Cipher2   
{
    int Ciphering; 
    public static void Cipher()
    {
        char[] arr = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};        
        //counting through array index
        Scanner sc = new Scanner(System.in);
        String Ciphering = sc.nextLine();  
        //scanner
        
        for (int i = 0; i < Ciphering.length(); i++){//counting input
         char currentChar = Ciphering.charAt(i);
         for (int j = 0; j < arr.length; j++){
             //for however many letters are counted in the input it adds to the arry
             if (arr[j] == currentChar){
                 System.out.print(j);//print 'j' which is the cipher
                }
          }
        }
    }
}