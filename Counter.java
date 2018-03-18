package counter;

import java.util.Scanner;

public class Counter implements Runnable {

@Override
public void run() {
	for (int i = 1; i < 1000; i++) { 

		System.out.println("counter = " + i); 
		try {
			Thread.sleep(1000);
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}

@SuppressWarnings("deprecation")
public static void main(String[] args) {
	Counter c = new Counter(); 
	Thread t = new Thread(c); 

	System.out.println("Enter 0 when you want to Stop: ");

	t.start();
	
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt(); 

	if (i == 0) { 
		t.stop(); 
		System.out.println("Executing Stoped");
	}
	
	sc.close();
	}
}