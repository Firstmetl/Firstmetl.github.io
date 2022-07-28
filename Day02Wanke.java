package wanke;
public class Day02Wanke {
    public static void main(String[] args) {
        double balance = 5000.0; //帐户余额
        balance = balance+1000; //存款1000
        System.out.println(balance); //6000.0
        balance = balance-2000; //取款2000
        System.out.println(balance); //4000.0

        double price = 600.0; //消费金额
        price = price*0.8; //打8折
        System.out.println(price); //480.0
        price = price-100; //减100
        System.out.println(price); //380.0

        /*
        int a = 5/2;
        System.out.println(a); //2
        double c = 5.0/2;
        System.out.println(c); //2.5
        double b = 5/2;
        System.out.println(b); //2.0
        //不同类型参与运算时，系统自动往大类型上转
        //int d = 5.0/2; //编译错误
        */
    }
}









/*
晚课的安排:
1)今日内容的总结
2)常见面试题
3)补充练习
 */


/*
1.变量：存数的
    int a;  int b,c,d;
    int a = 5;  int a; a = 5;
    int b = a+10; System.out.println(b);
2.八种基本数据类型：byte,short,int,long,float,double,boolean,char
  1)int:整型，4个字节，5，25，250......
  2)long:长整型，8个字节，5L,1000000000000L......
  3)double:浮点型，8个字节，3.14，5.0，25.678......
  4)boolean:布尔型，1个字节，true,false
  5)char:字符型，2个字节，'你'，'y'，'4'，')'，'\\'......
3.类型间的转换：
  1)两种方式：
    1.1)自动/隐式类型转换：小类型到大类型
    1.2)强制类型转换：大类型到小类型  (要转换成为的数据类型)变量
        ---强转有可能溢出或丢失精度
  2)两点规则：
      short s1 = 5;
      short s2 = 6;
      short s3 = (short)(s1+s2);
 */

/*
常见面试题:
1.java的8种基本数据类型是什么?(简述java的8种基本数据类型)
  答:八种基本数据类型包括：byte,short,int,long,float,double,boolean,char
     1)byte:字节型，用于存储整数，占用1个字节，范围-128到127
     2)short:短整型，用于存储整数，占用2个字节，范围-32768到32767
     3)int:整型，用于存储整数，占用4个字节，范围-2^31到2^31-1
     4)long:长整型，用于存储整数，占用8个字节，范围-2^63到2^63-1
     5)float:单精度浮点型，用于存储小数，占用4个字节，不能表示精确的值
     6)double:双精度浮点型，用于存储小数，占用8个字节，不能表示精确的值
     7)boolean:布尔型，用于存储true或false，占用1个字节
     8)char:字符型，采用Unicode编码格式，用于存储单个字符，占用2个字节
*/























