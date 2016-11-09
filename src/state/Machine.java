package state;

public class Machine {
	private State state;
	private State initState;
	private State runState;
	private State finState;

	public Machine(int amount) {
		// this.state=new State(this);
		this.initState = new initState(this);
		this.runState = new runState(this);
		this.finState = new finState(this);
		this.state = this.initState;
	}

	public void setState(State s) {
		this.state = s;
	}

	public void run() {
		this.state.run();
	}

	public void stop() {
		this.state.stop();
	}

	public void init() {
		this.state.init();
	}

	public State getState() {
		if (this.state == null) {
			this.setState(initState);
		}

		return this.state;
	}

	public State getInitState() {
		return initState;
	}

	public State getRunState() {
		return runState;
	}

	public State getFinState() {
		return finState;
	}

}
