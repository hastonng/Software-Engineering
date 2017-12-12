import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class LoginPage
{
	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public static void show()
	{
		JPanel panel1 = Window.getCleanContentPane();
		
		
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(0, 0, 10000, 10000);
		panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel1.setLayout(null);;
		
		JLabel lblWelcome = new JLabel("Welcome ");
		lblWelcome.setForeground(Color.WHITE);
		lblWelcome.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 50));
		lblWelcome.setBounds(75, 165, 333, 119);
		panel1.add(lblWelcome);
		
		JLabel lblNewLabel_1 = new JLabel("To Over Surgery System");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(75, 284, 666, 119);
		lblNewLabel_1.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 50));
		panel1.add(lblNewLabel_1);
		
		JPanel loginBoxPanel = new JPanel();
		loginBoxPanel.setBackground(UIManager.getColor("activeCaption"));
		loginBoxPanel.setBounds(650, 399, 410, 256);
		panel1.add(loginBoxPanel);
		loginBoxPanel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(10, 41, 133, 28);
		loginBoxPanel.add(lblUsername);
		lblUsername.setFont(new Font("Georgia", Font.PLAIN, 25));
		
		JTextField userNameField = new JTextField();
		userNameField.setBounds(153, 36, 216, 37);
		loginBoxPanel.add(userNameField);
		userNameField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		userNameField.setColumns(10);
		
		JLabel label_2 = new JLabel("Password:");
		label_2.setBounds(22, 103, 139, 35);
		loginBoxPanel.add(label_2);
		label_2.setFont(new Font("Georgia", Font.PLAIN, 25));
		
		JPasswordField passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(153, 105, 216, 37);
		loginBoxPanel.add(passwordField_1);
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		

		Button loginBtn = new Button("Login");
		loginBtn.setFont(new Font("Dialog", Font.PLAIN, 20));
		loginBtn.setBounds(264, 192, 104, 35);
		loginBoxPanel.add(loginBtn);
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
		
		Button fpwBtn = new Button("Forget Password");
		fpwBtn.setBounds(22, 192, 180, 35);
		loginBoxPanel.add(fpwBtn);
		fpwBtn.setFont(new Font("Dialog", Font.PLAIN, 20));
		fpwBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					invalidPage.show();
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});

		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					String password = new String(passwordField_1.getPassword());
					String username = userNameField.getText();
					
					if(username.trim().length() == 0 ||  password.trim().length() == 0) {
						
						LoginPage.show();
						
					}else {
						
						Login log = new Login();
						log.login(username,password);
						
						
						if(log.isLoginValidation() == true) {
							
							if(log.getUserRole() == 1) {
								
								Employee emp = new Employee();
								emp.setEmployeeID(userNameField.getText());
								emp.setPassword(password);
								
								emp.setRole(1);
								FindPatientPage.setEmployeeId(emp);
								MainPage.show();
							}
							else if (log.getUserRole() == 2) {
								
									Employee emp = new Employee();
								
									emp.setEmployeeID(userNameField.getText());
									emp.setPassword(password);
								
									emp.setRole(2);
									FindPatientPage.setEmployeeId(emp);
									GPMainPage.show();
								}
							else if (log.getUserRole() == 3 ) {
								
								Employee emp = new Employee();
								
								emp.setEmployeeID(userNameField.getText());
								emp.setPassword(password);
								
								emp.setRole(3);
								FindPatientPage.setEmployeeId(emp);
								GPMainPage.show();
							}	
						
						}else
							invalidPage.show();
						
					}
					
					
									
				
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		//Image img = new ImageIcon(this.getClass().getResource("/loginIcon.png")).getImage();
		
	
			
		fpwBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					invalidPage.show();
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
	
		
		
	
		
		JLabel thumb = new JLabel();
		thumb.setBackground(new Color(255, 255, 255));
		thumb.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 19));
		thumb.setBounds(0, 0, 1370, 800);
		thumb.setIcon(new ImageIcon("C:\\Users\\Haston Ng\\eclipse-workspace\\Over Surgery System\\src\\loginPageImg.jpg"));
		panel1.add(thumb);
		
		Window.update();
	}
}
