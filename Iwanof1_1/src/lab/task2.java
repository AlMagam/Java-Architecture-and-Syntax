package lab;

/*class created for solving task1*/
public class task2 {
    private int rows;
    private int cols;
    private int[][] arr;
    private String[] str_arr;
    private int[] int_arr;
  /*  generate random number
    @param min minimal number of range
    @param max maximal number of range
    @return pseudo random number in range [min, max]
    */
    public int randNum(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    /* constructor
    @param rows - rows count in array
    @param cols - columns count in array
      */
    public task2(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        arr = new int[rows][cols];
        int_arr = new int[cols];
        str_arr = new String[cols];
    }

    //we fill double_arr
    public void fill_big_arr() {
        int rnd_num;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                rnd_num = randNum(3, 31);
                if (rnd_num % 2 != 0)
                    arr[i][j] = rnd_num;
                else j--;
            }
        }
    }
//find min in each colum
    public void find_min_col() {
        for (int i = 0; i < cols; i++) {
            int min = 33;
            for (int j = 0; j < rows; j++) {
                if (arr[j][i] < min) min = arr[j][i];
            }
            System.out.println("Our min in col " + i + " = " + min);
            int_arr[i] = min;
        }
    }
//fill small array
    public void fill_small_arr() {
        for (int i = 0; i < cols; i++) {
            str_arr[i] = "";
        }
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < int_arr[i]; j++) {
                str_arr[i] += "" + "a";
            }
        }
    }
//sorting small array
    public void sort_small_Arr() {
        String tmp;
        for (int i = 0; i < cols - 1; i++) {
            for (int j = i + 1; j < cols; j++) {
                if(str_arr[j].compareTo(str_arr[i]) > 0) {
                    tmp = str_arr[j];
                    str_arr[j] = str_arr[i];
                    str_arr[i] = tmp;
                }
            }
        }
    }
    //printing small array
    public void print_small_arr() {
        //Arrays.sort(str_arr,Comparator.reverseOrder());
        for (String ch : str_arr) {
            System.out.print(ch + " ");
        }

    }
    //printing double_array
    public void print_arr() {
        System.out.println("\n\nSubtask 2:");
        for (int i = 0; i < rows; i++, System.out.println()) {
            for (int j = 0; j < cols; j++)
                System.out.print(arr[i][j] + " ");
        }
    }
    //to make
    public void make(){
        task2.this.fill_big_arr();
        task2.this.print_arr();
        task2.this.find_min_col();
        task2.this.fill_small_arr();
        task2.this.sort_small_Arr();
        task2.this.print_small_arr();
    }

}
