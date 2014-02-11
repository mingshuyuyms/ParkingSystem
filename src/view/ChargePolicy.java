package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JOptionPane;

import control.Sytem;

public class ChargePolicy extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form ChargePolicy */
	public ChargePolicy() {
		initComponents();
	}

	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		fee2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		fee4 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		fee8 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		fee12 = new javax.swing.JTextField();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		fee24 = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 14));
		jLabel1.setText("Charge Policy");

		jLabel2.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jLabel2.setText("2  hours");
		

		jLabel3.setText("pouds");

		jLabel4.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jLabel4.setText("4  hours");

		jLabel5.setText("pouds");

		jLabel6.setText("pouds");

		jLabel7.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jLabel7.setText("8  hours");

		jLabel8.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jLabel8.setText("12hours");

		jLabel9.setText("pouds");

		jLabel10.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jLabel10.setText("24hours");

		jLabel11.setText("pouds");
		
		fee2.setText("0.5");
		fee4.setText("1");
		fee8.setText("2");
		fee12.setText("3");
		fee24.setText("5");

		jButton1.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jButton1.setText("SAVE");
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saveChargePolicy();
				JOptionPane.showMessageDialog(null, "save success");
			}

			private void saveChargePolicy() {
				String fee2h = fee2.getText();
				String fee4h = fee4.getText();
				String fee8h = fee8.getText();
				String fee12h = fee12.getText();
				String fee24h = fee24.getText();
				if (!"".equals(fee2h)) {
					Sytem.fee2 = new BigDecimal(fee2h);
				}
				if (!"".equals(fee4h)) {
					Sytem.fee4 = new BigDecimal(fee4h);
				}
				if (!"".equals(fee8h)) {
					Sytem.fee8 = new BigDecimal(fee8h);
				}
				if (!"".equals(fee12h)) {
					Sytem.fee12 = new BigDecimal(fee12h);
				}
				if (!"".equals(fee24h)) {
					Sytem.fee24 = new BigDecimal(fee24h);
				}
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(64, 64,
																		64)
																.addComponent(
																		jLabel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		102,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(17, 17,
																		17)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel2)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addComponent(
																										fee2,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										75,
																										Short.MAX_VALUE)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		jLabel5))
																												.addGroup(
																														javax.swing.GroupLayout.Alignment.TRAILING,
																														layout.createSequentialGroup()
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		jLabel3))))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createSequentialGroup()
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jLabel7)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																.addComponent(
																																		fee8,
																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																		75,
																																		Short.MAX_VALUE))
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jLabel8)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																.addComponent(
																																		fee12,
																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																		76,
																																		Short.MAX_VALUE))
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		jLabel4)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																.addComponent(
																																		fee4,
																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																		75,
																																		Short.MAX_VALUE)))
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jLabel9)
																												.addComponent(
																														jLabel6)))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel10)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jButton1)
																												.addGroup(
																														layout.createSequentialGroup()
																																.addComponent(
																																		fee24,
																																		javax.swing.GroupLayout.DEFAULT_SIZE,
																																		76,
																																		Short.MAX_VALUE)
																																.addPreferredGap(
																																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																.addComponent(
																																		jLabel11)))))))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(jLabel3)
												.addComponent(
														fee2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														20,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel4)
												.addComponent(jLabel5)
												.addComponent(
														fee4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														20,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel6)
												.addComponent(jLabel7)
												.addComponent(
														fee8,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														20,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel8)
												.addComponent(
														fee12,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														20,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel9))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel10)
												.addComponent(
														fee24,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														20,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel11))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										14, Short.MAX_VALUE)
								.addComponent(jButton1).addContainerGap()));

		pack();
		setVisible(true);
	}// </editor-fold>

	// Variables declaration - do not modify
	public static ChargePolicy chargePolicy;
	private javax.swing.JTextField fee2;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JTextField fee4;
	private javax.swing.JTextField fee8;
	private javax.swing.JTextField fee12;
	private javax.swing.JTextField fee24;
	// End of variables declaration//GEN-END:variables

}