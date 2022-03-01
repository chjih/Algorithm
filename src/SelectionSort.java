import java.util.Scanner;

public class SelectionSort {
    private int[] ar;
    private int size;

    public SelectionSort(int n){
        ar = new int[n];
        size=0;
    }

    public void add(int n){
        ar[size++]=n;
    }

    //선택정렬(오름차순)
    public void selectionSort(){
        for(int i=0; i<size; i++){
            int min = ar[i];
            int k=i;
            for(int j=i; j<size; j++){
                if(min>ar[j]){
                    min=ar[j];
                    k = j;
                }
            }
            ar[k]=ar[i];
            ar[i]=min;
        }
    }

    public void print(){
        for(int i=0; i<size; i++) System.out.println(ar[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SelectionSort ar = new SelectionSort(n);
        for(int i=0; i<n; i++){
            ar.add(sc.nextInt());
        }
        ar.selectionSort();
        ar.print();
        sc.close();
    }
}
