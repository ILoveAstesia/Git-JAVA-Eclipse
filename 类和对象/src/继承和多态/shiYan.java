package 继承和多态;

public class shiYan {

	public static void main(String[] args) {
		//实例化本科生
		Graduate ZhangSan= new Graduate(20220101,"张三","软件工程三班","李四");
		//实例化管理员
		Administor M= new Administor ("M");
		//管理员实现入库
		M.add(ZhangSan);
	}

}

/*
 * 如何创建一个方法？
 * 先确定一个访问权限，
 * 其次确定返回类型
 * 最后确定参数列表
 * 
 * 学生，抽象类
 * 包含学号姓名班级三个变量
 * 
 * 以及学生注册学生注销两个方法
 * 再设计一个本科生类
 * 和研究生类
 * 分别注册和注销的操作
 * 最后设计一个学生管理类
 * 完成不同的注册和注销
 */

//类方法注释

//定义学生类
abstract class Student
{
	 int Sno;
	 String Sn;
	 String Class;
	 
	 //构建方法
	 Student(){
		 Sno=0;
		 Sn="空";
		 Class="无";
		 System.out.println("没有输入参数");
	 }
	 
	 Student(int Sno,String Sn,String Class){
		 this.Sno=Sno;
		 this.Sn=Sn;
		 this.Class=Class;
	 }
	 
	 
	abstract void in();
	 //注册方法
	abstract void out();
	 //注销方法
}
//定义本科生类
class Graduate extends Student{
	String headmaster;
	
	//定义构建方法
	Graduate(){
		super();
		headmaster="无";
	}
	Graduate(int Sno,String Sn,String Class,String headmaster){
		super(Sno,Sn,Class);
		this.headmaster=headmaster;
	}
	
	//实现
	 void in() {System.out.println("本科生调用注册方法成功");}
	 //注册方法
	 void out() {System.out.println("本科生调用注销方法成功");}
	 //注销方法
}

class Undergraduate extends Student{
	String master;
	Undergraduate(){
		super();
		master="空";
	}
	Undergraduate(int Sno,String Sn,String Class,String master){
		super(Sno,Sn,Class);
		this.master=master;
	}

	void in() {System.out.println("研究生调用注册方法成功");}
	 //注册方法
	 void out() {System.out.println("研究生调用注销方法成功");}
	 //注销方法
}

//定义管理员类
class Administor{
	String name;
	Administor(String name){
		this.name=name;
	}
	//添加入库
	void add(Student s){
		System.out.println(name+":正在入库");
		s.in();
	}
	//移除库存
	void delete(Student s) {
		System.out.println(name+":正在出库");
		s.out();
	}
}