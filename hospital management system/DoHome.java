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
import java.sql.SQLException;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class DoHome extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private DefaultTableModel tableModel;
	private JTable table_1;
	private JTable table_2;
	private JLabel lblNewLabel;
	private JLabel lblHospitals;
	private JLabel lblNewLabel_3;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoHome frame = new DoHome();
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
	public DoHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 840, 535);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	        

	        JLabel lblNewLabel_2 = new JLabel("username :");
	        lblNewLabel_2.setForeground(new Color(255, 255, 255));
	        lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
	        lblNewLabel_2.setBounds(486, 353, 150, 29);
	        contentPane.add(lblNewLabel_2);


	        JButton btnNewButton = new JButton("Search");
	        btnNewButton.setForeground(new Color(0, 0, 0));
	        btnNewButton.setBackground(new Color(153, 0, 102));
	        btnNewButton.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 30));
	        btnNewButton.setBounds(573, 496, 443, 71);
	        contentPane.add(btnNewButton);
	        
	        JLabel lblNewLabel_2_1 = new JLabel("Email :");
	        lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
	        lblNewLabel_2_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
	        lblNewLabel_2_1.setBounds(522, 412, 110, 29);
	        contentPane.add(lblNewLabel_2_1);
	       
	        
	        
	        textField = new JTextField();
	        textField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
	        textField.setBounds(614, 353, 278, 25);
	        contentPane.add(textField);
	        textField.setColumns(10);
	        
	        textField_1 = new JTextField();
	        textField_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
	        textField_1.setColumns(10);
	        textField_1.setBounds(614, 412, 278, 25);
	        contentPane.add(textField_1);
	        
	        
	        
	        
	        table_1 =  new JTable();
	        table_1.setForeground(Color.WHITE);
	        table_1.setBackground(Color.BLACK);
	        table_1.setBounds(510, 606, 547, 149);
	        contentPane.add(table_1);
	        
	        
	        tableModel = new DefaultTableModel();
	        tableModel.addColumn("Username");
	        tableModel.addColumn("Email");
	        tableModel.addColumn("Specialization");
	        tableModel.addColumn("Tel");
	        tableModel.addColumn("Gender");
	        table_1.setModel(tableModel);
	        
	        JLabel lblNewLabel_1 = new JLabel("Back");
	        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        lblNewLabel_1.setBounds(10, 10, 45, 13);
	        contentPane.add(lblNewLabel_1);
	        
	        JScrollPane scrollPane = new JScrollPane();
	        scrollPane.setBounds(510, 577, 547, 29);
	        contentPane.add(scrollPane);
	        
	        table_2 = new JTable();
	        scrollPane.setViewportView(table_2);
	        table_2.setModel(new DefaultTableModel(
	        	new Object[][] {
	        	},
	        	new String[] {
	        		"username", "Email", "Specialization", "Telephone", "Gender"
	        	}
	        ));
	        
	        lblNewLabel = new JLabel("SUWA ARANA ");
	        lblNewLabel.setForeground(Color.RED);
	        lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
	        lblNewLabel.setBounds(207, 20, 707, 101);
	        contentPane.add(lblNewLabel);
	        
	        lblHospitals = new JLabel("HOSPITALS");
	        lblHospitals.setForeground(Color.BLACK);
	        lblHospitals.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
	        lblHospitals.setBackground(Color.WHITE);
	        lblHospitals.setBounds(636, 115, 647, 87);
	        contentPane.add(lblHospitals);
	        
	        lblNewLabel_5 = new JLabel("");
	        lblNewLabel_5.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Icons-Land-Vista-People-Medical-Nurse-Male-Dark.48.png"));
	        lblNewLabel_5.setBounds(902, 337, 39, 56);
	        contentPane.add(lblNewLabel_5);
	        
	        lblNewLabel_3 = new JLabel("Doctor Information");
	        lblNewLabel_3.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 50));
	        lblNewLabel_3.setBounds(482, 211, 627, 87);
	        contentPane.add(lblNewLabel_3);
	        
	        lblNewLabel_6 = new JLabel("");
	        lblNewLabel_6.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Wwalczyszyn-Android-Style-Mail.64.png"));
	        lblNewLabel_6.setBounds(898, 399, 64, 47);
	        contentPane.add(lblNewLabel_6);
	        
	        panel = new JPanel();
	        panel.setBackground(new Color(153, 0, 51));
	        panel.setBounds(614, 342, 347, 47);
	        contentPane.add(panel);
	        
	        panel_1 = new JPanel();
	        panel_1.setBackground(new Color(153, 0, 51));
	        panel_1.setBounds(615, 400, 347, 47);
	        contentPane.add(panel_1);
	        
	        lblNewLabel_4 = new JLabel("");
	        lblNewLabel_4.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\medical-banner-with-doctor-wearing-goggles.jpg"));
	        lblNewLabel_4.setBounds(-341, -257, 2161, 1333);
	        contentPane.add(lblNewLabel_4);
	        
	      
	       
	        
	        

	        


	        btnNewButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                searchDatabase();
	            }

	            private void searchDatabase() {
	                String searchTextUsername = textField.getText().trim();
	                String searchTextEmail = textField_1.getText().trim();

	                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "123456")) {
	                    String query = "SELECT * FROM doctor WHERE username LIKE ? OR Email LIKE ?";
	                    PreparedStatement stmt = connection.prepareStatement(query);
	                    stmt.setString(1, "%" + searchTextUsername + "%");
	                    stmt.setString(2, "%" + searchTextEmail + "%");
	                    ResultSet resultSet = stmt.executeQuery();

	                    // Clear existing table data
	                   
	                    while (resultSet.next()) {
	                        String username = resultSet.getString("username");
	                        String Email = resultSet.getString("Email");
	                        
	                        if (username.contains(searchTextUsername) && Email.contains(searchTextEmail)) {
	                            String Specialization = resultSet.getString("Specialization");
	                            String Tel = resultSet.getString("Tel");
	                            String Gender = resultSet.getString("Gender");


		                        // Add the retrieved data to the table model
		                     tableModel.addRow(new Object[]{username, Email, Specialization, Tel, Gender});
	                        
	                        }

	                    
	                    }
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        setTitle("Search Example");
	        setSize(1579, 882);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);
	        
	        lblNewLabel_1.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                // Create and display the registration form
	              Dinterface  adminlogForm = new Dinterface();
	                adminlogForm.setVisible(true);

	                // Close the login form
	                dispose();
	            }
	        });
	    }
}
