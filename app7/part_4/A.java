class Address
{
	String houseNo;
	String streetName;
}
class Person
{
	String firstName;
	int age;
	double weight;
	Address permanentAddress;
	void printPersonInfo()
	{
		System.out.print(firstName + ", ");
		System.out.print(age + ", ");
		System.out.print(weight + ", ");
		System.out.print(permanentAddress.houseNo + ", ");
		System.out.println(permanentAddress.streetName);
	}
}
class A 
{
	public static void main(String[] args) 
	{
		Address a1 = new Address();
		a1.houseNo = "123/M";
		a1.streetName = "BTM";
		Person p1 = new Person();
		p1.firstName = "Vijay";
		p1.age = 22;
		p1.weight = 55.89;
		p1.permanentAddress = a1;
		Person p2 = new Person();
		p2.firstName = "Kiran";
		p2.age = 32;
		p2.weight = 65.89;
		p2.permanentAddress = new Address();
		p2.permanentAddress.houseNo = "304/S";
		p2.permanentAddress.streetName = "JP Nagar";
		p1.printPersonInfo();
		p2.printPersonInfo();
	}
}
