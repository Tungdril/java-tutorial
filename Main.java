// import jdk.tools.jlink.resources.plugins; I didn't put this here
// test test2
public class Main { 
    String traveller = "I'm from another class!";       //is called later in Classes.java

    public static void main(String[] args){
        //System.out.println("Hello World!"); 
        //Variable training 
        String name = "Tungdril";               
        int age = 17;
        float height = 1.80f;
        char chartest = 'L';
        final boolean isCool = true;

        System.out.printf(name+", "+age+", "+height+"m"+", "+chartest+", "+"Cool? "+isCool);
        System.out.println("\r");

        //int x = 13, y = 6587, z = -452;
        //System.out.println("\n"+x+y+z);

        //Data type training
        short short1 = 32767;
        long long1 = 9223854700000000L;
        char ASCIIchar = 37; //37 = "%"

        System.out.println(ASCIIchar);
        System.out.println(short1);
        System.out.println(long1);

        //Arithmethic operators test
        int sum1= 50;                               
        int sum2= 600;
        int sum3= sum1 + sum2;
        int sum4= sum3/10;
        int sum5= sum4*2; 

        System.out.println(sum5-666);

        /* Assignmet operators example
            x+=3 == x=5
            x|=3 == x | 3
            x^=3 == x=x^3
            x<<=3 == x=x<<3
          
           Comparison and logical operators
            == equal to
            != not equal to
            <> less/greater than
            <=>= less/greater or equal to

            && and
            || or
            ! not
        */

        //String training
        String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        
        System.out.println(text.toLowerCase() + "Lenght: " + text.length()); //transforms text into lower case and prints its lenght
        System.out.println(text.indexOf("C"));  //prints the position of "C" in text, returns -1 if not found                                              
 
        String firstName = "Tungdril";
        String lastName = "Goldhand";

        System.out.println(firstName + " " + lastName); // alternative: System.out.println(firstName.concat(lastName));

        /*Escape sequences
        \'Quote\'   -> 'Quote'
        \"Quote\"   -> "Quote"
        \\          -> \

        \n  -> new line
        \r  -> carriage return (same as \n, but doesn't leave a free line)
        \t  -> tab
        \b  -> backspace
        \f  -> form feed (next page)
        */

        //Math training 1
        /* syntax: System.out.println(Math.x(x));
            Math.max(5, 10);    -> highest value
            Math.min(5, 10);    -> lowst value
            Math.sqrt(64);      -> square root of x
            Math.abs(-4.7);     -> returs absolute (positive) value of x
            Math.random()       -> (semi) random number between 0.0 (inclusive) and 1.0 (exclusive)
            int randomNum = (int)(Math.random() * 101); -> random number betweem 0 and 100
        */

        System.out.println(Math.random());

        // if ... else training
        int if1 = 265;
        int if2 = 23176;
        int if3 = 265;
        if (if1 > if2) {    
            System.out.println("if1 is cool af");
          } else if(if1!=if3){
            System.out.println("they do be the same tho");
          } else{
              System.out.println("NaBrO");
          }
          

        /* Ternary operator (shortform) -> syntax: variable = (condition) ? expressionTrue :  expressionFalse;
        Long form:
          int time = 20;
            if (time < 18) {
                System.out.println("Good day.");
            } else {
                System.out.println("Good evening.");
            }
        Short form:
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
        */

        //Switch training
        int month = 5;

        switch (month){
            case 1:
            System.out.println("January");
            break;
            case 2:
            System.out.println("February");
            break;
            case 3:
            System.out.println("March");
            break;
            case 4:
            System.out.println("April");
            break;
            case 5:
            System.out.println("May");
            break;
            case 6:
            System.out.println("June");
            break;
            case 7:
            System.out.println("July");
            break;
            case 8:
            System.out.println("August");
            break;
            case 9:
            System.out.println("September");
            break;
            case 10:
            System.out.println("October");
            break;
            case 11:
            System.out.println("November");
            break;
            case 12:
            System.out.println("December");
            break;
            default:
            System.out.println("Wtf, that\'s not a month");
        }
        

        //Loop training
        
        int i = 0;                  //executes as long as i is under 5
        while(i<5){
            System.out.println(i);
            i++;
            if(i==2){               //should skip 2, but doesn't?  (╯°□°）╯︵ ┻━┻
                break;
            }
        }

        do{                         
            System.out.println(i);
            i++;
            if(i>=4){
                continue;
            }
        }
        while (i<5);                //executed at least once, check only after running
        
        for(int j = 0; j<3; j++){
            System.out.println(j);
        }

        for (int l = 0; l <= 10; l = l + 2) {
            System.out.println(l);
           
          }

        String[] eyes = {"Blue", "Green", "Brown", "Black"};
        for(String e : eyes){
            System.out.println(e);
        }
          
        //Array training
        String[] sizes = {"smol", "medium", "large", "big chungus"};

        System.out.println(sizes[3]);
        System.out.println(sizes.length);
        for(int c = 0; c<sizes.length; c++){
            System.out.println(sizes[c]);
        }
        //Same with for-each loop
        for(String s : sizes){
            System.out.println(s);
        }
        // Multidimensional
        int[][] multi = {{1,2,3,5},{6,2,-5,1}};

        System.out.println(multi[1][2]);
    }
        //Advanced training: See Advanced.java

        //Class training: See Classes.java
        
}


    
