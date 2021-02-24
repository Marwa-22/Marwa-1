
import java.util.stream.Stream;
import java.util.Arrays;
import java.io.*;

class merge_array {

    public static <T> Object[] concatenate(T[] a, T[] b)
    {
        // Function to merge two arrays of  
        // same type 
        return Stream.of(a, b)
                .flatMap(Stream::of)
                .toArray();
    }
    public static void main (String[] args)
    {
        Integer[] a = new Integer[]{1,2,3};
        Integer[] b = new Integer[]{4,5,6};
        Object[] c = concatenate(a,b);
        System.out.println("Merged object array : "
                + Arrays.toString(c));
    }
} 