/* Java - 8
 * 
 * From Java 8 interfaces are enhanced to have implemented methods
 * default & static keywords used to create interfaces w/ method implementation
 * 
 * Interface1 has static method implementation used in this class
 * Java 8 uses default & static methods heavily in Collection API 
 * default methods are added so that our code remains backward compatibility
 * 
 * If any class in the hierarchy has a method w/ same signature
 * then default methods become irrelevant
 * B/c any class implementing an interface already had Object as superclass
 * Thats why for clarity, interfaces not allowed to have Object class default methods
 *  
 */
public class DefaultAndStaticMethodsInterfaces implements Interface1, Interface2{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1(String string) {
		// TODO Auto-generated method stub
		
	}
	
	//This class won't complie w/o having its own log() implementation
	@Override
	public void log(String string) {
		System.out.println("DefaultAndStaticMethodsInterfaces logging: " + string);
		Interface1.print("abc");
	}
	
	

}
