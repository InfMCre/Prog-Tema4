import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	private JTextField inputNombre;
	private JTextField inputTelefono;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton addContactoButton = new JButton("Boton123");
		addContactoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				addContacto(inputNombre.getText(), inputTelefono.getText());
			}
		});
		addContactoButton.setBounds(177, 212, 89, 23);
		contentPane.add(addContactoButton);
		
		inputNombre = new JTextField();
		inputNombre.setBounds(51, 69, 86, 20);
		contentPane.add(inputNombre);
		inputNombre.setColumns(10);
		
		JLabel labelNombre = new JLabel("Nombre");
		labelNombre.setBounds(51, 55, 86, 14);
		contentPane.add(labelNombre);
		
		inputTelefono = new JTextField();
		inputTelefono.setBounds(249, 69, 86, 20);
		contentPane.add(inputTelefono);
		inputTelefono.setColumns(10);
		
		JLabel labelTelefono = new JLabel("Teléfono");
		labelTelefono.setBounds(249, 55, 89, 14);
		contentPane.add(labelTelefono);
	}
	
	private static void addContacto(String nombre, String telefono) {
		System.out.println("aqui se añade el contacto");
		System.out.println(nombre);
		System.out.println(telefono);
	}

}
