package 类和对象;

import java.util.Scanner;

class Rectanglel
{
	private double width,height;
	private String color;
	
	Rectangle(){
		width=10.0;
		height=10.0;
		color="blue";
	}
	
	Rectangle(double width,double height,String color){
		this.color=color;
		this.height=height;
		this.width=width;
		System.out.print("有参构造方法调用中……"+"\n");
	}
	
	public void getter() {
		System.out.print("宽："+width+"\t"+"高："+height+"\t"+"颜色："+color+"\n");
	}
	
	public void set_color(String color_1) 
	{
		color=color_1;
	}
	public void set_height(double height) 
	{
		this.height=height;
	}
	public void set_width(double width) 
	{
		this.width=width;
	}
	
	public static void getArea(Rectangle a) {
		System.out.print("面积为:"+a.height*a.width+"\n");
	}
}

class Test {

	public static void main(String[] args) {
	
		Rectangle a= new Rectangle ();
		a.set_color("Maple");
		a.set_width(10.0);
		a.set_height(10.0);
		a.getter();
		Rectangle.getArea(a);
	
	}
}





/*
 *		类是对象的抽象	共有属性的抽象 对象是类的具体
 * */
/*面向对象的基本特征
 * 
 * 
 * 
 * 1.封装
 * 是为了保护
 * 
 * 四种属性
 * 访问权限
 * 公有最高，私有最低，
 * 
 * 接口=方法
 * 
 * 2.继承
 * 提高编程的效率
 * 子类,父类/超类
 * 子类继承父类的<非>私有成员。
 * 即继承，有可以添加&改变属性和方法.
 * 重定义。
 * 老师认为三者之中最为困难的。
 * 
 * 
 * 3.多态
 * 一个接口多个方法实现。
 * 继承是多态的实现方法之一
 * 可以有不同的数据类型或不同的
 * 
 * 重载，只要第一行不同就是，但是名字要相同
 * 名字，类型，参数，？
 * 
 * 类的两大成员，成员变量和成员方法
 * 
 * 构建方法
 * 
 * */

/*[修饰符]class 类名[extends 父类][implements 接口名]{}
 * 
 * [（访问控制修饰符）public，(默认)（访问控制修饰符）friendly ，
 * （<非访问控制>修饰符）abstract ，（<非访问控制>修饰符）final ]
 * 访问控制修饰符实际上指的是作用域↓
 * 
 * abstract
 * 抽象的类
 * 只能出现常量和抽象方法
 * 抽象方法是没有方法体的方法。
 * 
 * final
 * 最终，不能派生子类
 * 
 * 最好类名不要汉字
 * 类名开头最好大写
 * 
 * 
 */

 /* [修饰符] 数据类型 变量名 [=初值];
  * 成员变量↓
 * 访问控制修饰符
 * 共有，私有，保护，默认
 * public ,private?,protected?,default?
 * 
 * 非访问修饰<控制符>
 * static 静态成员是类共享的可以用类来访问，直接也可以，而普通的要用对象来引用。
 * final
 * 
 * 
 * 类的修饰符分为两种
 * 一种是访问控制修饰符，一种是非访问控制修饰符。
 * 
 * 数据类型↓
 * 前面的类型都是，基本类型。
 * 引用类型为
 * 接口类型，对象类型，类类型。
 * 
 */

 /* [修饰符] 返回值类型 方法名 ( [参数列表] ) [throws 异常类型]{}
 * 
 * 成员方法
 * 修饰符
 * 访问 共有私有保护省略。
 * static,abstract,final
 * 默认void.
 * 抽象方法是没有方法体的方法
 * 
 * 
 * 方法重载
 * 同名的方法，但是第一行其他有不同就是重载，即参数的个数顺序，类型，修饰符，抛出类型不同有一处不同就是。
 * 
 * */

/*this 关键字
 * 特指对某个成员的引用。
 * 方法
 * class student{
* 		int age;//成员变量
* 		public void setAge(int age){
* 		this.age(成员变量)=age(局部);
* 		}
* 	
* 		this.setAge;
* 		可以对方法使用
* }
* 
* 构造方法。
* 和类同名
*public Student
*this可以辅助引用构造方法
*方法调用完成要回去！
* 
* public class Student{
* 	String name;
* 构造	public Student{
* 辅助2	this("张三");
* 		}
* 		
* 构造	public Student{
* 	  3	this.name = name;
* 		}
* 
* 成员	public void print(){
* 方法5	System.out.printlin("姓名:"+name);
* 		}
* 	
* 		public static void main(String[] args){
*  	  1	Student stu = new Student();
* 引用4	stu.print();
* 		}
* }
* 
* 构建方法一般用于初始化。
* 构建方法在创建对象时自动调用。
* “没有”返回值，所以没有返回类型。
* 
* 构造方法能被访问控制修饰符（!）修饰，但不能被static，abstract，final等关键字修饰。
* 无参一般用常量来初始化
* 有参就调用.
* 一般用和成员变量同名的参数.
* 
 * */

/*小结
 * 
 * 类
 * 可以被 
 * 访问权限控制符修饰，
 * 还有final，abstract
 * 默认friendly
 * 
 * 成员变量 
 * 可以被
 * 访问权限控制符修饰
 * 以及，共有，私有，保护，默认
 * public ,private?,protected?,default?
 * 默认初始化
 * byte short int long 		0
 * float double 			0.0
 * char						' '(空格)
 * boolean					false
 * 引用类型（类，对象，接口）	null(空值)
 * 
 * 成员方法
 * 可以被
 * 访问权限控制符修饰 
 * 以及,公有私有保护省略。
 * static,abstract,final
 * 默认void. 
 * 
 * */

/*
 * 
 * */