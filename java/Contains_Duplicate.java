package DSA.DSA_Practice_questions_375.Array_topic_01;

public class Contains_Duplicate {
    public boolean checkDuplicate(int[] nums){
        boolean duplicateCheck = false;
        for(int i = 0; i < nums.length - 1; i++){
            int value = nums[i];
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] == value){
                    count += 1;
                }
            }
            if(count >= 2){
                return true; // If duplicate is found, return true immediately.
            }
        }
        return false; // If no duplicates are found, return false.
    }

    public static void main(String[] args) {
        Contains_Duplicate check = new Contains_Duplicate();
        int [] arr = {1, 2, 3};
        System.out.println(check.checkDuplicate(arr));
    }
}
