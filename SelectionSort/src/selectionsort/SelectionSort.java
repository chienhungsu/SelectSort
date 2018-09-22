/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author chienhungsu
 */
public class SelectionSort {

    /**
     * select sort is unstable sort
     * better performance than bubble sort
     * because it has less swapping
     */
    public static void main(String[] args) {
        // create the int array and give the size of array
        int [] intarr = new int[7];
        
        intarr[0]=100;
        intarr[1]=21;
        intarr[2]=252;
        intarr[3]=-23;
        intarr[4]=424;
        intarr[5]=325;
        intarr[6]=216;
        for(int i=0;i<intarr.length;i++)System.out.println(intarr[i]);
        selectsort(intarr);
        for(int i=0;i<intarr.length;i++)System.out.println("\n"+intarr[i]);
    }
    private static void swap(int[] intarr, int i, int j) {
        int temp;
        // check the index is the same or not if the index is the same then not swap
        if(i==j)return;
        // swap the array
        temp=intarr[i];
        intarr[i]=intarr[j];
        intarr[j]=temp;
    }
    private static void selectsort(int[] intarr) {
        for(int unsortindex=intarr.length-1;unsortindex>=0;unsortindex--){
            int largest=0;
            for(int curindex=0;curindex<unsortindex;curindex++){
                if(intarr[curindex]<intarr[curindex+1])largest=curindex+1;
            }
            swap(intarr,unsortindex,largest);
        }
    }
}
