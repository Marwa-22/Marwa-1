
public class reverse {
    public static void main(String[] args) {
            // write your code here
            String[] names = {"hi", "you","are", "there"};
            printArray(names);
            printArray2(names);

        }
        public static <T> void printArray(T[] array){
            for(T el : array){
                System.out.print(el + " ");
            }
            System.out.println("\n");
        }
        public static <T> void printArray2(T[] array) {
            for (int i = array.length - 1; i >= 0; i--)
                System.out.print(array[i] + " ");
        }
}

