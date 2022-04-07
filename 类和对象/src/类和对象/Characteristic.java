package 类和对象;
//向上转型，
//继承
//重写
//super
import java.util.Scanner;
//Scanner input_n=new Scanner(System.in);	
//String name=input_n.next();
//input_n.close ();
public class Characteristic {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		类的特性
		Employee man1 = new Employee();//向上转型 用Employee给man类定义
		
	}
	void display() {;}
}
/*  
 * 主方法 对象
 * 上级下指令~主方法调用对象的方法
 * 工作岗位
 * 和程序之间的关系 类比
 * 分工
 * 
 * 
 * 类的特性
 * 多态
 * 封装
 * 重载
 * 
 * 多个对象可以用对象数组
 *   
 *   
 *   static 不能重写，当然final和private也是
 *   “错误抛出子类只抛出更小的”
 *   方法重写叫覆盖
 *   成员重写叫隐藏
 *   
 */


/*
 * 继承
 * extends 关键字！
 * 重写
 * super 关键字
 * 用于引用直接父类对象；
 * 1.调用构建方法
 * 要放在子类的构建方法的第一行！！！
 * super（）;
 * super(name,....);
 * 2.调用成员
 * 包括方法和变量
 * 重写后，
 * super.方法
 * super.变量名字；
 * 
 * 
 * 多态编译时的多态
 * 和运行时的多态
 * 
 * 重载是编译时的
 * 运行时的是继承、重写、向上转型。
 * 
 * 用子类来给父类对象初始化
 * Employee man = new Employee();
 */
class Man{
	String name,address;
	int age,phone;
	Man(){
		name="Null";
		address="Null";
		age=000;
		phone=00000000000;
	}
	Man(String name,String address,int age,int phone){
		
	}
	void set_name(){;}
	void set_address(){;}
	void set_age(){;}
	void set_phone(){;}
}

class Employee extends Man {
	
	                     
	Employee(){super();}
	
	Employee(String name,String address,int age,int phone){
		super(name,address,age,phone);
	}
	

}

//向上转型，不看左边（声明）只看右边（实际）；
//Farther a = Son();
//a.method();
//a虽然是father类但是用的是son的造函数，这时候a调用就是son的成员。
//如果F没有定义method
//S定义
//如果B没有定义method
//S继承
/*
 * 抽象的方法只能存在抽象类里面
 * 抽象类不能实例化
 */
/*
 * 定义 子类的时候
 * 重写，继承，新增加。
 */

/*
 * 如何创建一个方法？
 * 先确定一个访问权限，
 * 其次确定返回类型
 * 最后确定参数列表
 * 
 * public void add(student s)
 * {
 *  s.login();
 *  }
 */




