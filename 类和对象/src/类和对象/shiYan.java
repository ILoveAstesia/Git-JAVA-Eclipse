package ��Ͷ���;

import java.util.Scanner;

class Rectangle
{
	double width,height;
	String color;
	
	Rectangle (){
		width=10.0;
		height=10.0;
		color="blue";
	}
	
	Rectangle (double width,double height,String color){
		this.color=color;
		this.height=height;
		this.width=width;
		System.out.print("�вι��췽�������С���"+"\n");
	}
	
	public void getter() {
		System.out.print("��"+width+"\t"+"�ߣ�"+height+"\t"+"��ɫ��"+color+"\n");
	}
	public void setter() {
		System.out.print("�ߣ�");
		Scanner input_h=new Scanner(System.in);		
		double height=input_h.nextInt();
		System.out.print("��");
		Scanner input_w=new Scanner(System.in);
		double width=input_w.nextInt();
		System.out.print("��ɫ��");
		Scanner input_c=new Scanner(System.in);
		String color=input_c.next();
		this.color=color;
		
		this.height=height;
	
		this.width=width;		
		input_w.close ();
		input_c.close ();
		input_h.close ();
	}
	public static void getArea(Rectangle a) {
		System.out.print("���Ϊ:"+a.height*a.width+"\n");
	}
}

public class shiYan {

	public static void main(String[] args) {
		int i=0;
		switch(i)
		{
		
		}


		// TODO �Զ����ɵķ������
		//Rectangle a= new Rectangle ();
		Rectangle b= new Rectangle (5.0,5.0,"Astesia");
		//Rectangle.getArea(a);
		b.setter();
		b.getter();
		Rectangle.getArea(b);
		//go to git hub
		//go to git hub

	}
	

}


