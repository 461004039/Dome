package Test_2;

public class PeopleTest {
	public static void main(String[] args){
		People people = new People("����",18,'��',1.8);
		people.show();
		people.calculation(23,45);
		people.changeName("����");
		people.show();
	}
}
