package com.example.arithmetic.sortalgorithm;

import java.util.Arrays;

/**
 * @ClassName : SelectionSort
 * @Description : 选择排序
 * @Author : baicun
 * @Date: 20210506
 * @Version V1.0
 */
public class SelectionSort {
    // 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
    // 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
    // 重复第二步，直到所有元素均排序完毕。
    // 时间复杂度：O(n²)
    // 空间复杂度：O(1)
    public static int[] sort(int[] sourceArray){
        int length = sourceArray.length;
        for(int i=0;i<length;i++){
            int min = i;//记录最小数字
            for(int j=i+1;j<length;j++){
                if(sourceArray[min]>sourceArray[j]){
                    min = j;
                }
            }
            // 将找到的最小值和i位置所在的值进行交换
            if(i != min){
                int tmp = sourceArray[i];
                sourceArray[i] = sourceArray[min];
                sourceArray[min] = tmp;
            }
        }
        return sourceArray;
    }

    public static void main(String[] args) {
        int[] sourceArray = new int[]{2,5,3,4,8};
        int[] sort = sort(sourceArray);
        System.out.println("sort = " + Arrays.toString(sort));
    }
}
