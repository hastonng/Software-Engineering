import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import com.toedter.calendar.JCalendar;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class AppointmentPage {

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
					AppointmentPage window = new AppointmentPage();
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
	public AppointmentPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblPatientId = new JLabel("Patient ID: ");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblPatientName = new JLabel("Patient Name: ");
		
		JLabel lblNric = new JLabel("NRIC: ");
		
		JLabel lblContactNumber = new JLabel("Contact Number: ");
		
		JLabel lblEmail = new JLabel("Email:");
		
		JCalendar calendar = new JCalendar();
		
		JLabel lblOverSurgerySystem = new JLabel("Over Surgery System");
		
		JLabel lblGeneralPractitionalId = new JLabel("General Practitional ID: ");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton button = new JButton("OK");
		
		JLabel lblGeneralPractitionalName = new JLabel("General Practitional Name: ");
		
		JLabel lblGeneralPractitionalAvailability = new JLabel("General Practitional Availability: ");
		
		JLabel lblNurseId = new JLabel("Nurse ID: ");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JButton button_1 = new JButton("OK");
		
		JLabel lblNurseName = new JLabel("Nurse Name: ");
		
		JLabel lblNurseAvailability = new JLabel("Nurse Availability: ");
		
		JLabel lblTime = new JLabel("Time: ");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		
		JButton btnCancel = new JButton("Cancel");
		
		JLabel label = new JLabel("");
		
		JLabel label_1 = new JLabel("");
		
		JLabel label_4 = new JLabel("");
		
		JLabel label_6 = new JLabel("");
		
		JLabel label_5 = new JLabel("");
		
		JLabel label_7 = new JLabel("");
		
		JLabel label_2 = new JLabel("");
		
		JLabel label_3 = new JLabel("");
		GroupLayout groupLayout= new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(32)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblPatientId)
									.addGap(18)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnOk, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblGeneralPractitionalId)
									.addGap(18)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNurseId)
									.addGap(18)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblContactNumber)
										.addComponent(lblPatientName))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(label)
										.addComponent(label_1))
									.addGap(306)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNric)
											.addGap(18)
											.addComponent(label_2))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblEmail)
											.addGap(18)
											.addComponent(label_3))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblGeneralPractitionalName)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(18)
													.addComponent(label_4))
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(264)
													.addComponent(lblGeneralPractitionalAvailability))))
										.addComponent(calendar, GroupLayout.PREFERRED_SIZE, 546, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(23)
													.addComponent(lblTime)
													.addGap(18)
													.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGroup(groupLayout.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
													.addGap(18)))
											.addComponent(btnConfirm, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(18)
											.addComponent(label_5))))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNurseName)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(18)
											.addComponent(label_6))
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(348)
											.addComponent(lblNurseAvailability)
											.addGap(18)
											.addComponent(label_7))))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(441)
							.addComponent(lblOverSurgerySystem)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblOverSurgerySystem)
					.addGap(60)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPatientId)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOk))
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPatientName)
						.addComponent(label)
						.addComponent(lblNric)
						.addComponent(label_2))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContactNumber)
						.addComponent(label_1)
						.addComponent(lblEmail)
						.addComponent(label_3))
					.addGap(44)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGeneralPractitionalId)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblGeneralPractitionalName)
						.addComponent(label_4)
						.addComponent(lblGeneralPractitionalAvailability)
						.addComponent(label_5))
					.addGap(61)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNurseId)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNurseName)
						.addComponent(label_6)
						.addComponent(lblNurseAvailability)
						.addComponent(label_7))
					.addGap(87)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblTime)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(calendar, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.TRAILING, groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnConfirm, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(25, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		
	}
}
