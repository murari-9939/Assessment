package swingprojectpractice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class lppp {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lppp window = new lppp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public lppp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Name");
		lblNewLabel.setBounds(48, 25, 72, 24);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("U_Name");
		lblNewLabel_1.setBounds(34, 84, 72, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblUmail = new JLabel("U_Mail");
		lblUmail.setBounds(34, 109, 72, 14);
		frame.getContentPane().add(lblUmail);
		
		JLabel lblUpass = new JLabel("U_Pass");
		lblUpass.setBounds(34, 140, 72, 14);
		frame.getContentPane().add(lblUpass);
		
		JLabel lblUcountry = new JLabel("U_Country");
		lblUcountry.setBounds(34, 192, 72, 24);
		frame.getContentPane().add(lblUcountry);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(156, 25, 82, 22);
		frame.getContentPane().add(textArea);
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setBounds(116, 79, 82, 22);
		frame.getContentPane().add(textArea1);
		
		JTextArea textArea3 = new JTextArea();
		textArea3.setBounds(81, 135, 103, 22);
		frame.getContentPane().add(textArea3);
		
		JTextArea textArea4 = new JTextArea();
		textArea4.setBounds(136, 192, 82, 24);
		frame.getContentPane().add(textArea4);
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setBounds(116, 104, 82, 22);
		frame.getContentPane().add(textArea2);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {  
		            String str = textArea.getText();  
		            Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/pt","root","murari9939"); 
		            PreparedStatement st = con.prepareStatement("select * from emp where  uname=?"); 
		            st.setString(1, str);  
		            //Excuting Query  
		            ResultSet rs = st.executeQuery();  
		            if (rs.next()) {  
		                String s = rs.getString(1);  
		                String s1 = rs.getString(2);  
		                String s2 = rs.getString(3);  
		                String s3 = rs.getString(4);  
		                //Sets Records in TextFields.  
		                textArea1.setText(s);  
		                textArea2.setText(s1);  
		                textArea3.setText(s2);  
		                textArea4.setText(s3);  
		            } else {  
		                JOptionPane.showMessageDialog(null, "Name not Found");  
		            }  
		            //Create Exception Handler  
		        } catch (Exception ex) {  
		            System.out.println(ex);  
		        }
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(259, 11, 165, 38);
		frame.getContentPane().add(btnNewButton);
	}
}
