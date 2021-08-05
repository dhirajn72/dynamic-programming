import java.util.*;
public class Subsets_1{
    public static  void subset(int[] nums){
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length-1;
        for(int i=0;i<=n;i++){
            for(int j=i;j<=n;j++){
                List<Integer> list=new ArrayList<>();
                for(int k=i;k<=j;k++)
                    list.add(nums[k]);
                result.add(list);
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        int[] nums={1,2,3};
        subset(nums);
    }
}
