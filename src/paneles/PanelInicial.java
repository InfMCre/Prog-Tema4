package paneles;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PanelInicial extends JPanel {
	private JTextField inputNombreUsuario;
	/**
	 * Create the panel.
	 */
	public PanelInicial() {

		setLayout(null);
		
		JLabel labelNombreUsuario = new JLabel("Introduce tu nombre de usuario");
		labelNombreUsuario.setBounds(142, 79, 181, 14);
		add(labelNombreUsuario);
		
		inputNombreUsuario = new JTextField();
		inputNombreUsuario.setBounds(145, 120, 147, 20);
		add(inputNombreUsuario);
		inputNombreUsuario.setColumns(10);
		
		JButton mostrarSegundoPanelBtn = new JButton("Acceder");
		mostrarSegundoPanelBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				// obtenemos el JFrame de la aplicacion (app) con las dos siguientes lineas
				Component component = (Component) e.getSource();
		        App app = (App) SwingUtilities.getRoot(component);
		        
		        // vamos a llamar a la funcion publica de cambiar al panel secundario
		        // pero antes obtenemos el texto del usuario para enviarselo al panel
		        String nombreUsuario = inputNombreUsuario.getText();
		        app.cambiarPanelAlSegundoPanel(nombreUsuario);
		        
			}
		});
		mostrarSegundoPanelBtn.setBounds(167, 208, 89, 23);
		add(mostrarSegundoPanelBtn);


	}

}
