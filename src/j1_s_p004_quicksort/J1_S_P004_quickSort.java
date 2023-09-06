/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1_s_p004_quicksort;

/**
 *
 * @author MSII
 */
public class J1_S_P004_quickSort {

    static int partition(int[] a, int l, int r) {
        int pivot = a[(l + r) / 2], i = l, j = r;
        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

    static void quickSort(int[] a, int l, int r) {
        int i = partition(a, l, r);
        if (l < i - 1) {
            quickSort(a, l, i - 1);
        }
        if (i < r) {
            quickSort(a, i, r);
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 3, 7, 1, -5, 10, 5};
        for (int i = 0; i < a.length; i++) 
            System.out.print(a[i] + " ");
            System.out.println("\n----------------");
        

        quickSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) 
            System.out.print(a[i] + " ");
            System.out.println();
        
    }
}
