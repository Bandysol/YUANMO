package yuanmo.MOM;
import database.CharacterString;
import method.Method1;
import java.util.Scanner;

public class MainOperationMoldule {
	public boolean newgame;
	public boolean savegame;
	private boolean exitgame;
	private CharacterString cs = new CharacterString();
	private Method1 mh = new Method1();
	private MainOperationMoldule2 mom2 = new MainOperationMoldule2();
	private MainOperationMoldule3 mom3 = new MainOperationMoldule3();
	private static Scanner scan = new Scanner(System.in);
	public void function1() throws InterruptedException {
		newgame = false;
		savegame = false;
		mh.println("YUANMO " + cs.version);
		mh.println("主菜单");
		mh.println("1：开始新游戏");
		mh.println("2：从一个存档中读取");
		mh.println("其他数字：退出游戏");
		while (true) {
			mh.print("输入数据：");
			try {
				short a = scan.nextShort();
				if (a == 1) {
					newgame = true;
				} else if (a == 2) {
					savegame = true;
				} else {
					exitgame = true;
				}
				break;
			} catch (Exception e) {
				mh.println("");
				mh.println("输入错误！");
				mh.println("");
			}
		}
		if (newgame)
			mom2.newgame();
		if (savegame)
			mom3.savegame();
		if (exitgame) {
			mh.println("The program will exit after 3 seconds!");
			Thread.sleep(1000);
			mh.println("The program will exit after 2 seconds!");
			Thread.sleep(1000);
			mh.println("The program will exit after 1 seconds!");
			Thread.sleep(1000);
		}
	}
}