public class Finder {
    public static void main(String[] args) {


    }

    public int findMax(int[] intArray) {
        int max = intArray[0];
        for (int elem : intArray) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

    public int findMin(int[] intArray) {
        int min = intArray[0];
        for (int elem : intArray) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }


}
