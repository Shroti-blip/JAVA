package coderush;

public class Q2 {

    public static void main(String[] args) {
        // find 2 largest number

        int arr[] = {10, 25, 7, 89, 34};
        int size = arr.length;
        //Bubble Sort
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[i]) {
                    arr[j] = arr[j] + arr[i];
                    arr[i] = arr[j] - arr[i];
                    arr[j] = arr[j] - arr[i];
                }
            }
        }

        System.out.println("Second Largest number is : " + arr[size-2]);
    }

}
