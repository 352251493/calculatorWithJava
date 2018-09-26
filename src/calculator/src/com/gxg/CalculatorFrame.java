package com.gxg;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


public class CalculatorFrame extends JFrame {
	private static JFrame jf;
	private static Container container;
	private static Button buttonBackspace;
	private static Button buttonCE;
	private static Button buttonC;
	private static Button buttonMC;
	private static Button button7;
	private static Button button8;
	private static Button button9;
	private static Button buttonExecept;
	private static Button buttonSqrt;
	private static Button buttonMR;
	private static Button button4;
	private static Button button5;
	private static Button button6;
	private static Button buttonRide;
	private static Button buttonModulo;
	private static Button buttonMS;
	private static Button button1;
	private static Button button2;
	private static Button button3;
	private static Button buttonReduce;
	private static Button buttonReciprocal;
	private static Button buttonM;
	private static Button button0;
	private static Button buttonPositiveAndNegative;
	private static Button buttonPoint;
	private static Button buttonAdd;
	private static Button buttonEqual;
	private static JLabel jLabel;//标签，用于显示输入及输出结果
	public static void createFrame() {
		createButton();
		buttonAction();
		jf = new JFrame("计算器");
		container = jf.getContentPane();
		JPanel p1 = new JPanel(new GridLayout(2, 1));//初始化一个面板，设置为2行1列布局
		JPanel p2 = new JPanel(new GridLayout(1, 4));//初始化一个面板，设置为1行4列布局
		JPanel p3 = new JPanel(new GridLayout(4, 1));//初始化一个面板，设置为4行1列布局
		JPanel p4 = new JPanel(new GridLayout(4, 5));//初始化一个面板，设置为4行5列布局
		p1.setBackground(Color.white);
		p2.add(new Button(""));
		p2.add(buttonBackspace);
		p2.add(buttonCE);
		p2.add(buttonC);
		jLabel = new JLabel("0.");//标签
		//使标签上的文字居右
		jLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		p1.add(jLabel);
		p1.add(p2);
		p3.add(buttonMC);
		p3.add(buttonMR);
		p3.add(buttonMS);
		p3.add(buttonM);
		p4.add(button7);
		p4.add(button8);
		p4.add(button9);
		p4.add(buttonExecept);
		p4.add(buttonSqrt);
		p4.add(button4);
		p4.add(button5);
		p4.add(button6);
		p4.add(buttonRide);
		p4.add(buttonModulo);
		p4.add(button1);
		p4.add(button2);
		p4.add(button3);
		p4.add(buttonReduce);
		p4.add(buttonReciprocal);
		p4.add(button0);
		p4.add(buttonPositiveAndNegative);
		p4.add(buttonPoint);
		p4.add(buttonAdd);
		p4.add(buttonEqual);
		container.add(BorderLayout.NORTH, p1);
		container.add(BorderLayout.WEST, p3);
		container.add(p4);
		container.setBackground(Color.white);
		jf.setSize(500, 250);
		jf.setVisible(true);//可视化一定要放在最后面
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void createButton() {
		button0 = new Button("0");
		button1 = new Button("1");
		button2 = new Button("2");
		button3 = new Button("3");
		button4 = new Button("4");
		button5 = new Button("5");
		button6 = new Button("6");
		button7 = new Button("7");
		button8 = new Button("8");
		button9 = new Button("9");
		buttonBackspace = new Button("Backspace");
		buttonCE = new Button("CE");
		buttonC = new Button("C");
		buttonMC = new Button("MC");
		buttonExecept = new Button("/");
		buttonSqrt = new Button("sqrt");
		buttonMR = new Button("MR");
		buttonRide = new Button("*");
		buttonModulo = new Button("%");
		buttonMS = new Button("MS");
		buttonReduce = new Button("-");
		buttonReciprocal = new Button("1/x");
		buttonM = new Button("M+");
		buttonPositiveAndNegative = new Button("+/-");
		buttonPoint = new Button(".");
		buttonAdd = new Button("+");
		buttonEqual = new Button("=");
	}
	
	public static void buttonAction() {
		button0.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("0");
				jLabel.setText(num);
			}
		});
		
		button1.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("1");
				jLabel.setText(num);
			}
		});
		
		button2.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("2");
				jLabel.setText(num);
			}
		});
		
		button3.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("3");
				jLabel.setText(num);
			}
		});
		
		button4.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("4");
				jLabel.setText(num);
			}
		});
		
		button5.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("5");
				jLabel.setText(num);
			}
		});
		
		button6.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("6");
				jLabel.setText(num);
			}
		});
		
		button7.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("7");
				jLabel.setText(num);
			}
		});
		
		button8.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("8");
				jLabel.setText(num);
			}
		});
		
		button9.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("9");
				jLabel.setText(num);
			}
		});
		
		buttonPoint.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing(".");
				jLabel.setText(num);
			}
		});
		
		buttonExecept.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("/");
				jLabel.setText(num);
			}
		});
		buttonSqrt.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("sqrt");
				jLabel.setText(num);
			}
		});
		buttonRide.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("*");
				jLabel.setText(num);
			}
		});
		buttonModulo.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("%");
				jLabel.setText(num);
			}
		});
		buttonReduce.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("-");
				jLabel.setText(num);
			}
		});
		buttonAdd.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("+");
				jLabel.setText(num);
			}
		});
		buttonReciprocal.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("1/x");
				jLabel.setText(num);
			}
		});
		buttonEqual.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("=");
				jLabel.setText(num);
			}
		});
		
		buttonC.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String num = Action.eventProcessing("C");
				jLabel.setText(num);
			}
		});
	}
}
