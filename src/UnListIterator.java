// Import ArrayList package.
import java.util.ArrayList;
// Import ListIterator package.
import java.util.ListIterator;
 
// Create a public class.
public class UnListIterator {
 
	//
	public static void main(String[] args) {

	    // Create a String ArrayList.
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// Add first element.
	    arrayList.add("element_1");
	    
	    // Add second element.
	    arrayList.add("element_2");
	    
	    // Add third element.
	    arrayList.add("element_3");
	    
	    // Add fourth element.
	    arrayList.add("element_4");
	    
	    // Add fifth element.
	    arrayList.add("element_5");
  
	    //
	    ListIterator it = arrayList.listIterator();
  
	    // Something is going to happen until the List Iterator has not a token.
	    while(it.hasNext())
	    	
	    	// Next token is printed.
	    	System.out.println(it.next());
  
	    // Something is going to happen until the List Iterator has not a token before.
	    while(it.hasPrevious())
	    	
	    	// The token before the actual token is printed.
	    	System.out.println(it.previous());

	    // The index of the token before actual token is printed.
	    System.out.println("Previous Index is : " + it.previousIndex());   
	    
	    // The index of the next token is printed.
	    System.out.println("Next Index is : " + it.nextIndex());
	
	    // The next token is printed.
	    System.out.println("Next element is : " + it.next());
	    
	    // The index of the token before actual token is printed.
	    System.out.println("Previous Index is : " + it.previousIndex()); 
	    
	    // The index of the next token is printed.
	    System.out.println("Next Index is : " + it.nextIndex());

	    // Add a new element.
	    it.add("element_6");

	    // A loop to go through array list positions.
	    for(int i = 0; i < arrayList.size(); i++)
	    	
	    	// Print the actual position.
	    	System.out.println(arrayList.get(i));

	    // Next token is printed.
	    System.out.println("Next element is : " + it.next());

	    // Delete the token.
	    it.remove();

	    // A loop to go through array list positions.
	    for(int i = 0; i < arrayList.size(); i++)
	    	
	    	// // Print the actual position.
	    	System.out.println(arrayList.get(i));

	    // Next token is printed.
	    System.out.println("Next element is : " + it.next());
    
	    // Replace the element of the last position.
	    it.set("element_7");

	    // A loop to go through array list positions.
	    for(int i = 0; i < arrayList.size(); i++)
	    	
	    	// Print the actual position.
	    	System.out.println(arrayList.get(i)); 

	// Close "public static void main(String[] args).
	}
	
// Close the class.	
}