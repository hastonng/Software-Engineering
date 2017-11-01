import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JMenu;
import java.awt.Choice;
import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JTree;
import javax.swing.JSlider;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JRadioButton;

public class MainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	MainPage() {
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
		
		JButton RPatientBtn = new JButton("");
		RPatientBtn.setBounds(49, 188, 121, 110);
		panel.add(RPatientBtn);
		RPatientBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try 
				{
					newPatient nPatient = new newPatient();
					nPatient.setVisible(true);
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		
		JButton fPatientBtn = new JButton("");
		fPatientBtn.setBounds(239, 188, 121, 110);
		panel.add(fPatientBtn);
		fPatientBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					FindPatient fPatient = new FindPatient();
					fPatient.setVisible(true);
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		
		JButton mAppointmentBtn = new JButton("");
		mAppointmentBtn.setBounds(424, 188, 121, 110);
		panel.add(mAppointmentBtn);
		mAppointmentBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					AppointmentPage aPage = new AppointmentPage();
					aPage.setVisible(true);
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		
		JButton logoutBtn = new JButton("");
		logoutBtn.setBounds(611, 188, 121, 110);
		panel.add(logoutBtn);
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					Login login = new Login();
					login.setVisible(true);
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Register Patient");
		lblNewLabel_1.setBounds(60, 309, 121, 26);
		panel.add(lblNewLabel_1);
		
		JLabel lblFindPatient = new JLabel("Find Patient");
		lblFindPatient.setBounds(266, 309, 111, 26);
		panel.add(lblFindPatient);
		
		JLabel lblMakeAppointment = new JLabel("Make Appointment\r\n\r\n");
		lblMakeAppointment.setBounds(430, 309, 121, 26);
		panel.add(lblMakeAppointment);
		
		JLabel lblLogout = new JLabel("Logout\r\n");
		lblLogout.setBounds(650, 309, 39, 26);
		panel.add(lblLogout);
		
	}
}
