package JavaExercises;

import java.util.Arrays;

/**
 * @author Gyt
 * @create 2021-03-17-9:22
 */
public class test2 {
    /**
     * 用java语言实现冒泡排序、插入排序、
     * 快速排序、合并排序、堆排序
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] ints = {2, 5, 1, 8, 4, 3, 6, 7};

//        bubbleSort(ints);
//        insertSort(ints);
//        quickSort(ints);
//        mergeSort(ints);
//        heapSort(ints);
        show(ints);


    }


    /**
     * 冒泡排序
     *
     * @param ints
     */
    public static void bubbleSort(int[] ints) {

        int temp = 0;

        for (int i = 0; i < ints.length; i++) {
            for (int lf = 0; lf < ints.length - i - 1; lf++) {

                if (ints[lf] > ints[lf + 1]) {
                    temp = ints[lf];
                    ints[lf] = ints[lf + 1];
                    ints[lf + 1] = temp;
                }

            }
        }

    }

    /**
     * 插入排序
     *
     * @param ints
     */
    public static void insertSort(int[] ints) {

        int temp = 0;

        for (int i = 1; i < ints.length; i++) {
            for (int lf = i; lf > 0; lf--) {
                if (ints[lf] < ints[lf - 1]) {
                    temp = ints[lf];
                    ints[lf] = ints[lf - 1];
                    ints[lf - 1] = temp;
                }
            }
        }
    }

    /**
     * 快速排序
     *
     * @param ints
     */
    public static void quickSort(int[] ints) {
        quickSort(ints, 0, ints.length - 1);
    }

    public static void quickSort(int[] ints, int lf, int rt) {
        if (lf >= rt) {
            return;
        }

        int left = lf;
        int right = rt;

        int key = ints[left];

        while (left < right) {
            while (right > left && ints[right] >= key) {
                right--;
            }

            ints[left] = ints[right];

            while (left < right && ints[left] <= key) {
                left++;
            }

            ints[right] = ints[left];
        }
        ints[left] = key;
        //递归
        quickSort(ints, lf, left - 1);
        quickSort(ints, right + 1, rt);
    }


    /**
     * 合并排序
     */
    public static void mergeSort(int[] ints) {
        mergeSort(ints, 0, ints.length - 1, new int[ints.length]);
    }

    public static void merge(int[] ints, int low, int mid, int high, int[] tmp) {
        int i = 0;
        int lf = low, rt = mid + 1;  //左边序列和右边序列起始索引
        while (lf <= mid && rt <= high) {
            if (ints[lf] < ints[rt]) {
                tmp[i++] = ints[lf++];
            } else {
                tmp[i++] = ints[rt++];
            }
        }

        //若左边序列还有剩余，则将其全部拷贝进tmp[]中
        while (lf <= mid) {
            tmp[i++] = ints[lf++];
        }

        while (rt <= high) {
            tmp[i++] = ints[rt++];
        }

        for (int t = 0; t < i; t++) {
            ints[low + t] = tmp[t];
        }
    }

    public static void mergeSort(int[] ints, int low, int high, int[] tmp) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(ints, low, mid, tmp); //对左边序列进行归并排序
            mergeSort(ints, mid + 1, high, tmp);  //对右边序列进行归并排序
            merge(ints, low, mid, high, tmp);    //合并两个有序序列
        }
    }


    /**
     * 堆排序
     */
    private static void heapSort(int[] ints) {
        //创建堆
        for (int i = (ints.length - 1) / 2; i >= 0; i--) {
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(ints, i, ints.length);
        }

        //调整堆结构+交换堆顶元素与末尾元素
        for (int i = ints.length - 1; i > 0; i--) {
            //将堆顶元素与末尾元素进行交换
            int temp = ints[i];
            ints[i] = ints[0];
            ints[0] = temp;

            //重新对堆进行调整
            adjustHeap(ints, 0, i);
        }
    }

    private static void adjustHeap(int[] ints, int parent, int length) {
        //将temp作为父节点
        int temp = ints[parent];
        //左孩子
        int lChild = 2 * parent + 1;

        while (lChild < length) {
            //右孩子
            int rChild = lChild + 1;
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if (rChild < length && ints[lChild] < ints[rChild]) {
                lChild++;
            }

            // 如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp >= ints[lChild]) {
                break;
            }

            // 把孩子结点的值赋给父结点
            ints[parent] = ints[lChild];

            //选取孩子结点的左孩子结点,继续向下筛选
            parent = lChild;
            lChild = 2 * lChild + 1;
        }
        ints[parent] = temp;
    }


    public static void show(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }

}
