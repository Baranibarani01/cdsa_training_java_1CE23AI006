public class BubbleSort {

    public static int[] sort(int[] array) {
        int len = array.length;
        int temp;
        for (int k = 0; k < len; k++) {
            for (int i = 0; i < len - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }
}


