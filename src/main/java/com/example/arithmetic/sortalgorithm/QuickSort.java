package com.example.arithmetic.sortalgorithm;

import org.springframework.context.annotation.Primary;

import java.util.Arrays;

/**
 * @ClassName : QuickSort
 * @Description : 快速排序
 * @Author : baicun
 * @Date: 20210506
 * @Version V1.0
 */
public class QuickSort {
    // 从数列中挑出一个元素，称为 “基准”（pivot）;
    // 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作；
    // 递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序；
    // 时间复杂度：Ο(nlogn)
    // 空间复杂度：O(logn)
    public static int[] sort(int[] sourceArray, int left, int right){
        if(left<right){
            int partitionIndex = partition(sourceArray, left, right);
            sort(sourceArray, left, partitionIndex-1);
            sort(sourceArray, partitionIndex+1, right);
        }
        return sourceArray;
    }

    // 根据基准值进行分区
    private static int partition(int[] arr, int left, int right){
        // 设置基准值
        int pivot = left;
        int index = pivot + 1;
        for(int i=index;i<=right;i++){
            if(arr[i]<arr[pivot]){
                swap(arr, i, index);
                index++;
            }
        }
        swap(arr, pivot, index-1);
        return index-1;
    }

    //交换
    private static void swap (int[] arr, int i,int index){
        int tmp = arr[i];
        arr[i] = arr[index];
        arr[index] = tmp;
    }

    public static void main(String[] args) {
        int[] sourceArray = new int[]{2,5,3,4,8,1};
        int[] sort = sort(sourceArray,0, sourceArray.length-1);
        System.out.println("sort = " + Arrays.toString(sort));
    }
}
