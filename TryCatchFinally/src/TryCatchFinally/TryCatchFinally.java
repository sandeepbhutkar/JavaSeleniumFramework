package TryCatchFinally;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			int i = 10;
			System.out.println(i/0);//this will create exception, so we should handle this.
		}
		catch(Throwable t) {  //Throwable is class which has many methods as getmessage, get cause.
			System.out.println(t.getMessage());
			System.out.println(t.getCause());
		}
		finally {
			System.out.println("Finally");//Finally will always be executed even if no exception
		}
		

	}

}
