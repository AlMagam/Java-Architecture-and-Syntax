package lab;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;

public class task1 {
    private int rows;
    private int cols;
    private int arr[][];
    private String[] str_arr;
    Random random = new Random();//for generating rand num
    int rnd;
    StringBuilder strbuilder;// StringBuffer slowly

   /* constructor
    @param rows - rows count in array
    @param cols - columns count in array
      */
    public task1(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        arr = new int[rows][cols];
        str_arr = new String[cols];
        strbuilder = new StringBuilder();
    }

    //we fill double_arr
    public void fill_big_arr() {
        System.out.println("Subtask 1:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                rnd = random.nextInt(28) + 3;
                if (rnd % 2 != 0)
                    arr[i][j] = rnd;
                else j--;
            }
        }
    }

    //find min in each double_arr colum
    public void find_min_col() {
        for (int i = 0; i < cols; i++) {
            int min = 33;
            for (int j = 0; j < rows; j++) {
                if (arr[j][i] < min) min = arr[j][i];
            }
            System.out.println("Our min in col " + i + " = " + min);
            add_str_on_pos(i, min);
        }
    }

    //we print double_arr
    public void print_arr() {
        for (int i = 0; i < rows; i++, System.out.println()) {
            for (int j = 0; j < cols; j++)
                System.out.print(arr[i][j] + " ");
        }
    }
    //we add string in small array
    public void add_str_on_pos(int position, int count) {
        strbuilder.setLength(0);//start from 0
        while (count > 0) {
            strbuilder.append("a");
            count--;
        }
        str_arr[position] = strbuilder.toString();
    }
    //we print small array
    public void print_small_arr() {
        Arrays.sort(str_arr, Comparator.reverseOrder());
        for (String ch : str_arr) {
            System.out.print(ch + " ");
        }
    }
    //to do together
    public void make(){
        task1.this.fill_big_arr();
        task1.this.print_arr();
        task1.this.find_min_col();
        task1.this.print_small_arr();
    }

}
