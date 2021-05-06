public class ArrayPrinter {
    void printArray(int[] array) {
        if(array == null) {
            System.out.println("Array is null. No elements");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
