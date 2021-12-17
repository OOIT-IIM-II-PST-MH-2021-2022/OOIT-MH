package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import javax.swing.JToggleButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class TestFrame extends JFrame {

	private JPanel contentPane;
	private DefaultListModel<String> dlm = new DefaultListModel<String>();
	private ButtonGroup group = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrame frame = new TestFrame();
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
	public TestFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		JButton btnAntristres = new JButton("Antistres dugme");
		btnAntristres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Antistres dugme :)", "Vas stres je nestao",JOptionPane.ERROR_MESSAGE);
			}
		});
		btnAntristres.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panelSouth.add(btnAntristres);
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[]{85, 84, 0, 0};
		gbl_panelCenter.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panelCenter.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelCenter.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelCenter.setLayout(gbl_panelCenter);
		
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		JLabel lblPlavo = new JLabel("Plavo");
		lblPlavo.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblPlavo = new GridBagConstraints();
		gbc_lblPlavo.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlavo.gridx = 1;
		gbc_lblPlavo.gridy = 0;
		panelCenter.add(lblPlavo, gbc_lblPlavo);
		
		JToggleButton btnPlavo = new JToggleButton("Plavo");
		btnPlavo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.add(0, lblPlavo.getText());
				panelCenter.setBackground(Color.BLUE);
				panelNorth.setBackground(Color.BLUE);
				panelSouth.setBackground(Color.BLUE);
			}
		});
		GridBagConstraints gbc_btnPlavo = new GridBagConstraints();
		gbc_btnPlavo.fill = GridBagConstraints.BOTH;
		gbc_btnPlavo.insets = new Insets(0, 0, 5, 5);
		gbc_btnPlavo.gridx = 0;
		gbc_btnPlavo.gridy = 0;
		panelCenter.add(btnPlavo, gbc_btnPlavo);
		group.add(btnPlavo);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridheight = 3;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 2;
		gbc_scrollPane.gridy = 0;
		panelCenter.add(scrollPane, gbc_scrollPane);
		
		JList<String> list = new JList<String>();
		scrollPane.setViewportView(list);
		list.setModel(dlm);
		
		JLabel lblCrveno = new JLabel("Crveno");
		lblCrveno.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblCrveno = new GridBagConstraints();
		gbc_lblCrveno.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrveno.gridx = 1;
		gbc_lblCrveno.gridy = 1;
		panelCenter.add(lblCrveno, gbc_lblCrveno);
		
		JToggleButton btnCrveno = new JToggleButton("Crveno");
		btnCrveno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dlm.add(0, lblCrveno.getText());
				panelCenter.setBackground(Color.RED);
				panelNorth.setBackground(Color.RED);
				panelSouth.setBackground(Color.RED);
			}
		});
		GridBagConstraints gbc_btnCrveno = new GridBagConstraints();
		gbc_btnCrveno.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCrveno.insets = new Insets(0, 0, 5, 5);
		gbc_btnCrveno.gridx = 0;
		gbc_btnCrveno.gridy = 1;
		panelCenter.add(btnCrveno, gbc_btnCrveno);
		group.add(btnCrveno);
		
		JLabel lblZuto = new JLabel("Zuto");
		lblZuto.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblZuto = new GridBagConstraints();
		gbc_lblZuto.insets = new Insets(0, 0, 0, 5);
		gbc_lblZuto.gridx = 1;
		gbc_lblZuto.gridy = 2;
		panelCenter.add(lblZuto, gbc_lblZuto);
		
		
		JToggleButton btnZuto = new JToggleButton("Zuto");
		btnZuto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dlm.add(0, lblZuto.getText());
				panelCenter.setBackground(Color.YELLOW);
				panelNorth.setBackground(Color.YELLOW);
				panelSouth.setBackground(Color.YELLOW);
			}
		});
		GridBagConstraints gbc_btnZuto = new GridBagConstraints();
		gbc_btnZuto.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnZuto.insets = new Insets(0, 0, 0, 5);
		gbc_btnZuto.gridx = 0;
		gbc_btnZuto.gridy = 2;
		panelCenter.add(btnZuto, gbc_btnZuto);
		group.add(btnZuto);
		
		
		
		
		JLabel lblNaslov = new JLabel("NASLOV");
		lblNaslov.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panelNorth.add(lblNaslov);
	}

}
