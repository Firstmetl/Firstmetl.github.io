package wanke;

public class ooDay06Evensong {
}

/*
1.static final常量: 应用率高
  1)必须声明同时初始化
  2)通过类名点来访问，不能被改变
  3)建议:常量名所有字母都大写，多个单词用_分隔
  4)编译器在编译时会将常量直接替换为具体的值，效率高
  5)何时用:数据永远不变，并且经常使用
2.抽象方法:
  1)由abstract修饰
  2)只有方法的定义，没有具体的实现(连大括号都没有)
3.抽象类:
  1)由abstract修饰
  2)包含抽象方法的类必须是抽象类
  3)抽象类不能被实例化(实例化就是new对象)
  4)抽象类是需要被继承的，派生类:
    4.1)重写所有抽象方法--------变不完整为完整
    4.2)也声明为抽象类----------一般不这么用
  5)抽象类的意义:
    5.1)封装共有的属性和行为------------代码复用
    5.2)为所有派生类提供统一的类型------向上造型
    5.3)可以包含抽象方法，为派生类提供统一的入口(能点出来)，
        同时强制派生类必须重写，相当于制定了一个标准


潜艇游戏第六天:
1.设计窗口的宽和高为常量，适当地方做修改
2.画对象:
  1)想画对象需要去获取对象的图片，每个对象都能获取图片，
    意味着获取图片行为为共有的行为，所以设计在SeaObject超类中，
    每个对象获取图片的行为都是不一样的，所以设计为抽象方法
    ----在SeaObject中设计抽象方法getImage()获取对象的图片
  2)重写getImage()获取对象的图片
    ----返回对应对象的图片即可
  3)画对象时需要去判断对象的状态，因为只有活着的时候才会画对象，
    每个对象都有状态，意味着状态为共有的属性，所以设计在SeaObject超类中，
    状态一般都设计为常量，同时设计state变量表示当前状态
    ----在SeaObject中设计LIVE、DEAD状态常量，state变量表示当前状态
    状态有了，还需要判断状态，每个对象都能状态判断，
    意味着判断状态行为为共有行为，所以设计在SeaObject超类中，
    每个对象判断状态的行为都是一样的，所以设计为普通方法
    ----在SeaObject中设计isLive()、isDead()判断状态
  4)对象的图片、x坐标、y坐标有了，就可以开画了，每个对象都能画图片，
    意味着画图片行为为共有的行为，所以设计在SeaObject超类中，
    每个对象画图片的行为都是一样的，所以设计为普通方法
    ---在SeaObject中设计paintImage()画图片-----------不要求掌握
  5)画图片行为做好之后，在World中调用即可:
    ---准备对象数据
    ---重写paint()画方法：画海洋图、画对象
*/




/*
集中答疑:
1.运行后，只是不显示潜艇？
  -----检查SeaObject类中的两个参数构造方法中，给x赋值的负号去掉了吗？
2.运行后，能显示海洋图、战舰，但是潜艇、水雷、深水炸弹都不显示?
  -----检查World类的submarines数组、mines数组、bombs数组中是否填充对象了
3.运行后，海洋图、还包括所有对象都不显示？
  -----检查你paint()方法的名称是否写对了
4.运行后，显示两个侦察潜艇，一个鱼雷潜艇，但是没有水雷潜艇
  -----检查你水雷潜艇类的getImage()方法，看看是不是图片返回错误了
5.运行后，报ArrayIndexOutOfBoundsException数组下标越界异常
  -----遍历数组时，是不是写成 i<=???.length，必须是i<???.length才对
  -----遍历哪个数组，就一定要在哪个数组中获取数据
       for(int i=0;i<submarines.length;i++){ //假设3个潜艇，1个炸弹
         bombs[i].paintImage(g); //正确应该是submarines[i]
       }
6.重写与重载:  1)重写了 2)重载了 3)什么也没发生
  class Aoo{
    void show(){}
  }
  class Boo{ //既没有重写，也没有重载
    void show(){}
  }
  class Boo extends Aoo{ //发生重写了
    void show(){}
  }
  class Boo{ //既没有重写，也没有重载
    void show(int a){}
  }
  class Boo extends Aoo{ //发生重载了
    void show(int a){}
  }
7.继承的是超类中的成员变量和普通方法，而不包括构造方法
  超类的构造方法是被派生类通过super来调用的
  class Aoo{
    int a;
    Aoo(){ //-------是被派生类通过super来调用的
    }
    void show(){
    }
  }
  class Boo extends Aoo{
    继承的是Aoo类中的成员变量a和普通方法show()，而不包括构造方法
    Aoo中的构造方法，是派生类通过super()调用的
  }
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
3.方法重载与重写的区别:
  1)重载(overload/overloading):
    1.1)发生在同一类中，方法名相同，参数列表不同
    1.2)是完全不同的方法，只是赶上方法名正好相同----选答
  2)重写(override/overriding):
    2.1)发生在父子类中，方法名相同，参数列表相同
    2.2)用于在子类中修改父类中所定义的方法---------选答
4.实例变量与静态变量的区别:
  ---实例变量和静态变量都属于成员变量
     1)实例变量:是属于对象的，在创建对象时存储在内存堆中，创建多少个对象，则实例变量
              就会在内存中存在多少份，需要通过引用来访问
     2)静态变量:是属于类的，在类被加载时存储在方法区中，无论创建了多少个对象，静态变量
              在内存中都只有一份，常常通过类名来访问
*/


















