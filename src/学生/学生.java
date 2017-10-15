/*
@author:杨兰
@file:学生.java
@package:学生
@project:设计一个学生类Student，其属性有：姓名(name)、年龄(age)、学历(education),由Student类派生出本科生类Undergraduate
 * 和研究生类Graduate，本科生类增加属性：专业(specialty),研究生类增加属性：研究方向(direction)。每个类都有构造方法和用于输出属性信息的
 * show()方法，在测试类TestExtends中测试输出。
@date time:2017年10月11日下午23:15:18
@location:https://github.com/Gcaption/studant.git
*/
package 学生;
public class 学生 {
	public static void main(String agsp[]){
		System.out.print("************学生信息************");
		System.out.println();
		Undergraduate under=new Undergraduate("王林",19,"本科","软件工程");
		under.show();
		System.out.print("、、、、、、、、、、、、、、、、、、、、、、、");
		System.out.println();
		Graduate grau=new Graduate("张丽",22,"研究生","大数据");
		grau.show();
	}
}
 class Student{        //学生类Student
	 String name;      //姓名 
	 int age;          //年龄
	 String education; //学历
	 Student(String nam, int age, String educ) {    //构造方法
		this.name = nam;
		this.age = age;
		this.education = educ;
	 }
	 public void show() { 
		 System.out.println("姓名："+name+"    "+"年龄："+age+" "+"学历："+education);
	 }
 }
 
 class Undergraduate extends Student{             //本科生类
     String specialty;
	 Undergraduate(String na, int ag, String edu,String spe) {
		super(na, ag, edu);
		this.specialty = spe;
	} 
	 public void show() { 
		 super.show();
		 System.out.println("专业："+specialty);
	 }
 }
 class Graduate extends Student{                //研究生类
        String direction;
	    Graduate(String nam, int age, String educ,String dire) {
		super(nam, age, educ);
		this.direction=dire;
	}
		 public void show() { 
			 super.show();
			 System.out.println("研究方向："+direction);
		 }   	 
 }