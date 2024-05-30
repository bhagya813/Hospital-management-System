package hosLogin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.ImageIcon;

public class Pinterface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pinterface frame = new Pinterface();
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
	public Pinterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1544, 878);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JLabel lblNewLabel = new JLabel("SUVA ARANA");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(88, -23, 617, 151);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Nurses Information");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(204, 0, 0));
		btnNewButton.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(175, 296, 274, 244);
		contentPane.add(btnNewButton);
		
		JButton btnPatientInformation = new JButton("Doctor information");
		btnPatientInformation.setForeground(new Color(0, 0, 0));
		btnPatientInformation.setBackground(new Color(255, 0, 51));
		btnPatientInformation.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 20));
		btnPatientInformation.setBounds(825, 296, 274, 244);
		contentPane.add(btnPatientInformation);
		
		JLabel lblNewLabel_1 = new JLabel("Back");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 10, 54, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblHospitals = new JLabel("HOSPITALS");
		lblHospitals.setForeground(new Color(0, 0, 0));
		lblHospitals.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblHospitals.setBackground(Color.WHITE);
		lblHospitals.setBounds(650, 89, 647, 87);
		contentPane.add(lblHospitals);
		
		JLabel lblNewLabel_2 =  new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\various-pills-hand.jpg"));
		lblNewLabel_2.setBounds(0, 0, 2000, 1333);
		contentPane.add(lblNewLabel_2);
		

		btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
              Nuhome adminlogForm = new Nuhome();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		

		btnPatientInformation.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
              PaNHome adminlogForm = new PaNHome ();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		
		
	}
}
