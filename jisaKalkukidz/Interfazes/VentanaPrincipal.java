package kalkukidz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kalkukidz.Calculadora;

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
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCalculadora, 81, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCalculadora, 96, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCalculadora, -227, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnLogo, 71, SpringLayout.EAST, btnCalculadora);
		btnCalculadora.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/operacioens1.gif")));
		btnCalculadora.setBackground(Color.WHITE);
		contentPane.add(btnCalculadora);
		btnCalculadora.addActionListener(this);
		
		btnCuadrado = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCuadrado, 202, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCuadrado, 21, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCalculadora, -28, SpringLayout.NORTH, btnCuadrado);
		btnCuadrado.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/cuadrado1.gif")));
		btnCuadrado.setBackground(Color.WHITE);
		contentPane.add(btnCuadrado);
		btnCuadrado.addActionListener(this);
		
		btnCirculo = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnCirculo, 202, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCirculo, 0, SpringLayout.SOUTH, btnCuadrado);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCirculo, -153, SpringLayout.EAST, contentPane);
		btnCirculo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/circulo1.jpg")));
		contentPane.add(btnCirculo);
		btnCirculo.addActionListener(this);
		
		btnTriangulo = new JButton("");
		sl_contentPane.putConstraint(SpringLayout.WEST, btnCirculo, 18, SpringLayout.EAST, btnTriangulo);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnCuadrado, -16, SpringLayout.WEST, btnTriangulo);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnTriangulo, -18, SpringLayout.EAST, btnCalculadora);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnTriangulo, 28, SpringLayout.SOUTH, btnCalculadora);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnTriangulo, 106, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnTriangulo, 0, SpringLayout.SOUTH, btnCuadrado);
		btnTriangulo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/triangulo1.gif")));
		contentPane.add(btnTriangulo);
		btnTriangulo.addActionListener(this);
		
		btnLogica = new JButton("Logica");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnLogica, 289, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnLogica, -227, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnLogica, 96, SpringLayout.WEST, contentPane);
		btnLogica.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/iconos/logico.gif")));
		btnLogica.setBackground(Color.WHITE);
		contentPane.add(btnLogica);
		btnLogica.addActionListener(this);
		
		JLabel lblTexto = new JLabel("\u00BFQu\u00E9 operaci\u00F3n quieres hacer?");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnLogica, -82, SpringLayout.NORTH, lblTexto);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnCuadrado, -203, SpringLayout.NORTH, lblTexto);
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
			// ocultamos la VentanaPrincipal
			this.setVisible(false); 
		}
		
		else if (o == btnCirculo)
		{
			Circulo cir = new Circulo();
			cir.setVisible(true);
			this.setVisible(false);
		}
		
		else if (o == btnTriangulo)
		{
			TrianguloIntermedio triInter = new TrianguloIntermedio();
			triInter.setVisible(true);
			this.setVisible(false);
		}
		
		else if (o == btnCuadrado)
		{
			Cuadrado cuad = new Cuadrado();
			cuad.setVisible(true);
			this.setVisible(false);
		}
		
		else if (o == btnLogica)
		{
			Logica log = new Logica();
			log.setVisible(true);
			this.setVisible(false);
		}
	}
}
