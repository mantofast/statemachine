package state;

public class TestStateMach {
	public static void main(String args[]) {
		Machine mach = new Machine(1);
		mach.init();
		mach.stop();
		mach.run();
		mach.stop();
		mach.init();
		mach.run();
		mach.stop();
	}

}
