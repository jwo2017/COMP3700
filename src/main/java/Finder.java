public class Finder {
    public static void main(String[] args) {


    }

    public Integer findMax(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        int max = intArray[0];
        for (int elem : intArray) {
            if (elem > max) {
                max = elem;
            }
        }
        return max;
    }

    public Integer findMin(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        int min = intArray[0];
        for (int elem : intArray) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }


}
