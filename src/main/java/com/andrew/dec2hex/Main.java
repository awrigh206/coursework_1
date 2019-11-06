import com.andrew.dec2hex.Converter;
import java.util.Scanner;

class Main
{
    //Change to see if docker is set up to automatically build correctly

    public static void main(String args[])
    {
        Converter converter = new Converter();
        if(args.length >0)
        {
            System.out.println("Hexadecimal representation is : " + converter.toHex(args[0]));
        }
        
        else 
	{
            System.err.println("you must enter an integer argument");
            System.exit(0);
	}
    }
    

}
