package �̳кͶ�̬;

public class shiYan {

	public static void main(String[] args) {
		//ʵ����������
		Graduate ZhangSan= new Graduate(20220101,"����","�����������","����");
		//ʵ��������Ա
		Administor M= new Administor ("M");
		//����Աʵ�����
		M.add(ZhangSan);
	}

}

/*
 * ��δ���һ��������
 * ��ȷ��һ������Ȩ�ޣ�
 * ���ȷ����������
 * ���ȷ�������б�
 * 
 * ѧ����������
 * ����ѧ�������༶��������
 * 
 * �Լ�ѧ��ע��ѧ��ע����������
 * �����һ����������
 * ���о�����
 * �ֱ�ע���ע���Ĳ���
 * ������һ��ѧ��������
 * ��ɲ�ͬ��ע���ע��
 */

//�෽��ע��

//����ѧ����
abstract class Student
{
	 int Sno;
	 String Sn;
	 String Class;
	 
	 //��������
	 Student(){
		 Sno=0;
		 Sn="��";
		 Class="��";
		 System.out.println("û���������");
	 }
	 
	 Student(int Sno,String Sn,String Class){
		 this.Sno=Sno;
		 this.Sn=Sn;
		 this.Class=Class;
	 }
	 
	 
	abstract void in();
	 //ע�᷽��
	abstract void out();
	 //ע������
}
//���屾������
class Graduate extends Student{
	String headmaster;
	
	//���幹������
	Graduate(){
		super();
		headmaster="��";
	}
	Graduate(int Sno,String Sn,String Class,String headmaster){
		super(Sno,Sn,Class);
		this.headmaster=headmaster;
	}
	
	//ʵ��
	 void in() {System.out.println("����������ע�᷽���ɹ�");}
	 //ע�᷽��
	 void out() {System.out.println("����������ע�������ɹ�");}
	 //ע������
}

class Undergraduate extends Student{
	String master;
	Undergraduate(){
		super();
		master="��";
	}
	Undergraduate(int Sno,String Sn,String Class,String master){
		super(Sno,Sn,Class);
		this.master=master;
	}

	void in() {System.out.println("�о�������ע�᷽���ɹ�");}
	 //ע�᷽��
	 void out() {System.out.println("�о�������ע�������ɹ�");}
	 //ע������
}

//�������Ա��
class Administor{
	String name;
	Administor(String name){
		this.name=name;
	}
	//������
	void add(Student s){
		System.out.println(name+":�������");
		s.in();
	}
	//�Ƴ����
	void delete(Student s) {
		System.out.println(name+":���ڳ���");
		s.out();
	}
}