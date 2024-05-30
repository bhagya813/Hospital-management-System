package hosLogin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.border.MatteBorder;

public class NurseLog extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NurseLog frame = new NurseLog();
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
	public NurseLog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1554, 1017);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUVA ARANA");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(95, -39, 1017, 178);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HOSPITALS");
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 80));
		lblNewLabel_1.setIcon(null);
		lblNewLabel_1.setBounds(568, 77, 504, 82);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2.setBounds(365, 245, 189, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("password :");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2_1.setBounds(353, 317, 195, 29);
		contentPane.add(lblNewLabel_2_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(547, 251, 311, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		passwordField.setBounds(547, 325, 311, 35);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("Nurses Login");
		lblNewLabel_3.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_3.setBounds(554, 169, 402, 60);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(0, 0, 102)));
		btnNewButton.setBackground(new Color(0, 0, 204));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(547, 448, 402, 67);
		contentPane.add(btnNewButton);
		

		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "123456");
                    String sql = "SELECT * FROM nurse WHERE username = ? AND password = ?";
                    PreparedStatement stmt = con.prepareStatement(sql);
                    stmt.setString(1, textField.getText());
                    stmt.setString(2, passwordField.getText());

                    ResultSet rs = stmt.executeQuery();

                    if (rs.next()) {
                        String username = rs.getString("username"); // Retrieve the username
                        Ah2 adminAccountFrame = new Ah2(); // Pass the 
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
		
		
		JLabel lblNewLabel_4 = new JLabel("Back");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 10, 50, 19);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Forgot password?");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_5.setBounds(525, 387, 189, 29);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Icons-Land-Vista-People-Medical-Nurse-Male-Dark.48.png"));
		lblNewLabel_8.setBounds(868, 242, 58, 60);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Gartoon-Team-Gartoon-Misc-Dialog-Password-Lock.64.png"));
		lblNewLabel_9.setBounds(862, 312, 64, 60);
		contentPane.add(lblNewLabel_9);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 204, 255));
		panel.setBounds(548, 241, 379, 61);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 204, 255));
		panel_1.setBounds(547, 312, 379, 60);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_6 = new JLabel("New Members : Sign Up");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_6.setBounds(776, 525, 318, 35);
		contentPane.add(lblNewLabel_6);
		
		
		
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\young-female-doctor-working-isolated-white.jpg"));
		lblNewLabel_7.setBounds(-152, -285, 2000, 1333);
		contentPane.add(lblNewLabel_7);
		
		
		
		
		
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                NurseRegis adminlogForm = new NurseRegis();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                NForgot adminlogForm = new NForgot();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                NurseRegis adminlogForm = new NurseRegis();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
	}
}
