package Pa1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Java program deals with all operation of a dynamic array
// add, remove, resize memory of array is the main feature
public class DynamicArray {

    // create three variable array[] is a array,
    // count will deal with no of element add by you and
    // size will with size of array[]
    private int array[];
    private int count;
    private int size;
    // constructor initialize value to variable

    public DynamicArray() {
        array = new int[1];
        count = 0;
        size = 1;
    }
    // function add an element at the end of array

    public void insertAtLast(int data) {

        // check no of element is equal to size of array
        if (count == size) {
            growSize(); // make array size double
        } // insert element at end of array
        array[count] = data;
        count++;
    }

    // function makes size double of array
    public void growSize() {

        int temp[] = null;
        if (count == size) {

            // temp is a double size array of array
            // and store array elements
            temp = new int[size * 2];

            for (int i = 0; i < size; i++) {
                // copy all array value into temp
                temp[i] = array[i];
            }

        }

        // double size array temp initialize
        // into variable array again
        array = temp;

        // and make size is double also of array
        size = size * 2;
    }

    // function shrink size of array
    // which block unnecessary remove them
    // function add an element at given index
    public void insertAtStart(int data) {

        if (count == size) {
            growSize();
        }

        for (int i = count + 1; i > 0; i--) {

            array[i + 1] = array[i];// shift all elements 1 index right
        }
        array[0] = data;
        count++;

    }

    public int showAt(int index) {
        return array[index];
    }

    // function shift all element of right
    // side from given index in left
    public void insertAt(int index, int data) {
        if (count == size) {
            growSize();
        }

        for (int i = count + 1; i >= index; i--) {

            array[i + 1] = array[i];

            // shift all element of right 
            // side from given index in left
        }
        array[index] = data;
        count++;
    }

    public static void main(String[] args) throws FileNotFoundException {
        DynamicArray da = new DynamicArray();
        File file = new File("1Mint.txt");

        // TO:DO Timer Start !!
        try ( Scanner scan = new Scanner(file)) {
            int num;

            while (scan.hasNextInt()) {
                num = scan.nextInt();
                da.insertAtLast(num);
            }
        }
        //TODO timer closed == Dynamic Array structure built in xx seconds 

        //Timer starts for insert at first index
        da.insertAtStart(9999);
        //Timer closed;;

        //Timer starts for add end of the array
        da.insertAtLast(9999);
        //Timer closed;

        // Timer starts
        //Timer ends
        System.out.println(da.showAt(9));

    }
}
