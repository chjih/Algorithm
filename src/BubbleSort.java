import java.util.Scanner;

public class BubbleSort {
    private int[] ar;
    private int size;
    public BubbleSort(int n){
        ar = new int[n];
        size=0;
    }

    public void add(int i){
        ar[size++]=i;
    }

    //버블 정렬(오름차순)
    public void bubbleSort(){
        for(int i=size-1; i>=0; i--){
            for(int j=0; j<i; j++){
                if(ar[j]>ar[j+1]){
                    int a = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = a;
                }
            }
        }
    }

    public void print(){
        for(int i=0; i<size; i++) System.out.println(ar[i]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BubbleSort ar = new BubbleSort(n);
        for(int i=0; i<n; i++){
            ar.add(sc.nextInt());
        }
        ar.bubbleSort();
        ar.print();
        sc.close();
    }
}
