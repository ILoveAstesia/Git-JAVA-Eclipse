package ��Ͷ���;
//����ת�ͣ�
//�̳�
//��д
//super
import java.util.Scanner;
//Scanner input_n=new Scanner(System.in);	
//String name=input_n.next();
//input_n.close ();
public class Characteristic {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		�������
		Employee man1 = new Employee();//����ת�� ��Employee��man�ඨ��
		
	}
	void display() {;}
}
/*  
 * ������ ����
 * �ϼ���ָ��~���������ö���ķ���
 * ������λ
 * �ͳ���֮��Ĺ�ϵ ���
 * �ֹ�
 * 
 * 
 * �������
 * ��̬
 * ��װ
 * ����
 * 
 * �����������ö�������
 *   
 *   
 *   static ������д����Ȼfinal��privateҲ��
 *   �������׳�����ֻ�׳���С�ġ�
 *   ������д�и���
 *   ��Ա��д������
 *   
 */


/*
 * �̳�
 * extends �ؼ��֣�
 * ��д
 * super �ؼ���
 * ��������ֱ�Ӹ������
 * 1.���ù�������
 * Ҫ��������Ĺ��������ĵ�һ�У�����
 * super����;
 * super(name,....);
 * 2.���ó�Ա
 * ���������ͱ���
 * ��д��
 * super.����
 * super.�������֣�
 * 
 * 
 * ��̬����ʱ�Ķ�̬
 * ������ʱ�Ķ�̬
 * 
 * �����Ǳ���ʱ��
 * ����ʱ���Ǽ̳С���д������ת�͡�
 * 
 * ������������������ʼ��
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

//����ת�ͣ�������ߣ�������ֻ���ұߣ�ʵ�ʣ���
//Farther a = Son();
//a.method();
//a��Ȼ��father�൫���õ���son���캯������ʱ��a���þ���son�ĳ�Ա��
//���Fû�ж���method
//S����
//���Bû�ж���method
//S�̳�
/*
 * ����ķ���ֻ�ܴ��ڳ���������
 * �����಻��ʵ����
 */
/*
 * ���� �����ʱ��
 * ��д���̳У������ӡ�
 */

/*
 * ��δ���һ��������
 * ��ȷ��һ������Ȩ�ޣ�
 * ���ȷ����������
 * ���ȷ�������б�
 * 
 * public void add(student s)
 * {
 *  s.login();
 *  }
 */




