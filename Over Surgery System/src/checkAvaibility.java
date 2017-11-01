import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class checkAvaibility extends JFrame{

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkAvaibility frame = new checkAvaibility();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	checkAvaibility() {
		setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 784, 572);
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 795, 36);
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Over Surgery System");
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		table = new JTable();
		table.setBounds(25, 130, 726, 120);
		getContentPane().add(table);
		
		JLabel lblNewLabel1 = new JLabel("General Practictioner ID:");
		lblNewLabel1.setBounds(25, 73, 145, 34);
		panel.add(lblNewLabel1);
		
		textField = new JTextField();
		textField.setBounds(218, 77, 172, 27);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.setBounds(440, 79, 57, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNurseAvability = new JLabel("Nurse ID:");
		lblNurseAvability.setBounds(25, 326, 112, 14);
		getContentPane().add(lblNurseAvability);
		
		textField_1 = new JTextField();
		textField_1.setBounds(233, 326, 172, 27);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("Ok");
		button.setBounds(440, 328, 57, 23);
		getContentPane().add(button);
		
		table_1 = new JTable();
		table_1.setBounds(25, 388, 726, 120);
		getContentPane().add(table_1);
	}
}
