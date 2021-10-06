

public class WhileLoop {
    public static void main(String[] args) {

        // set up a boolean that while be the condition for our while loop
        boolean keepGoing = true;
        int iterations = 0;

        while (keepGoing) {

            if (++iterations > 2)
                //This statment will run when if statement will true
                // this statement is in if bracket {};
                //keepGoing = false;
                break;//break will stop the loop.
            //if (++iterations > 2) keepGoing = false;
            //continue keyword will skip the below statments and run iteration of loop
            if (iterations ==2) continue;

            System.out.println("Iteration: " + iterations +
                        ", keepGoing = " + keepGoing);

            //Nested loop
            do{
                System.out.println("----Doing something in the nested loop,"
                                +"iterations = " +iterations);
                System.out.println("-------END of do while loop");
            }while (iterations<0);

        }  // end while
    }
}