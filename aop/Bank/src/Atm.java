
public interface Atm {
	void displayInfo();
	default void displayFunc() {
		System.out.println("inside the default");
		
	}
//	private void displayprivateFunc() {
//		System.out.println("inside the private");
//	}

}
