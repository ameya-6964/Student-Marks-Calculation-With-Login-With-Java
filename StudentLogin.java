import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class StudentLogin {
	private JFrame frame;
	private JTextField idField;
	private JPasswordField passwordField;
	private JTextField nameField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentLogin window = new StudentLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public StudentLogin() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 710, 542);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT LOGIN ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel.setBounds(196, 10, 321, 36);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(64, 265, 154, 30);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		idField = new JTextField();
		idField.setBounds(313, 189, 278, 29);
		frame.getContentPane().add(idField);
		idField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(313, 265, 278, 29);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton_1_1 = new JButton("LOGIN");
		btnNewButton_1_1.setBackground(new Color(0, 255, 128));
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = nameField.getText();
				String userid = idField.getText();
				String password = passwordField.getText();
				if(password.contains("Ameya") && userid.contains("Ameya121297") && username.contains("Ameya Belvalkar"))
				{
					JOptionPane.showMessageDialog(null,"  YOU HAVE LOGGED AND YOU CAN CALCULATE MARKS :)","SUCCESSFUL",JOptionPane.INFORMATION_MESSAGE);
					idField.setText(null);
					nameField.setText(null);
					passwordField.setText(null);
					StudentMarks.main(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"  INVALID CREDENTIALS","ERROR",JOptionPane.ERROR_MESSAGE);
					idField.setText(null);
					nameField.setText(null);
					passwordField.setText(null);
				}
				
			}
		});
		btnNewButton_1_1.setBounds(193, 373, 110, 50);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("RESET");
		btnNewButton_1_1_1.setBackground(new Color(0, 128, 255));
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idField.setText(null);
				nameField.setText(null);
				passwordField.setText(null);

			}
		});
		btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_1_1.setBounds(349, 373, 110, 50);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("EXIT");
		btnNewButton_1_1_1_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btnNewButton_1_1_1_1.setBounds(511, 373, 110, 50);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("STUDENT ID");
		lblNewLabel_1_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(64, 189, 198, 30);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("STUDENT NAME");
		lblNewLabel_1_2_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel_1_2_1.setBounds(64, 117, 198, 30);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		nameField = new JTextField();
		nameField.setColumns(10);
		nameField.setBounds(313, 117, 278, 29);
		frame.getContentPane().add(nameField);
	}
}
