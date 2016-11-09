package state;

public class finState extends State {

	public finState(Machine m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() {
		System.out.println("the machine is initializing now");
		this.mach.setState(this.mach.getInitState());
	}

}
