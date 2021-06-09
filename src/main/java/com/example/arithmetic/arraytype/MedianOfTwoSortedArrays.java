package com.example.arithmetic.arraytype;

/**
 * @ClassName : MedianOfTwoSortedArrays
 * @Description :
 * @Author : baicun
 * @Date:
 * @Version V1.0
 */
public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        {
            double a=0;
            int[] nums1 = new int[]{1,2};
            int[] nums2 = new int[]{1,1};
            int m = nums1==null?0:nums1.length;
            int n = nums2==null?0:nums2.length;
            //计算并赋值最长数组 -> m
            if(m<n){
                int[] temp = new int[n];
                temp = nums2;
                nums2 = nums1;
                nums1 = temp;
                m = nums1.length;
                n = nums2.length;
            }
            //计算中位数
            int mod = (m+n)/2;

            // 合并两个数组,一直排序到数组中位数，停止排序，返回中位数
            if((m+n)%2 == 1){
                //合并数据为奇数
                for(int i=0; i<m; i++){
                    //循环排序
                    for(int j=0; j<n; j++){
                        if(nums1[i] <= nums2[j]){
                            continue;
                        }else{
                            int temp = nums1[i];
                            nums1[i] = nums2[j];
                            nums2[j] = temp;
                        }
                    }
                    //如果等于中位数，直接返回
                    if(i== mod){
                        a= nums1[i];
                    }
                }
            }else{
                //合并数据为偶数
                for(int i=0; i<m; i++){
                    //循环排序
                    for(int j=0; j<n; j++){
                        if(nums1[i] <= nums2[j]){
                            continue;
                        }else{
                            int temp = nums1[i];
                            nums1[i] = nums2[j];
                            nums2[j] = temp;
                        }
                    }
                    //如果等于中位数，直接返回
                    if(m==n){
                        if(i==m-1){
                            a =  (nums1[i] + nums2[0])/2.0;
                        }
                    }
                    if(i == mod){
                        a = (nums1[i-1] + nums1[i])/2.0;
                    }
                }
            }
            System.out.println("a = [" + a + "]");
        }
    }
}
