package test01;


import java.util.Scanner;

/**
 * @author 陈亚琦
 * 我亦无他,唯手熟尔
 */
/*转换属性 V
A  B  投入多少A , 出来多少B

    [ A / V] = B  b-v单调递减
    a/v <= b 的最小v
   ( a/v <= b-1 ) - 1
 */
public class mains1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = 1;
        int max = (int) 10e9;
        while (n-- > 0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            min = Math.max(min,binarySearch(a,b));
            max = Math.min(max,binarySearch(a,b-1) - 1);
        }
        System.out.println(min + " " + max);
    }
    public static int  binarySearch(int a,int b){
        int l = 1; int r = (int) 1e9;
        while(l<r){
            int mid = l + r >> 1;
            if( a / mid <= b ){
                r = mid;
            }else l = mid + 1;
        }
        return r;
    }
}
/*
3
75 3
53 2
59 2

 */