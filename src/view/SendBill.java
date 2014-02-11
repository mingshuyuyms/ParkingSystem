package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class SendBill extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form SendBill */
	public SendBill() {
		initComponents();
	}

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 14));
		jLabel1.setText("SEND BILL");

		jLabel2.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jLabel2.setText("CAMPUS ID");

		jLabel3.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jLabel3.setText("FOR SPECIFY STAFF :");

		jButton1.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jButton1.setText("SEND");
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendSpecifyBill();
			}
		});

		jLabel4.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jLabel4.setText("FOR ALL STAFF :");

		jButton2.setFont(new java.awt.Font("微软雅黑", 1, 12));
		jButton2.setText("SEND");
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sendAllBills();
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
																.addContainerGap()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(64,
																										64,
																										64)
																								.addComponent(
																										jLabel1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										74,
																										javax.swing.GroupLayout.PREFERRED_SIZE))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jLabel2,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										81,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jTextField1,
																														javax.swing.GroupLayout.PREFERRED_SIZE,
																														112,
																														javax.swing.GroupLayout.PREFERRED_SIZE)
																												.addGroup(
																														layout.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																																.addComponent(
																																		jButton2,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		76,
																																		javax.swing.GroupLayout.PREFERRED_SIZE)
																																.addComponent(
																																		jButton1,
																																		javax.swing.GroupLayout.PREFERRED_SIZE,
																																		76,
																																		javax.swing.GroupLayout.PREFERRED_SIZE))))))
												.addComponent(
														jLabel3,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														129,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jLabel4,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														129,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(30, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel1)
								.addGap(2, 2, 2)
								.addComponent(jLabel3)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														20,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jButton1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jLabel4)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jButton2)
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		pack();
		setVisible(true);
	}// </editor-fold>
	
	/**
	 * send staff bill
	 */
	private void sendAllBills(){
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File(
					"src/staff.txt")));
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/monthbill.txt"), true));
			List<String> staffList = new ArrayList<String>();
			String staffInfo;
			while (!"".equals((staffInfo = reader.readLine()))&&staffInfo!=null) {
				writer.write(staffInfo);
				writer.newLine();
				staffInfo = staffInfo.substring(0, staffInfo.lastIndexOf("@")+1) + "0";
				staffList.add(staffInfo);
			}
			reader.close();
			writer.flush();
			writer.close();
			BufferedWriter writerUpdate = new BufferedWriter(new FileWriter(new File("src/staff.txt")));
			for(int i=0; i<staffList.size(); i++){
				writerUpdate.write(staffList.get(i));
				writerUpdate.newLine();
			}
			writerUpdate.flush();
			writerUpdate.close();
			JOptionPane.showMessageDialog(null, "send all bills success");
		}catch (Exception e) {
				e.printStackTrace();
		}
	}
	private void sendSpecifyBill(){
		String campusId = jTextField1.getText();
		boolean flag = false;
		if (!"".equals(campusId)) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(new File(
						"src/staff.txt")));
				BufferedWriter writer = new BufferedWriter(new FileWriter(new File("src/monthbill.txt"), true));
				List<String> staffList = new ArrayList<String>();
				String staffInfo;
				while (!"".equals((staffInfo = reader.readLine()))&&staffInfo!=null) {
					if (campusId.equals(staffInfo.substring(0, staffInfo.indexOf("@")))) {
						writer.write(staffInfo);
						writer.newLine();
						staffInfo = staffInfo.substring(0,
								staffInfo.lastIndexOf("@") + 1)
								+ "0";
						flag = true;
					}
					staffList.add(staffInfo);
				}
				reader.close();
				writer.flush();
				writer.close();
				BufferedWriter writerUpdate = new BufferedWriter(new FileWriter(new File("src/staff.txt")));
				for(int i=0; i<staffList.size(); i++){
					writerUpdate.write(staffList.get(i));
					writerUpdate.newLine();
				}
				writerUpdate.flush();
				writerUpdate.close();
				if (flag) {
					JOptionPane.showMessageDialog(null, "send sepcify bill success");
				}else {
					JOptionPane.showMessageDialog(null, "can't find the specify campus id");
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			JOptionPane.showMessageDialog(null, "iuput can't be null");
		}
	}

	// Variables declaration - do not modify
	public static SendBill sendBill;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}