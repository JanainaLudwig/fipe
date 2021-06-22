package br.edu.utfpr.dv.fipe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MainWindow {

	private JFrame frmTabelaFipe;
	private JComboBox<Marca> comboMarca;
	private JComboBox<Modelo> comboModelo;
	private JComboBox<Ano> comboAno;
	private JLabel labelValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frmTabelaFipe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTabelaFipe = new JFrame();
		frmTabelaFipe.setTitle("Tabela Fipe");
		frmTabelaFipe.setResizable(false);
		frmTabelaFipe.setBounds(100, 100, 450, 300);
		frmTabelaFipe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTabelaFipe.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblMarca = new JLabel("Marca:");
		frmTabelaFipe.getContentPane().add(lblMarca);
		
		comboMarca = new JComboBox<Marca>();
		comboMarca.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	if(comboMarca.getSelectedItem() != null) {
		    		carregarModelos((Marca)comboMarca.getSelectedItem());
		    	}
		    }
		});
		frmTabelaFipe.getContentPane().add(comboMarca);
		
		JLabel lblModelo = new JLabel("Modelo:");
		frmTabelaFipe.getContentPane().add(lblModelo);
		
		comboModelo = new JComboBox<Modelo>();
		comboModelo.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	if((comboMarca.getSelectedItem() != null) && (comboModelo.getSelectedItem() != null)) {
		    		carregarAnos((Marca)comboMarca.getSelectedItem(), (Modelo)comboModelo.getSelectedItem());
		    	}
		    }
		});
		frmTabelaFipe.getContentPane().add(comboModelo);
		
		JLabel lblAno = new JLabel("Ano:");
		frmTabelaFipe.getContentPane().add(lblAno);
		
		comboAno = new JComboBox<Ano>();
		comboAno.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	if((comboMarca.getSelectedItem() != null) && (comboModelo.getSelectedItem() != null) && (comboAno.getSelectedItem() != null)) {
		    		carregarValor((Marca)comboMarca.getSelectedItem(), (Modelo)comboModelo.getSelectedItem(), (Ano)comboAno.getSelectedItem());
		    	}
		    }
		});
		frmTabelaFipe.getContentPane().add(comboAno);
		
		JLabel lblValor = new JLabel("Valor:");
		frmTabelaFipe.getContentPane().add(lblValor);
		
		labelValor = new JLabel("");
		labelValor.setHorizontalAlignment(SwingConstants.CENTER);
		labelValor.setFont(new Font("Tahoma", Font.BOLD, 24));
		labelValor.setForeground(Color.RED);
		frmTabelaFipe.getContentPane().add(labelValor);
		
		this.carregarMarcas();
	}
	
	private String getContent(String url) {
		return "";
	}

	private void carregarMarcas() {
		
	}
	
	private void carregarModelos(Marca marca) {
		
	}
	
	private void carregarAnos(Marca marca, Modelo modelo) {
		
	}
	
	private void carregarValor(Marca marca, Modelo modelo, Ano ano) {
		
	}
}
