package week00.OneDimensionalArray;

public class StudentsMarks {
    public static void bubbleSort(int[] nums){
        int time = 0,swapCount = 0;
        for(int i =0; i<nums.length;i++){
            for(int j = 0;j<nums.length-1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapCount++;
                    time+=3;
                }
                time+=3;
            }
            time+=3;
        }
        System.out.println("marks in ascending order");
        for(int mark : nums){
            System.out.print(mark+ " ");
        }
        System.out.println("\nTime required : "+time);
        System.out.println("number of swapping : "+swapCount);
    }
    public static void main(String[] args) {
        int[] marks = {40,50,60,70,80,70,70,40,50,60};
        bubbleSort(marks);
    }
}
