package a;

//print method should be called separetly in App class as mentioned
/*public class Test{
	public void print(){
		System.out.println("Hi from Test in package a");
	}
	
	public void display(){
		System.out.println("Display: Hi from Test in package a");
	}
	
}*/


//if print metod is not required to print //Test method won't be displayed since not called on App class.
/*public class Test{
	void print(){
		System.out.println("Hi from Test in package a");
	}
	
	public void display(){
		System.out.println("Display: Hi from Test in package a");
	}
	
}
*/

//if print metod is required to print without mentioning public
public class Test{
	void print(){
		System.out.println("Hi from Test in package a");
	}
	
	public void display(){
		print(); // print method is called within display method
		System.out.println("Display: Hi from Test in package a");
	}
	
}