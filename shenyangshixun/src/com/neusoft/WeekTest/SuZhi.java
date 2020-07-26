package com.neusoft.WeekTest;

/**
 * @author shihaobo
 * @date 2020/7/26 10:42
 * 3. 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 *    分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去掉不满足条件的排列。
 */
public class SuZhi {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 4; j++)
            {
                if (j == i)
                {
                    continue;
                }
                for (int k = 1; k <= 4; k++)
                {
                    if (k == i || k == j)
                    {
                        continue;
                    }
                    for (int m = 1; m <= 4; m++)
                    {
                        if (m == i || m == j || m == k)
                        {
                            continue;
                        }

                        System.out.println(i * 1000 + j * 100 + k * 10 + m);
                    }
                }
            }
        }
    }
}
