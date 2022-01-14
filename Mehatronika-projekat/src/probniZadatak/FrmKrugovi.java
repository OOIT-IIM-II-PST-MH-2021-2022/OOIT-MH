package probniZadatak;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometry.Circle;
import geometry.Point;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JScrollPane;
import java.awt.GridBagConstraints;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmKrugovi extends JFrame {

	private JPanel contentPane;
	private DefaultListModel<Circle> dlm = new DefaultListModel<Circle>();
	private JTextField txtKrugovaUListi;
	private static int brojac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmKrugovi frame = new FrmKrugovi();
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
	public FrmKrugovi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 450);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelNorth = new JPanel();
		contentPane.add(panelNorth, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Krugovi");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		panelNorth.add(lblNewLabel);
		
		JPanel panelSouth = new JPanel();
		contentPane.add(panelSouth, BorderLayout.SOUTH);
		
		txtKrugovaUListi = new JTextField();
		txtKrugovaUListi.setText("Krugova u listi: ");
		txtKrugovaUListi.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtKrugovaUListi.setEditable(false);
		panelSouth.add(txtKrugovaUListi);
		txtKrugovaUListi.setColumns(10);
		
		JLabel probnaLabela = new JLabel("Krugova u listi:");
		probnaLabela.setFont(new Font("Tahoma", Font.BOLD, 20));
		panelSouth.add(probnaLabela);
		
		JPanel panelCenter = new JPanel();
		contentPane.add(panelCenter, BorderLayout.CENTER);
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelCenter.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelCenter.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panelCenter.setLayout(gbl_panelCenter);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 22;
		gbc_scrollPane.gridheight = 12;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panelCenter.add(scrollPane, gbc_scrollPane);
		
		JList<Circle> list = new JList<Circle>();
		list.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == KeyEvent.VK_ENTER) {
					JOptionPane.showMessageDialog(null, "Površina odabranog kruga je: "
							+ (int)dlm.get(list.getSelectedIndex()).area()
							, "Rezultat", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		list.setModel(dlm);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				if(arg0.getButton() == MouseEvent.BUTTON3) {
					DlgKrug dlg = new DlgKrug();
					dlg.setVisible(true);
					if(!dlg.isChecked()) {
						Circle c1 = new Circle(new Point(-1,-1),Integer.parseInt(dlg.getTextField().getText()));
						dlm.addElement(c1);
						brojac++;
						/* Prvi način
						txtKrugovaUListi.setText("Krugova u listi: " + dlm.size());
						probnaLabela.setText("Krugova u listi: " + dlm.size());
						*/
						// Način sa promenljivom(statičkom)
						txtKrugovaUListi.setText("Krugova u listi: " + brojac);
						probnaLabela.setText("Krugova u listi: " + brojac);
						 
					}
				}
			}
		});
		list.setFont(new Font("Tahoma", Font.PLAIN, 18));
		list.setForeground(Color.WHITE);
		list.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(list);
	}
}
