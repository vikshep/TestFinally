
public class FinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = returnInteger();
		System.out.print(x);
	}
	
	@SuppressWarnings("finally")
	private static int returnInteger() {
		try {
			return 100;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally Block");
			return 200;
		}
	}

}
