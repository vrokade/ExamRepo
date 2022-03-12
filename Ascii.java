import java.util.Scanner;
public class Ascii
{
  public static void main(String args[])
   {
     char ch;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a char");
     ch = sc.next().charAt(0);
     int asciivalue = ch;
     System.out.println("Ascii value is :" + asciivalue);
   }
}
     