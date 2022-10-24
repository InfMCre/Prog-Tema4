package tabla;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;

public class EjercicioTabla extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjercicioTabla frame = new EjercicioTabla();
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
	public EjercicioTabla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// pondremos 5 columnas
		String[] columnas = {
			"First Name",
            "Last Name",
            "Sport",
            "# of Years",
            "Vegetarian"
        };
		
		// un listado de personas con las 5 columnas
		Object[][] listado = {
		    {"Kathy", "Smith", "Snowboarding", 5, false},
		    {"John", "Doe", "Rowing", 3, true},
		    {"Sue", "Black", "Knitting", 2, false},
		    {"Jane", "White", "Speed reading", 20, true},
		    {"Joe", "Brown", "Pool", 10, false},
		    {"Kathy", "Smith", "Snowboarding", 5, false},
		    {"John", "Doe", "Rowing", 3, true},
		    {"Sue", "Black", "Knitting", 2, false},
		    {"Jane", "White", "Speed reading", 20, true},
		    {"Joe", "Brown", "Pool", 10, false},
		    // repetidos
		    {"Kathy", "Smith", "Snowboarding", 5, false},
		    {"John", "Doe", "Rowing", 3, true},
		    {"Sue", "Black", "Knitting", 2, false},
		    {"Jane", "White", "Speed reading", 20, true},
		    {"Joe", "Brown", "Pool", 10, false},
		    {"Kathy", "Smith", "Snowboarding", 5, false},
		    {"John", "Doe", "Rowing", 3, true},
		    {"Sue", "Black", "Knitting", 2, false},
		    {"Jane", "White", "Speed reading", 20, true},
		    {"Joe", "Brown", "Pool", 10, false},
		    {"Kathy", "Smith", "Snowboarding", 5, false},
		    {"John", "Doe", "Rowing", 3, true},
		    {"Sue", "Black", "Knitting", 2, false},
		    {"Jane", "White", "Speed reading", 20, true},
		    {"Joe", "Brown", "Pool", 10, false},
		    {"Kathy", "Smith", "Snowboarding", 5, false},
		    {"John", "Doe", "Rowing", 3, true},
		    {"Sue", "Black", "Knitting", 2, false},
		    {"Jane", "White", "Speed reading", 20, true},
		    {"Joe", "Brown", "Pool", 10, false},
		    {"Kathy", "Smith", "Snowboarding", 5, false},
		    {"John", "Doe", "Rowing", 3, true},
		    {"Sue", "Black", "Knitting", 2, false},
		    {"Jane", "White", "Speed reading", 20, true},
		    {"Joe", "Brown", "Pool", 10, false},
		    {"Kathy", "Smith", "Snowboarding", 5, false},
		    {"John", "Doe", "Rowing", 3, true},
		    {"Sue", "Black", "Knitting", 2, false},
		    {"Jane", "White", "Speed reading", 20, true},
		    {"Joe", "Brown", "Pool", 10, false}
		};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(5, 5, 424, 251);
		contentPane.add(scrollPane);
		
		table = new JTable(listado, columnas);
		scrollPane.setViewportView(table);
		
	}
}
