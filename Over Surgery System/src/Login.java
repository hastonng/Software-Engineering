import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
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
		panel.setBounds(0, 0, 784, 572);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(0, 0, 795, 36);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Over Surgery System");
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblLogin.setBounds(349, 59, 95, 54);
		panel.add(lblLogin);
		
		JLabel lblUserName = new JLabel("User name:");
		lblUserName.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblUserName.setBounds(223, 146, 120, 30);
		panel.add(lblUserName);
		
		textField = new JTextField();
		textField.setBounds(369, 146, 186, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblPassword.setBounds(223, 222, 120, 30);
		panel.add(lblPassword);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(369, 222, 186, 30);
		panel.add(pwdPassword);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					firstScreen fScreen = new firstScreen();
					fScreen.setVisible(true);
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		//Image img = new ImageIcon(this.getClass().getResource("/loginIcon.png")).getImage();
		loginBtn.setBounds(422, 310, 115, 36);
		panel.add(loginBtn);
	
		JButton FPwdBtn = new JButton("Forget Password");
		FPwdBtn.setBounds(239, 310, 115, 36);
		panel.add(FPwdBtn);
		
	}
}
		
	
