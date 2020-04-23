# MarkDown基本语法
一级标题 一个#号 
# 这是一级标题
三级标题
### 这是三级标题
六级标题
######这是六级标题

#无序列表
面向对象的特性有哪些？
- 继承
- 封装
- 抽象
- 多态
#有序列表
如何把大象塞进冰箱?
1. 打开冰箱门
2. 将大象塞进去
3. 关上冰箱门

#链接的引用
[更多markdown语法请点击](https://www.jianshu.com/p/280e2ef4069e)

#图片的语法格式
基本格式为
![java](https://upload-images.jianshu.io/upload_images/22778944-d05db21c19b6c84f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

引用网上图片,比如引用Java之父图片
![image](https://upload-images.jianshu.io/upload_images/22778944-dff00349199111f6.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
#引用段落
> Java是一门面向对象编程语言，不仅吸收了C++语言的各种优点，还摒弃了C++里难以理解的多继承、指针等概念，因此Java语言具有功能强大和简单易用两个特征。Java语言作为静态面向对象编程语言的代表，极好地实现了面向对象理论，允许程序员以优雅的思维方式进行复杂的编程 [1] 。
#代码块的编写
```
编辑代码的区域
```
### 举例
以下代码可以用递归的方式实现斐波那契额数列
```python
# 1， 1， 2， 3， 5， 8， 13, 21
def fibo(k):
    """
    递归实现斐波那契数列
    :param k: k代表位置序号
    :return: k 个值 是多少
    """
    assert k > 0, "k的值必须大于0"
    if k in [1, 2]:
        return 1
  
    return fibo(k-1) + fibo(k-2)
```
#斜体格式:* *
*字体变倾斜*
#粗体格式：** **
**粗体效果**
#强调效果（变红）
有的时候我们在编辑**函数**的时候需要使用`return`关键字


#表格的语法
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


