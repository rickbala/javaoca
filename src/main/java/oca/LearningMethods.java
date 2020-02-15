package oca;

public class LearningMethods {

	public static void main(String[] args) {

//		System.out.println(System.getProperties());
//		System.out.println(System.getProperty("os.name"));
//		System.out.println(System.getProperty("user.name"));
//		System.out.println(System.getProperty("java.vm.specification.version"));
//		System.out.println(System.getProperty("user.home"));

		System.out.println();
		System.out.println("Hello, " + System.getProperty("user.name") + "!");

		System.out.println("You are using Java version: " + System.getProperty("java.vm.specification.version"));

		System.out.println("Current directory is: " + System.getProperty("user.dir"));

		System.out.println("\nWhat else?");

	}

}
