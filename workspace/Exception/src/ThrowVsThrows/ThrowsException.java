/*
 *  In  The Java, throws keyword is used to declare an exception.
 *   It gives an information to the programmer that there may occur an exception so it is better
 *   for the programmer to provide the exception handling code
 *   so that normal flow can be maintained.
 *    */
package ThrowVsThrows;

public class ThrowsException {
		public static void main(String[] args) throws ClassNotFoundException {
			
				Class.forName("UncheckedException.ArrayBoundException");//packagename.classname
				
				System.out.println("Class found :)");
			
		}

	

}

//--An exception is an event that occurs during the execution of a program and disrupts the normal flow of the program instruction
// --Try-Enclose the code that might throw an exception within a try block.if an exception occurs within a try block
// the exception can be handled using exception handler associated with it.The try block contains atlest ne catch block or finally bock
// --Catch-The java catch block is used to handle the exception.it must be used after the try block only.you can use multiple catch blocks 
// with  a single try
//--Finally-The finally block gets executed always whether there is an exception occurs or not.

//Throw is used within the method.Throws is used with the method signature
//you cannot throw multiple exceptions....using throws u can declare multiple exceptions eg public void method() throws io exception,sql exception.
 //Error vs exception
//Error in java are of type java.lang.error Exception in java are of type java.lang.Exception
//All are errors in java are unchecked type Exceptions include both checked as well as unchecked type
//An error is caused due to lack of system resorces...An exception is caused because of the code.
//ex of error 1)out of memory error-thrown when jvm cannot allocate more objects because it is out memory.2)Stackoverflowerror-occurs when stack space for a thread has run out
//ex of exception-nullpointer class not found 
