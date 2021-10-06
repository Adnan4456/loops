
public class ForLoopExample1 {
    public static void main(String[] args) {

        System.out.println("------- Traditional for loop -------");

        //This is basic for loop , which loops through argument passed to
        //this method and prints them out.

        for (int i =0; i<args.length; i++){
            System.out.println("Arguments "+ (i+1)+ " = " + args[i]);
        }

        System.out.println("---------Enhanced for loop-------");

        //if you want an iteration index , you have to maintain it yourself.
        int i=0;
        for (String arg: args){
            System.out.println("Argument " + (++i) +" = " + arg);
        }

    }
}
