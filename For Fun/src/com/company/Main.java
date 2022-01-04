package com.company;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	String name =JOptionPane.showInputDialog("Hi,What's your name?");
	JOptionPane.showMessageDialog(null,"I Love u " + name);
    }
}
