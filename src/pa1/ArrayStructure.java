package Pa1;

import java.io.File;
import java.util.Scanner;

public class ArrayStructure {
    
    public static int ARR_SIZE = 1000000;
     int[] arr = new int[ARR_SIZE];
     public static int count = 0 ;
     
     
     public int showAt(int index){
         return arr[index];
     }
     


    public void insertAt(int index, int data) {
        if(count >= 0) {
            int[] temp = new int[++ARR_SIZE];

            for (int i = 0; i < index; i++) {
                temp[i] = arr[i]; 
            }

            for (int i = index; i < count; i++) {
                temp[i + 1] = arr[i];
                
            }
            temp[index] = data;
            arr = temp ;
            count ++;
         }
    }

    public void insertFirst(int data) {
        if(count >= 0) {

            int[] temp = new int[++ARR_SIZE]; // Created temp array to shift elements

            for (int i = 0; i < count; i++) {
                temp[i + 1] = arr[i];
                
            }
            temp[0] = data ;
            
            arr = temp ;
            count ++;
         }
    }

    public void insertLast(int data){
        
        int[] temp = new int[++ARR_SIZE];
        temp[ARR_SIZE-1] = data;
        arr = temp;
        count++;
    }
    
    public void add(int data){
        
        arr[count++] = data;
        
    }
    
    public static void main(String[] args) {
        
        File file = new File("1Mint.txt");
        ArrayStructure as = new ArrayStructure();

        try {
            int num ;
            Scanner scan = new Scanner(file);
            
            while(scan.hasNextInt()){
                num = scan.nextInt();
                
                as.add(num);
            }

        } catch (Exception e) {
           
            System.out.println("Exception!!!!");
        }


        as.insertFirst(999);
        as.insertAt(1, 2222);

        for (int i = 0; i < count; i++) {
            System.out.println(as.arr[i]);
        }
        
    }
}
