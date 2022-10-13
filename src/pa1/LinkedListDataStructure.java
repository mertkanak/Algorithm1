package pa1;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class LinkedListDataStructure {
    
    public static void main(String[] args) throws IOException {

        
        TimeWatch watch = TimeWatch.start();
        System.out.println("Helloooo");
        File file = new File("C:\\Users\\Alperen\\Desktop\\Algorithm1\\1Mintt.txt");
        LinkedList list = new LinkedList();
        try (Scanner scan = new Scanner(file)) {
            int num;

            while(scan.hasNextInt()) {
                num = scan.nextInt();
                System.out.println(num);
                list.insert(num);
            }
        }
        
       
        long passedTimeInMs = watch.time();
        System.out.println("The integer Linked List Structure built in "+passedTimeInMs + " milliseconds.");

        watch.reset();
        TimeWatch w2 = TimeWatch.start();
        list.insertAtStart(5);
        long passedTimeInMs2 = w2.time();
        System.out.println("An integer is inserted into the first index of the LinkedList in "+ passedTimeInMs2+ " milliseconds." );
        w2.reset();

        TimeWatch w3 = TimeWatch.start();
        list.insert(45);
        long passedTimeInMs3 = w3.time();
        System.out.println("An integer is inserted in to the last index of the Linkedlist in "+ passedTimeInMs3+ " milliseconds.");
        w3.reset();
       
        TimeWatch w4 = TimeWatch.start();
        list.showAt(9);
        long passedTimeInMs4 = w4.time();
        System.out.println("An integer which is the from the " +list.showAt(9) + " index 9 of the integer Linkedlist in "+ passedTimeInMs4+ " milliseconds." );
        w4.reset();
    }
   
}
