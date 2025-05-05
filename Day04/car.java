class model{

private String name;

//Getter
public String getName(){
	return name;
}

//Setter
public void setName(String newName){
	this.name=newName;
}
}

public class car{
	public static void main(String[] args)
	{
		model c1=new model();
		c1.setName("Toyota Corolla");
		System.out.println(c1.getName());
	}
}
