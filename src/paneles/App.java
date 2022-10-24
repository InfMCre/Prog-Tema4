package paneles;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class App extends JFrame {

	private Container contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = getContentPane();
		mostrarPanelAlEjecutarLaAplicacion();
	}

	/**
	 * Primera vez que mostramos un panel en el contenedor
	 */
	private void mostrarPanelAlEjecutarLaAplicacion() {
		contentPane.removeAll();
		PanelInicial panelInicial = new PanelInicial();
        contentPane.add(panelInicial);
        validate();
        setVisible(true);
	}
	
	
	/**
	 * Quita cualquier panel de la App y annade el segundo panel
	 * @param nombreUsuario
	 */
	public void cambiarPanelAlSegundoPanel(String nombreUsuario) {
		getContentPane().removeAll();
		getContentPane().invalidate();
		SegundoPanel segundoPanel = new SegundoPanel(nombreUsuario);
		getContentPane().add(segundoPanel);
		getContentPane().revalidate();
	}
	
	/**
	 * Quita cualquier panel de la App y annade el panel inicial
	 */
	public void cambiarPanelAlPanelInicial() {
		getContentPane().removeAll();
		getContentPane().invalidate();
		PanelInicial panelInicial = new PanelInicial();
		getContentPane().add(panelInicial);
		getContentPane().revalidate();
	}
}
