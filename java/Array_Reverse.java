package DSA.DSA_Practice_questions_375.Array_topic_01;

public class Array_Reverse {
    public int[]  reverseArray(int[] arr){
        int length = arr.length-1;
        int arr_length = arr.length/2;
        for (int i = 0; i <= arr_length; i++) {
                int number1 = arr[length];
                arr[length] = arr[i];
                arr[i] = number1;

                length-=1;
        }
        return arr;
    }

    public static void main(String[] args) {
        Array_Reverse reverse = new Array_Reverse();
        
        int[] array = {1,2,3,4,5};
        System.out.print("Original array : ");

        for(int s:array){
            System.out.print(s + " ");
        }
        System.out.println();
        reverse.reverseArray(array);

        System.out.print("Reversed array : ");

        for(int s:array){
            System.out.print(s + " ");
        }
        System.out.println();
        
        
        
    }
    
}
