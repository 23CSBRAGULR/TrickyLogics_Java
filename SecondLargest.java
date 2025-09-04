package TrickyLogics_Java;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {-5, -8, -6, -7, -2, -10};
        int large = Integer.MIN_VALUE;
        int slarge = Integer.MIN_VALUE;

        for(int num : arr) {
            if (num > large) {
                slarge = large;
                large = num;
            }
            else if (num > slarge && num != large) {
                slarge = num;
            }
        }

        System.out.println("Second Largest element is: " + slarge);
    }
}
