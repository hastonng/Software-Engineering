import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage
{
	/**
	 * Initialize the contents of the frame.
	 */
	public static void show()
	{
		JPanel contentPane = Window.getCleanContentPane();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel_1.setBounds(0, 0, 795, 36);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Over Surgery System");
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblLogin.setBounds(349, 59, 95, 54);
		contentPane.add(lblLogin);
		
		JLabel lblUserName = new JLabel("User name:");
		lblUserName.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblUserName.setBounds(223, 146, 120, 30);
		contentPane.add(lblUserName);
		
		JTextField textField = new JTextField();
		textField.setBounds(369, 146, 186, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Georgia", Font.PLAIN, 20));
		lblPassword.setBounds(223, 222, 120, 30);
		contentPane.add(lblPassword);
		
		JPasswordField pwdPassword = new JPasswordField();
		pwdPassword.setBounds(369, 222, 186, 30);
		contentPane.add(pwdPassword);
		
		JButton loginBtn = new JButton("LoginPage");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					MainPage.show();
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		//Image img = new ImageIcon(this.getClass().getResource("/loginIcon.png")).getImage();
		loginBtn.setBounds(422, 310, 115, 36);
		contentPane.add(loginBtn);
	
		JButton FPwdBtn = new JButton("Forget Password");
		FPwdBtn.setBounds(192, 310, 162, 36);
		contentPane.add(FPwdBtn);
		
		Window.update();
	}
}
