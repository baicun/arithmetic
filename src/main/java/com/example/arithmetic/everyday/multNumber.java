package com.example.arithmetic.everyday;

public class multNumber {
    // 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
    // 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
    // 示例 1：
    //     输入：[3,2,3]
    //     输出：3
    public static void main(String[] args) {
        int[] nums = new int[]{3,3,3,2,2};
        //摩尔投票 - 多数胜出
        int count = 0;
        int most = nums[0];
        for(int i=0;i<nums.length;i++){
            if(most == nums[i]){
                count++;
            }else{
                count--;
                if(count == 0){
                    most = nums[i];
                    count++;
                }
            }
        }
        System.out.println("most = [" + most + "]"+", count = [" + count + "]");

    }
}
