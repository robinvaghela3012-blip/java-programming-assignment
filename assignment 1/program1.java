import java.util.*;

class ArrayStringOps {
    int[] arr;
    String str;

    ArrayStringOps(int[] arr, String str) {
        this.arr = arr;
        this.str = str;
    }

    void reverseArray() {
        System.out.print("Reversed Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void sortArray() {
        Arrays.sort(arr);
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    void searchElement(int key) {
        boolean found = false;
        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }

    void average() {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Average: " + (sum / arr.length));
    }

    void maximum() {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        System.out.println("Maximum: " + max);
    }

    void reverseString() {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed String: " + rev);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        String str = "Prince";

        ArrayStringOps obj = new ArrayStringOps(arr, str);

        obj.reverseArray();
        obj.sortArray();
        obj.searchElement(9);
        obj.average();
        obj.maximum();
        obj.reverseString();
    }
}