package ��Ͷ���;

import java.util.Scanner;

class Rectangle
{
	private double width,height;
	private String color;
	
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
		System.out.print("���Ϊ:"+a.height*a.width+"\n");
	}
}

public class shiYan {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//Rectangle a= new Rectangle ();
		Rectangle a= new Rectangle ();
//		Rectangle b= new Rectangle (5.0,5.0,"Astesia");
		a.set_color("Maple");
		a.set_width(10.0);
		a.set_height(10.0);
		a.getter();
		Rectangle.getArea(a);
//		b.setter();
//		b.getter();
//		Rectangle.getArea(b);
		//go to git hub
		//go to git hub

	}
}


