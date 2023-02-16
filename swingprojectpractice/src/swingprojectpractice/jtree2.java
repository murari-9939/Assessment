package swingprojectpractice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class jtree2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jtree2 frame = new jtree2();
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
	public jtree2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("course") {
				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("programming");
						node_1.add(new DefaultMutableTreeNode("java"));
						node_1.add(new DefaultMutableTreeNode("python"));
						node_1.add(new DefaultMutableTreeNode("red"));
						node_1.add(new DefaultMutableTreeNode("yellow"));
					add(node_1);
					add(new DefaultMutableTreeNode(""));
				}
			}
		));
	
		tree.setBounds(73, 39, 124, 160);
		contentPane.add(tree);
		
		JLabel lblNewLabel = new JLabel("course");
		lblNewLabel.setBounds(253, 40, 99, 33);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(237, 84, 99, 32);
		contentPane.add(textArea);
		
		JLabel lblFees = new JLabel("fees");
		lblFees.setBounds(237, 126, 99, 33);
		contentPane.add(lblFees);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(237, 170, 99, 29);
		contentPane.add(textArea_1);
	}
}
