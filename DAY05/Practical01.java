class Paper{
	int length;	//int length,width;
	int width;
	String context;
}

class Document{
	String name;
	Paper p;
	
	public static void main(String[] args){
		
		Document d=new Document();
		System.out.println("Created a Document Object d");
		d.name="My first Document";
		System.out.println("Name of the Document d is "+d.name);
	
		d.p=new Paper();
		d.p.context="This is the text in the paper of the document My First document";
		System.out.println("Size of the paper of the document d is "+d.p.width);
		
		Document d2=new Document();
		System.out.println("Created a Document Object d2");
		d2.name="My Second Document";
		System.out.println("Name of the Document d2 is "+d2.name);
		
		
		
	}
}