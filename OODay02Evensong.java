package wanke;

public class OODay02Evensong {
}

/*
1.构造方法:----------------代码复用(给成员变量赋初值)
   1)作用: 给成员变量赋初值
   2)与类同名，没有返回值类型(连void没有)
   3)在创建(new)对象时被自动调用
   4)若自己不写构造方法，则编译器默认提供一个无参的构造方法，
     若自己写了构造方法，则不再默认提供
   5)构造方法可以重载
2.this:指代当前对象，哪个对象调用方法它指的就是哪个对象
       只能用在方法中，方法中访问成员变量之前默认有个this.
  this的用法:
  1)this.成员变量名-----------访问成员变量
    ----当成员变量与局部变量同名时，若想访问成员变量则this不能省略
3.null:表示空，没有指向任何对象
       若引用的值为null，则该引用不能再进行任何点操作了
       若点操作则发生NullPointerException空指针异常


潜艇游戏第二天：
1.给6个类添加构造方法，并测试
在昨天晚上项目的基础之上，将今天的代码最少重写两次
*/



/*
1)问:new Battleship()后，width,height的值为什么都是0?
  class Battleship{
    int width;   //成员变量---依然是默认值0
    int height;
    Battleship(){
        int width = 58;  //局部变量---此处是在给局部变量赋值
        int height = 80;
    }
  }
2)class Test{
     public static void main(String[] args){
        Aoo o = new Aoo(); //调用默认的无参构造方法
        System.out.println(o.a); //0
        o.Aoo(); //调用普通方法void Aoo(){...}
        System.out.println(o.a); //5
     }
  }
  class Aoo{
     int a;
     void Aoo(){ //不是构造方法，它只是一个普通方法
        a = 5;
     }
  }
3)堆栈存什么?
  3.1)存在哪?--堆中存new出来的对象(包括成员变量)、栈中存局部变量(包括方法参数)
      装什么?--引用类型变量中存的是地址，基本类型变量中存的是值
  class Aoo{
    Student zs;  //堆中(装地址)
    int a;       //堆中(装值)
    void test(){
        Student ls; //栈中(装地址)
        int b;      //栈中(装值)
    }
  }
4)成员变量是有默认值的，局部变量是没有默认值的(必须自己赋值)
  class Test{
     public static void main(String[] args){
        //变量在使用之前，必须声明并初始化
        Aoo o = new Aoo(); //-------------a=0
        o.show(25); //--------------------b=25
     }
  }
  class Aoo{
    int a;
    void show(int b){
      int c;
      System.out.println(a); //0
      System.out.println(b); //25
      System.out.println(c); //编译错误，变量c未初始化
    }
  }
*/







