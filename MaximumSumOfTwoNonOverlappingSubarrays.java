class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        if(n==firstLen+secondLen){
            int sum=0;
            for(int e:nums){
                sum+=e;
            }
            return sum;
        }
        
        if(firstLen<secondLen){
            int temp=firstLen;
            firstLen=secondLen;
            secondLen=temp;
        }
        int max=0;
        int secondMax=0;
        boolean flag=true;
        // The first part 
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                int k=i+j;

                int[] maxArr=Arrays.copyOfRange(nums,j,k);
                if(maxArr.length<firstLen || maxArr.length>firstLen)
                    continue;
                int sum=0;
                for(int e:maxArr){
                    sum+=e;
                }
                if(sum>max){
                    max=sum;
                    set.clear();
                    for(int l=j;l<=k;l++)
                        set.add(l); // save the indexes
                }
            }
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                int k=i+j;

                int[] maxArr=Arrays.copyOfRange(nums,j,k);
                if(maxArr.length<secondLen || maxArr.length>secondLen)
                    continue;
                int sum=0;
                for(int e:maxArr){
                    sum+=e;
                }
                if(sum>secondMax){
                    for(int l=j;l<=k;l++){
                        if(set.contains(l)){
                            flag=false;
                            break;
                        }
                    }
                    if(flag){
                        secondMax=sum;
                    }
                    flag=true;
                }
            }
        }
        return max+secondMax;
    }
}


/*

[4,5,14,16,16,20,7,13,8,15]
3
5









*/
