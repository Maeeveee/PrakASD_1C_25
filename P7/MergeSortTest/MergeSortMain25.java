package P7.MergeSortTest;

public class MergeSortMain25 {
public static void main(String[] args) {
    int data[] = {10,40,30,50,70,20,100,90};
    System.out.println("Sorting dengan merge sort");
    MergeSorting25 mSort = new MergeSorting25();
    System.out.println("data awal : ");
    mSort.printArray(data);
    mSort.mergesort(data);
    System.out.println("setelah diurutkan : ");
    mSort.printArray(data);
}    
}
