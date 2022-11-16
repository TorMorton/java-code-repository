//this is a comment
//multiple lines of comments

/*
 * this is a multi-line comment
 * press return to make more lines
 */

//class declaration
//access modifier (public), then keyword "class", then name of class
//class name must be pascal case, uppercase at beginning of each word
//class name must match file name
public class HelloWorld { //can also comment at end of line

	/*this is the main method
	 * first thing that Java runs when it runs the program
	 * public - access modifier telling you what other files have access to this class, anything in program can access
	 * static - can be run without an instance of the object
	 * void - return type, tells you that nothing is returned
	 * main - the name of the method
	 * 
	 * () - contain arguments the main method takes
	 * 
	 * String - type, string of alphanumeric characters
	 * [] - indicates that this is an array
	 * args - variable name for the String array
	 * 
	 * example from command line -- java HelloWorld argument1 argument2
	 * 
	 * {} - everything within the curly braces is "in scope"
	 */
	public static void main(String[] args) {
		
		//this prints out anything within the parentheses to our console
		//if printing a string, put in quotes
		System.out.println("Hello World");
		System.out.println("...and Hello, back!");
		
		//sysout then CTRL + Space
		System.out.println();
		
		System.out.println("Now with wonderful spacing");
		
	}
	
	//not in the scope of main method
	//public int number - 3;
}
