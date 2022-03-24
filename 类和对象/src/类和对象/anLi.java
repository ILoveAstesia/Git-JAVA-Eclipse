package 类和对象;

import java.util.Scanner;
public class anLi {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		Scanner input_n=new Scanner(System.in);	
//		String name=input_n.next();
//		Scanner input_a=new Scanner(System.in);	
//		int age=input_a.nextInt();
//		Scanner input_s=new Scanner(System.in);	
//		int score=input_s.nextInt();
		
		Student s1 = new Student();
		s1.display();
//		Student s2 = new Student(name,age,score);
//		s2.display();
		
//		input_n.close ();
//		input_a.close ();
//		input_s.close ();
	}
	
	
		
}

class Student
{
	String name;
	int age;
	int score;
	
	//构建一个构造方法
	Student(){
		name="空 白";
		age=0;
		score=0;
	}
	
	Student(String name,int age,int score){
		this.name=name;
		this.age=age;
		this.score=score;
	}
	
	void display() {
		
		System.out.println("\n"+"姓 名："+name);
		System.out.println("年 龄："+age);
		System.out.print("成 绩："+score);
	}
}

