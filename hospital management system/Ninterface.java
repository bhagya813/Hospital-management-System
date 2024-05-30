package hosLogin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;

public class Ninterface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ninterface frame = new Ninterface();
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
	public Ninterface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1405, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Nurses Information");
		btnNewButton.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 0, 0)));
		btnNewButton.setBackground(new Color(255, 0, 153));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
		btnNewButton.setBounds(212, 326, 332, 180);
		contentPane.add(btnNewButton);
		
		JButton btnPatientInformation = new JButton("patient information");
		btnPatientInformation.setForeground(new Color(0, 0, 0));
		btnPatientInformation.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(0, 0, 0)));
		btnPatientInformation.setBackground(new Color(255, 0, 153));
		btnPatientInformation.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 25));
		btnPatientInformation.setBounds(1059, 326, 332, 180);
		contentPane.add(btnPatientInformation);
		
		JLabel lblNewLabel_1 = new JLabel("Back");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 10, 54, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_8 = new JLabel("HOSPITALS");
		lblNewLabel_8.setForeground(new Color(255, 51, 153));
		lblNewLabel_8.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel_8.setBounds(447, 79, 944, 89);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel = new JLabel("SUVA ARANA");
		lblNewLabel.setForeground(new Color(102, 255, 0));
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setBounds(103, 0, 944, 89);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("D:\\OOP project\\photos oop\\ill-male-patient-bed-talking-nurse.jpg"));
		lblNewLabel_2.setBounds(-336, -202, 1862, 1205);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
              Nuhome  adminlogForm = new Nuhome();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
              NHlog  adminlogForm = new NHlog();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
		
		btnPatientInformation.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Create and display the registration form
              PaNHome  adminlogForm = new PaNHome();
                adminlogForm.setVisible(true);

                // Close the login form
                dispose();
            }
        });
	}

}
