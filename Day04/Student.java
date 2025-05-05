class Student{
	String name="Karunithaa";//will be deflut value
	int marks=100;		// for all name and	marks
		
		Student(){
			name="No_Name";
		}
		
		Student(String n){
			name=n;
		}
		
		Student(String n, int m){//constructor overloading
		
			name=n;
			marks=m;
		}
}


class StudentDemo{	
	public static void main(String[] args){
		System.out.println("Hi from class StudentDemo");
		
		System.out.println("Creating an object of class Student");
		Student s1=new Student("Nice_Name",85);	//new student object->s1
		System.out.println("Created an object of class Student");
		
		System.out.println("Name value of the object is "+ s1.name);
		System.out.println("Marks value of the object is "+ s1.marks);
		
		s1.name="Lucy";	//assigned new values
		s1.marks=90;
		
		System.out.println("Name value of the object is "+ s1.name);
		System.out.println("Marks value of the object is "+ s1.marks);
	}
}