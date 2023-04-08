
class Fruits{
	public void color(){
		System.out.println("Parent class method is invoked");
	}
}

class Mango extends Fruits{
	public void color(){
		System.out.println("Mango color is: Yellow");
	}
}

class Apple extends Fruits{
	public void color(){
		System.out.println("Apple color is: Red");
	}
}

class program4{
	public static void main(String args[]){
	Fruits fruit = new Mango();
	fruit.color();
	fruit = new Apple();
	fruit.color();
	}
}