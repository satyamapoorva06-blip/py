import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] a = arr.clone();
        Arrays.sort(a);
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int num : a) {
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}