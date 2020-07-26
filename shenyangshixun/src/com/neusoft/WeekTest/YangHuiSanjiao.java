package com.neusoft.WeekTest;

/**
 * @author shihaobo
 * @date 2020/7/26 10:47
 * 10. 打印出杨辉三角形（要求打印出10行如下图）
 * 1
 * 1   1
 * 1   2   1
 * 1   3   3   1
 * 1   4   6   4   1
 * 1   5   10   10   5   1
 */
public class YangHuiSanjiao {
    public static void main(String[] args) {
        int n = 10; //打印10行的杨辉三角形
        int i = 0;
        int j = 0;
        int[][] arr = new int[n][n];

        arr[0][0] = 1; //第0行特殊处理

        for (i = 1; i < n; i++) //从第1行开始，到第n行结束
        {
            arr[i][0] = 1; //每行的头尾固定为1
            arr[i][i] = 1;

            for (j = 1; j < i; j++) //从第2列开始，到第i-1列
            {
                //每个元素等于：上一行的上一列 + 上一行的该列
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        //输出
        for (i = 0; i < n; i++)
        {
            for (j = 0; j <= i; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
