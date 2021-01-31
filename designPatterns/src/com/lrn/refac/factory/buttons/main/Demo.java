package com.lrn.refac.factory.buttons.main;

import com.lrn.refac.factory.buttons.factory.Dialog;
import com.lrn.refac.factory.buttons.factory.HtmlDialog;
import com.lrn.refac.factory.buttons.factory.WindowsDialog;

public class Demo {
	private static Dialog dialog;

	public static void main(String[] args) {
		configure();
		runBusinessLogic();
	}

	static void configure() {
		if (System.getProperty("os.name").equals("Windows 10")) {
			dialog = new WindowsDialog();
		} else {
			dialog = new HtmlDialog();
		}
	}

	static void runBusinessLogic() {
		dialog.renderWindow();
	}
}
