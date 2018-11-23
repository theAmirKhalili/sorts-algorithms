package sorts;


import java.util.Random;
import java.lang.Math;

public class main {

    public static void main(String [] args) {
//      length of array = more than 1;
        int len = 10000;


//______GENERATE RANDOM LIST_______________________
        //point : generate random between (-len) and (len)
        int min = -len;
        int max = len;
        int rand_list[] = new int[len];
        for (int i = 0; i < len; i++) {
            Random rand = new Random();
            int n = rand.nextInt(2 * max) + min;
            rand_list[i] = n;
        }
//---------------------------------------------------



//______print random list____________________________
//        for (int i = 0; i < len; i++) {
//            System.out.print(rand_list[i] + " ");
//        }
//        System.out.println();
//    }
// --------------------------------------------------



//______initialize arrays for 6 sorts._______________
        int arr1[] = new int[len];
        int arr2[] = new int[len];
        int arr3[] = new int[len];
        int arr4[] = new int[len];
        int arr5[] = new int[len];
        int arr6[] = new int[len];

        for (int i = 0; i < len; i++) {
            arr1[i] = rand_list[i];
            arr2[i] = rand_list[i];
            arr3[i] = rand_list[i];
            arr4[i] = rand_list[i];
            arr5[i] = rand_list[i];
            arr6[i] = rand_list[i];
        }
//--------------------------------------------------




//_______tests for sorts____________________________

        sorts sort = new sorts(); //create object of sort.



        //Insertion sort
        System.out.println("Insertion sort :");
        double startTime1 = System.nanoTime();
        sort.Insertion_sort(arr1);
        //sort.print(arr1);
        double endTime1 = System.nanoTime();
        double nano = 1000000000;
        double Time_1 = (endTime1 - startTime1)/nano;
        System.out.println("Time of Insertion sort :" + Time_1 + " s.");
        System.out.println();
        System.out.println();
        System.out.println();


        //Selection sort
        System.out.println("Selection sort :");
        double startTime2 = System.nanoTime();
        sort.Selection_sort(arr2);
        //sort.print(arr2);
        double endTime2 = System.nanoTime();
        double Time_2 = (endTime2 - startTime2)/nano;
        System.out.println("Time of Selection sort :" + Time_2 + " s.");
        System.out.println();
        System.out.println();
        System.out.println();


        //Bubble sort
        System.out.println("Bubble sort :");
        double startTime3 = System.nanoTime();
        sort.BubbleSort(arr3);
        //sort.print(arr3);
        double endTime3 = System.nanoTime();
        double Time_3 = (endTime3 - startTime3)/nano;
        System.out.println("Time of Bubble sort :" + Time_3 + " s.");
        System.out.println();
        System.out.println();
        System.out.println();


        //Merge sort
        System.out.println("Merge sort :");
        double startTime4 = System.nanoTime();
        sort.MergeSort(arr4);
        //sort.print(arr4);
        double endTime4 = System.nanoTime();
        double Time_4 = (endTime4 - startTime4)/nano;
        System.out.println("Time of Merge sort :" + Time_4 + " s.");
        System.out.println();
        System.out.println();
        System.out.println();


        //Quick sort
        System.out.println("Quick sort :");
        double startTime5 = System.nanoTime();
        sort.QuickSort(arr5, 0, len - 1);//0 to len - 1 because 0 is first element of array
        //sort.print(arr5);                      // and len - 1 is last element of array
        double endTime5 = System.nanoTime();
        double Time_5 = (endTime5 - startTime5)/nano;
        System.out.println("Time of Quick sort :" + Time_5 + " s.");
        System.out.println();
        System.out.println();
        System.out.println();


        //Heap sort
        System.out.println("Heap sort :");
        double startTime6 = System.nanoTime();
        sort.HeapSort(arr6);
        //sort.print(arr6);
        double endTime6 = System.nanoTime();
        double Time_6 = (endTime6 - startTime6)/nano;
        System.out.println("Time of Heap sort :" + Time_6 + " s.");
        System.out.println();
        System.out.println();
        System.out.println();

    }
}
