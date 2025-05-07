class Rectangle{
	
	int height;
	int width;
	
	Rectangle(int height, int width){
		this.height=height;
		this.width=width;
		System.out.println("Just Created a rectangle object with Height - " + height + " & Width - " + width);
		print(width, height);
	}
	
	void print(int width, int height){
	//void print(int height, int width){
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}

class Main{
	public static void main(String[] args){
		/* //FOR LOOP
		for(int i=0; i<10; i++){
			System.out.println("Value of i is " + i);
		}*/
		
		Rectangle r1 = new Rectangle(5,10);
		Rectangle r2 = new Rectangle(6,12);
		Rectangle r3 = r1;
		System.out.println("Height="+r1.height+" Width="+r1.width);
		System.out.println("Height="+r2.height+" Width="+r2.width);
		System.out.println("Height="+r3.height+" Width="+r3.width);
		
		//r1.print(3,4);
		//r1.print(4,3);
		
	}
}

