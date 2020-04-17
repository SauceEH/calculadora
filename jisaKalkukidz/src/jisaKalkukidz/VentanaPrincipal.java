package jisaKalkukidz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import jisaKalkukidz.Calculadora;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener{

	/**
	 * 
	 */
	
	
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnLogica;
	private JButton btnCalculadora;
	private JButton btnTriangulo;
	private JButton btnCirculo;
	private JButton btnCuadrado;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setTitle("KalkuKidz");
		setBackground(Color.PINK);
		setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 596);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(244, 164, 96));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JButton btnLogo = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.EAST, btnLogo, -10, SpringLayout.EAST, contentPane);
		btnLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnLogo, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnLogo, -399, SpringLayout.SOUTH, contentPane);
		btnLogo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/JISAKALKUKIDZ1.gif")));
		btnLogo.setBackground(Color.WHITE);
		contentPane.add(btnLogo);
		
		
		btnCalculadora = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnLogo, 44, SpringLayout.EAST, btnCalculadora);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCalculadora, 97, SpringLayout.NORTH, contentPane);
		btnCalculadora.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/operacioens1.gif")));
		btnCalculadora.setBackground(Color.WHITE);
		contentPane.add(btnCalculadora);
		btnCalculadora.addActionListener(this);
		
		btnCuadrado = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCuadrado, 186, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCuadrado, 10, SpringLayout.WEST, contentPane);
		btnCuadrado.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/cuadrado1.gif")));
		btnCuadrado.setBackground(Color.WHITE);
		contentPane.add(btnCuadrado);
		btnCuadrado.addActionListener(this);
		
		btnCirculo = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCirculo, 0, SpringLayout.NORTH, btnCuadrado);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCirculo, -268, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCirculo, -87, SpringLayout.EAST, btnLogo);
		btnCirculo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/circulo1.jpg")));
		contentPane.add(btnCirculo);
		btnCirculo.addActionListener(this);
		
		btnTriangulo = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCirculo, 6, SpringLayout.EAST, btnTriangulo);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnTriangulo, 118, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCuadrado, -6, SpringLayout.WEST, btnTriangulo);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnTriangulo, 186, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnTriangulo, -268, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCalculadora, 0, SpringLayout.WEST, btnTriangulo);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCalculadora, -6, SpringLayout.NORTH, btnTriangulo);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCalculadora, 0, SpringLayout.EAST, btnTriangulo);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnTriangulo, -205, SpringLayout.EAST, contentPane);
		btnTriangulo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/triangulo1.gif")));
		contentPane.add(btnTriangulo);
		btnTriangulo.addActionListener(this);
		
		btnLogica = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnLogica, 6, SpringLayout.SOUTH, btnTriangulo);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnLogica, 0, SpringLayout.WEST, btnTriangulo);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnLogica, 0, SpringLayout.EAST, btnCalculadora);
		btnLogica.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/logico.gif")));
		btnLogica.setBackground(Color.WHITE);
		contentPane.add(btnLogica);
		btnLogica.addActionListener(this);
		
		JLabel lblTexto = new JLabel("\u00BFQu\u00E9 operaci\u00F3n quieres hacer?");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnLogica, -86, SpringLayout.NORTH, lblTexto);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCuadrado, -185, SpringLayout.NORTH, lblTexto);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblTexto, -5, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblTexto, 464, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblTexto, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblTexto, -24, SpringLayout.SOUTH, contentPane);
		lblTexto.setFont(new Font("Maiandra GD", Font.PLAIN, 24));
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTexto);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// obtenemos que boton se ha pulsado
		Object o = ae.getSource();
		
		//comparamos para saber que boton se ha pulsado y abrir la ventana correspondiente
		
		if (o == btnCalculadora) // si se ha pulsado el boton de la calculadora aritmetica
		{	
			// creamos un nuevo Jframe de la clase Calculadora
			Calculadora cal = new Calculadora();
			// la mostramos
			cal.setVisible(true);
			cal.setResizable(false);
			// ocultamos la VentanaPrincipal
			this.setVisible(false); 
		}
		
		else if (o == btnCirculo)
		{
			Circulo cir = new Circulo();
			cir.setVisible(true);
			cir.setResizable(false);
			this.setVisible(false);
		}
		
		else if (o == btnTriangulo)
		{
			TrianguloIntermedio triInter = new TrianguloIntermedio();
			triInter.setVisible(true);
			triInter.setResizable(false);
			this.setVisible(false);
		}
		
		else if (o == btnCuadrado)
		{
			Cuadrado cuad = new Cuadrado();
			cuad.setVisible(true);
			cuad.setResizable(false);
			this.setVisible(false);
		}
		
		else if (o == btnLogica)
		{
			Logica log = new Logica();
			log.setVisible(true);
			log.setResizable(false);
			this.setVisible(false);
		}
	}
}
