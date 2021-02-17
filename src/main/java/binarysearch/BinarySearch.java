package binarysearch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


// efjwenfj(({{123jfsdb{P[[})))fskmdfgs)){}}]
public class BinarySearch {

    public static void main(String[] args) throws IOException {
        List<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(10);
        integerArrayList.add(15);

        Integer[] integers = new Integer[integerArrayList.size()];
        integerArrayList.toArray(integers);

        System.out.println(binarySearch(integers, 15, 0, 5));
    }

    public static Integer binarySearch (Integer[] sortedArray, int key, int low, int high) throws IOException {
        Integer index = -1;

        while (low <= high) {
            Integer mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
