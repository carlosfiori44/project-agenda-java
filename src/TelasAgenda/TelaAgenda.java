package TelasAgenda;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import agenda.Contato;
import arquivos.EscreverLerArquivos;


public class TelaAgenda extends JFrame {
	private JLabel jlNome, jlEndereco, jlTelefone, jlImage, jlImage1;//jl melhor para indentificar
	private JTextField jtfNome, jtfEndereco, jtfTelefone;//jtf melhor para indentificar
	private JButton jbCadastrar, jbStatus, jbAlterar, jbRemover, jbGravar;
	private JTextArea jtaMostrar;
	private ImageIcon image, image1;
	Color cor = new Color(80, 140, 190);
	Color cor1 = new Color(130, 100, 60);
	Color cor2 = new Color(30, 30, 170);
	Color fonte = new Color(100,228,228);
	Color jtfcolor = new Color(100, 100, 100);
	Font font = new Font("Arial Black", Font.ITALIC, 13);
	Font font1 = new Font("Unispace", Font.BOLD, 15);
	Font font2 = new Font("Century", Font.BOLD, 16);
	Font font3 = new Font("Century Schoolbook", Font.BOLD, 15);
	List<Contato> contato = new ArrayList<Contato>();
	EscreverLerArquivos arquivo = new EscreverLerArquivos("aluno.bin", contato);

	public TelaAgenda(String title) {
		super(title);
		contato = arquivo.lerArquivo();
		iniciarComponente();
		iniciarEventos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void iniciarComponente() {
		// TODO Auto-generated method stub
		setSize(700, 600);
		setLayout(null);//desativa o dimensionamento automático
		getContentPane().setBackground(cor);
		
		/**Criar objeto**/		
		image = new ImageIcon(getClass().getResource("/imagem/folha.png"));
		jlImage = new JLabel(image);
		
		image1 = new ImageIcon(getClass().getResource("/imagem/Carregandoaa.gif"));
		jlImage1 = new JLabel(image1);
		
		jlNome = new JLabel("Nome");
		jlNome.setFont(font1);
		jlNome.setForeground(Color.black);
		jtfNome = new JTextField();
		jtfNome.setForeground(fonte);
		jtfNome.setFont(font2);
		jtfNome.setBackground(jtfcolor);
		jtfNome.setBorder(BorderFactory.createLineBorder(cor2, 3));
		
		jlEndereco = new JLabel("Endereço");
		jlEndereco.setFont(font1);
		jlEndereco.setForeground(Color.black);
		jtfEndereco = new JTextField();
		jtfEndereco.setForeground(fonte);
		jtfEndereco.setFont(font2);
		jtfEndereco.setBackground(jtfcolor);
		jtfEndereco.setBorder(BorderFactory.createLineBorder(cor2, 3));

		jlTelefone = new JLabel("Telefone");
		jlTelefone.setFont(font1);
		jlTelefone.setForeground(Color.black);
		jtfTelefone = new JTextField();
		jtfTelefone.setForeground(fonte);
		jtfTelefone.setFont(font2);
		jtfTelefone.setBackground(jtfcolor);
		jtfTelefone.setBorder(BorderFactory.createLineBorder(cor2, 3));

		jbCadastrar = new JButton("Cadastro");
		jbCadastrar.setBackground(Color.black);
		jbCadastrar.setForeground(Color.yellow);
		jbCadastrar.setFont(font);
		jbCadastrar.setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
		
		jbStatus = new JButton("Atualizar");
		jbStatus.setBackground(Color.black);
		jbStatus.setForeground(Color.yellow);
		jbStatus.setFont(font);
		jbStatus.setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
		
		jbAlterar = new JButton("Alterar");
		jbAlterar.setBackground(Color.black);
		jbAlterar.setForeground(Color.yellow);
		jbAlterar.setFont(font);
		jbAlterar.setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
		
		jbRemover = new JButton("Remover");
		jbRemover.setBackground(Color.black);
		jbRemover.setForeground(Color.yellow);
		jbRemover.setFont(font);
		jbRemover.setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
		
		jbGravar = new JButton("Gravar");
		jbGravar.setBackground(Color.black);
		jbGravar.setForeground(Color.red);
		jbGravar.setFont(font);
		jbGravar.setBorder(BorderFactory.createLineBorder(Color.red, 1));

		jtaMostrar = new JTextArea();
		jtaMostrar.setBackground(cor1);
		jtaMostrar.setBorder(BorderFactory.createLineBorder(Color.black, 7));
		jtaMostrar.setFont(font3);
		jtaMostrar.setForeground(cor2);
		
		/**adicionar o componete na tela**/
		add(jlNome);
		add(jtfNome);

		add(jlEndereco);
		add(jtfEndereco);

		add(jlTelefone);
		add(jtfTelefone);

		add(jbCadastrar);
		add(jbStatus);
		add(jbAlterar);
		add(jbRemover);
		add(jbGravar);

		add(jtaMostrar);
		
		add(jlImage);
		add(jlImage1);

		/**dimensionamento do componete**/
		jlNome.setBounds(10, 20, 50, 20);
		jtfNome.setBounds(10, 40, 220, 20);

		jlEndereco.setBounds(10, 60, 100, 20);
		jtfEndereco.setBounds(10, 80, 220, 20);

		jlTelefone.setBounds(10, 100, 100, 20);
		jtfTelefone.setBounds(10, 120, 150, 20);

		jbCadastrar.setBounds(260, 40, 100, 20);
		jbStatus.setBounds(260, 80, 100, 20);
		jbAlterar.setBounds(370, 40, 100, 20);
		jbRemover.setBounds(370, 80, 100, 20);
		jbGravar.setBounds(370, 120, 100, 20);

		jtaMostrar.setBounds(10, 150, 400, 400);
		
		jlImage.setBounds(450, 250, 200, 200);
		jlImage1.setBounds(550, 60, 50, 50);
	}

	private void iniciarEventos() {
		jbCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jtaMostrar.setText("");
				jtaMostrar.setText("\tAgenda");
				if(!jtfEndereco.getText().isEmpty() && !jtfNome.getText().isEmpty() && !jtfTelefone.getText().isEmpty()) {
				contato.add(new Contato(jtfNome.getText(),
				jtfEndereco.getText(), jtfTelefone.getText()));
	
				jtfNome.setText("");
				jtfEndereco.setText("");
				jtfTelefone.setText("");
				int indice = 1;
				for (Contato contato2 : contato) {
					jtaMostrar.append("\n"+indice+"°\nNome: "+contato2.getNome()+"\nEndereço: "+
							contato2.getEndereco()+"\nTelefone: "+contato2.getTelefone());
					indice++;
					}
				} else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Agenda", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		jbStatus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrar.setText("");
				jtaMostrar.setText("\tAgenda");
				int indice = 1;
				for (Contato contato2 : contato) {
					jtaMostrar.append("\n"+indice+"°\nNome: "+contato2.getNome()+"\nEndereço: "+
							contato2.getEndereco()+"\nTelefone: "+contato2.getTelefone());
					indice++;
				}
			}
		});

		jbAlterar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!contato.isEmpty()) {
				if(!jtfEndereco.getText().isEmpty() && !jtfNome.getText().isEmpty() && !jtfTelefone.getText().isEmpty()) {		
					try {
					int indice = Integer.parseInt(JOptionPane.showInputDialog("Entre com o índice: "));
					contato.get(indice-1).setNome(jtfNome.getText());
					contato.get(indice-1).setEndereco(jtfEndereco.getText());
					contato.get(indice-1).setTelefone(jtfTelefone.getText());
					jtfNome.setText("");
					jtfEndereco.setText("");
					jtfTelefone.setText("");
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "No índice, entre somente com números!",
							null, JOptionPane.ERROR_MESSAGE);
				}	
				} else {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Agenda", JOptionPane.ERROR_MESSAGE);
				}
				}else {
					JOptionPane.showMessageDialog(null, "Sua Agenda está vazia!", "Agenda", JOptionPane.ERROR_MESSAGE);
				}
			}
			});

		jbRemover.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!contato.isEmpty()) {
				try {
				int index = Integer.parseInt(JOptionPane.showInputDialog("Entre com o índice: "));
				contato.remove(index-1);
				jtaMostrar.setText("");
				jtaMostrar.setText("\tAgenda");
				int indice = 1;
				for (Contato contato2 : contato) {
					jtaMostrar.append("\n"+indice+"°\nNome: "+contato2.getNome()+"\nEndereço: "+
							contato2.getEndereco()+"\nTelefone: "+contato2.getTelefone());
					indice++;
				}
				} catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "No índice, entre somente com números!",
							null, JOptionPane.ERROR_MESSAGE);
				}
				}else {
					JOptionPane.showMessageDialog(null, "Sua Agenda está vazia!",
							null, JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		jbGravar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				arquivo.escreverArquivo();
			}
		});
	}
}