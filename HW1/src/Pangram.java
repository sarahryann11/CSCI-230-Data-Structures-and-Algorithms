import java.util.Scanner;

/**
 * @author Sarah Nicholson
 * @date 1/18/17
 */
public class Pangram 
{
    private static int letters = 26; //There are 26 letters in the alphabet
    
    public static boolean pangramCheck(String inputString)
    {        
        if (inputString.length() < letters)
            return false; //If the length is less than 26, automatically 
                         //not a pangram

        for (char lr = 'a'; lr <= 'z'; lr++)
        {
            if (inputString.indexOf(lr) < 0)
                return false; //If not all letters are represented in the string,
                             //not a pangram
        }
        return true; //If it has at least 26 letters and all are represented, then
                    //it is a pangram
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string for pangram testing:");
        String inputString = input.nextLine(); //Get user input
        inputString = inputString.toLowerCase(); //Changes to lowercase
        
        boolean isPangram = pangramCheck(inputString); //Get bool for ifs
        if (isPangram == true)
        {
            System.out.println("This sentance IS a pangram.");
        }
        if (isPangram == false)
        {
            System.out.println("This sentance IS NOT a pangram.");
        }
    }
}