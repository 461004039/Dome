package Test_2;

public class PeopleTest {
	public static void main(String[] args){
		People people = new People("张三",18,'男',1.8);
		people.show();
		people.calculation(23,45);
		people.changeName("李四");
		people.show();
	}
}
