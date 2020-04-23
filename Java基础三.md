
##循环跳转
分类：
>- break: 是用来终止循环的, 循环不再继续执行.
>- continue: 用来结束本次循环, 进行下一次循环的, 循环还会继续执行.

案例：
#####break入门
打印10次HelloWorld, 当打印第五次的时候, 结束循环.
```
public class BreakDemo01 {
    public static void main(String[] args) {
        System.out.println("start");
        //1. 定义for循环, 打印10次HelloWorld
        for (int i = 1; i <= 10 ; i++) {
            //2.当i等于5的时候, 结束循环
            if (i == 5)
                break;
            System.out.println("Hello World! " + i);
        }
        System.out.println("end");
    }
}
```
![break案例](https://upload-images.jianshu.io/upload_images/22778944-1a72eebd0b18edcb.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

#####continue入门

打印1~10之间, 所有不是3倍数的整数.
```
public class ContinueDemo02 {
    public static void main(String[] args) {
        System.out.println("start");
        //1. 通过for循环, 获取1 - 10之间所有的整数
        for (int i = 1; i <= 10; i++) {
            //2. 判断该数字是否是3的倍数.
            if (i % 3 == 0)
                //3. 如果是, 就结束本次循环
                continue;
            //4. 如果不是, 就打印该数字的值.
            System.out.println(i);
        }
        System.out.println("end");
    }
}
```
![continue案例](https://upload-images.jianshu.io/upload_images/22778944-42d336980c6444ec.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


##循环嵌套
>循环嵌套用的最多的是for循环的嵌套。
循环嵌套的总执行次数 = 外循环的次数 * 内循环的次数.
案例一：打印2020年1月至2023年12月之间所有的月份, 格式为: XXXX年XX月
```
public class ForForDemo04 {
    public static void main(String[] args) {
        //1. 定义外循环, 控制年份的变化.
        for (int i = 2020; i <= 2023 ; i++) {       //外循环执行一次, 内循环执行一圈.
            System.out.println("start");
            //变量i的取值: 2021, 2022, 2023
            //2. 定义内循环, 控制月份的变化.
            for (int j = 1; j <= 12 ; j++) {
                System.out.print(i + "年" + j + "月\t");
            }
            System.out.println();   //记得加换行
            System.out.println("end\r\n");
        }
    }
}
```

案例二：打印1天内的所有时间, 格式: 13时14分.
```
public class ForForDemo05 {
    public static void main(String[] args) {
        //1. 定义外循环, 控制小时的变化.
        for (int hour = 0; hour <= 23 ; hour++) {
            //2. 定义内循环, 控制分钟的变换.
            for (int minute = 0; minute <= 59; minute++) {
                System.out.println(hour + "时" + minute + "分");
            }
        }
    }
}

```
案例三：打印倒三角形
```
public class ForForDemo08 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {       //外循环控制行
            for (int j = i; j <= 5; j++) {   //内循环控制列
                System.out.print("*");      //每次打印一个"*"
            }
            System.out.println();           //内循环执行结束, 意味着一行打印完毕, 记得要换行.
        }
    }
}
```

案例四：打印99乘法表
```
public class ForForDemo09 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {       //外循环控制行
            for (int j = 1; j <= i; j++) {   //内循环控制列
                //1 * 3 = 3   2 * 3 = 6  3 * 3 = 9
                System.out.print(j + " * " + i + " = " + i * j + "\t");     
            }
            System.out.println();           //内循环执行结束, 意味着一行打印完毕, 记得要换行.
        }
    }
}
```

##带标号的循环操作
格式：
```
A: for(初始化条件; 判断条件; 控制条件) {     //外循环
    B: for(初始化条件; 判断条件; 控制条件) { //内循环
        循环体;
    }
}
```
- break用法
```
//打印一个1行2列的星星图案
public class ForForDemo10 {
    public static void main(String[] args) {
        A: for (int i = 1; i <= 5; i++) {      //外循环, 控制行.
            B: for (int j = 1; j <= 5 ; j++) { //内循环, 控制列.
                if (j == 3) {
                    break A;   //这个break, 是用来结束哪个循环呢?
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

- continue用法

```
//打印1~100之间所有的质数, 并按照3个一行的形式进行输出.
public class ForForDemo10 {
    public static void main(String[] args) {
        //定义变量, 用来记录1-100之间的 质数个数.
        int count = 0;
        //定义变量, 用来记录一行打印几个数.
        int flag = 3;
        a: for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i ; j++) {
                if (i % j == 0) {
                    //走到这里, 说明i不是质数.
                    continue a;
                }
            }
            System.out.print(i + (++count % flag == 0 ? "\r\n" : "\t"));
        }
    }
}
```


##生成随机数(Random)
>Random类似Scanner，也是Java提供好的API(Application Programming Interface)，内部提供了产生随机数的功能. API后续课程详细讲解，现在可以简单理解为Java已经写好的代码, 我们可以直接拿来用.

步骤:
```
//导入包
import java.util.Random;
//常见随机数Random对象
Random r = new Random();
//调用方法,产生随机数
int num = r.nextInt(10); //小括号中可以传入任意的正整数
double num = r.nexDouble();  // [0, 1.0)之间的任意小数
boolean num = r.nextBoolean(10); // 生成均等的布尔值

```

案例一:使用Random类，生成5个10以内的随机整数, 并将结果打印到控制台.
```
import java.util.Random;

public class RandomDemo01 {
    public static void main(String[] args) {
        //1. 创建Random对象.
        Random r = new Random();
        //2. 定义for循环, 用来获取3个随机数.
        int num;
        for (int i = 1; i <= 3; i++) {
            //3. 调用r.nextInt(数字)方法, 获取具体的随机数.
            num = r.nextInt(10);
            System.out.println(num);
        }
    }
}
```

案例二:生成随机职业
```
import java.util.Random;
import java.util.Scanner;

public class RandomDemo03 {
    public static void main(String[] args) {
        /*
            1. 提示用户录入他/她的名字并接收.
            2. 通过随机数, 来打印用户上辈子的职业.
            3. 0: 宰相, 1: 一品带刀侍卫, 2:皇帝, 3: 大内总管, 4: 店小二, 5: 江湖郎中
         */
        //1. 创建Random类的对象.
        Random r = new Random();
        //2. 提示用户录入他/她的名字并接收.
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入您的姓名, 我来算一下您上辈子的职业: ");
        String name = sc.nextLine();

        //3. 生成一个0-5之间的随机数.
        int num = r.nextInt(6);
        String occupation = "";
        switch (num) {
            case 0:
                occupation = "宰相";
                break;
            case 1:
                occupation = "一品带刀侍卫";
                break;
            case 2:
                occupation = "皇帝";
                break;
            case 3:
                occupation = "大内总管";
                break;
            case 4:
                occupation = "店小二";
                break;
            case 5:
                occupation = "宰相";
                break;
            default:
                System.out.println("江湖郎中");
                break;
        }
        //4. 根据生成的随机数, 打印用户上辈子的职业.
        System.out.println("您好, " + name + ", 经过大数据分析, 您上辈子的职业是: " + occupation);
    }
}
```

案例三:猜数字
```
/*生成一个1-100之间的随机数, 让用户来猜.
如果猜的数字比生成的随机数大，提示你猜的数据大了
如果猜的数字比生成的随机数小，提示你猜的数据小了
如果猜的数字与生成的随机数相等，提示恭喜你猜中了*/
import java.util.Random;
import java.util.Scanner;

public class RandomDemo02 {
    public static void main(String[] args) {
        //1. 创建Random类的对象.
        Random r = new Random();
        //2. 生成一个随机数让用户来猜.
        int guessNum = r.nextInt(100) + 1;
        //3. 因为不知道用户多少次能猜对, 所以用while(true)死循环.
        int inputNum = 0;
        while (true) {
            //4. 提示用户录入猜的数据, 并接收.
            System.out.println("请录入您猜的数据(1-100): ");
            inputNum = new Scanner(System.in).nextInt();
            //5. 比较用户录入的数据 和 生成的随机数是否一致, 并提示.
            if (inputNum > guessNum)
                System.out.println("您猜的数字大了!");
            else if (inputNum < guessNum)
                System.out.println("您猜的数字小了");
            else {
                System.out.println("恭喜您, 猜对了, 请找班任领取奖品... 就业班晋级卡");
                break;
            }
        }
    }
}
```

##数组
- 数组的定义
```
格式一:
数组存储的数据类型[] 数组名字;
格式二:
数组存储的数据类型 数组名字[];
```
- 数组的动态初始化
```
定义:数组动态初始化就是只给定数组的长度，由系统给出默认初始化值

数组存储的数据类型[] 数组名字 = new 数组存储的数据类型[长度];
```
`数组有定长特性，长度一旦指定，不可更改。`

- 数组的静态初始化
```
定义:在创建数组时，直接确定数组元素

数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3...};

数据类型[] 数组名 = {元素1,元素2,元素3...};
```

- 数组的访问
>索引,元素是从0开始
>数组的长度:`数组名.length`
>数组的最大索引值为:`数组名.length-1`

```
//数组名[索引]
	System.out.println(arr1[2]);
//长度属性，数组名.length 表示数组中元素的个数
	System.out.println(arr2.length);
//修改数组中的元素
	arr[0] = 6;
```

数组访问案例
```
public static void main(String[] args) {
        //求数组中最大值
        Random random = new Random();
        //创建一个12个元素的随机数组，值在1~100之间
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        //求最大值：定义最大值变量max，假设是第一个，遍历取出
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println(max);
    }
```
