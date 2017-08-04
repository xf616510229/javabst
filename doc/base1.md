# Java基础算法题

## 图形打印

在控制台绘制各种形的状三角形，以及菱形，矩形。（空心和实心分别实现）

> DrawDemo.java

## 乘法表

1. 使用循环打印99乘法表
2. 使用单层循环打印99乘法表

> X99Demo.java

## 素数

打印101~200之间的素数

> PrimeDemo.java

## 哥德巴赫猜想

歌德巴赫猜想,任何一个大于六的偶数可以拆分成两个质数的和 打印出所有的可能

> GoldbachDemo.java

## 公倍数

求两个数的最大公约数和最小公倍数

> LcdLcmDemo.java

## 斐波那契数列

1. 表述一：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
2. 表述二：输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值  1  1  2  3  5  8  13  21  34 规律：一个数等于前两个数之和

> FibonacciDemo.java

## 完数

某自然数除它本身以外的所有因子之和等于该数，则该数被称为完数。 例如6=1＋2＋3.编程   找出1000以内的所有完数

> PerfectNumDemo.java

## 阶乘

传入一个n，计算n！（n的阶乘），并计算1！+2！+3！....+n！

> FactorialDemo.java

## 圆周率

计算圆周率：PI＝4－4/3+4/5-4/7.......  打印出第一个大于3.145 小于 3.146的值

> PiDemo.java

## 函数调用

编写一个方法，输入n为偶数时，调用函数求`1/2+1/4+...+1/n`,当输入n为奇数时，调用函数`1/1+1/3+1/5...+1/n`

> TwoHsDemo.java

## 位数

1. 传入一个整数，判断这个整数是几位数。比如：输入250，得到你输入的数是3位数。
2. 逆序输出这个数

> NumBitsDemo.java

## 回文数

一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。打印出所有的回文数，22，151都是回文数

> PaliNumDemo.java

## 数字组数

有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？

> Num1234Demo.java

## 进制转换

输入一个十进制数，将其转换为2进制数进行输出 

1. 返回String类型
2. 返回Long类型

> Dec2BinDemo.java

## 自幂数

- 一位自幂数：独身数
- 两位自幂数：没有
- 三位自幂数：水仙花数
- 四位自幂数：四叶玫瑰数
- 五位自幂数：五角星数
- 六位自幂数：六合数
- 七位自幂数：北斗七星数
- 八位自幂数：八仙数
- 九位自幂数：九九重阳数
- 十位自幂数：十全十美数

打印出所有的 "自幂数 "。比如： "水仙花数 "就是一种自幂数，是一个三位数，他的各位数字立方和等于该数本身。               

> SelfDemo.java

## 最大值

输入三个数，输出最大的数

> MaxDemo.java

## 猜数游戏

猜数游戏:系统随机产生一个随机数,比如30.,请您输入,数字范围在[1-100]:>50,大了,请您输入,数字范围在[1-50]:>25,小了,请您输入,数字范围在[25-50]:>30,恭喜您!猜中了!您总共猜了3次！！

> GuessNumDemo.java

## 熊孩子报数

熊孩子报数，有一列熊孩子，按1、2、3的顺序报数，报到3的熊孩子出列，直到所有熊孩子出列。打印熊孩子出列的顺序。

> CallNumDemo.java

## 矩阵

使用二维数组实现矩阵的常见运算

> MirtrixDemo.java

## 矩阵转置

    白日依山尽，
    黄河入海流。
    欲穷千里目，
    更上一层楼。
```
白 黄 欲 更
日 河 穷 上
依 入 千 一
山 海 里 层
尽 流 目 楼
， 。 ， 。
```

1.把它放入到一个二维数组中...

2.通过程序和算法,把它改变成

> 参考：`java.lang.String char[] toCharArray();`

> MitrixTransDemo.java

## 杨辉三角

 输出杨辉三角：

```
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
```

> YanghuiDemo.java

## 字符统计

输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。 

> CharCountDemo.java

## 字符串截取

实现subString的功能,（但是是按字符截取）

> SubStrDemo.java

## 剪刀石头布

实现简单石头布的小游戏

> JdStBuDemo.java

## 球下落

一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？

> BallDropDemo.java

## 猴子吃桃

猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。 

> MonkyEatDemo.java

## 猴子分桃

海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子平均分为五份，多了一个，这只猴子把多的一 个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中 ，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？

> MonkyDivide.java

## 岁数问题

有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。请问第五个人多大？ 

> AgeDemo.java
