package soltion;

public abstract class AbstractClass {
	
	private String name;
	
	public AbstractClass(String name) {
		this.name= name;
	}

	abstract void add() ;
	
	protected void print() {
		System.out.println(this.name);
	}

}
