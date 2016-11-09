package state;

public abstract class State {
	protected Machine mach;

	public State(Machine m) {
		this.mach = m;
	}

	public void run() {
		System.out.println("state change erro");
	}

	public void stop() {
		System.out.println("state change erro");
	}

	public void init() {
		System.out.println("state change erro");
	}

}
