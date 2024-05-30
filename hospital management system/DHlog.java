package hosLogin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class DHlog extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField txtHospital;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DHlog frame = new DHlog();
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
	public DHlog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1477, 882);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblHospitals = new JLabel("HOSPITALS");
		lblHospitals.setForeground(new Color(102, 255, 0));
		lblHospitals.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblHospitals.setBackground(Color.WHITE);
		lblHospitals.setBounds(542, 123, 647, 87);
		contentPane.add(lblHospitals);
		
		JLabel lblNewLabel = new JLabel("SUWA ARANA ");
		lblNewLabel.setBounds(113, 28, 707, 101);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Doctors Login");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(582, 231, 466, 52);
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 40));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(542, 341, 157, 36);
		lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("password :");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setBounds(542, 400, 157, 36);
		lblNewLabel_2_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		contentPane.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(690, 347, 328, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		passwordField.setBounds(690, 406, 328, 30);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(102, 255, 51));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(693, 481, 425, 136);
		btnNewButton.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 30));
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "123456");
                    String sql = "SELECT * FROM doctor WHERE username = ? AND password = ?";
                    PreparedStatement stmt = con.prepareStatement(sql);
                    stmt.setString(1, textField.getText());
                    stmt.setString(2, passwordField.getText());

                    ResultSet rs = stmt.executeQuery();

                    if (rs.next()) {
                        String username = rs.getString("username"); // Retrieve the username
                        Dinterface adminAccountFrame = new Dinterface(); // Pass the 
                        adminAccountFrame.setVisible(true);

                        setVisible(false); // Close the login form
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect username and password");
                    }
                } catch (Exception ae) {
                    ae.printStackTrace();
                }
            }
        });
		
		JLabel lblNewLabel_3 = new JLabel("Back");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(10, 10, 45, 19);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Gartoon-Team-Gartoon-Misc-Dialog-Password-Lock.64.png"));
		lblNewLabel_5_1.setBounds(1016, 407, 64, 45);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Icons-Land-Vista-People-Medical-Nurse-Male-Dark.48.png"));
		lblNewLabel_5.setBounds(1027, 342, 91, 48);
		contentPane.add(lblNewLabel_5);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 255, 51));
		panel_1.setBounds(689, 400, 391, 52);
		contentPane.add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 255, 51));
		panel.setBounds(689, 338, 391, 52);
		contentPane.add(panel);
		

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setForeground(new Color(51, 153, 255));
		lblNewLabel_4.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\photo-young-doctor-with-stethoscope-folder-blue-posing.jpg"));
		lblNewLabel_4.setBounds(-24, -46, 2031, 1333);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                Home adminlogForm = new  Home();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
	}
}
