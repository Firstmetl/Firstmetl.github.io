package wanke;
//第3天晚课
public class Day03Evensong {
    public static void main(String[] args) {
        /*
          闰年的判断公式:
          1)能被4整除，并且，不能被100整除
            或者
          2)能被400整除
         */
        int year = 2000; //年份 //带数(2022,2020,2000)
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"是平年");
        }



















        /*
        int a=8,b=55;
        int max = a>b?a:b;
        System.out.println("max="+max);
        */
        /*
        int a=8,b=55;
        int max;
        if(a>b){
            max = a;
        }else{
            max = b;
        }
        System.out.println("max="+max);
        */











        /*
          1.年龄age在18到50之间(不包括18和50)
            ---age>18 && age<50
          2.年龄age在18到50之间(包括18和50)
            ---age>=18 && age<=50
          3.成绩score合法:在0到100之间(包括0和100)
            ---score>=0 && score<=100
          4.成绩score不合法:不在0到100之间
            ---score<0 || score>100
         */
        /*
        int score = 560;
        if(score<0 || score>100){
            System.out.println("成绩不合法");
        }else{
            System.out.println("成绩合法");
        }
         */

    }
}







/*
内容总结:
1.运算符：
  1)算术:+,-,*,/,%,++,--
  2)关系:>,<,>=,<=,==,!=  boolean
  3)逻辑:&&(并且),||(或者),!(取反)  boolean
  4)赋值:=,+=,-=,*=,/=,%=
  5)字符串连接:+
  6)条件/三目: boolean?数1:数2
2.分支结构：基于条件执行的代码
  1)if结构:1条路
  2)if...else结构:2条路
 */

































