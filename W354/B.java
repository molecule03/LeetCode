package LeetCode_Contest.W354;

import java.util.*;

public class B {

    public static void main(String[] args) {

        int nums[] ={75,15,9};
        int k = 28;
        System.out.println(maximumBeauty(nums, k));
    }

    //    Corrected Code in Upsolve
    public static int  maximumBeauty(int[] nums, int k)  {

        int same = Integer.MIN_VALUE;
        Arrays.sort(nums);
        Map<Integer, Integer> map =  new HashMap<>();
        int sum  = 0;
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
            sum+=i;
        }
        for(int key : map.keySet()){
            same = Math.max(same, map.get(key));
        }

        int n = nums.length;
        if(n == 1) return 1;
        int mid = n/2;



        int count = 0;

        int l =0;
        int r = n-1;


        while(l<r){
//            int m = (int)(1.0*Math.abs(sum/(r-l+1)));
            int m = (int)Math.abs((nums[l]+nums[r])/2);
            int ld = nums[l]+k;
            int rd = nums[r]-k;
//            System.out.println(l+" "+r+" "+m);
            if(ld < m || rd > m){
                if(ld < m && rd > m){
                    System.out.println( (m-nums[l])+" "+(nums[r]-m) );
                    if((m-nums[l]) <= (nums[r]-m)){
                        r--;
                        sum -= nums[r];
                    }
                    else {
                        l++;
                        sum -= nums[l];
                    }
                    System.out.println("if");
                }
                else if(ld < m){
                    sum -= nums[l];
                    l++;
                    System.out.println("else if");
                }
                else if(rd > m){
                    sum -= nums[r];
                    r--;
                    System.out.println("else");
                }
            }
            else{
                count = r-l+1;
                break;
            }
            System.out.println(l+" "+r+" "+m);
        }


        return Math.max(same,count);
    }
}