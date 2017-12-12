import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class registerPatientPage
{
	
	private static String fName;
	private static String lName;
	private static int pHeight;
	private static int pWeight;
	private static String dob;
	private static String streetField1;
	private static String streetField2;
	private static String town;
	private static String state;
	private static String postalCode;
	
	/**
	 * Initialize the contents of the frame.
	 */
	public static void show()
	{
        JPanel panel = Window.getCleanContentPane();
        Window.setWindowSize(900,700);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 795, 36);
		panel_1.setBackground(SystemColor.inactiveCaption);
		panel.add(panel_1);
		
		JLabel title = new JLabel("Over Surgery System");
        title.setBounds(365, 5, 187, 25);
        panel_1.add(title);
        title.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JPanel UpperPartPanel = new JPanel();
		UpperPartPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		UpperPartPanel.setBounds(29, 76, 825, 268);
		panel.add(UpperPartPanel);
		UpperPartPanel.setLayout(null);
		
		JLabel label_1 = new JLabel("New Patient Registration");
		label_1.setFont(new Font("Verdana", Font.BOLD, 24));
		label_1.setBounds(258, 11, 390, 40);
		UpperPartPanel.add(label_1);
		
		
		//FIRST NAME
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setBounds(29, 91, 150, 40);
		UpperPartPanel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField FirstNameField = new JTextField();
		FirstNameField.setBounds(123, 93, 180, 30);
		UpperPartPanel.add(FirstNameField);
		FirstNameField.setFont(new Font("Verdana", Font.ITALIC, 15));
		
		//LAST NAME
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(30, 126, 140, 40);
		UpperPartPanel.add(lblLastName);
		lblLastName.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField LastNameField = new JTextField();
		LastNameField.setBounds(123, 133, 180, 30);
		UpperPartPanel.add(LastNameField);
		LastNameField.setFont(new Font("Verdana", Font.ITALIC, 15));
		
		//DOB
		JLabel lblDOB = new JLabel("Date Of Birth:");
		lblDOB.setBounds(10, 208, 150, 30);
		UpperPartPanel.add(lblDOB);
		lblDOB.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField ddField= new JTextField();
		ddField.setFont(new Font("Verdana", Font.ITALIC, 15));
		ddField.setColumns(10);
		ddField.setBounds(123, 213, 33, 30);
		UpperPartPanel.add(ddField);
		//SET TEXT LIMIT
		ddField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (ddField.getText().length() >= 2)
					e.consume();
			}
		});
	
		JLabel lblNewLabel_5 = new JLabel("-");
		lblNewLabel_5.setBounds(160, 213, 17, 30);
		UpperPartPanel.add(lblNewLabel_5);
		
		JTextField mmField = new JTextField();
		mmField.setBounds(171, 213, 33, 30);
		UpperPartPanel.add(mmField);
		mmField.setFont(new Font("Verdana", Font.ITALIC, 15));
		mmField.setColumns(10);
		//SET TEXT LIMIT
		mmField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (mmField.getText().length() >= 2)
					e.consume();
			}
		});
		
		JLabel label = new JLabel("-");
		label.setBounds(209, 214, 17, 30);
		UpperPartPanel.add(label);
		
		JTextField yyyyField = new JTextField();
		yyyyField.setBounds(221, 213, 56, 30);
		UpperPartPanel.add(yyyyField);
		yyyyField.setFont(new Font("Verdana", Font.ITALIC, 15));
		yyyyField.setColumns(10);
		//SET TEXT LIMIT
		yyyyField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (yyyyField.getText().length() >= 4)
					e.consume();
			}
		});
		
		
		
		//DOB label
		JLabel lblNote1 = new JLabel("  (Format: YYYY/MM/DD)");
		lblNote1.setBounds(281, 213, 150, 30);
		UpperPartPanel.add(lblNote1);
		lblNote1.setFont(new Font("Georgia", Font.PLAIN, 10));
		
		JLabel lblNric = new JLabel("NRIC:");
		lblNric.setBounds(70, 170, 100, 30);
		UpperPartPanel.add(lblNric);
		lblNric.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField ICNumField = new JTextField();
		ICNumField.setBounds(123, 171, 180, 30);
		UpperPartPanel.add(ICNumField);
		ICNumField.setFont(new Font("Verdana", Font.ITALIC, 15));
		ICNumField.setColumns(10);
		//SET TEXT LIMIT
		ICNumField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent ev) {
                //SET TEXT LIMIT-
                if (ICNumField.getText().length() >= 12)
                    ev.consume();

                    else 
                    {    //set accept only interger
                         char c = ev.getKeyChar();
                         if (!((c >= '0') && (c <= '9') ||
                            c == KeyEvent.VK_BACK_SPACE) ||
                            (c == KeyEvent.VK_DELETE)) {
                              ICNumField.getToolkit().beep();
                              ev.consume();
                    }
        }
        }

        });
		
		
		
		//ic label
		JLabel lblNote = new JLabel("  (Without \"-\")");
		lblNote.setBounds(300, 170, 90, 30);
		UpperPartPanel.add(lblNote);
		lblNote.setFont(new Font("Georgia", Font.PLAIN, 10));
		
		JLabel lblNewLabel_2 = new JLabel("Gender:");
		lblNewLabel_2.setBounds(484, 131, 150, 30);
		UpperPartPanel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setSelected(true);
		rdbtnMale.setBounds(555, 131, 90, 30);
		UpperPartPanel.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(645, 131, 100, 30);
		UpperPartPanel.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnMale);
		group.add(rdbtnFemale);
		
		JLabel lblContactNo = new JLabel("Contact No:");
		lblContactNo.setBounds(454, 172, 140, 30);
		UpperPartPanel.add(lblContactNo);
		lblContactNo.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField PhoneNumField = new JTextField();
		PhoneNumField.setBounds(557, 174, 180, 30);
		UpperPartPanel.add(PhoneNumField);
		PhoneNumField.setFont(new Font("Verdana", Font.ITALIC, 15));
		PhoneNumField.setColumns(10);
		//SET TEXT LIMIT
		PhoneNumField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (PhoneNumField.getText().length() >= 11)
					e.consume();
			}
		});
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(494, 213, 100, 30);
		UpperPartPanel.add(lblEmail);
		lblEmail.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField EmailField = new JTextField();
		EmailField.setBounds(557, 214, 180, 30);
		UpperPartPanel.add(EmailField);
		EmailField.setFont(new Font("Verdana", Font.ITALIC, 15));
		EmailField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Height:");
		lblNewLabel_4.setBounds(461, 96, 70, 30);
		UpperPartPanel.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField HeightField = new JTextField();
		HeightField.setBounds(519, 96, 60, 30);
		UpperPartPanel.add(HeightField);
		HeightField.setFont(new Font("Verdana", Font.ITALIC, 15));
		HeightField.setColumns(10);
		//SET TEXT LIMIT
		HeightField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (HeightField.getText().length() >= 3)
					e.consume();
			}
		});
		
		JLabel lblCm = new JLabel("(cm)");
		lblCm.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblCm.setBounds(580, 97, 24, 30);
		UpperPartPanel.add(lblCm);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setBounds(615, 96, 70, 30);
		UpperPartPanel.add(lblWeight);
		lblWeight.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField WeightField = new JTextField();
		WeightField.setBounds(675, 96, 60, 30);
		UpperPartPanel.add(WeightField);
		WeightField.setFont(new Font("Verdana", Font.ITALIC, 15));
		WeightField.setColumns(10);
		//SET TEXT LIMIT
		WeightField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (WeightField.getText().length() >= 3)
					e.consume();
			}
		});
		
		JLabel lblkg = new JLabel("(kg)");
		lblkg.setFont(new Font("Georgia", Font.PLAIN, 10));
		lblkg.setBounds(738, 97, 24, 30);
		UpperPartPanel.add(lblkg);
		
		JLabel label_2 = new JLabel("  (Without \"-\")");
		label_2.setFont(new Font("Georgia", Font.PLAIN, 10));
		label_2.setBounds(736, 174, 90, 30);
		UpperPartPanel.add(label_2);
		
		
		//lowerPart-Address Part
		JPanel lowerPartPanel = new JPanel();
		lowerPartPanel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lowerPartPanel.setBounds(26, 379, 826, 224);
		panel.add(lowerPartPanel);
		lowerPartPanel.setLayout(null);
		
		JLabel lblAddress = new JLabel("Street Address:");
		lblAddress.setBounds(39, 7, 166, 30);
		lowerPartPanel.add(lblAddress);
		lblAddress.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField StreetField1 = new JTextField();
		StreetField1.setBounds(39, 48, 260, 30);
		lowerPartPanel.add(StreetField1);
		StreetField1.setFont(new Font("Verdana", Font.ITALIC, 15));
		StreetField1.setColumns(10);
		
		JTextField StreetField2 = new JTextField();
		StreetField2.setBounds(39, 77, 260, 30);
		lowerPartPanel.add(StreetField2);
		StreetField2.setFont(new Font("Verdana", Font.ITALIC, 15));
		StreetField2.setColumns(10);
		
		JLabel Townlabel = new JLabel("Town / City:");
		Townlabel.setBounds(514, 11, 127, 30);
		lowerPartPanel.add(Townlabel);
		Townlabel.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField TownField = new JTextField();
		TownField.setBounds(513, 51, 260, 30);
		lowerPartPanel.add(TownField);
		TownField.setFont(new Font("Verdana", Font.ITALIC, 15));
		TownField.setColumns(10);
		
		JLabel lblTownCity = new JLabel("Postcode / ZIP:");
		lblTownCity.setBounds(39, 129, 127, 30);
		lowerPartPanel.add(lblTownCity);
		lblTownCity.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField PostcodeField = new JTextField();
		PostcodeField.setBounds(39, 170, 260, 30);
		lowerPartPanel.add(PostcodeField);
		//SET TEXT LIMIT
		PostcodeField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (PostcodeField.getText().length() >= 5)
					e.consume();
			}
		});
		PostcodeField.setFont(new Font("Verdana", Font.ITALIC, 15));
		PostcodeField.setColumns(10);
		PostcodeField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (PostcodeField.getText().length() >= 5)
					e.consume();
			}
		});
				
		JLabel lblStateCountry = new JLabel("State / Country:");
		lblStateCountry.setBounds(512, 128, 127, 30);
		lowerPartPanel.add(lblStateCountry);
		lblStateCountry.setFont(new Font("Verdana", Font.PLAIN, 15));
		
		JTextField StateField = new JTextField();
		StateField.setBounds(512, 169, 260, 30);
		lowerPartPanel.add(StateField);
		StateField.setFont(new Font("Verdana", Font.ITALIC, 15));
		StateField.setColumns(10);
		
		//register and cancel buttons
		Button registerButton = new Button("Register");
		registerButton.setFont(new Font("Verdana", Font.PLAIN, 15));
		registerButton.setBounds(669, 627, 73, 25);
		panel.add(registerButton);
		
		
		
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					Patient patient = new Patient();
					fName = FirstNameField.getText().toString();
					lName = LastNameField.getText().toString();
					dob =  yyyyField.getText() +"-"+ mmField.getText() +"-"+ ddField.getText();
					pHeight = Integer.parseInt(HeightField.getText().toString());
					pWeight = Integer.parseInt(WeightField.getText().toString());
					streetField1 = StreetField1.getText().toString();
					streetField2 = StreetField2.getText().toString();
					town = TownField.getText().toString();
					postalCode = PostcodeField.getText().toString();
					state = StateField.getText().toString();
					
					
					patient.setPatientName(fName + " " + lName);
					patient.setStrDob(dob);
					patient.setNricNum(ICNumField.getText().toString());
					patient.setPhoneNum(PhoneNumField.getText().toString());
					patient.setPatientHeight(pHeight);
					patient.setPatientWeight(pWeight);
					patient.setEmail(EmailField.getText().toString());
					patient.setAddress(streetField1 +" "+ streetField2 + "," + postalCode  +" "+ town +" "+ state);
					
					
					if(rdbtnMale.isSelected())
					{
						patient.setSex(rdbtnMale.getText().toString());
					}
					else if (rdbtnFemale.isSelected()) {
						patient.setSex(rdbtnFemale.getText().toString());
					}
					
					patient.RegisterPatient();
					
					System.out.println(patient.getPatientName()+patient.getStrDob()+patient.getNricNum()+patient.getSex()+patient.getPhoneNum()+patient.getPatientHeight()+patient.getPatientWeight()+patient.getEmail()+patient.getAddress());
					
					registerPatientPage.show();
					
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
	
		
		Button button_1 = new Button("Cancel");
		button_1.setFont(new Font("Verdana", Font.PLAIN, 15));
		button_1.setBounds(780, 627, 73, 25);
		panel.add(button_1);
		button_1.addActionListener(new ActionListener() {
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
		Window.update();
	}
}
