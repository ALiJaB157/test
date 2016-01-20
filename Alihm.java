//
//Examples of java statements.
//

public class Statements {

 public static void main(String[] args) {
  //Variable declaration statements
  System.out.println("Variables");
  int a;
  int b = 2;

  // Assignment statements with expressions
  a = b + 10;
  System.out.println("a=" + a + ", b=" + b);

  //Conditional Branching Statements
  //If statement
  System.out.println("\nIf");
  if (a > b) {
    System.out.println("a is greater than b");
  } else {
   System.out.println("a is equal or less than b");
  }

  //Switch statement
  System.out.println("\nSwitch");
  switch (b) {
   case 1:
    System.out.println("one");
    break;

   case 2:
    System.out.println("two");
    break;

   case 3:
    System.out.println("three");
    break;

   default:
    System.out.println("to big to tell");
    break;
   }

  //Iteration Statements
  //The while loop
  System.out.println("\nWhile");
  a = 0;
  b = 10;
  while (a < b) {
   a++;
   b--;
   System.out.println(a + "/" + b);
  }

  //The do...while loop
  System.out.println("\nDo ... while");
  double r;
  do {
   r = Math.random() + 0.3;
   System.out.println("r = " + r);
  } while (r > 0.5);

  //The for loop
  System.out.println("\nFor");
  a = 1;
  for (int i = 0; i < 10; i++) {
   a = a + a;
   System.out.println("a = " + a);
  }

  //The foreach loop
  System.out.println("\nForeach");
  String[] names = {"ALi", "Hm", "Haji"};
  for (String name : names) {
   System.out.println("I like " + name);
  }

 }
}
