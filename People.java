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
		System.out.println("���");
	}
	public void calculation(int x,int y){
		
		System.out.println(x +"+"+ y +"="+(x+y));
	}
	public void changeName(String name){
		this.name = name;
		System.out.println("����Ϊ:"+name);
		
	}
	public void show(){
		System.out.println("����:"+name);
		System.out.println("����:"+age);
		System.out.println("�Ա�:"+sex);
		System.out.println("���:"+height);
	}
}
