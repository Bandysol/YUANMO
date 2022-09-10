package yuanmo.MOM;
import java.util.InputMismatchException;
import java.util.Scanner;
import method.Method1;
import yuanmo.OperationModuleOfTheProtagonistKong.OperationModuleOfTheProtagonistKong1;
import yuanmo.OperationModuleOfTheProtagonistYing.OperationModuleOfTheProtagonistYing1;

public class MainOperationMoldule2 {
	private short b = 1;
	private Method1 mh = new Method1();
	private Scanner scan = new Scanner(System.in);
	private OperationModuleOfTheProtagonistYing1 omot = new OperationModuleOfTheProtagonistYing1();
	private OperationModuleOfTheProtagonistKong1 omo = new OperationModuleOfTheProtagonistKong1();
	public static boolean leadkong = true;
	public void newgame() throws InterruptedException{
		mh.println("选择你的角色");
		mh.println("1：空");
		mh.println("2：荧");
		w :while (true) {
			mh.print("请输入：");
			try {
				short a = scan.nextShort();
				if (a == 1) {
					break;
				} else if (a == 2) {
					leadkong = false;
					break;
				} else {
					mh.println("Error:" + a + " Is not a correct input!");
					mh.println("");
					b += 1;
					if (b > 3) {
						mh.println("Fatal error: The memory heap of the circular module exceeds the maximum number of bits (32 bits)!");
						Thread.sleep(10000);
						break;
					}
				}
			} catch (InputMismatchException e) {
				mh.println("");
				mh.println("输入错误！");
				mh.println("");
				break w;
			}
		}
		if (!leadkong) {
			omot.OMOTPY1();
		} else {
			omo.OMOTPK1();
		}
	}
}