import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class StudentMarks {

	private JFrame frame;
	private JTextField sub1;
	private JTextField sub2;
	private JTextField sub3;
	private JTextField totalMarks;
	private JTextField average;
	private JTextField grade;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarks window = new StudentMarks();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public StudentMarks() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 864, 733);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT MARKS CALCULATION SYSTEM");
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(65, 10, 526, 90);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSubject = new JLabel("SUBJECT 1 ");
		lblSubject.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblSubject.setBackground(new Color(255, 255, 255));
		lblSubject.setBounds(29, 116, 150, 69);
		frame.getContentPane().add(lblSubject);
		
		JLabel lblSubject_2 = new JLabel("SUBJECT 2");
		lblSubject_2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblSubject_2.setBackground(Color.WHITE);
		lblSubject_2.setBounds(29, 212, 150, 69);
		frame.getContentPane().add(lblSubject_2);
		
		JLabel lblSubject_1_1 = new JLabel("SUBJECT 3 ");
		lblSubject_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblSubject_1_1.setBackground(Color.WHITE);
		lblSubject_1_1.setBounds(29, 306, 150, 69);
		frame.getContentPane().add(lblSubject_1_1);
		
		JLabel lblSubject_1_1_1 = new JLabel("TOTAL MARKS");
		lblSubject_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblSubject_1_1_1.setBackground(Color.WHITE);
		lblSubject_1_1_1.setBounds(29, 409, 167, 69);
		frame.getContentPane().add(lblSubject_1_1_1);
		
		JLabel lblSubject_1_1_1_1 = new JLabel("AVERAGE ");
		lblSubject_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblSubject_1_1_1_1.setBackground(Color.WHITE);
		lblSubject_1_1_1_1.setBounds(29, 504, 150, 69);
		frame.getContentPane().add(lblSubject_1_1_1_1);
		
		JLabel lblSubject_1_1_1_1_1 = new JLabel("GRADE");
		lblSubject_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblSubject_1_1_1_1_1.setBackground(Color.WHITE);
		lblSubject_1_1_1_1_1.setBounds(29, 596, 150, 69);
		frame.getContentPane().add(lblSubject_1_1_1_1_1);
		
		sub1 = new JTextField();
		sub1.setBounds(223, 136, 311, 35);
		frame.getContentPane().add(sub1);
		sub1.setColumns(10);
		
		sub2 = new JTextField();
		sub2.setColumns(10);
		sub2.setBounds(222, 228, 310, 35);
		frame.getContentPane().add(sub2);
		
		sub3 = new JTextField();
		sub3.setColumns(10);
		sub3.setBounds(224, 323, 311, 35);
		frame.getContentPane().add(sub3);
		
		totalMarks = new JTextField();
		totalMarks.setColumns(10);
		totalMarks.setBounds(228, 426, 310, 35);
		frame.getContentPane().add(totalMarks);
		
		average = new JTextField();
		average.setColumns(10);
		average.setBounds(226, 521, 310, 35);
		frame.getContentPane().add(average);
		
		grade = new JTextField();
		grade.setColumns(10);
		grade.setBounds(221, 614, 310, 35);
		frame.getContentPane().add(grade);
		
		JButton btnNewButton_1_1 = new JButton("CALCULATE");
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_1.setBackground(new Color(0, 255, 128));
		btnNewButton_1_1.setBounds(617, 179, 189, 50);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("RESET");
		btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_1_1.setBackground(new Color(0, 128, 255));
		btnNewButton_1_1_1.setBounds(617, 315, 189, 50);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("EXIT");
		btnNewButton_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_1_1_1.setBackground(Color.RED);
		btnNewButton_1_1_1_1.setBounds(617, 445, 189, 50);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
	}
}
