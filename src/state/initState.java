package state;

public class initState extends State {

	public initState(Machine m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		System.out.println("the machine is running now");
		this.mach.setState(this.mach.getRunState());
	}

	@Override
	public void stop() {
		System.out.println("the machine is fin now");
		this.mach.setState(this.mach.getFinState());
	}

}
