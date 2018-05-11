package csci230.hwk4;

import java.util.EmptyStackException;

/**
 * A LIFO stack that has constant time complexity O(1) for
 * all three stack interface methods (i.e., push, pop, and 
 * peek).
 * 
 * This data structure was discussed in class along with the 
 * operations, please review your notes.
 * 
 * @author CSCI 230: Data Structures and Algorithms Spring 2017 || Sarah Nicholson
 *
 * @param <AnyType>
 */
public class ConstantTimeStack<AnyType extends Comparable> implements Stack<AnyType>{
	
	/**
	 * private instance variables
	 */
	private SinglyLinkedList<AnyType> list = new SinglyLinkedList<AnyType>();

	/**
	 * Pushes an item onto the top of this stack in constant 
	 * time O(1)
	 * 
	 * @param t the item to be pushed onto this stack.
	 */
	public void push(AnyType t) {
		
		/**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         * Note: Your push solution must be a constant 
         * time O(1) operation
         * 
         */
	   
            list.add(0, t);
		
	} // end push() method

	/**
	 * Removes the object at the top of this stack and return the 
	 * item in constant time O(1)
	 * .
	 * @return The item at the top of this stack
	 * @throws EmptyStackException - if this stack is empty.
	 */
	public AnyType pop() throws EmptyStackException {
		
		/**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         * Note: Your pop solution must be a constant 
         * time O(1) operation
         * 
         */
            
            if (list.isEmpty())
                throw new EmptyStackException();
	    else
            {
                AnyType popped = list.remove(0);
                return popped;
            }
		
	} // end pop() method

	/**
	 * Looks at the item at the top of this stack without removing it 
	 * from the stack in constant time O(1)
	 * 
	 * @return the item at the top of this stack
	 * @throws EmptyStackException  - if this stack is empty.
	 */
	public AnyType peek() throws EmptyStackException {
		
		/**
         * -------------------------------------------
         * TODO: You fully implement this method
         * 
         * Note: Your peek solution must be a constant 
         * time O(1) operation
         * 
         */
            
            if (list.isEmpty())
                throw new EmptyStackException();
            else
            {
                AnyType peeked = list.get(0);
                return peeked;
            }
	} // end peek() method
	
//        public String toString()
//        {
//            String s = new String();
//            for (int i = 0; i < list.size(); i++)
//                s += list.get(i).toString() + " ";
//            return s;
//                        
//        }
	/**
	 * 
	 * @param args
	 */
	public static void main( String[] args ) {
		
		/**
         * -------------------------------------------
         * TODO: You put your test cases here
         * 
         */
            //A toString method is used to run the main, but is commented out.
            
	    ConstantTimeStack<Integer> stack = new ConstantTimeStack<Integer>();
            
	    System.out.println("Popping from empty stack: ");
            try
            {
                stack.pop();
            }
            catch (EmptyStackException e)
            {
                System.out.println("pop error: " + e);
            }
            
            System.out.println("Peeking from empty stack: ");
            try
            {
                System.out.println(stack.peek());
            }
            catch (EmptyStackException e)
            {
                System.out.println("peek error: " + e);
            }
             
            stack.push(1);
            System.out.println("Pushing 1: " + stack);
            stack.push(2);
            System.out.println("Pushing 2: " + stack);
            stack.push(3);
            System.out.println("Pushing 3: " + stack);
            stack.push(4);
            System.out.println("Pushing 4: " + stack);
            stack.push(5);
            System.out.println("Pushing 5: " + stack);
                                    
            System.out.println("Peeking: " + stack.peek());
            
            System.out.println("Popping: " + stack.pop());
            
            System.out.println(stack);
            
            System.out.println("Popping: " + stack.pop());
            System.out.println(stack);
            System.out.println("Popping: " + stack.pop());
            System.out.println(stack);
            System.out.println("Popping: " + stack.pop());
            System.out.println(stack);
            System.out.println("Popping: " + stack.pop());
            
            System.out.println("Popping from empty stack: ");
            try
            {
                stack.pop();
            }
            catch (EmptyStackException e)
            {
                System.out.println("pop error: " + e);
            }
            
            System.out.println(stack);
        
    } // end main method

} // end ConstantTimeStack class definition
