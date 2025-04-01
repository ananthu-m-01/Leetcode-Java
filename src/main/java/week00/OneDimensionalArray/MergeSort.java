package week00.OneDimensionalArray;

public class MergeSort {
    static int[] tempArray;
    public static void merge(int[] nums,int start,int mid,int end){
        int i = start, k = start, j = mid+1;
        while (i <= mid && j <= end){
            if(nums[i] < nums[j]){
                tempArray[k] = nums[i];
                i++;
                k++;
            }else {
                tempArray[k] = nums[j];
                j++;
                k++;
            }
        }
        while (i <= mid){
            tempArray[k] = nums[i];
            i++;
            k++;
        }
        while (j <= end){
            tempArray[k] = nums[j];
            k++;
            j++;
        }
        for (int x = start;x <= end;x++){
            nums[x] = tempArray[x];
        }
    }
    public static void mergeSort(int[] nums,int start,int end){
        if(start<end){
            int mid = (start + end)/2;
            mergeSort(nums,start,mid);
            mergeSort(nums,mid+1,end);
            merge(nums,start,mid,end);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,5,4,6,2,9,3,8,10,7};
        tempArray = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        System.out.println("array before sorting");
        for (int num : nums){
            System.out.print(num + " ");
        }
        mergeSort(nums,start,end);
        System.out.println("\narray after sorting");
        for (int num : nums){
            System.out.print(num + " ");
        }
    }
}
