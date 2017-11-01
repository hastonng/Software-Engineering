import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.ScrollPane;

public class medicalPrescriptions {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					medicalPrescriptions window = new medicalPrescriptions();
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
	public medicalPrescriptions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel panel = new Panel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Medical Prescription");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 25));
		lblNewLabel.setBounds(250, 50, 300, 40);
		panel.add(lblNewLabel);
		
		JLabel lblPatientName = new JLabel("Patient Name:");
		lblPatientName.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblPatientName.setBounds(35, 110, 150, 30);
		panel.add(lblPatientName);
		
		JLabel lblPatientId = new JLabel("Patient ID:");
		lblPatientId.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblPatientId.setBounds(35, 140, 150, 30);
		panel.add(lblPatientId);
		
		JLabel lblDiagnosis = new JLabel("Diagnosis:");
		lblDiagnosis.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblDiagnosis.setBounds(35, 300, 150, 30);
		panel.add(lblDiagnosis);
		
		textField = new JTextField();
		textField.setFont(new Font("Verdana", Font.PLAIN, 12));
		textField.setBounds(200, 300, 400, 180);
		panel.add(textField);
		textField.setColumns(10);
		
		Button button = new Button("Submit");
		button.setFont(new Font("Verdana", Font.PLAIN, 12));
		button.setBounds(200, 500, 100, 30);
		panel.add(button);
		
		Button button_1 = new Button("Cancel");
		button_1.setFont(new Font("Verdana", Font.PLAIN, 12));
		button_1.setBounds(500, 500, 100, 30);
		panel.add(button_1);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblHeight.setBounds(35, 170, 150, 30);
		panel.add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblWeight.setBounds(35, 200, 150, 30);
		panel.add(lblWeight);
		
		JLabel lblDisease = new JLabel("Condition:");
		lblDisease.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblDisease.setBounds(35, 230, 150, 30);
		panel.add(lblDisease);
		
		JLabel lblNewLabel_1 = new JLabel("Disease:");
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(35, 260, 150, 30);
		panel.add(lblNewLabel_1);
	}
}
