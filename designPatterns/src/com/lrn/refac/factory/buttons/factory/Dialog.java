package com.lrn.refac.factory.buttons.factory;

import java.awt.Button;

import com.lrn.refac.factory.buttons.Buttons;

public abstract class Dialog {
	public void renderWindow() {
		// ... other code ...

		Buttons okButton = createButton();
		okButton.render();
	}

	public abstract Buttons createButton();
}
