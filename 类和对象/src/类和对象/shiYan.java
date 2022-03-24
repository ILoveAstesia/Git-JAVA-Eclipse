package 类和对象;

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
		System.out.print("有参构造方法调用中……"+"\n");
	}
	
	public void getter() {
		System.out.print("宽："+width+"\t"+"高："+height+"\t"+"颜色："+color+"\n");
	}
	
	public void setter() {
		System.out.print("高：");
		Scanner input_h=new Scanner(System.in);		
		double height=input_h.nextInt();
		System.out.print("宽：");
		Scanner input_w=new Scanner(System.in);
		double width=input_w.nextInt();
		System.out.print("颜色：");
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
		System.out.print("面积为:"+a.height*a.width+"\n");
	}
}

public class shiYan {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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


