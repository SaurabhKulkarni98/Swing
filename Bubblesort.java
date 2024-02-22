import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bubblesort extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bubblesort frame = new Bubblesort();
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
	public Bubblesort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Sorting = new JLabel("Sorting");
		Sorting.setForeground(new Color(255, 0, 0));
		Sorting.setFont(new Font("Tahoma", Font.BOLD, 13));
		Sorting.setBounds(158, 24, 104, 30);
		contentPane.add(Sorting);
		
		JLabel A = new JLabel("Enters Number for Sorting");
		A.setForeground(new Color(255, 0, 0));
		A.setFont(new Font("Tahoma", Font.BOLD, 11));
		A.setBounds(40, 85, 150, 14);
		contentPane.add(A);
		
		JTextArea tr1 = new JTextArea();
		tr1.setBounds(211, 80, 180, 22);
		contentPane.add(tr1);
		
		JLabel B = new JLabel("Numbers after Sorting");
		B.setFont(new Font("Tahoma", Font.BOLD, 11));
		B.setForeground(new Color(255, 0, 0));
		B.setBounds(38, 124, 152, 14);
		contentPane.add(B);
		
		JTextArea tr2 = new JTextArea();
		tr2.setBounds(211, 119, 184, 22);
		contentPane.add(tr2);
		
		JButton Sort = new JButton("Bubble Sort");
		Sort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//logic for sorting
				String sentence=tr1.getText();
				String arr[]=sentence.split("");
				String help;
				for(int i=0;i<=arr.length-2;i++)
				{
					for(int j=0;j<=arr.length-2-i;j++)
					{
						if(Integer.valueOf(arr[j])>Integer.valueOf(arr[j+1]))
						{
							help=arr[j];
							arr[j]=arr[i+1];
							arr[j+1]=help;
						}
					}
				}
				String result="";
				for(int i=0;i<=arr.length-1;i++)
				{
					result=result+arr[i]+"";
				}
				tr2.setText(result);
			}
		});
		Sort.setFont(new Font("Tahoma", Font.BOLD, 14));
		Sort.setForeground(new Color(255, 255, 0));
		Sort.setBounds(154, 218, 113, 25);
		contentPane.add(Sort);
	}
}
