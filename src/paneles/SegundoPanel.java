package paneles;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class SegundoPanel extends JPanel {

	/**
	 * Create the panel.
	 * @param nombreUsuario
	 */
	public SegundoPanel(String nombreUsuario) {

		setLayout(null);
		
		// el contenido es dinamico ya que el nombre de usuario viene dado
		// en la creacion del panel
		JLabel lblNewLabel = new JLabel("Hola, " + nombreUsuario);
		lblNewLabel.setBounds(142, 118, 121, 14);
		add(lblNewLabel);
		
		JButton mostrarPanelinicialBtn = new JButton("Volver");
		mostrarPanelinicialBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// obtenemos el JFrame de la aplicacion (app) con las dos siguientes lineas
				Component component = (Component) e.getSource();
		        App app = (App) SwingUtilities.getRoot(component);
		        
		        // vamos a llamar a la funcion publica de cambiar al panel inicial
		        app.cambiarPanelAlPanelInicial();
		        
			}
		});
		mostrarPanelinicialBtn.setBounds(142, 223, 89, 23);
		add(mostrarPanelinicialBtn);
	}
	
}
