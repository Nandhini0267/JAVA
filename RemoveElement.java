import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
    public static int[] removeElement(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i : arr) {
            arrayList.add(i);
        }
        
        arrayList.remove(index);
        
        int[] newArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            newArr[i] = arrayList.get(i);
        }
        
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int indexToRemove = 2;
        int[] newArr = removeElement(arr, indexToRemove);
        
        System.out.println(Arrays.toString(newArr));
    }
}
