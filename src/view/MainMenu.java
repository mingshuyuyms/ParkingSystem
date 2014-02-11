package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form MainMenu */
	public MainMenu() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	private void initComponents() {

		adminInfo = new javax.swing.JLabel();
		title = new javax.swing.JLabel();
		register = new javax.swing.JButton();
		search = new javax.swing.JButton();
		sendBill = new javax.swing.JButton();
		editSatus = new javax.swing.JButton();
		changePassword = new javax.swing.JButton();
		logout = new javax.swing.JButton();
		chargePolicy = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		adminInfo.setText("Hello,XXX   AdminNo.XXX");

		title.setFont(new java.awt.Font("Dialog", 1, 14));
		title.setText("Main   Menu");

		register.setFont(new java.awt.Font("Dialog", 1, 12));
		register.setText("REGISTER");
		register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Register.register = new Register();
			}
		});

		search.setFont(new java.awt.Font("Dialog", 1, 12));
		search.setText("SEARCH");
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Search.search = new Search();
			}
		});

		sendBill.setFont(new java.awt.Font("Dialog", 1, 12));
		sendBill.setText("SENDBILL");
		sendBill.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SendBill.sendBill = new SendBill();
			}
		});
		

		editSatus.setFont(new java.awt.Font("Dialog", 1, 12));
		editSatus.setText("EDITSTATUS");
		editSatus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				EditStatus.editStatus = new EditStatus();
			}
		});
		
		chargePolicy.setFont(new java.awt.Font("Dialog", 1, 12));
		chargePolicy.setText("CHARGE POLICY");
		chargePolicy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChargePolicy.chargePolicy = new ChargePolicy();
			}
		});

		changePassword.setFont(new java.awt.Font("Dialog", 1, 12));
		changePassword.setText("CHANGE PASSWORD");
		changePassword.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePassword.changePassword = new ChangePassword();
			}
		});

		logout.setText("logout");
		logout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				MainMenu.mainMenu.dispose();
				AdminLogin.adminLogin = new AdminLogin();
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(159, Short.MAX_VALUE)
								.addComponent(adminInfo,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										157,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(
						layout.createSequentialGroup()
								.addGap(90, 90, 90)
								.addComponent(title,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(146, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(41, 41, 41)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														logout,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addComponent(
																						sendBill,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						register,
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						70,
																						Short.MAX_VALUE))
																.addGap(52, 52,
																		52)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addComponent(
																						editSatus,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						search,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						75,
																						Short.MAX_VALUE))))
								.addContainerGap(74, Short.MAX_VALUE))
				.addGroup(
						layout.createSequentialGroup()
								.addGap(75, 75, 75)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING,
												false)
												.addComponent(
														chargePolicy,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														changePassword,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
								.addContainerGap(118, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(adminInfo,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(title,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														register,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														search,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														sendBill,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														editSatus,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										12, Short.MAX_VALUE)
								.addComponent(chargePolicy)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														logout,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(
														javax.swing.GroupLayout.Alignment.TRAILING,
														layout.createSequentialGroup()
																.addComponent(
																		changePassword,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(29, 29,
																		29)))));

		pack();
		setVisible(true);
	}
	

	// Variables declaration - do not modify
	public static MainMenu mainMenu;
	public javax.swing.JLabel adminInfo;
	public javax.swing.JButton chargePolicy;
	public javax.swing.JButton editSatus;
	private javax.swing.JButton logout;
	public javax.swing.JButton changePassword;
	private javax.swing.JButton register;
	private javax.swing.JButton search;
	private javax.swing.JButton sendBill;
	private javax.swing.JLabel title;
	// End of variables declaration//GEN-END:variables

}