package soltion;
class AbstractClassTest extends AbstractClass{

	public AbstractClassTest(String name) {
		super(name);
	}

	@Override
	void add() {
		
	}
	
	public static void main(String[] args) {
		AbstractClassTest ac = new AbstractClassTest("ABC") ;
		ac.print();
	}

	
}