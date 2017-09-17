package com.prestonb.basic;

import java.awt.Button;
import java.awt.Frame;

import javax.swing.JFrame;

public class First extends JFrame {
	First() {
		Button b = new Button("click me");
		b.setBounds(30, 100, 80, 30);// setting button position
		add(b);// adding button into frame
		setSize(300, 300);// frame size 300 width and 300 height
		setLayout(null);// no layout manager
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);// now frame will be visible, by default not visible
	}

	public static void main(String args[]) {
		First f = new First();
	}
}
