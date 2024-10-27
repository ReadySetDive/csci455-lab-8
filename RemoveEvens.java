import java.util.Stack;
import java.util.Scanner;


public class RemoveEvens {
   public static void main(String[] args) {

      doOneTest(createStack("1 2 3 2 4 5"), "1 3 5");
   }


   // removes the even values from theStack.
   // afterwards, theStack will have all the same odd values as before, in the
   // same relative order as before.  E.g.,
   //    before, theStack contains: [1, 2, 3, 2, 4, 5] <-- top
   //    after, theStack contains: [1, 3, 5] <-- top
   public static void removeEvens(Stack<Integer> theStack){

   }

   // creates and returns a Stack of Integers from a String of space-separated
   // integers, pushing them from left to right.  i.e., the last integer in
   // the string ends up at the top of the stack.
   // PRE: the string must consist only of integers and whitespace to separate
   //     them.
   public static Stack<Integer> createStack(String str) {
      Stack<Integer> result = new Stack<>();
      Scanner strScanner = new Scanner(str);
      while (strScanner.hasNext()) {
         result.push(new Integer(strScanner.next()));
      }
      return result;
   }



   // Tests removeEvens on theStack, printing out its contents before and after,
   // as well as expected result provided in second parameter, exp.
   // Expected result should be a string with space separated values,
   // top element given last (i.e., so bottom element would be first)
   private static void doOneTest(Stack<Integer> theStack, String exp) {
      System.out.print("Stack before: ");
      System.out.println(theStack.toString() + " <-- top");

      removeEvens(theStack);

      System.out.print("Expected value of stack after: ");
      System.out.println(exp + " <-- top");
      
      System.out.print("Actual stack value after removeEvens: ");
      System.out.println(theStack.toString() + " <-- top");
      System.out.println();
   }

}