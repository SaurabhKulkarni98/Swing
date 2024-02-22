import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Firstwindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Firstwindow frame = new Firstwindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Firstwindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Calculator");
		heading.setForeground(new Color(0, 0, 255));
		heading.setFont(new Font("Tahoma", Font.BOLD, 13));
		heading.setBackground(new Color(0, 0, 255));
		heading.setBounds(181, 21, 106, 20);
		contentPane.add(heading);
		
		JLabel labela = new JLabel("A");
		labela.setForeground(new Color(255, 255, 0));
		labela.setBackground(new Color(255, 255, 0));
		labela.setFont(new Font("Tahoma", Font.PLAIN, 11));
		labela.setBounds(111, 55, 49, 14);
		contentPane.add(labela);
		
		tfa = new JTextField();
		tfa.setBounds(191, 52, 96, 20);
		contentPane.add(tfa);
		tfa.setColumns(10);
		
		JLabel labelb = new JLabel("B");
		labelb.setForeground(new Color(255, 255, 0));
		labelb.setFont(new Font("Tahoma", Font.PLAIN, 11));
		labelb.setBackground(new Color(255, 255, 0));
		labelb.setBounds(111, 94, 49, 14);
		contentPane.add(labelb);
		
		tfb = new JTextField();
		tfb.setBackground(new Color(255, 255, 255));
		tfb.setBounds(191, 91, 96, 20);
		contentPane.add(tfb);
		tfb.setColumns(10);
		
		JLabel res = new JLabel("Result");
		res.setFont(new Font("Tahoma", Font.PLAIN, 11));
		res.setForeground(new Color(255, 255, 0));
		res.setBackground(new Color(255, 255, 0));
		res.setBounds(111, 129, 49, 14);
		contentPane.add(res);
		
		tfr = new JTextField();
		tfr.setBounds(191, 129, 96, 20);
		contentPane.add(tfr);
		tfr.setColumns(10);
		
		JButton add = new JButton("ADD");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to add
				String data1=tfa.getText();
				String data2=tfb.getText();
				int a =Integer.valueOf(data1);
				int b =Integer.valueOf(data2);
				
				int res=a+b;
				String result=String.valueOf(res);
				tfr.setText(result);
				
				}
		});
		add.setFont(new Font("Tahoma", Font.PLAIN, 11));
		add.setForeground(new Color(255, 0, 128));
		add.setBackground(new Color(255, 128, 0));
		add.setBounds(31, 179, 55, 23);
		contentPane.add(add);
		
		JButton sub = new JButton("SUB");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to sub
				String data1=tfa.getText();
				String data2=tfb.getText();
				int Var1=Integer.valueOf(data1);
				int Var2=Integer.valueOf(data2);
				
				int res=Var1-Var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		sub.setFont(new Font("Tahoma", Font.PLAIN, 11));
		sub.setForeground(new Color(255, 0, 128));
		sub.setBackground(new Color(255, 128, 0));
		sub.setBounds(107, 179, 53, 23);
		contentPane.add(sub);
		
		JButton mul = new JButton("MUL");
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to multiply
				String data1=tfa.getText();
				String data2=tfb.getText();
				int Var1=Integer.valueOf(data1);
				int Var2=Integer.valueOf(data2);
				
				int res=Var1*Var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		mul.setFont(new Font("Tahoma", Font.PLAIN, 11));
		mul.setForeground(new Color(255, 0, 128));
		mul.setBackground(new Color(255, 128, 0));
		mul.setBounds(181, 179, 53, 23);
		contentPane.add(mul);
		
		JButton div = new JButton("DIV");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to divide
				String data1=tfa.getText();
				String data2=tfb.getText();
				float Var1=Float.valueOf(data1);
				float Var2=Float.valueOf(data2);
				
				float res=Var1/Var2;
				String result=String.valueOf(res);
				tfr.setText(result);
			}
		});
		div.setFont(new Font("Tahoma", Font.PLAIN, 11));
		div.setForeground(new Color(255, 0, 128));
		div.setBackground(new Color(255, 128, 0));
		div.setBounds(254, 179, 51, 23);
		contentPane.add(div);
		
		JButton rem = new JButton("REM");
		rem.setBackground(new Color(255, 128, 0));
		rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic to find reminder
				int Var1=Integer.valueOf(tfa.getText());
				int Var2=Integer.valueOf(tfb.getText());
		int res=Var1%Var2;
		String result=String.valueOf(res);
		tfr.setText(result);
			}
		});
		rem.setFont(new Font("Tahoma", Font.PLAIN, 11));
		rem.setForeground(new Color(255, 0, 128));
		rem.setBounds(325, 179, 55, 23);
		contentPane.add(rem);
	}
}
