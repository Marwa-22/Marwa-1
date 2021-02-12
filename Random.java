/**
 * Created by saud on 2/11/2021.
 */
public class Random {
    public static void main(String[] args) {
        int[] array={1,2,9,6,7,8,3,4,11,12,13,14,0};
        removeElements(array);

    }

    private static void removeElements(int[] array) {
        Random r=new Random();
        while (array.length>0){
            int index = r.nextInt(array.length);
            System.out.println("index = "+ index +", element"+array[index]);
            int[] array1 = new int[array.length-1];
            for(int i=0;i<index;i++)
                array[i] = array[i];
            for(int i=index;i<array.length-1;i++)
                array[i] = array1[i+1];
            array=array1;

        }
    }
}
