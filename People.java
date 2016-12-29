package Test_2;

public class People {
	String name;
	int age;
	char sex;
	double height;
	People(){
		
	}
	People(String name,int age,char sex, double height){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
	}
	public void speak(){
		System.out.println("你好");
	}
	public void calculation(int x,int y){
		
		System.out.println(x +"+"+ y +"="+(x+y));
	}
	public void changeName(String name){
		this.name = name;
		System.out.println("改名为:"+name);
		
	}
	public void show(){
		System.out.println("姓名:"+name);
		System.out.println("年龄:"+age);
		System.out.println("性别:"+sex);
		System.out.println("身高:"+height);
	}
}
