package ��Ͷ���;

import java.util.Scanner;
public class anLi {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
	
	//����һ�����췽��
	Student(){
		name="�� ��";
		age=0;
		score=0;
	}
	
	Student(String name,int age,int score){
		this.name=name;
		this.age=age;
		this.score=score;
	}
	
	void display() {
		
		System.out.println("\n"+"�� ����"+name);
		System.out.println("�� �䣺"+age);
		System.out.print("�� ����"+score);
	}
}

