package test01;

import java.util.Scanner;

/**
 * @author 陈亚琦
 * 我亦无他,唯手熟尔
 */

/*转换属性 V
A  B  投入多少A , 出来多少B
    b * v <= a       max
    (b + 1) * v > a  min

     a/ (b + 1)  < v <= a/b

3
75 3
53 2
59 2   20  29

 */
public class mains {
    static int max = Integer.MAX_VALUE;

    static int min = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int l = a/(b+1) + 1;
            int r = a/b;

            min = Math.max(min,l);
            max = Math.min(max,r);
        }
        System.out.println(min + " " + max);
    }
}
