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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dinterface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dinterface frame = new Dinterface();
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
	public Dinterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1440, 1002);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Doctors Information");
		btnNewButton.setBackground(new Color(51, 204, 153));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(794, 295, 352, 153);
		contentPane.add(btnNewButton);
		
		JButton btnPatientInformation = new JButton("Patient information");
		btnPatientInformation.setBackground(new Color(51, 204, 153));
		btnPatientInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPatientInformation.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnPatientInformation.setBounds(248, 300, 352, 142);
		contentPane.add(btnPatientInformation);
		
		JLabel lblNewLabel_1 = new JLabel("Back");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 10, 54, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(-71, 664, 2000, 1478);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_5 = new JLabel("HOSPITALAS");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 80));
		lblNewLabel_5.setBounds(513, 95, 580, 79);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("SUVA ARANA ");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(187, 10, 656, 109);
		contentPane.add(lblNewLabel_3);
		
		JLabel picture = new JLabel("New label");
		picture.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\happy-doctor-holding-clipboard-with-patients.jpg"));
		picture.setBackground(new Color(64, 0, 64));
		picture.setBounds(0, -12, 2000, 1345);
		contentPane.add(picture);
		
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                DHlog adminlogForm = new  DHlog();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                DoHome adminlogForm = new  DoHome();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		btnPatientInformation.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
                PaHome adminlogForm = new  PaHome();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
	}

}
