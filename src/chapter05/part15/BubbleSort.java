package chapter05.part01;

import java.util.Arrays;

public class BubbleSort {

    public static void sortV1(int array[])
    {
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length-i-1; j++)
            {
                int tmp  = 0;
                if(array[j] > array[j+1])
                {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static void sortV2(int array[])
    {
        int tmp  = 0;
        for(int i = 0; i < array.length; i++)
        {
            //有序标记，每一轮的初始是true
            boolean isSorted = true;
            for(int j = 0; j < array.length-i-1; j++)
            {

                if(array[j] > array[j+1])
                {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    //有元素交换，所以不是有序，标记变为false
                    isSorted = false;
                }
            }

            if(isSorted){
                break;
            }
        }
    }

    public static void main(String[] args){
        int[] array = new int[]{3,4,2,1,5,6,7,8};
        sortV2(array);
        System.out.println(Arrays.toString(array));
    }
}
