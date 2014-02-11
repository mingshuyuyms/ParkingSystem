package view;

public class Help extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form Help */
	public Help() {
		initComponents();
	}

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 14));
		jLabel1.setText("USER GUID");

		jLabel2.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jLabel2.setText("STAFF :");

		jLabel3.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jLabel3.setText("1. SCAN CAMPUS CARD AT ENTRANCE");

		jLabel4.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jLabel4.setText("2. SCAN CAMPUS CARD AT EXIT");

		jLabel5.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jLabel5.setText("PUBLIC :");

		jLabel6.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jLabel6.setText("1. GET TICKET AT ENTRANCE");

		jLabel7.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jLabel7.setText("2. PAY AND GET EXIT TICKET AT PAYMENTSTATION");

		jLabel8.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jLabel8.setText("3. SCAN EXIT TICKET AT EXIT");

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
																.addContainerGap()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(10,
																										10,
																										10)
																								.addComponent(
																										jLabel3,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										321,
																										Short.MAX_VALUE))
																				.addComponent(
																						jLabel2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						51,
																						javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGap(22, 22,
																		22)
																.addComponent(
																		jLabel4,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		321,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		jLabel5,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		59,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGap(22, 22,
																		22)
																.addComponent(
																		jLabel6,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		321,
																		Short.MAX_VALUE))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGap(22, 22,
																		22)
																.addComponent(
																		jLabel7,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(123,
																		123,
																		123)
																.addComponent(
																		jLabel1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		87,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addGap(22, 22,
																		22)
																.addComponent(
																		jLabel8,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		321,
																		Short.MAX_VALUE)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel2)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel3)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel4)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel5)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel6)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel7)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel8)
								.addContainerGap(36, Short.MAX_VALUE)));

		pack();
		setVisible(true);
	}// </editor-fold>

	// Variables declaration - do not modify
	public static Help help;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	// End of variables declaration//GEN-END:variables

}