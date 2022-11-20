package lab;

public class fibonach {
private static long[] arr = new long[92];
private static int have = 2;

static{// принадлежат классу//we have this
    arr[0] = 1;
    arr[1] = 1;
}
public static long fib_get(int n){
    if( n <= have) return arr[n - 1];
    while(have != n){
        arr[have] = arr[have -1]
                + arr[have - 2];
        have++;
    }
    return arr[n-1];
}
}
