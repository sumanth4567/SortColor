import java.util.Scanner;
class SortColor {
    public void sortColors(int[] nums) {
        int mid=0,low=0;
        int high=nums.length-1;
        int temp=0;
        while(mid<=high){
            if(nums[mid]==0){
                temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }
    }
    public static void main(String args[]){
        SortColor sc=new SortColor();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=s.nextInt();
        int a[]= new int[n];
        System.out.println("Enter the values consisting of 0,1,2 into array:");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        sc.sortColors(a);
        System.out.println("The sorted colors are:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}
