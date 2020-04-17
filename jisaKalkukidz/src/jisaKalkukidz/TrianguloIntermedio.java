package jisaKalkukidz;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TrianguloIntermedio extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnArea;
	private JButton btnPerimetro;
	private JLabel lblPantalla; 
	private JButton btnVolver;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrianguloIntermedio frame = new TrianguloIntermedio();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TrianguloIntermedio() {
		setTitle("Triangulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(244, 164, 96));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Aparecera una etiqueta con un mensaje por la pantalla
		lblPantalla = new JLabel("\u00BFQue quieres hacer?");
		lblPantalla.setForeground(Color.WHITE);
		lblPantalla.setFont(new Font("Calibri", Font.BOLD, 35));
		lblPantalla.setBounds(68, 89, 307, 65);
		contentPane.add(lblPantalla);
		
		//Boton de Area
		//Al seleccionarlo nos mandara a otra pantalla para hacer las operaciones necesarias
		btnArea = new JButton("AREA");
		btnArea.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnArea.addActionListener(this);
		btnArea.setBounds(25, 246, 176, 71);
		btnArea.setBackground(new Color(255, 204, 102));
		contentPane.add(btnArea);
		
		//Boton de Perimetro
		//Como el boton de Area, este al seleccionarlo nos mandara a otra pantalla para hacer las operaciones necesarias
		btnPerimetro = new JButton("PERIMETRO");
		btnPerimetro.addActionListener(this);
		btnPerimetro.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPerimetro.setBounds(228, 246, 168, 71);
		btnPerimetro.setBackground(new Color(255, 204, 102));
		contentPane.add(btnPerimetro);
		
		btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(this);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVolver.setBackground(new Color(0, 128, 128));
		btnVolver.setBounds(81, 441, 262, 48);
		contentPane.add(btnVolver);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		
		// acciones a realizar en botones que tengan ActionListener con "this"
		
				// obtenemos que boton ha sido pulsado
				Object o = ae.getSource();
				
				if (o == btnArea)
				{
					// creamos un nuevo Jframe de la clase TrianguloArea
					TrianguloArea TriArea = new TrianguloArea();
					// la mostramos
					TriArea.setVisible(true);
					TriArea.setResizable(false);
					// ocultamos la Calculadora
					this.setVisible(false); 
				}
				
				else if (o == btnPerimetro)
				{
					// creamos un nuevo Jframe de la clase TrianguloPerimetro
					TrianguloPerimetro TriPer = new TrianguloPerimetro();
					// la mostramos
					TriPer.setVisible(true);
					TriPer.setResizable(false);
					// ocultamos esta ventana
					this.setVisible(false); 
				}
				
				else if (o == btnVolver)
				{
					// creamos un nuevo Jframe de la clase VentanaPrincipal
					VentanaPrincipal vp = new VentanaPrincipal();
					// la mostramos
					vp.setVisible(true);
					vp.setResizable(false);
					// ocultamos esta ventana
					this.setVisible(false); 
				}
	}
}
