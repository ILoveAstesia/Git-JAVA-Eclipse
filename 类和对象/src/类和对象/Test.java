package ��Ͷ���;

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
		System.out.print("�вι��췽�������С���"+"\n");
	}
	
	public void getter() {
		System.out.print("��"+width+"\t"+"�ߣ�"+height+"\t"+"��ɫ��"+color+"\n");
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
 *		���Ƕ���ĳ���	�������Եĳ��� ��������ľ���
 * */
/*�������Ļ�������
 * 
 * 
 * 
 * 1.��װ
 * ��Ϊ�˱���
 * 
 * ��������
 * ����Ȩ��
 * ������ߣ�˽����ͣ�
 * 
 * �ӿ�=����
 * 
 * 2.�̳�
 * ��߱�̵�Ч��
 * ����,����/����
 * ����̳и����<��>˽�г�Ա��
 * ���̳У��п������&�ı����Ժͷ���.
 * �ض��塣
 * ��ʦ��Ϊ����֮����Ϊ���ѵġ�
 * 
 * 
 * 3.��̬
 * һ���ӿڶ������ʵ�֡�
 * �̳��Ƕ�̬��ʵ�ַ���֮һ
 * �����в�ͬ���������ͻ�ͬ��
 * 
 * ���أ�ֻҪ��һ�в�ͬ���ǣ���������Ҫ��ͬ
 * ���֣����ͣ���������
 * 
 * ��������Ա����Ա�����ͳ�Ա����
 * 
 * ��������
 * 
 * */

/*[���η�]class ����[extends ����][implements �ӿ���]{}
 * 
 * [�����ʿ������η���public��(Ĭ��)�����ʿ������η���friendly ��
 * ��<�Ƿ��ʿ���>���η���abstract ����<�Ƿ��ʿ���>���η���final ]
 * ���ʿ������η�ʵ����ָ�����������
 * 
 * abstract
 * �������
 * ֻ�ܳ��ֳ����ͳ��󷽷�
 * ���󷽷���û�з�����ķ�����
 * 
 * final
 * ���գ�������������
 * 
 * ���������Ҫ����
 * ������ͷ��ô�д
 * 
 * 
 */

 /* [���η�] �������� ������ [=��ֵ];
  * ��Ա������
 * ���ʿ������η�
 * ���У�˽�У�������Ĭ��
 * public ,private?,protected?,default?
 * 
 * �Ƿ�������<���Ʒ�>
 * static ��̬��Ա���๲��Ŀ������������ʣ�ֱ��Ҳ���ԣ�����ͨ��Ҫ�ö��������á�
 * final
 * 
 * 
 * ������η���Ϊ����
 * һ���Ƿ��ʿ������η���һ���ǷǷ��ʿ������η���
 * 
 * �������͡�
 * ǰ������Ͷ��ǣ��������͡�
 * ��������Ϊ
 * �ӿ����ͣ��������ͣ������͡�
 * 
 */

 /* [���η�] ����ֵ���� ������ ( [�����б�] ) [throws �쳣����]{}
 * 
 * ��Ա����
 * ���η�
 * ���� ����˽�б���ʡ�ԡ�
 * static,abstract,final
 * Ĭ��void.
 * ���󷽷���û�з�����ķ���
 * 
 * 
 * ��������
 * ͬ���ķ��������ǵ�һ�������в�ͬ�������أ��������ĸ���˳�����ͣ����η����׳����Ͳ�ͬ��һ����ͬ���ǡ�
 * 
 * */

/*this �ؼ���
 * ��ָ��ĳ����Ա�����á�
 * ����
 * class student{
* 		int age;//��Ա����
* 		public void setAge(int age){
* 		this.age(��Ա����)=age(�ֲ�);
* 		}
* 	
* 		this.setAge;
* 		���ԶԷ���ʹ��
* }
* 
* ���췽����
* ����ͬ��
*public Student
*this���Ը������ù��췽��
*�����������Ҫ��ȥ��
* 
* public class Student{
* 	String name;
* ����	public Student{
* ����2	this("����");
* 		}
* 		
* ����	public Student{
* 	  3	this.name = name;
* 		}
* 
* ��Ա	public void print(){
* ����5	System.out.printlin("����:"+name);
* 		}
* 	
* 		public static void main(String[] args){
*  	  1	Student stu = new Student();
* ����4	stu.print();
* 		}
* }
* 
* ��������һ�����ڳ�ʼ����
* ���������ڴ�������ʱ�Զ����á�
* ��û�С�����ֵ������û�з������͡�
* 
* ���췽���ܱ����ʿ������η���!�����Σ������ܱ�static��abstract��final�ȹؼ������Ρ�
* �޲�һ���ó�������ʼ��
* �вξ͵���.
* һ���úͳ�Ա����ͬ���Ĳ���.
* 
 * */

/*С��
 * 
 * ��
 * ���Ա� 
 * ����Ȩ�޿��Ʒ����Σ�
 * ����final��abstract
 * Ĭ��friendly
 * 
 * ��Ա���� 
 * ���Ա�
 * ����Ȩ�޿��Ʒ�����
 * �Լ������У�˽�У�������Ĭ��
 * public ,private?,protected?,default?
 * Ĭ�ϳ�ʼ��
 * byte short int long 		0
 * float double 			0.0
 * char						' '(�ո�)
 * boolean					false
 * �������ͣ��࣬���󣬽ӿڣ�	null(��ֵ)
 * 
 * ��Ա����
 * ���Ա�
 * ����Ȩ�޿��Ʒ����� 
 * �Լ�,����˽�б���ʡ�ԡ�
 * static,abstract,final
 * Ĭ��void. 
 * 
 * */

/*
 * 
 * */