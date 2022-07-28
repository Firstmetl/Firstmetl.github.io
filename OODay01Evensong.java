package wanke;
//面向对象第1天晚课
public class OODay01Evensong {
    public static void main(String[] args) {
        /*
        //变量在使用之前必须声明并初始化
        int num = 10;
        int i;
        if(num>0){ //编译器并不认为程序一定会走if里面
            i = 100;
        }
        System.out.println(i); //编译错误，i未初始化
        */

        /*
        int num = 10;
        int i;
        if(num>0){
            i = 100;
        }else{
            i = 200;
        }
        System.out.println(i); //100
        */

        /*
        //for中的循环变量i的作用范围，仅在当前for中
        for(int i=0;i<10;i++){
        }
        System.out.println(i); //发生编译错误，超出i的作用范围了
        */

        /*
        int i;
        for(i=0;i<10;i++){
        }
        System.out.println(i); //10
        */

        /*
        int i = 0;
        while(i<10){
            i++;
        }
        System.out.println(i); //10
        */

        /*
        int result = 0;
        int i = 2;
        switch(i){
            case 1:
                result = result+1;
            case 2:
                result = result+i*2; //result = 4
            case 3:
                result = result+i*3; //result = 10
        }
        System.out.println(result); //10
        */

        /*
        int a=0,b=0;
        do{
            --b; //-1
            a--; //-1
        }while(a>0);
        System.out.println(a); //-1
        System.out.println(b); //-1
         */

    }
}


/*
1.什么是类？什么是对象？
  1)现实生活中是由很多很多对象组成的，基于对象抽出了类
  2)对象:软件中真实存在的单个个体/东西
    类:类型/类别，代表一类个体
  3)类是对象的模子，对象是类的具体的实例
  4)类中包含：
    4.1)对象的属性/特征-------------------成员变量
    4.2)对象的行为/动作-------------------方法
  5)一个类可以创建多个对象
2.如何创建类？如何创建对象？如何访问成员？
3.方法的签名:方法名+参数列表
4.方法的重载(Overload/Overloading):
  1)发生在同一类中，方法名称相同，参数列表不同
  2)编译器在编译时会根据方法的签名自动绑定方法


潜艇游戏第一天：
1.创建了6个类，创建World类并测试

你们的练习任务:
1.将今天的所有项目代码最少重做两次(建项目、建包、建类......)
  ----World类中，测试代码做了3-4个对象就可以了

公众号中问问题需注意:
1.代码不能复制粘贴
2.不要用手机拍照发代码，不要发音频、视频，要用文字描述，一定要代码截图
  截图的时候不要截整个窗口，要求哪个代码有问题你就截哪个代码
3.如果自己的问题已经解决，在公众号中一定要告诉我一声
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
2.switch能作用在哪些类型的变量上?
  ---byte,short,char,int,String,枚举
*/

