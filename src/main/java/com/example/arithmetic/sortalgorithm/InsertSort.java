package com.example.arithmetic.sortalgorithm;

import java.util.Arrays;

/**
 * @ClassName : InsertSort
 * @Description : 插入排序
 * @Author : baicun
 * @Date: 20210506
 * @Version V1.0
 */
public class InsertSort {
    // 将第一待排序序列第一个元素看做一个有序序列，把第二个元素到最后一个元素当成是未排序序列。
    // 从头到尾依次扫描未排序序列，将扫描到的每个元素插入有序序列的适当位置。（如果待插入的元素与有序序列中的某个元素相等，则将待插入元素插入到相等元素的后面。）
    // 时间复杂度：O(n²)
    // 空间复杂度：O(1)
    public static int[] sort(int[] sourceArray, int length){
        for(int i=1;i<length;i++){
            // 记录要插入的数据
            int tmp = sourceArray[i];
            // 从已经排序的序列最右边的开始比较，找到比其小的数
            int j = i;
            while (j>0 && tmp<sourceArray[j-1]){
                sourceArray[j] = sourceArray[j-1];
                j--;
            }
            // 存在比其小的数，插入
            if(j!=i){
                sourceArray[j] = tmp;
            }
        }
        return sourceArray;
    }

    public static void main(String[] args) {
        int[] sourceArray = new int[]{2,5,3,4,8};
        int[] sort = sort(sourceArray,sourceArray.length);
        System.out.println("sort = " + Arrays.toString(sort));
    }
}
