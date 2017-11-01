import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class FindPatient {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindPatient window = new FindPatient();
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
	public FindPatient() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(-11, 0, 795, 36);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Over Surgery System");
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblFindPatient = new JLabel("Find Patient");
		lblFindPatient.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblFindPatient.setBounds(317, 59, 155, 54);
		panel.add(lblFindPatient);
		
		JLabel lblPatientId = new JLabel("Patient ID: ");
		lblPatientId.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblPatientId.setBounds(257, 134, 120, 30);
		panel.add(lblPatientId);
		
		textField = new JTextField();
		textField.setBounds(387, 134, 144, 36);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblIcNumber = new JLabel("IC Number:");
		lblIcNumber.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblIcNumber.setBounds(250, 245, 120, 30);
		panel.add(lblIcNumber);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(387, 245, 144, 36);
		panel.add(textField_1);
		
		JLabel lblPatientName = new JLabel("Patient Name: ");
		lblPatientName.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblPatientName.setBounds(226, 190, 144, 30);
		panel.add(lblPatientName);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(387, 190, 144, 36);
		panel.add(textField_2);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number:");
		lblPhoneNumber.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblPhoneNumber.setBounds(213, 303, 144, 30);
		panel.add(lblPhoneNumber);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(387, 303, 144, 36);
		panel.add(textField_3);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(634, 337, 6, 20);
		panel.add(textPane);
		
		JButton findBtn = new JButton("Find");
		findBtn.setBounds(426, 413, 134, 43);
		panel.add(findBtn);
		
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.setBounds(226, 413, 134, 43);
		panel.add(cancelBtn);
		

	}
}
