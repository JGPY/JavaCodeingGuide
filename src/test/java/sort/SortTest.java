package sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author l
 */
public class SortTest {

    Sort s;
    int []a;


    @Before
    public void beforeSort() {
        s=new Sort();
        a=new int[10];
        for(int i=1;i<a.length;i++){
            //a[i]=(int)(new Random().nextInt(100));
            a[i]=(int)(Math.random()*100);
        }
        System.out.println("排序前的数组为："+Arrays.toString(a));
    }

    @Test
    public void insertSort() {
        s.insertSort(a);
    }

    @Test
    public void sheelSort() {
        s.sheelSort(a);
    }

    @Test
    public void selectSort() {
        s.selectSort(a);
    }

    @Test
    public void heapSort() {
        s.heapSort(a);
    }

    @Test
    public void bubbleSort() {
        s.bubbleSort(a);
    }

    @Test
    public void quickSort() {
        s.quickSort(a, 1, 9);
    }

    @Test
    public void mergeSort() {
        s.mergeSort(a, 3, 7);
    }

    @Test
    public void baseSort() {
        s.baseSort(a);
    }

    @After
    public void afterSort() {
        System.out.println("排序后的数组为："+Arrays.toString(a));
    }
}