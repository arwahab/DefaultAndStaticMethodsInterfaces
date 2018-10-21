@FunctionalInterface
public interface Interface1 {
	
	void method1(String string);
	
	default void log (String string) {
		System.out.println("Interface1 logging: " + string);
	}
	
	static void print(String string) {
		System.out.println("Printing " + string);
	}

}
