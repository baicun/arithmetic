package com.example.arithmetic.sortalgorithm;

import java.util.Arrays;

/**
 * @ClassName : bubblesort
 * @Description : 冒泡排序
 * @Author : baicun
 * @Date: 20210506
 * @Version V1.0
 */
public class bubblesort {
    // 冒泡排序是通过比较两个相邻元素的大小实现排序，如果前一个元素大于后一个元素，就交换这两个元素。这样就会让每一趟冒泡都能找到最大一个元素并放到最后。
    // 时间复杂度：O(n²)
    // 空间复杂度：O(1)
    public static int[] sort(int[] sourceArray) {
        for(int i=1;i<sourceArray.length;i++){
            boolean flag = false; // 对冒泡排序的优化
            for(int j=0;j<sourceArray.length-i;j++){
                //如果前一个元素大于后一个元素，则进行交换
                if(sourceArray[j]>sourceArray[j+1]){
                    Integer tmp = sourceArray[j];
                    sourceArray[j] = sourceArray[j+1];
                    sourceArray[j+1]  = tmp;
                    flag = true;
                }
            }
            if(flag==false){
                return sourceArray;
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
