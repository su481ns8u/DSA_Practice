package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArrays {
    static List<Integer> mergeArrays(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();

        if (list1.isEmpty())
            return list2;
        else if (list2.isEmpty())
            return list1;

        Integer it1 = 0;
        Integer it2 = 0;

        while (it1 < list1.size() && it2 < list2.size()) {
            if (list1.get(it1) < list2.get(it2)) {
                mergedList.add(list1.get(it1));
                it1++;
            } else {
                mergedList.add(list2.get(it2));
                it2++;
            }
        }

        if (it1 < list1.size()) {
            while (it1 < list1.size()) {
                mergedList.add(list1.get(it1));
                it1++;
            }
        } else {
            while (it2 < list2.size()) {
                mergedList.add(list2.get(it2));
                it2++;
            }
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(0, 3, 4, 31));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(4, 6, 30));
        System.out.println(mergeArrays(list1, list2));
    }
}
