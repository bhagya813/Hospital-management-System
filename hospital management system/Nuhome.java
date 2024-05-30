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
import java.sql.SQLException;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Nuhome extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField searchField;
    private DefaultTableModel tableModel;
    private JTextField textField;
    private JTable table;
	protected int ResultSet;
	private JTable table_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Nuhome frame = new Nuhome();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Nuhome() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 840, 535);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("SUAVA SEVANA");
        lblNewLabel.setForeground(Color.RED);
        lblNewLabel.setBackground(Color.WHITE);
        lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
        lblNewLabel.setBounds(185, -12, 788, 123);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_2 = new JLabel("username :");
        lblNewLabel_2.setForeground(new Color(0, 0, 0));
        lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
        lblNewLabel_2.setBounds(466, 261, 196, 29);
        contentPane.add(lblNewLabel_2);

        searchField = new JTextField();
        searchField.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
        searchField.setBounds(666, 270, 289, 29);
        contentPane.add(searchField);
        searchField.setColumns(10);

        JButton btnNewButton = new JButton("Search");
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(51, 0, 102));
        btnNewButton.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 30));
        btnNewButton.setBounds(597, 413, 520, 79);
        contentPane.add(btnNewButton);
        
        JLabel lblNewLabel_2_1 = new JLabel("Email :");
        lblNewLabel_2_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_2_1.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
        lblNewLabel_2_1.setBounds(535, 333, 143, 29);
        contentPane.add(lblNewLabel_2_1);
        
        textField = new JTextField();
        textField.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
        textField.setColumns(10);
        textField.setBounds(666, 340, 289, 29);
        contentPane.add(textField);

        // Initialize table model
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Username");
        tableModel.addColumn("Email");
        tableModel.addColumn("Gender");
        tableModel.addColumn("Nic");
        

        

        
        table = new JTable();
        table.setForeground(Color.WHITE);
        table.setBackground(Color.BLACK);
        table.setModel(tableModel);
        table.setBounds(597, 583, 568, 129);
        contentPane.add(table);
        
        JLabel lblNewLabel_1 = new JLabel("Back");
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(10, 10, 70, 19);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_4 = new JLabel("Nurses information");
        lblNewLabel_4.setForeground(new Color(255, 255, 255));
        lblNewLabel_4.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 45));
        lblNewLabel_4.setBounds(597, 183, 537, 46);
        contentPane.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("HOSPITALS");
        lblNewLabel_5.setForeground(new Color(51, 204, 255));
        lblNewLabel_5.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
        lblNewLabel_5.setBackground(Color.WHITE);
        lblNewLabel_5.setBounds(712, 76, 788, 123);
        contentPane.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Icons-Land-Vista-People-Medical-Nurse-Male-Dark.48.png"));
        lblNewLabel_6.setBounds(972, 239, 98, 89);
        contentPane.add(lblNewLabel_6);
        
        JLabel lblNewLabel_6_1 = new JLabel("");
        lblNewLabel_6_1.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\Wwalczyszyn-Android-Style-Mail.64.png"));
        lblNewLabel_6_1.setBounds(954, 320, 81, 59);
        contentPane.add(lblNewLabel_6_1);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(51, 51, 255));
        panel.setBounds(666, 261, 349, 51);
        contentPane.add(panel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(0, 51, 255));
        panel_1.setBounds(666, 327, 349, 52);
        contentPane.add(panel_1);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(597, 563, 568, 19);
        contentPane.add(scrollPane);
        
        table_1 = new JTable();
        scrollPane.setViewportView(table_1);
        table_1.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"username", "Email", "Gender", "Nic"
        	}
        ));
        
        
        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\grandfather-with-wheelchair-assisted-by-nurse-outdoor-senior-man-young-caregiver-park.jpg"));
        lblNewLabel_3.setBounds(0, 0, 2000, 1333);
        contentPane.add(lblNewLabel_3);
        
       
        

        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchDatabase();
            }
            
            private void searchDatabase() {
            	String searchTextUsername = searchField.getText().trim();
                String searchTextEmail = textField.getText().trim();

                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "123456")) {
                    String query = "SELECT * FROM nurse WHERE username LIKE ? OR Email LIKE ?";
                    PreparedStatement stmt = connection.prepareStatement(query);
                    stmt.setString(1, "%" + searchTextUsername + "%");
                    stmt.setString(2, "%" + searchTextEmail + "%");
                    ResultSet resultSet = stmt.executeQuery();
                    
                    // Clear existing table data
                    tableModel.setRowCount(0);

                    while (resultSet.next()) {
                        String username = resultSet.getString("username");
                        String email = resultSet.getString("Email");
                     // Check if the result matches the search criteria
                        if (username.contains(searchTextUsername) && email.contains(searchTextEmail)) {
                            String gender = resultSet.getString("Gender");
                            String nic = resultSet.getString("Nic");
                            

                            // Add the retrieved data to the table model
                            tableModel.addRow(new Object[]{username, email, gender, nic});
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        });

        setTitle("Search Example");
        setSize(1493, 805);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        lblNewLabel_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
              Ninterface adminlogForm = new Ninterface();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
    }
}
