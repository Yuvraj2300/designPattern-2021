package com.lrn.refac.factory.buttons.factory;

import com.lrn.refac.factory.buttons.Buttons;
import com.lrn.refac.factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
	@Override
	public Buttons createButton() {
		return new HtmlButton();
	}
}
