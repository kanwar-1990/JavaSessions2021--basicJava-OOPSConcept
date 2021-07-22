package OOps_Abstract;

public class WhatsAPPTEST {

	public static void main(String[] args) {

		WhatsApp wt = new WhatsApp();
		wt.DBSetup();
		wt.envSetup();
		wt.ServerSetup();
		wt.UILayer();// OverRidden Method---In Parent Class it was red colur and change in WhatsAPP
						// CLas as green
		// Such Changes are possible hence selenium wanted to avoid this so they created
		// webdriver interface
	}

}
