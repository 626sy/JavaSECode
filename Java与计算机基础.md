[Markdown语法介绍](https://www.jianshu.com/p/2041ef1bf6ea)
[Java基础二](https://www.jianshu.com/p/7ad8414da732)
[Java基础三](https://www.jianshu.com/p/f270c5c5eb64)


#计算机组成
#####硬件：看得见，摸得着的东西
1. 中央处理器（CPU）:由运算器和控制器组成。
2. 存储器：
 - 内存：内存条（代数、睿频）
 - 外存：硬盘（SSD、HSD、HDD），U盘
3. 输入设备：键盘、鼠标
4. 输出设备：显示器
#####软件：能在计算机上
1. 系统软件：Windows、Mac、Linux系统
2. 应用软件：程序员编程代码开发的软件

#计算机语言：人与计算机之间交互的方式
#####分类：
1. 机器语言
2. 汇编语言
3. 高级语言

##Java语言
1. 概述：Sun公司在1995年推出的高级编程语言，Java之父为詹姆斯·高斯林（James Gosling），Sun公司在2009年被Oracle公司收购。
2. 平台版本
- J2SE：标准版
- J2ME：小型版
- J2EE：企业版
3. 特点
- 开源
- 跨平台
- 多态
- 多线程
- 面向对象
  
4. JDK和JRE
- JDK：Java开发工具包(Java Development Kit), 包含开发工具 和 JRE.常用开发工具包括javac、java.
- JRE:Java运行时环境（Java Runtime Environment），包含运行Java程序时所需的核心类库和JVM。核心类库包括java.lang,java.util,java.io
- JVM：Java虚拟机（Java virtual Machine），用来保证Java程序跨平台性的，但是JVM本身并不能跨平台。
![图解](https://upload-images.jianshu.io/upload_images/22778944-31684ba9891a73e9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
5. Java环境搭建
(1) JDK下载：[Oracle](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
(2) JDK的安装
      - 傻瓜式安装
      - 自定义安装（不要直接安装在盘符目录下，安装路径最后不要有中文，空格等特殊符号）
      - 文件目录解释：
bin：存放的是编译器和工具
db：存数数据
include：编译本地方法
jre：Java运行时文件
lib：存放类库文件
src.zip：存放源代码的


##常用DOS命令
| 操作                    | 说明                              |
| ----------------------- | --------------------------------- |
| 盘符名称:               | 盘符切换。E:回车，表示切换到E盘。 |
| dir                     | 查看当前路径下的内容。            |
| cd 目录                 | 进入单级目录。cd eric         |
| cd 目录1\目录2...       | 进入多级目录。cd eric\JavaSE   |
| cd ..                   | 回退到上一级目录。                |
| cd \                    | 回退到盘符目录。                  |
| cls                     | 清屏。                            |
| exit                    | 退出命令提示符窗口。              |
| color /help             | 设置控制台颜色, 例如:  color 3f   |
| ipconfig /all           | 查看本机IP地址.                   |
| ping ip地址或者网址  -t | 测试网络连接是否通畅.             |
| shutdown -s -f -t  时间 | 设置电脑定时关机(时间单位: 秒)    |
| shutdown -a             | 取消电脑的自动关机计划            |
| java -version           | 查看你安装的JDK版本的.            |

##Java基本操作
1. **注释**：
```
//单行注释
```
```
/*
  多行注释
  多行注释
*/
```
```
/**
    文档注释
    文档注释
/
```
2. **关键字**：纯英文组成，全部是小写的
- public：公共的权限，目前先了解即可。
- class：表示在创建一个类
- static：表示静态的意思
- void：表示方法的返回值类型
3. 定义Java源代码文件的格式
```
//类名可以自定义.
public class 类名 {
    public static void main(String[] args) {
        System.out.println(这里的内容可以随便写);
    }
}
```
4. 保留字：goto,const
5. **常量**：
- 自定义常量
- 字面值常量：整数常量、小数常量、字符常量、字符串常量、布尔常量、空常量。

6. **变量**：在程序执行的过程中，其值可以在某个范围内发生改变的量叫做`变量`
- Java中要求一个变量每次只能保存一个数据，而且必须要明确保存数据的数据类型。
![变量](https://upload-images.jianshu.io/upload_images/22778944-e658a83a63ad638a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
- 变量入门
```
//1. 定义一个Java类, 类名叫: VariableDemo01
public class VariableDemo01 {
    //2. 定义main方法, 作为程序的主入口, 所有代码都是从这里开始执行的.
    public static void main(String[] args) {
        //3. 定义一个int类型的变量, 变量名叫a, 初始化值为: 121
        int a = 121;
        //4. 通过输出语句, 将变量a的值打印到控制台上. 
        System.out.println(a);
    }
}

```

##Java数据类型
######Java是一种`强类型语言`，针对每一个数据都给出了明确的数据类型
>区分一门语言到底是强类型语言还是弱类型语言的依据是: 看这门语言对数据的数据类型划分是否精细.
如果精细, 则是强类型语言, 如果不精细, 则是弱类型语言.
######数据类型的分类
1. **基本数据类型**：byte、short、char、int、long、float、double、Boolean
2. **引用数据类型**：`String，数组，类，接口`

![数据类型分类图解](https://upload-images.jianshu.io/upload_images/22778944-29c7dd7d28683838.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


![数据类型](https://upload-images.jianshu.io/upload_images/22778944-1a2f1e275bcbee8a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

>- byte类型的取值范围是: -128 ~ 127,char类型的取值范围是: 0 ~ 65535
>- 默认的整形是: int类型, 默认的浮点型(即: 小数类型)是: double类型.
>- 定义long类型的数据时, 数据后边要加字母L(大小写均可), 建议加L
>- 定义float类型的数据时, 数据后边要加字母F(大小写均可), 建议加F



##变量的赋值与打印
- 先声明后赋值
>数据类型 变量名；
  变量名 = 初始化值；

```
package com.neusoft;
import java.util.SortedMap;
public class VaribleDemo01 {
    public static void main(String[] args){
        //byte类型
        byte b;
        b = 20;
        System.out.println(b);
        //short类型
        short s;
        s = 30;
        System.out.println(s);
        //int类型
        int a;
        a = 100;
        System.out.println(a);
        //long类型
        long lon;
        lon = 100L;
        System.out.println(lon);
        //float类型
        float f;
        f = 10.5F;
        System.out.println(f);
        //double类型
        double d;
        d = 5.21;
        System.out.println(d);
        //char类型
        char c;
        c = 'B';
        System.out.println(c);
        //boolean类型
        boolean bb;
        bb = true;
        System.out.println(bb);
    }
}

```
- 声明变量并赋值
>数据类型  变量名 = 初始化值；
```
package com.neusoft;
public class VaribleDemo02 {
    public static void main(String[] args) {
        //byte类型
        byte b = 20;
        System.out.println(b);
        //short类型
        short s = 30;
        System.out.println(s);
        //int类型
        int a = 100;
        System.out.println(a);
        //long类型
        long lon = 100L;
        System.out.println(lon);
        //float类型
        float f = 10.5F;
        System.out.println(f);
        //double类型
        double d = 5.20;
        System.out.println(d);
        //char类型
        char c = 'A';
        System.out.println(c);
        //boolean类型
        boolean bb = false;
        System.out.println(bb);
    }
}

```










  
