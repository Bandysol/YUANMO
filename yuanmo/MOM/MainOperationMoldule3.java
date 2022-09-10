package yuanmo.MOM;
import method.Method1;

public class MainOperationMoldule3 {
	private static MainOperationMoldule mom = new MainOperationMoldule();
	private Method1 mh = new Method1();
	public void savegame() throws InterruptedException {
		mh.println("Sorry,this function is still under development.");
		mh.println("You will return to the main menu after 5 seconds.");
		Thread.sleep(1000);
		mh.println("You will return to the main menu after 4 seconds.");
		Thread.sleep(1000);
		mh.println("You will return to the main menu after 3 seconds.");
		Thread.sleep(1000);
		mh.println("You will return to the main menu after 2 seconds.");
		Thread.sleep(1000);
		mh.println("You will return to the main menu after 1 seconds.");
		Thread.sleep(1000);
		mom.function1();
	}
}