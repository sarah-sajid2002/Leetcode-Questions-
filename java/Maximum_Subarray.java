package DSA.DSA_Practice_questions_375.Array_topic_01;

public class Maximum_Subarray {
    public int findmaxSuubarray(int[] arr) {
        int currentSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Maximum_Subarray object = new Maximum_Subarray();
        int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(object.findmaxSuubarray(array));

    }
}
