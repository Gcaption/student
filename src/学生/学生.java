/*
@author:����
@file:ѧ��.java
@package:ѧ��
@project:���һ��ѧ����Student���������У�����(name)������(age)��ѧ��(education),��Student����������������Undergraduate
 * ���о�����Graduate�����������������ԣ�רҵ(specialty),�о������������ԣ��о�����(direction)��ÿ���඼�й��췽�����������������Ϣ��
 * show()�������ڲ�����TestExtends�в��������
@date time:2017��10��11������23:15:18
@location:https://github.com/Gcaption/studant.git
*/
package ѧ��;
public class ѧ�� {
	public static void main(String agsp[]){
		System.out.print("************ѧ����Ϣ************");
		System.out.println();
		Undergraduate under=new Undergraduate("����",19,"����","�������");
		under.show();
		System.out.print("����������������������������������������������");
		System.out.println();
		Graduate grau=new Graduate("����",22,"�о���","������");
		grau.show();
	}
}
 class Student{        //ѧ����Student
	 String name;      //���� 
	 int age;          //����
	 String education; //ѧ��
	 Student(String nam, int age, String educ) {    //���췽��
		this.name = nam;
		this.age = age;
		this.education = educ;
	 }
	 public void show() { 
		 System.out.println("������"+name+"    "+"���䣺"+age+" "+"ѧ����"+education);
	 }
 }
 
 class Undergraduate extends Student{             //��������
     String specialty;
	 Undergraduate(String na, int ag, String edu,String spe) {
		super(na, ag, edu);
		this.specialty = spe;
	} 
	 public void show() { 
		 super.show();
		 System.out.println("רҵ��"+specialty);
	 }
 }
 class Graduate extends Student{                //�о�����
        String direction;
	    Graduate(String nam, int age, String educ,String dire) {
		super(nam, age, educ);
		this.direction=dire;
	}
		 public void show() { 
			 super.show();
			 System.out.println("�о�����"+direction);
		 }   	 
 }