@FunctionalInterface
public interface Interface2 {

	void method2();

	default void log(String string) {
		System.out.println("Interface2 logging: " + string);
	}

}
