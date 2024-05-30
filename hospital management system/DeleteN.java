package hosLogin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;
public class DeleteN extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final Object Email = null;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteN frame = new DeleteN();
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
	public DeleteN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1535, 869);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Delete Nurse Account");
		lblNewLabel_1.setForeground(new Color(255, 102, 153));
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 40));
		lblNewLabel_1.setBounds(518, 190, 551, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("SUVA ARANA");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(275, 10, 794, 86);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("username :");
		lblNewLabel_2.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2.setBounds(470, 272, 189, 29);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField.setBounds(635, 275, 250, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Email :");
		lblNewLabel_2_1.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2_1.setBounds(512, 358, 113, 29);
		contentPane.add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		textField_1.setBounds(635, 351, 250, 36);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete Account");
		btnNewButton.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(51, 0, 102)));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 0, 51));
		btnNewButton.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.setBounds(555, 446, 514, 66);
		contentPane.add(btnNewButton);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
           
			
			    public void mouseClicked(MouseEvent e) {
			    	 String username = textField.getText().trim();
					    String Email = textField_1.getText().trim();
					   
			   
			    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "123456")) {
			        String deleteQuery = "DELETE FROM nurse WHERE username = ? AND Email = ?";
			        PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
			        preparedStatement.setString(1, username);
			        preparedStatement.setString(2, Email);
                       
			        int rowsDeleted = preparedStatement.executeUpdate();

			        if (rowsDeleted > 0) {
			            JOptionPane.showMessageDialog(null, "Account deleted successfully.");
			            setVisible(false);
			            Ah2 loginFrame = new Ah2();
			            loginFrame.setVisible(true);
			        } else {
			            JOptionPane.showMessageDialog(null, "No record found for deletion.");
			        }
			    } catch (SQLException ex) {
			        ex.printStackTrace();
			        JOptionPane.showMessageDialog(null, "An error occurred while deleting the account: " + ex.getMessage());
			    }
			}

           
        });

		    
		
		JLabel lblNewLabel_3 = new JLabel("Back");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 10, 62, 19);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("HOSPITASLS");
		lblNewLabel_5.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 80));
		lblNewLabel_5.setBounds(668, 88, 529, 98);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Icons-Land-Vista-People-Medical-Nurse-Male-Dark.48.png"));
		lblNewLabel_7.setBounds(892, 272, 74, 41);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Wwalczyszyn-Android-Style-Mail.64.png"));
		lblNewLabel_7_1.setBounds(880, 337, 62, 53);
		contentPane.add(lblNewLabel_7_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 102));
		panel.setBounds(635, 264, 297, 53);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 102));
		panel_1.setBounds(635, 337, 297, 60);
		contentPane.add(panel_1);
		
		
		
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\female-doctor-with-stethoscope-posing-gray-background-high-quality-photo.jpg"));
		lblNewLabel_4.setBounds(0, 10, 2000, 1333);
		contentPane.add(lblNewLabel_4);
		
		
		
		JLabel lblNewLabel_6 = new JLabel("SUVA ARANA");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setBounds(526, 90, 794, 86);
		contentPane.add(lblNewLabel_6);
		
		
		
		
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                Ah2 adminlogForm = new Ah2();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
	}

}

