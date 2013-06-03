/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JAndroidInstaller.UIComponent;

import JAndroidInstaller.AndroidDevice.USBDeviceChecker;
import JAndroidInstaller.AndroidDevice.USBDeviceInstaller;
import JAndroidInstaller.AndroidDevice.USBDeviceWorker;
import WSwingUILib.Component.Base.JImagePanel;
import WSwingUILib.Component.JMiddleContentPanel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wcss
 */
public class JAndroidDeviceCheckPanel extends JMiddleContentPanel {

    private int currentStepIndex = 0;
    private ArrayList<String> firstChecks = null;
    private ArrayList<String> secondChecks = null;
    private JAPKInstallerUI parents = null;

    /**
     * Creates new form JAndroidDeviceCheckPanel
     */
    public JAndroidDeviceCheckPanel(JAPKInstallerUI aThis) {
        initComponents();
        parents = aThis;
        currentStepIndex = 1;
        this.lblStep1Flag.setText("<---");
        this.lblStep2Flag.setText("");
        this.lblStep3Flag.setText("");
        this.btnNext.setButtonText("下一步");
        this.btnExit.setButtonText("退 出");
    }

    public void showStepHint(int index) {
        this.lblStep1Flag.setText("");
        this.lblStep2Flag.setText("");
        this.lblStep3Flag.setText("");
        switch (index) {
            case 1: {
                lblStep1Flag.setText("<---");
            }
            break;
            case 2: {
                lblStep2Flag.setText("<---");
            }
            break;
            case 3: {
                lblStep3Flag.setText("<---");
            }
            break;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new JImagePanel("/JAndroidInstaller/UIImage/readme-back.png");
        jPanel1 = new JImagePanel("/JAndroidInstaller/UIImage/readme-back.png");
        jLabel1 = new javax.swing.JLabel();
        lblProductID = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblStep1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblStep1Flag = new javax.swing.JLabel();
        lblStep3 = new javax.swing.JLabel();
        lblStep2Flag = new javax.swing.JLabel();
        lblStep3Flag = new javax.swing.JLabel();
        lblStep2 = new javax.swing.JLabel();
        btnNext = new WSwingUILib.Component.JUIButton();
        btnExit = new WSwingUILib.Component.JUIButton();

        setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Android设备信息"));

        jLabel1.setText("厂商ID：");

        lblProductID.setText("未知");

        lblProductName.setText("未知");

        jLabel4.setText("厂商名称：");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(lblProductName))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lblProductID)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        lblStep1.setText("第一步，拔掉手机数据线并点击下一步按钮。");

        jLabel2.setText("<html>注：本程序在进行文件管理时，需要Android端有busybox的支持！<br> 如果您在设备上使用过网页式的android管理软件，那么它可能会占用adb通道，这样的情况下，请关闭\"USB调试\"功能后重新打开! </html>");

        lblStep1Flag.setText("jLabel1");

        lblStep3.setText("第三步，手机型号检查完成。");

        lblStep2Flag.setText("jLabel2");

        lblStep3Flag.setText("jLabel3");

        lblStep2.setText("第二步，插上手机数据线并点击下一步按钮。");

        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnNextLayout = new javax.swing.GroupLayout(btnNext);
        btnNext.setLayout(btnNextLayout);
        btnNextLayout.setHorizontalGroup(
            btnNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        btnNextLayout.setVerticalGroup(
            btnNextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblStep3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStep3Flag))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblStep2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStep2Flag))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblStep1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStep1Flag)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStep1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStep1Flag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStep2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStep2Flag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStep3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStep3Flag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(jPanel2);
        jPanel2.setBounds(180, 50, 530, 420);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
        // TODO add your handling code here:
        if (currentStepIndex == 1) {
            try {
                firstChecks = USBDeviceChecker.getDeviceData();
            } catch (Exception ex) {
                Logger.getLogger(JAndroidDeviceCheckPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (currentStepIndex == 2) {
            try {
                secondChecks = USBDeviceChecker.getDeviceData();
            } catch (Exception ex) {
                Logger.getLogger(JAndroidDeviceCheckPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            if (secondChecks != null && firstChecks != null) {
                for (String sss : firstChecks) {
                    if (secondChecks.contains(sss)) {
                        secondChecks.remove(sss);
                    }
                }

                if (secondChecks.size() >= 1) {
                    String[] teams = secondChecks.get(0).split(":");
                    this.lblProductID.setText(teams[0].trim());
                    HashMap<String, String> table = USBDeviceChecker.getMakerTable();
                    if (table.containsKey(teams[0].trim())) {
                        this.lblProductName.setText(table.get(teams[0].trim()));
                    } else {
                        this.lblProductName.setText("未知");
                    }
                }
            }
        } else if (currentStepIndex == 3) {
            if (secondChecks != null && firstChecks != null) {
                if (secondChecks.size() >= 1) {
                    String[] teams = secondChecks.get(0).split(":");
                    try {
                        Boolean result = USBDeviceInstaller.installUsbDevice(teams[0].trim());
                        if (result) {
                            javax.swing.JOptionPane.showMessageDialog(null, "Adb驱动配置完成！");
                        } else {
                            USBDeviceInstaller.restartAdbServer();
                            javax.swing.JOptionPane.showMessageDialog(null, "Adb服务重启完成！");
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(JAndroidDeviceCheckPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "检测失败！请关闭程序后重新开始！");
                    System.exit(0);
                }
            }
        } else {
            try {
                if (USBDeviceWorker.isAndroidDeviceOnline())
                {
                    parents.setStatusText("设备状态：已连接！");
                    this.getMainPanel().setVisible(false);
                    JAPKInstallerUI.startMainUI(JAPKInstallerUI.currentArgs);                    
                } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "检测失败！请关闭程序后重新开始！");
                    System.exit(0);
                }
            } catch (Exception ex) {
                Logger.getLogger(JAndroidDeviceCheckPanel.class.getName()).log(Level.SEVERE, null, ex);
                javax.swing.JOptionPane.showMessageDialog(null, "检测失败！请关闭程序后重新开始！");
                System.exit(0);
            }
        }

        currentStepIndex++;
        showStepHint(currentStepIndex);
        if (currentStepIndex == 4) {
            this.btnNext.setButtonText("完成");
            this.btnNext.nowPaint();
        } else if (currentStepIndex == 3) {
            this.btnNext.setButtonText("安装");
            this.btnNext.nowPaint();
        }
    }//GEN-LAST:event_btnNextMouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private WSwingUILib.Component.JUIButton btnExit;
    private WSwingUILib.Component.JUIButton btnNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblProductID;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblStep1;
    private javax.swing.JLabel lblStep1Flag;
    private javax.swing.JLabel lblStep2;
    private javax.swing.JLabel lblStep2Flag;
    private javax.swing.JLabel lblStep3;
    private javax.swing.JLabel lblStep3Flag;
    // End of variables declaration//GEN-END:variables
}
