/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa1;

import Pa1.ArrayStructure;
import Pa1.DynamicArray;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Alperen
 */
public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        
        TimeWatch watch_1 = new TimeWatch();
        File f1 = new File("1Mint.txt");
        ArrayStructure as = new ArrayStructure();

        try {
            int num ;
            Scanner scan = new Scanner(f1);
            
            while(scan.hasNextInt()){
                num = scan.nextInt();
                
                as.add(num);
            }

        } catch (Exception e) {
           
            System.out.println("Exception!!!!");
        }
        long passedTimeInArrayMs = watch_1.time();
        System.out.println("1a) The integer array structure structure built in "+passedTimeInArrayMs + " milliseconds.");
        watch_1.reset();
        
        TimeWatch watch_2 = new TimeWatch();
        as.insertFirst(123);
        long passedTimeInArrayMs2 = watch_2.time();
        System.out.println("2b) An integer is inserted into the first index of the integer array in "+ passedTimeInArrayMs2+ " milliseconds." );
        watch_2.reset();
        
        TimeWatch watch_3 = new TimeWatch();
        as.insertLast(987);
        long passedTimeInArrayMs3 = watch_3.time();
        System.out.println("2c) An integer is inserted into the last index of the integer array in "+ passedTimeInArrayMs3+ " milliseconds." );
        watch_3.reset();
        
        TimeWatch watch_4 = new TimeWatch();
        long passedTimeInArrayMs4 = watch_4.time();
        System.out.println("2d) An integer which is " +as.showAt(3) + " is read from the index 900000 of the integer array in " + passedTimeInArrayMs4+ " milliseconds." );
        watch_4.reset();
        
        TimeWatch watch_5 = new TimeWatch();
        long passedTimeInArrayMs5 = watch_5.time();
        System.out.println("2e) An integer which is " +as.showAt(5) + " is read from the index 9 of the integer array in " + passedTimeInArrayMs5+ " milliseconds." );
        watch_5.reset();
        
        
        
        
        
        
        
        TimeWatch watch = new TimeWatch();
        File f2 = new File("1Mintt.txt");
        LinkedList list = new LinkedList();
        try (Scanner scan = new Scanner(f2)) {
            int num;

            while(scan.hasNextInt()) {
                num = scan.nextInt();
                list.insert(num);
            }
        }
        long passedTimeInMs = watch.time();
        System.out.println("2a) The integer linked list structure built in "+passedTimeInMs + " milliseconds.");
        watch.reset();
        
        TimeWatch w2 = new TimeWatch();
        list.insertAtStart(5);
        long passedTimeInMs2 = w2.time();
        System.out.println("2b) An integer is inserted into the first index of the LinkedList in "+ passedTimeInMs2+ " milliseconds." );
        w2.reset();

        TimeWatch w3 = new TimeWatch();
        list.insert(45);
        long passedTimeInMs3 = w3.time();
        System.out.println("2c) An integer is inserted in to the last index of the Linkedlist in "+ passedTimeInMs3+ " milliseconds.");
        w3.reset();
       
        TimeWatch w4 = new TimeWatch();
        long passedTimeInMs4 = w4.time();
        System.out.println("2d) An integer which is " +list.showAt(900000) + " is read from the index 900000 of the linked list in " + passedTimeInMs4+ " milliseconds." );
        
        TimeWatch w5 = new TimeWatch();
        long passedTimeInMs5 = w5.time();
        System.out.println("2e) An integer which is " +list.showAt(9) + " is read from the index 9 of the linked list in " + passedTimeInMs5+ " milliseconds." );
        
        
        //DYNAMIC ARRAY SECTION
        TimeWatch watch_d1 = new TimeWatch();
        DynamicArray da = new DynamicArray();
        File f3 = new File("1Mint.txt");

        // TO:DO Timer Start !!
        try ( Scanner scan = new Scanner(f3)) {
            int num;

            while (scan.hasNextInt()) {
                num = scan.nextInt();
                da.insertAtLast(num);
            }
        }
        long passedTimeInDyArrayMs = watch_d1.time();
        System.out.println("3a) The integer dynamic array structure built in "+passedTimeInDyArrayMs + " milliseconds.");
        watch_d1.reset();
        
        TimeWatch watch_d2 = new TimeWatch();
        da.insertAtStart(5);
        long passedTimeInDyArrayMs2 = watch_d2.time();
        System.out.println("3b) An integer is inserted into the first index of the dynamic array in "+ passedTimeInDyArrayMs2+ " milliseconds." );
        watch_d2.reset();
        
        TimeWatch watch_d3 = new TimeWatch();
        da.insertAtLast(45);
        long passedTimeInDyArrayMs3 = watch_d3.time();
        System.out.println("3c) An integer is inserted in to the last index of the dynamic array in "+ passedTimeInDyArrayMs3+ " milliseconds.");
        watch_d3.reset();
        
        TimeWatch watch_d4 = new TimeWatch();
        long passedTimeInDyArrayMs4 = watch_d4.time();
        System.out.println("3d) An integer which is " +da.showAt(3) + " is read from the index 900000 of the dynamic array in " + passedTimeInDyArrayMs4+ " milliseconds.");
        
        TimeWatch watch_d5 = new TimeWatch();
        long passedTimeInDyArrayMs5 = watch_d5.time();
        System.out.println("3e) An integer which is " +da.showAt(5) + " is read from the index 9 of the dynamic array in " + passedTimeInDyArrayMs5+ " milliseconds." );
        watch_d5.reset();
        
    }
    
}
