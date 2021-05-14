public class Advanced {
    static void myMethod() {
        System.out.println("I just got executed!");
      }
    static void method2(String fname, int age){ //creates a string fname and an int age
      System.out.println(fname + " Goldhand" + " is " + age); //combines fname, age, with the defined output of main
    }
    static int method3(int x){
      return 5 + x;             //returns 5
    }
    static int method4(int x, int y){
      return x+ y;
    }
    static void checkAge(int age){  //uses the value of checkAge(x) and runs the if...esle statement 
      if(age<18){
          System.out.println("You're not old enough!");
      }
      else{
        System.out.println("Gates open, come on in!");
      }
    }
    /*Method overloading
      instead of creating to methods for different types (int, double), overload one method to use both
    */
    static int plusMethod(int x, int y){
      return x+y;
    }
    static double plusMethod(double x, double y){ //instead of creating e.g. plusMethodDouble, reuse the same method
      return x+y;
    }
  //refers to recursion training
    public static int sum(int k){     
      if(k>0){
        return k + sum(k-1);
      } else{
        return 0;
      }
    }
    public static int sum2(int start, int end){
      if(end>start){
        return end +sum2(start, end-1);
      } else{
        return end;
      }
    }

// -------------- Main, uses the Methods above -------------- \\

      public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();

        method2("Tungdril", 17); //creates output for method2 and prints it

        System.out.println(method3(10));   //adds 10 to the return value of method3 (5)

        int z = method4(1, 6);  //defines and stores the content of method 4 as variable z
        System.out.println(z);

        checkAge(20); //passes 20 to checkAge

        int myint = plusMethod(3, 4);
        double mydouble = plusMethod(4.5, 11); //careful to use plusMethod(double x, double y), had to change with quickfix ¯\_(ツ)_/¯
        System.out.println("int: " + myint);
        System.out.println("double: " + mydouble);

        //Variable scope

        //code here CANNOT use x

        { //Beginning of block    ffs, if i had known about blocks like this earlier, Main.java would be a lot cleaner

          //code here CANNOT use x

          int x = 50;

          //code here CAN use x
          System.out.println(x);

        } //End of block

        //code here CANNOT use x

        //Recursion training       
        int result = sum(10);       //interacts with method sum somehow, adds all numbers up to 10 (1+2+3+...+9+10)
        System.out.println(result);

        int result2 = sum2(5,10);   // interacts with sum2 to add up all numbers from 5 to 10
        System.out.println(result2);

      }
}



