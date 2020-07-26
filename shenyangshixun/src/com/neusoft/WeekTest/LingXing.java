package com.neusoft.WeekTest;

/**
 * @author shihaobo
 * @date 2020/7/26 10:44
 * 6. 打印出如下图案
 * *
 * ***
 * ******
 * ********
 * ******
 * ***
 * *
 * 分析：先把图形分成两部分来看待，前四行一个规律，后三行一个规律，利用双重for循环，第一层控制行，第二层控制列。
 */
public class LingXing {
    public static void main(String[] args) {
        int m = -2;
        for (int i = 0; i < 7; i++)
        {
            if (i < 4)
            {
                if (i % 2 == 0)
                {
                    m = m + 3;
                } else m = m + 2;
            } else
            {
                if (i % 2 == 0)
                {
                    m = m - 2;
                } else
                    m = m - 3;
            }
            for (int j = 0; j < m; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
