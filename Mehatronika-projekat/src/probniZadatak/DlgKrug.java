package probniZadatak;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgKrug extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private boolean check;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgKrug dialog = new DlgKrug();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgKrug() {
		setBounds(100, 100, 300, 220);
		setModal(true);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{65, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{30, 30, 28, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblPoluprecnik = new JLabel("Poluprečnik");
			GridBagConstraints gbc_lblPoluprecnik = new GridBagConstraints();
			gbc_lblPoluprecnik.anchor = GridBagConstraints.EAST;
			gbc_lblPoluprecnik.insets = new Insets(0, 0, 5, 5);
			gbc_lblPoluprecnik.gridx = 0;
			gbc_lblPoluprecnik.gridy = 0;
			contentPanel.add(lblPoluprecnik, gbc_lblPoluprecnik);
		}
		{
			textField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 0, 5, 0);
			gbc_textField.fill = GridBagConstraints.BOTH;
			gbc_textField.gridx = 1;
			gbc_textField.gridy = 0;
			contentPanel.add(textField, gbc_textField);
			textField.setColumns(10);
		}
		{
			JLabel lblIvica = new JLabel("Boja ivice");
			GridBagConstraints gbc_lblIvica = new GridBagConstraints();
			gbc_lblIvica.anchor = GridBagConstraints.EAST;
			gbc_lblIvica.insets = new Insets(0, 0, 5, 5);
			gbc_lblIvica.gridx = 0;
			gbc_lblIvica.gridy = 1;
			contentPanel.add(lblIvica, gbc_lblIvica);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Crvena", "Plava", "Zuta"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.insets = new Insets(0, 0, 5, 0);
			gbc_comboBox.fill = GridBagConstraints.BOTH;
			gbc_comboBox.gridx = 1;
			gbc_comboBox.gridy = 1;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JLabel lblUnutra = new JLabel("Boja unutrašnjosti");
			GridBagConstraints gbc_lblUnutra = new GridBagConstraints();
			gbc_lblUnutra.anchor = GridBagConstraints.EAST;
			gbc_lblUnutra.insets = new Insets(0, 0, 0, 5);
			gbc_lblUnutra.gridx = 0;
			gbc_lblUnutra.gridy = 2;
			contentPanel.add(lblUnutra, gbc_lblUnutra);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Crvena ", "Plava", "Zuta"}));
			GridBagConstraints gbc_comboBox = new GridBagConstraints();
			gbc_comboBox.fill = GridBagConstraints.BOTH;
			gbc_comboBox.gridx = 1;
			gbc_comboBox.gridy = 2;
			contentPanel.add(comboBox, gbc_comboBox);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {
							if(Integer.parseInt(textField.getText()) > 0) {
								dispose();
							}else {
								JOptionPane.showMessageDialog(null, "Radius mora biti pozitivan", "Greska", JOptionPane.ERROR_MESSAGE);
							}
						
						} catch (NumberFormatException e) {
							JOptionPane.showMessageDialog(null, "Radius mora biti pozitivna celobrojna vrednost", "Greska", JOptionPane.ERROR_MESSAGE);
						}
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						check = true;
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public JTextField getTextField() {
		return textField;
	}
	
	public boolean isChecked() {
		return check;
	}
}
