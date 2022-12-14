package pacote;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class JFGameTst1 extends JFrame {
	/**/
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	int Jogador1, Jogador2;
	JButton btnPedra;
	JButton btnPapel;
	JButton btnTesoura;
	JButton btnLargato;
	JButton btnSpock;
	JLabel lblPedra;
	JLabel lblPapel;
	JLabel lblTesoura;
	JLabel lblLargato;
	JLabel lblSpock;
	JLabel lblEmpate;
	JLabel lblJogador1V;
	JLabel lblJogador2V;
	JLabel lblPedra2;
	JLabel lblPapel2;
	JLabel lblTesoura2;
	JLabel lblLargato2;
	JLabel lblSpock2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFGameTst1 frame = new JFGameTst1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JFGameTst1() {
		setResizable(false);
		setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\sackr\\OneDrive\\Documentos\\redes\\sheldonj2.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 376);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setForeground(new Color(255, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel titulogame = new JLabel("Pedra Papel Tesoura Largato Spock");
		titulogame.setForeground(new Color(255, 255, 255));
		titulogame.setHorizontalAlignment(SwingConstants.CENTER);
		titulogame.setFont(new Font("Verdana", Font.BOLD, 30));
		titulogame.setBounds(24, 39, 645, 55);
		contentPane.add(titulogame);

		// Buttons

		btnPedra = new JButton("");
		btnPedra.setIcon(new ImageIcon("C:\\Users\\sackr\\OneDrive\\Documentos\\redes\\pedraj1.png"));
		btnPedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jogador1 = 1;
				btnPedra.setVisible(false);
				btnPapel.setVisible(false);
				btnTesoura.setVisible(false);
				btnLargato.setVisible(false);
				btnSpock.setVisible(false);
				jogo();
				jogo2();
			}
		});
		btnPedra.setBounds(24, 172, 140, 120);
		contentPane.add(btnPedra);

		btnPapel = new JButton("");
		btnPapel.setIcon(new ImageIcon("C:\\Users\\sackr\\OneDrive\\Documentos\\redes\\papelj1.png"));
		btnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jogador1 = 2;
				btnPedra.setVisible(false);
				btnPapel.setVisible(false);
				btnTesoura.setVisible(false);
				btnLargato.setVisible(false);
				btnSpock.setVisible(false);
				jogo();
				jogo2();
			}
		});
		btnPapel.setBounds(174, 167, 110, 125);
		contentPane.add(btnPapel);

		btnTesoura = new JButton("");
		btnTesoura.setIcon(new ImageIcon("C:\\Users\\sackr\\OneDrive\\Documentos\\redes\\tesouraj1.png"));
		btnTesoura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jogador1 = 3;
				btnPedra.setVisible(false);
				btnPapel.setVisible(false);
				btnTesoura.setVisible(false);
				btnLargato.setVisible(false);
				btnSpock.setVisible(false);
				jogo();
				jogo2();
			}
		});
		btnTesoura.setBounds(294, 172, 140, 120);
		contentPane.add(btnTesoura);

		btnLargato = new JButton("");
		btnLargato.setIcon(new ImageIcon("C:\\Users\\sackr\\OneDrive\\Documentos\\redes\\largatoj1.png"));
		btnLargato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jogador1 = 4;
				btnPedra.setVisible(false);
				btnPapel.setVisible(false);
				btnTesoura.setVisible(false);
				btnLargato.setVisible(false);
				btnSpock.setVisible(false);
				jogo();
				jogo2();
			}
		});
		btnLargato.setBounds(444, 148, 100, 175);
		contentPane.add(btnLargato);

		btnSpock = new JButton("");
		btnSpock.setIcon(new ImageIcon("C:\\Users\\sackr\\OneDrive\\Documentos\\redes\\spockj1.png"));
		btnSpock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jogador1 = 5;
				btnPedra.setVisible(false);
				btnPapel.setVisible(false);
				btnTesoura.setVisible(false);
				btnLargato.setVisible(false);
				btnSpock.setVisible(false);
				jogo();
				jogo2();
			}
		});
		btnSpock.setBounds(554, 147, 115, 145);
		contentPane.add(btnSpock);

		// Labels

		lblPedra = new JLabel("");
		lblPedra.setIcon(new ImageIcon("C:\\Users\\sackr\\OneDrive\\Documentos\\redes\\pedraj1.png"));
		lblPedra.setBounds(175, 155, 135, 117);
		lblPedra.setVisible(false);
		contentPane.add(lblPedra);

		lblPedra2 = new JLabel("");
		lblPedra2.setIcon(new ImageIcon("C:\\Users\\sackr\\OneDrive\\Documentos\\redes\\pedraj1.png"));
		lblPedra2.setBounds(375, 155, 135, 117);
		lblPedra2.setVisible(false);
		contentPane.add(lblPedra2);

		lblPapel = new JLabel("");
		lblPapel.setIcon(new ImageIcon("C:\\Users\\sackr\\OneDrive\\Documentos\\redes\\papelj1.png"));
		lblPapel.setBounds(175, 155, 110, 125);
		lblPapel.setVisible(false);
		contentPane.add(lblPapel);

		lblPapel2 = new JLabel("");
		lblPapel2.setIcon(new ImageIcon("C:\\Users\\sackr\\OneDrive\\Documentos\\redes\\papelj1.png"));
		lblPapel2.setBounds(375, 155, 110, 125);
		lblPapel2.setVisible(false);
		contentPane.add(lblPapel2);

		lblTesoura = new JLabel("");
		lblTesoura.setIcon(new ImageIcon("C:\\Users\\sackr\\OneDrive\\Documentos\\redes\\tesouraj1.png"));
		lblTesoura.setBounds(175, 155, 140, 120);
		lblTesoura.setVisible(false);
		contentPane.add(lblTesoura);

		lblTesoura2 = new JLabel("");
		lblTesoura2.setIcon(new ImageIcon("C:\\Users\\sackr\\OneDrive\\Documentos\\redes\\tesouraj1.png"));
		lblTesoura2.setBounds(375, 155, 140, 120);
		lblTesoura2.setVisible(false);
		contentPane.add(lblTesoura2);

		lblLargato = new JLabel("");
		lblLargato.setIcon(new ImageIcon("C:\\Users\\sackr\\OneDrive\\Documentos\\redes\\largatoj1.png"));
		lblLargato.setBounds(175, 135, 100, 175);
		lblLargato.setVisible(false);
		contentPane.add(lblLargato);

		lblLargato2 = new JLabel("");
		lblLargato2.setIcon(new ImageIcon("C:\\Users\\sackr\\OneDrive\\Documentos\\redes\\largatoj1.png"));
		lblLargato2.setBounds(375, 135, 100, 175);
		lblLargato2.setVisible(false);
		contentPane.add(lblLargato2);

		lblSpock = new JLabel("");
		lblSpock.setIcon(new ImageIcon("C:\\Users\\sackr\\OneDrive\\Documentos\\redes\\spockj1.png"));
		lblSpock.setBounds(175, 155, 115, 145);
		lblSpock.setVisible(false);
		contentPane.add(lblSpock);

		lblSpock2 = new JLabel("");
		lblSpock2.setIcon(new ImageIcon("C:\\Users\\sackr\\OneDrive\\Documentos\\redes\\spockj1.png"));
		lblSpock2.setBounds(375, 155, 115, 145);
		lblSpock2.setVisible(false);
		contentPane.add(lblSpock2);

		// Labels de fim de jogo

		lblEmpate = new JLabel("Empate!");
		lblEmpate.setForeground(new Color(255, 255, 255));
		lblEmpate.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpate.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblEmpate.setBounds(265, 80, 170, 55);
		lblEmpate.setVisible(false);
		contentPane.add(lblEmpate);

		lblJogador1V = new JLabel("Jogador 1 Venceu!");
		lblJogador1V.setForeground(new Color(255, 255, 255));
		lblJogador1V.setHorizontalAlignment(SwingConstants.CENTER);
		lblJogador1V.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblJogador1V.setBounds(135, 80, 410, 55);
		lblJogador1V.setVisible(false);
		contentPane.add(lblJogador1V);

		lblJogador2V = new JLabel("Jogador 2 Venceu!");
		lblJogador2V.setForeground(new Color(255, 255, 255));
		lblJogador2V.setHorizontalAlignment(SwingConstants.CENTER);
		lblJogador2V.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblJogador2V.setBounds(135, 80, 410, 55);
		lblJogador2V.setVisible(false);
		contentPane.add(lblJogador2V);
	}
	
	// Métodos switch para escolha do jogador
	
	private void jogo() {
		switch (Jogador1) {
		case 1:
			System.out.println("Pedra!");
			lblPedra.setVisible(true);
			break;
		case 2:
			System.out.println("Papel!");
			lblPapel.setVisible(true);
			break;
		case 3:
			System.out.println("Tesoura!");
			lblTesoura.setVisible(true);
			break;
		case 4:
			System.out.println("Largato!");
			lblLargato.setVisible(true);
			break;
		case 5:
			System.out.println("Spock!");
			lblSpock.setVisible(true);
			break;
		}
		
	}

	private void jogo2() {
		int Jogador2 = (int) (Math.random() * 5 + 1);
		switch (Jogador2) {
		case 1:
			System.out.println("Pedra!");
			lblPedra2.setVisible(true);
			break;
		case 2:
			System.out.println("Papel!");
			lblPapel2.setVisible(true);
			break;
		case 3:
			System.out.println("Tesoura!");
			lblTesoura2.setVisible(true);
			break;
		case 4:
			System.out.println("Largato!");
			lblLargato2.setVisible(true);
			break;
		case 5:
			System.out.println("Spock!");
			lblSpock2.setVisible(true);
			break;
		}
		
		// Lógica do jogo
		
		if (Jogador1 == Jogador2) {
			System.out.println(" ");
			lblEmpate.setVisible(true);
		} else {
			if ((Jogador1 == 1 && (Jogador2 == 3 || Jogador2 == 4))||
				(Jogador1 == 2 && (Jogador2 == 1 || Jogador2 == 5))||
				(Jogador1 == 3 && (Jogador2 == 2 || Jogador2 == 4))||
				(Jogador1 == 4 && (Jogador2 == 2 || Jogador2 == 5))||
				(Jogador1 == 5 && (Jogador2 == 1 || Jogador2 == 3))){
				System.out.println("Jogador 1 Venceu!");
				lblJogador1V.setVisible(true);
			} else {
				System.out.println("Jogador 2 venceu!");
				lblJogador2V.setVisible(true);
			}
		}
	}
}
