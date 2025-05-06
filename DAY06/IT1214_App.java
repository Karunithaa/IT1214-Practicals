class Student{
	int marks;
	String name;
	
	Student(){
		System.out.println("Creating a Student Object");
		name="Default Name";
	}
	
	Student(String n, int m){
		System.out.println("Creating a Student Object with name "+n+ " and marks "+m);
	}
}


class App{
	public static void main(String[] args){
		System.out.println("Welcome to Demo Class App");
		
		Student s1 = new Student();
		
		s1.marks=90;
		System.out.println("Student Name is "+ s1.name);
		
		s1.name="Lucy";
		System.out.println("Student Name is "+ s1.name + " and marks is " + s1.marks);
		
		Student s2=new Student("Clair",50);
		System.out.println("Student Name is "+ s2.name);
		
	}
}