package stepDefinitions;

public class HooksClass {
	
	private void beforeExecution() {
		System.out.println("Started");

	}
	
	private void afterExecution() {
		System.out.println("Completed");
	}

}
