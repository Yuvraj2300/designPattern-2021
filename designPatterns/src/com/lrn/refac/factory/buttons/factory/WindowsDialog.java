package com.lrn.refac.factory.buttons.factory;

import com.lrn.refac.factory.buttons.Buttons;
import com.lrn.refac.factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

	@Override
	public Buttons createButton() {
		return new WindowsButton();
	}

}
