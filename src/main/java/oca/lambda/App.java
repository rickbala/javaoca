package oca.lambda;

public class App {

	public static void main(String[] args) {

		Human tom = new Human();
//		walker(tom);

		Robot wale = new Robot();
//		walker(wale);

//		walker( () -> {
//			System.out.println("Custom object walking...");
//			System.out.println("another line of code");
//			});

		Walkable aBlockOfCode =  () -> {
			System.out.println("Custom object walking...");
			System.out.println("another line of code");
		};

		walker(aBlockOfCode);
	}

	public static void walker(Walkable walkableEntity){
		walkableEntity.walk();
	}

}
