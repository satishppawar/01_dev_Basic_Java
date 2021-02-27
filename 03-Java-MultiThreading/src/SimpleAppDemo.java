
class Task {
	public void doTask() {
		for (int i = 0; i <= 1500; i++) {
			System.out.print("T");
		}

	}
}

public class SimpleAppDemo {
	public static void main(String[] args) {
		Task t1 = new Task();
		t1.doTask();
		for (int i = 0; i <= 1500; i++) {
			System.out.print("M");
		}
	}
}
