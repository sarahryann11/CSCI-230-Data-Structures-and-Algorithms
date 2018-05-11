package csci230project;

/**
 *
 * @author Sarah Nicholson
 */
public class ElementNotInHashTableException extends Exception
{
    public ElementNotInHashTableException()
    {
        super("element not in hash table");
    }
}
