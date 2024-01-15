package Abstract;

public abstract class AbstractRecipie {
	
	void execute() {
		getReady();
		doTheDish();
		cleanUp();
	}
	
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanUp();
	//abstarct class implement high level design or algolithm and they leave specific details to the implementation classes,to the classes which are extending the abstract classes

}
