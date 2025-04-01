package week00.OneDimensionalArray;

public class LinearSearch {
    public static void linearSearch(int[] nums,int target){
        boolean found = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                found = true;
                System.out.println("target element found at index:"+i);
                break;
            }
        }
        if(!found){
            System.out.println("target element is not found in the given array!");
        }
    }
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        System.out.println("array elements!");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("\ntarget element : "+target);
        linearSearch(nums,target);
    }
}

