package TrickyLogics_Java;

public class SecondLargestUsingSort {
    public static void main(String[] args) {
        int[] arr = {-5, -8, -6, -7, -2, -10};
        int n = arr.length;

        //sorting the array in ascending order using bubble sort
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    //swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        //printing the second largest element
        System.out.println("Second Largest element is: " + arr[n-2]);
    }
}
