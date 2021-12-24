package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgDodavanjeBoje extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldOne;
	private JTextField textFieldTwo;
	private JTextField textFieldThree;
	private int one,two,three;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgDodavanjeBoje dialog = new DlgDodavanjeBoje();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgDodavanjeBoje() {
		setTitle("Dodavanje boje");
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{100, 94, 96, 0};
		gbl_contentPanel.rowHeights = new int[]{19, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblOne = new JLabel("Prvi broj");
			GridBagConstraints gbc_lblOne = new GridBagConstraints();
			gbc_lblOne.insets = new Insets(0, 0, 5, 5);
			gbc_lblOne.gridx = 1;
			gbc_lblOne.gridy = 1;
			contentPanel.add(lblOne, gbc_lblOne);
		}
		{
			textFieldOne = new JTextField();
			textFieldOne.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(c < '0' || c > '9' || c == KeyEvent.VK_SPACE) {
						e.consume();
					}
				}
			});
			GridBagConstraints gbc_textFieldOne = new GridBagConstraints();
			gbc_textFieldOne.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldOne.anchor = GridBagConstraints.NORTHWEST;
			gbc_textFieldOne.gridx = 2;
			gbc_textFieldOne.gridy = 1;
			contentPanel.add(textFieldOne, gbc_textFieldOne);
			textFieldOne.setColumns(10);
		}
		{
			JLabel lblTwo = new JLabel("Broj dva");
			GridBagConstraints gbc_lblTwo = new GridBagConstraints();
			gbc_lblTwo.insets = new Insets(0, 0, 5, 5);
			gbc_lblTwo.gridx = 1;
			gbc_lblTwo.gridy = 2;
			contentPanel.add(lblTwo, gbc_lblTwo);
		}
		{
			textFieldTwo = new JTextField();
			textFieldTwo.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(c < '0' || c > '9' || c == KeyEvent.VK_SPACE) {
						e.consume();
					}
				}
			});
			GridBagConstraints gbc_textFieldTwo = new GridBagConstraints();
			gbc_textFieldTwo.insets = new Insets(0, 0, 5, 0);
			gbc_textFieldTwo.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldTwo.gridx = 2;
			gbc_textFieldTwo.gridy = 2;
			contentPanel.add(textFieldTwo, gbc_textFieldTwo);
			textFieldTwo.setColumns(10);
		}
		{
			JLabel lblThree = new JLabel("Treci broj");
			GridBagConstraints gbc_lblThree = new GridBagConstraints();
			gbc_lblThree.insets = new Insets(0, 0, 0, 5);
			gbc_lblThree.gridx = 1;
			gbc_lblThree.gridy = 3;
			contentPanel.add(lblThree, gbc_lblThree);
		}
		{
			textFieldThree = new JTextField();
			textFieldThree.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char c = e.getKeyChar();
					if(c < '0' || c > '9' || c == KeyEvent.VK_SPACE) {
						e.consume();
					}
				}
			});
			GridBagConstraints gbc_textFieldThree = new GridBagConstraints();
			gbc_textFieldThree.fill = GridBagConstraints.HORIZONTAL;
			gbc_textFieldThree.gridx = 2;
			gbc_textFieldThree.gridy = 3;
			contentPanel.add(textFieldThree, gbc_textFieldThree);
			textFieldThree.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							one = Integer.parseInt(textFieldOne.getText());
							two = Integer.parseInt(textFieldTwo.getText());
							three = Integer.parseInt(textFieldThree.getText());
						} catch (Exception e2) {
							JOptionPane.showMessageDialog(null, "Input must not be empty", "Incorrect input", JOptionPane.ERROR_MESSAGE);
						}
						/*one = Integer.parseInt(textFieldOne.getText());
						two = Integer.parseInt(textFieldTwo.getText());
						three = Integer.parseInt(textFieldThree.getText());*/
						if(one > 0 && one <=255 &&
							two > 0 && two <=255 &&
							three > 0 && three <=255) {
							dispose();
						}else {
							JOptionPane.showMessageDialog(null, "Input has to be between 0 and 255", "Wrong number", JOptionPane.ERROR_MESSAGE);
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
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	
	public JTextField getTextFieldOne() {
		return textFieldOne;
	}

	public JTextField getTextFieldTwo() {
		return textFieldTwo;
	}

	public JTextField getTextFieldThree() {
		return textFieldThree;
	}

	public int getOne() {
		return one;
	}

	public int getTwo() {
		return two;
	}

	public int getThree() {
		return three;
	}
	

}
