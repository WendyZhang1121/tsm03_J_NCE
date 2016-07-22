package tsm03_J_NCE;

import java.io.IOException;

class Foo {
	private Helper helper;
	public Helper getHelper() { 
		return helper;
	}
	
	public void initialize() { 
		helper = new Helper(42);
	} 
	
	public void testCase(){
		Thread test = new Thread(new Runnable() {
			public void run() {
				Foo testF = new Foo();
				testF.getHelper();
				}
			});
			   test.start();
	}
	
	public void main(String[] args) throws IOException { 
		
		testCase(); // starts thread 1 
		testCase(); // starts thread 2
	}
}	
