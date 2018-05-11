import java.util.Scanner;

/**
 * @author Sarah Nicholson
 * @date 1/18/17
 */
public class BinaryParity 
{
    public String decimalToBinary(int value)
    {
        //Uses recursion to convert the decimal value into
        //binary
        if (value > 0)
        {
           int num = value % 2;
           return (decimalToBinary(value / 2) + "" + num);
        }
        return "";
    }
    
    public static int binaryParityCheck(String binaryValue)
    {
        //Keep a count of how many 1's are in the binary string
        int count = 0;
        for (int i = 0; i < binaryValue.length(); i++)
        {
            char c = binaryValue.charAt(i);
            if (c != '0')
                count++;
        }
        return count;
    }

    public static void main(String[] args)
    {   
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a non-negative integer value: ");
        int value = input.nextInt(); //Get user input
        
        while (value < 0) //If user input is invalid, keep asking until valid
        {
            System.out.print("Please enter a non-negative integer value: ");
            value = input.nextInt();
        }
        
        BinaryParity obj = new BinaryParity();
        String binaryValue = obj.decimalToBinary(value);
        
        //Create count instance from the method in order to see if the user
        //input has even or odd parity
        int count = binaryParityCheck(binaryValue);
        if (count % 2 == 0)
        {
            System.out.println("The number " + value + " has EVEN parity");
        }
        else
            System.out.println("The number " + value + " has ODD parity");
    }
}
