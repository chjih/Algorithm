import java.util.Scanner;

public class InsertionSort {
    private int[] ar;
    private int size;

    public InsertionSort(int n){
        ar = new int[n];
        size=0;
    }

    public void add(int n){
        ar[size++]=n;
    }

    public void insertionSort(){
        for(int i=0; i<size-1; i++){
            for(int j=i+1; j>0; j--){
                if(ar[j-1]>ar[j]){
                    int a = ar[j];
                    ar[j] = ar[j-1];
                    ar[j-1] = a;
                }
                else break;
            }
        }
    }

    public void print(){
        for(int i=0; i<size; i++) System.out.println(ar[i]);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        InsertionSort ar = new InsertionSort(n);
        for(int i=0; i<n; i++){
            ar.add(sc.nextInt());
        }
        ar.insertionSort();
        ar.print();
        sc.close();
    }
}
