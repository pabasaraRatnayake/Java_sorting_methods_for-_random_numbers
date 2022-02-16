import javax.sound.midi.Soundbank;

public class Main {

    static void SelectionSort(int[] arr){
            for (int i = 0; i < arr.length-1; i++) {
                int min_idx = i;
                for (int j = i+1; j < arr.length; j++)
                    if (arr[j] < arr[min_idx]){
                        min_idx = j;
                    }
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
            for (int i=0; i<arr.length; ++i){
                System.out.print(arr[i]+" ");
            }
    }

    public static void InsertionSort(int[] arr){
            for (int i = 1; i < arr.length; ++i) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
           }
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
       }


    static void BubbleSort(int[] arr){
                for (int i = 0; i < arr.length-1; i++)
                    for (int j = 0; j < arr.length-i-1; j++)
                        if (arr[j] > arr[j+1]){
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                for (int i=0; i<arr.length; ++i){
                    System.out.print(arr[i] + " ");
                }
    }

    public static void main (String[] args){
        //int[] array = {12, 67,9,34,87};
        int[] array = new int[1000];
        System.out.println("Original Array");
        for (int i=0; i<array.length; i++){
            int randomNum = (int)(Math.random() * 1001);  // 0 to 1000
            array[i] = randomNum;
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\nSelection Sort");
        SelectionSort(array);

        System.out.println("\n\nInsertion Sort");
        InsertionSort(array);

        System.out.println("\n\nBubble Sort");
        BubbleSort(array);
    }


}


