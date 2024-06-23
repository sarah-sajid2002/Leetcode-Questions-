
/* 
Given an array of size N.The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

Examples:

Input:arr[]={3,5,4,1,9}Output:Minimum element is:1 Maximum element is:9

Input:arr[]={22,14,8,17,35,3}Output:Minimum element is:3 Maximum element is:35
*/

package DSA.DSA_Practice_questions_375.Array_topic_01;
public class Maximum_and_Minimum_Element_in_an_Array {
    public void findMinAndmax(int[] arr) {
        int min = arr[1];
        int max = arr[1];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                    min = arr[j];
                }
            }
        }
        System.out.println("\n\nminimum values: " +  min + " \nmax value: " +max + "\n\n");
    }

    public static void main(String[] args) {
        Maximum_and_Minimum_Element_in_an_Array findValue = new Maximum_and_Minimum_Element_in_an_Array();
        int arr[] = { 22, 14, 8, 17, 35, 3 };
        findValue.findMinAndmax(arr);
    }
}
