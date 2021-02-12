import java.util.Arrays;
public class Rem{
        public static int[] removeTheElement(int[] arr,int index){
            if ((arr == null))
            {
                return arr;
            }
            else if((index<0) || (index>=arr.length)){
                return arr;
            }
            int[] anotherArray = new int[arr.length-1];
            for(int i=0 , k=0;i<arr.length; i++ ){
                if(i == index)
                {continue;}
                anotherArray[k++] = arr[i];
            }
            return anotherArray;
        }
        public static void main(String[] args){
            int[] arr={11,12,13,14,15};
            System.out.println("original array:"+ Arrays.toString(arr));
            int index =12;
            System.out.println("index to be removed: "+ index);
            arr = removeTheElement(arr, index);
            System.out.println("resultant array: "+ Arrays.toString(arr));
        }
}