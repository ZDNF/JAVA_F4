/*
 * Problem.java
 *
 * Created on __DATE__, __TIME__
 */

package login_register;

/**
 *
 * @author  __USER__
 */
public class Problem extends javax.swing.JFrame {

	int j;

	/** Creates new form Problem */
	public Problem(int j) {
		this.j = j;
		initComponents();
		this.setLocationRelativeTo(null);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jSeparator1 = new javax.swing.JSeparator();
		jLabel1 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jSeparator2 = new javax.swing.JSeparator();
		jLabel7 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(41, 45, 51));

		jSeparator1.setBackground(new java.awt.Color(0, 51, 255));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("Problem solving center");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel3.setForeground(new java.awt.Color(255, 255, 255));
		jLabel3.setText("\u6e29\u99a8\u63d0\u793a\uff1a");

		jLabel4.setBackground(new java.awt.Color(255, 255, 255));
		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel4.setForeground(new java.awt.Color(204, 204, 204));
		jLabel4
				.setText("\u5982\u679c\u5728\u767b\u5f55\u6216\u6ce8\u518c\u8981\u5230\u95ee\u9898\u65e0\u6cd5\u89e3\u51b3\uff0c\u8bf7\u8054\u7cfb\u5ba2\u670d\uff01");

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel5.setForeground(new java.awt.Color(204, 204, 204));
		jLabel5.setText("\u5ba2\u670d\u7535\u8bdd\uff1a");

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 20));
		jLabel6.setForeground(new java.awt.Color(0, 102, 255));
		jLabel6.setText("1008611");

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 16));
		jLabel7.setForeground(new java.awt.Color(153, 153, 153));
		jLabel7
				.setText("\u672c\u8f6f\u4ef6\u6240\u6709\u89e3\u91ca\u6743\u5f52F4\u56e2\u961f\u5c0f\u7ec4\u6240\u6709");

		jButton1.setBackground(new java.awt.Color(41, 45, 51));
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/image/ͼ��.png"))); // NOI18N
		jButton1.setBorder(null);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				197,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				18,
																				18,
																				18)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jSeparator1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								319,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												34,
																												34,
																												34)
																										.addComponent(
																												jLabel1))))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				30,
																				30,
																				30)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel5)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel6)
																										.addGap(
																												21,
																												21,
																												21))
																						.addComponent(
																								jSeparator2,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								562,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				167,
																				167,
																				167)
																		.addComponent(
																				jLabel7))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				57,
																				57,
																				57)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel4)
																						.addComponent(
																								jLabel3))))
										.addContainerGap(28, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				63,
																				63,
																				63)
																		.addComponent(
																				jLabel1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jSeparator1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				10,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																161,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel3)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel4)
										.addGap(37, 37, 37)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel6)
														.addComponent(jLabel5))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jSeparator2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												10,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												89, Short.MAX_VALUE)
										.addComponent(jLabel7)
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
		if (j == 1) {
			new User_Login().setVisible(true);
		}
		if (j == 2) {
			new Merchant_Login().setVisible(true);
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				//new Problem().setVisible(true);

			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	// End of variables declaration//GEN-END:variables

}