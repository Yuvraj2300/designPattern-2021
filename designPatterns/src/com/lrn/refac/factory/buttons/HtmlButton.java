package com.lrn.refac.factory.buttons;

public class HtmlButton implements Buttons {

	public void render() {
		System.out.println("<button>Test Button</button>");
		onClick();
	}

	public void onClick() {
		System.out.println("Click! Button says - 'Hello World!'");
	}
}
