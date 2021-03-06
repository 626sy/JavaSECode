[Java案例](https://www.jianshu.com/p/4814c5930f7d)

##变量要点
- 变量未赋值，不能使用
     大括号包裹起来的代码叫做代码块
      代码块作用：让变量尽可能早的从内存消失，节约资源，提高效率
      高级编程语言的时候，GC垃圾回收机制
 - 变量可以一次声明多个

##代码规范
>标识符： 给类、接口、方法、变量等起名字的规范
>- java中，标识符由字母、数字、下划线、美元符号组成
>- python和C语言中: 标识符由字母、数字、下划线组成

>标识符不能以数字开头,不能喝和Java中的关键字（保留字）重名
1、类 --》`大驼峰`（每个单词首字母都大写，其他全部小写）
2、 变量--》 `小驼峰` （从第二个单词开始，首字母大写，其余都小写）
3、常量 --》 所有字母全都大写，单词之间用下划线
4、包的命名规范，所有的字母都小写，多级包之间使用"."隔开，一般包名都是公司域名的反写
5、方法命名 —--》 小驼峰
规范详情:[阿里巴巴开发规范](https://www.cnblogs.com/han-1034683568/p/7680354.html)


##数据类型转换:
>1. 自动类型转换(显示转换):
    是指小类型自动提升为大类型
    将取值范围小的类型自动提升为取值范围大的类型
>2. 强制类型转换(隐式转换):
    数据类型 变量名 = （强制转换的类型） 要被转换的数值
        
##运算符
- 关系运算符:用来描述两个变量或者常量之间的关系的.

| 符号 |                          说明                           |
| ---- | :-----------------------------------------------------: |
| ==   |  a==b，判断a和b的值是否相等，成立为true，不成立为false  |
| !=   | a!=b，判断a和b的值是否不相等，成立为true，不成立为false |
| >    |     a>b，判断a是否大于b，成立为true，不成立为false      |
| >=   |   a>=b，判断a是否大于等于b，成立为true，不成立为false   |
| <    |     a<b，判断a是否小于b，成立为true，不成立为false      |
| <=   |   a<=b，判断a是否小于等于b，成立为true，不成立为false   |
关系运算符的结果都是boolean类型，要么是true，要么是false.
 

- 逻辑运算符:逻辑运算符是用来判断并且, 或者, 除非等逻辑关系的符号.

| 符号 | 作用     | 说明                                                         |
| ---- | -------- | ------------------------------------------------------------ |
| &    | 逻辑与   | a&b，并且的意思. 有false则整体为false,  都为true, 则整体为true. |
| \|   | 逻辑或   | a\|b，或者的意思, 有true则整体为true, 都为false, 则整体为false. |
| !    | 逻辑非   | !a，取反的意思, 以前为true, 取反后为false, 以前为false, 取反后为true. |
| ^    | 逻辑异或 | a^b，异同的意思, 相同为false, 不同为true.                    |
| &&   | 短路与 | 作用和&相同，但是有短路效果, 前边出现false, 后边不执行. |
| \|\| | 短路或 | 作用和\|相同，但是有短路效果, 前边出现true, 后边不执行. |

实际开发中,用的最多的是&&,||,!

- 三目运算符:
```
(关系表达式) ? 表达式1：表达式2； 
```
>执行流程
>1. 先执行关系表达式, 看其结果是true还是false.
>2. 如果是true, 则执行表达式1
>3. 如果是false, 则执行表达式2
 

##键盘录入
```
//1. 导包,包就是文件夹
import java.util.Scanner;
//2. 创建Scanner类的对象
Scanner sc = new Scanner(System.in);
//3. 通过Scanner的`nextInt()`方法接收用户录入的数据
int a = sc.nextInt();
```

####idea常用快捷键
| 快捷键               | 功能                                   |
| -------------------- | -------------------------------------- |
| `Alt+Enter`          | 导入包，自动修正代码                   |
| `Ctrl+Y`             | 删除光标所在行                         |
| `Ctrl+D`             | 复制光标所在行的内容，插入光标位置下面 |
| `Ctrl+Alt+L`         | 格式化代码                             |
| `Ctrl+/`             | 单行注释                               |
| `Ctrl+Shift+/`       | 选中代码注释，多行注释，再按取消注释   |
| `Alt+Shift+上下箭头` | 移动当前代码行  


##流程控制
###- 选择结构
#####一.if语句:一般用于范围的判断
**1. 单分支**:if(){}
执行流程:
>- 先执行关系表达式, 看其结果是true还是false.
>- 如果是true, 则执行大括号中的语句体.
>- 如果是false, 则大括号中的语句体不执行.

**2. 双分支**:双分支结构指的是if. else语句, 一般用来判断两种情况
```
if(关系表达式) { //if的意思: 如果
    //语句体1;
} else {       //否则...
    //语句体2;
}
```
执行流程:
>- 先执行关系表达式, 看其结果是true还是false.
>- 如果是true, 则执行语句体1.
>- 如果是false, 则执行语句体2.

**3. 多分支**:多分支结构指的是if. else if语句, 一般用来判断多种情况
```
if(关系表达式1) {
    //语句体1;
} else if(关系表达式2){
    //语句体2;
} else if(关系表达式3){  //这里可以根据需求, 有多个else if语句
    //语句体3;
} else {
    //语句体n;
}
```
执行流程:
>- 先执行关系表达式1, 看其结果是true还是false.
>- 如果是true, 则执行语句体1, 整个if语句结束.
>- 如果是false, 则判断关系表达式2, 看其结果是true还是false.
>- 如果是true, 则执行语句体2, 整个if语句结束.
>- 如果是false, 则判断关系表达式3, ...以此类推.
>- 如果所有的关系表达式都不成立, 则执行else语句的语句体n, 整个if语句结束.






#####二.switch语句:一般是用于做固定值判断
![Switch语句格式](https://upload-images.jianshu.io/upload_images/22778944-9e2835f3ea8eaa04.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

控制流程
>- 先计算表达式的值, 然后按照从上往下的顺序依次和每一个case对应的值相匹配.
>- 如果能匹配成功, 则执行该case对应的语句体, 然后执行break, 至此, 整个switch语句结束.
>- 如果和所有的case值都不匹配, 则执行default对应的语句体, 然后执行break, 至此, 整个switch语句结束.


**case穿透**
>在switch语句中，如果case的后面不写break，将出现case穿透现象，也就是不会在判断下一个case的值，直接向后运行，直到遇到break，或者整体switch结束。





###- 循环结构
>循环，即事物周而复始的变化。循环结构指的是，使一部分代码按照次数或一定的条件反复执行的一种代码结构. 有些时候, 我们想代码是在满足某些条件的情况下, 重复(循环)执行的, 就需要用到循环结构了

组成
- 初始化条件:假设用int类型的变量x记录循环次数,x从1开始数, 数到100刚好100次, 1在这里充当的角色就是: 初始化条件.

- 判断条件:变量x从1开始数, 数到100结束. 即: x <= 100, 这就是判断条件, 用来决定循环是否继续执行的

- 控制条件:用来控制变量x变化的. 每循环一次, 变量x的值+1. 即: x++就是控制条件.
- 循环体:指的是需要重复执行的代码, 例如: System.out.println("Hello World!");

####for循环:一般适用于循环次数固定的情况.
```
for(初始化条件1; 判断条件2; 控制条件3) {
    //循环体4;
}
```
![for循环图解](https://upload-images.jianshu.io/upload_images/22778944-f0411938ebb5727d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

####while循环:一般适用于循环次数不固定的情况.
```
初始化条件1;
while(判断条件2) {
    //循环体3;
    //控制条件4;
}
```


####do while循环:实际开发中, 基本不用. 适用于先执行一次, 然后判断的情况.
```
初始化条件;
do {
    循环体;
    控制条件;
} while(判断条件);
```
>do.while循环是先执行一次, 后判断.
而其他两个循环都是先执行判断条件, 然后决定是否执行循环体.

>for循环执行结束后, 初始化条件就不能继续使用了.
而其他两个循环执行结束后, 初始化条件还可以继续使用.

####死循环
死循环指的是永不会结束的循环, 也就是循环的判断条件永远为true,
**分类**
- for(;;) { }
- while(true){ }
- do { } while(true






















