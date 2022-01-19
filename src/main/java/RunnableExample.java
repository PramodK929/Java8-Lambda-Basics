
public class RunnableExample {

	public static void main(String[] args) {
		// JAVA 7
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread running from traditional way");
			}
		});
		t1.run();
		
		// JAVA 8	
		Thread t2 = new Thread(() -> System.out.println("Thread created with Lambda expression"));
		t2.run();
	}

}
