package swingprojectpractice;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swingpro {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingpro window = new swingpro();
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
	public swingpro() {
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
		
		JRadioButton rb1 = new JRadioButton("male");
		buttonGroup.add(rb1);
		rb1.setBounds(108, 153, 109, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("female");
		buttonGroup.add(rb2);
		rb2.setBounds(108, 189, 109, 23);
		frame.getContentPane().add(rb2);
		
		JButton btnNewButton = new JButton("click");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rb1.isSelected()){    
					JOptionPane.showMessageDialog(btnNewButton, "You are Male.");    
					}    
					if(rb2.isSelected()){    
					JOptionPane.showMessageDialog(btnNewButton, "You are Female.");    
					}   
			}
		});
		buttonGroup.add(btnNewButton);
		btnNewButton.setBounds(118, 219, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
