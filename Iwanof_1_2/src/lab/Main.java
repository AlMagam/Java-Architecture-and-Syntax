package lab;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[300];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        arr[1] = -5;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > 0) {
                for (int j = 2; i * j < arr.length; j++)
                    arr[i * j] = 0;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0) {System.out.print(arr[i]);System.out.println();}
        }
    }
}
