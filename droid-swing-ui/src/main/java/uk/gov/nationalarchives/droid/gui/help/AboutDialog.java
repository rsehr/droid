/*
 * Copyright (c) 2016, The National Archives <pronom@nationalarchives.gov.uk>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following
 * conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of the The National Archives nor the
 *    names of its contributors may be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package uk.gov.nationalarchives.droid.gui.help;

import uk.gov.nationalarchives.droid.gui.DroidMainFrame;

import java.awt.Desktop;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author sparkhi
 */
public class AboutDialog extends javax.swing.JDialog {

    private static final String CLIPBOARD_LINE_FORMAT = "%s: %s";

    /**
     * Creates new form AboutDialog.
     *
     * @param parent parent frame for this dialog
     * @param modal modality of the dialog
     * @param data data to be populated in the UI controls
     */
    public AboutDialog(java.awt.Frame parent, boolean modal, AboutDialogData data) {
        super(parent, modal);
        initComponents();
        initData(data);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonOk = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtJavaVersion = new javax.swing.JTextField();
        labelJavaLocation = new javax.swing.JLabel();
        txtJavaLocation = new javax.swing.JTextField();
        labelOSName = new javax.swing.JLabel();
        txtOSName = new javax.swing.JTextField();
        labelVersion = new javax.swing.JLabel();
        txtVersion = new javax.swing.JTextField();
        labelJavaVersion = new javax.swing.JLabel();
        labelDroidFolder = new javax.swing.JLabel();
        txtDroidFolder = new javax.swing.JTextField();
        buttonOpenDroidFolder = new javax.swing.JButton();
        labelLogLocation = new javax.swing.JLabel();
        txtLogLocation = new javax.swing.JTextField();
        buttonOpenLogLocation = new javax.swing.JButton();
        labelBuildDate = new javax.swing.JLabel();
        txtBuildDate = new javax.swing.JTextField();
        labelProfileCount = new javax.swing.JLabel();
        txtProfileCount = new javax.swing.JTextField();
        buttonCopyToClipboard = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.title_1")); // NOI18N
        setMinimumSize(new java.awt.Dimension(540, 470));
        setPreferredSize(new java.awt.Dimension(640, 470));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        buttonOk.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.buttonOk.text")); // NOI18N
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtJavaVersion.setEditable(false);
        txtJavaVersion.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.txtJavaVersion.text")); // NOI18N

        labelJavaLocation.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.labelJavaLocation.text")); // NOI18N
        labelJavaLocation.setToolTipText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.labelJavaLocation.toolTipText")); // NOI18N

        txtJavaLocation.setEditable(false);
        txtJavaLocation.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.txtJavaLocation.text")); // NOI18N

        labelOSName.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.labelOSName.text")); // NOI18N
        labelOSName.setToolTipText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.labelOSName.toolTipText")); // NOI18N

        txtOSName.setEditable(false);
        txtOSName.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.txtOSName.text")); // NOI18N

        labelVersion.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.labelVersion.text")); // NOI18N
        labelVersion.setToolTipText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.labelVersion.toolTipText")); // NOI18N

        txtVersion.setEditable(false);
        txtVersion.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.txtVersion.text")); // NOI18N

        labelJavaVersion.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.labelJavaVersion.text")); // NOI18N
        labelJavaVersion.setToolTipText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.labelJavaVersion.toolTipText")); // NOI18N

        labelDroidFolder.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.labelDroidFolder.text")); // NOI18N
        labelDroidFolder.setToolTipText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.labelDroidFolder.toolTipText")); // NOI18N

        txtDroidFolder.setEditable(false);
        txtDroidFolder.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.txtDroidFolder.text")); // NOI18N

        buttonOpenDroidFolder.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.buttonOpenDroidFolder.text")); // NOI18N
        buttonOpenDroidFolder.setToolTipText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.buttonOpenDroidFolder.toolTipText")); // NOI18N
        buttonOpenDroidFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOpenDroidFolderActionPerformed(evt);
            }
        });

        labelLogLocation.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.labelLogLocation.text")); // NOI18N
        labelLogLocation.setToolTipText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.labelLogLocation.toolTipText")); // NOI18N

        txtLogLocation.setEditable(false);
        txtLogLocation.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.txtLogLocation.text")); // NOI18N

        buttonOpenLogLocation.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.buttonOpenLogLocation.text")); // NOI18N
        buttonOpenLogLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOpenLogLocationActionPerformed(evt);
            }
        });

        labelBuildDate.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.labelBuildDate.text")); // NOI18N
        labelBuildDate.setToolTipText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.labelBuildDate.toolTipText")); // NOI18N

        txtBuildDate.setEditable(false);
        txtBuildDate.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.txtBuildDate.text")); // NOI18N

        labelProfileCount.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.labelProfileCount.text")); // NOI18N
        labelProfileCount.setToolTipText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.labelProfileCount.toolTipText")); // NOI18N

        txtProfileCount.setEditable(false);
        txtProfileCount.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.txtProfileCount.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(labelVersion)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(labelJavaVersion)
                            .addGap(6, 6, 6)))
                    .addComponent(labelJavaLocation)
                    .addComponent(labelOSName)
                    .addComponent(labelDroidFolder)
                    .addComponent(labelLogLocation)
                    .addComponent(labelProfileCount))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOSName)
                    .addComponent(txtJavaLocation)
                    .addComponent(txtJavaVersion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtVersion, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(labelBuildDate)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuildDate, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLogLocation, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDroidFolder, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonOpenDroidFolder)
                            .addComponent(buttonOpenLogLocation)))
                    .addComponent(txtProfileCount))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVersion)
                    .addComponent(txtVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBuildDate)
                    .addComponent(txtBuildDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJavaVersion)
                    .addComponent(txtJavaVersion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelJavaLocation)
                    .addComponent(txtJavaLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOSName)
                    .addComponent(txtOSName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDroidFolder)
                    .addComponent(txtDroidFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonOpenDroidFolder))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLogLocation)
                    .addComponent(txtLogLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonOpenLogLocation))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProfileCount)
                    .addComponent(txtProfileCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        buttonCopyToClipboard.setText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.buttonCopyToClipboard.text")); // NOI18N
        buttonCopyToClipboard.setToolTipText(org.openide.util.NbBundle.getMessage(AboutDialog.class, "AboutDialog.buttonCopyToClipboard.toolTipText")); // NOI18N
        buttonCopyToClipboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCopyToClipboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonCopyToClipboard)
                        .addGap(18, 18, 18)
                        .addComponent(buttonOk))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCopyToClipboard)
                    .addComponent(buttonOk))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_buttonOkActionPerformed

    private void buttonOpenDroidFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOpenDroidFolderActionPerformed
        File file = new File(txtDroidFolder.getText());
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException iox) {
            throw new RuntimeException(iox);
        }
    }//GEN-LAST:event_buttonOpenDroidFolderActionPerformed

    private void buttonOpenLogLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOpenLogLocationActionPerformed
        File file = new File(txtLogLocation.getText());
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException iox) {
            throw new RuntimeException(iox);
        }
    }//GEN-LAST:event_buttonOpenLogLocationActionPerformed

    private void buttonCopyToClipboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCopyToClipboardActionPerformed
        String details = String.format(CLIPBOARD_LINE_FORMAT, labelVersion.getText(), txtVersion.getText()) +
                System.lineSeparator() +
                String.format(CLIPBOARD_LINE_FORMAT, labelBuildDate.getText(), txtBuildDate.getText()) +
                System.lineSeparator() +
                String.format(CLIPBOARD_LINE_FORMAT, labelJavaVersion.getText(), txtJavaVersion.getText()) +
                System.lineSeparator() +
                String.format(CLIPBOARD_LINE_FORMAT, labelJavaLocation.getText(), txtJavaLocation.getText()) +
                System.lineSeparator() +
                String.format(CLIPBOARD_LINE_FORMAT, labelOSName.getText(), txtOSName.getText()) +
                System.lineSeparator() +
                String.format(CLIPBOARD_LINE_FORMAT, labelDroidFolder.getText(), txtDroidFolder.getText()) +
                System.lineSeparator() +
                String.format(CLIPBOARD_LINE_FORMAT, labelLogLocation.getText(), txtLogLocation.getText()) +
                System.lineSeparator() +
                String.format(CLIPBOARD_LINE_FORMAT, labelProfileCount.getText(), txtProfileCount.getText());

        StringSelection clipboardContent = new StringSelection(details);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(clipboardContent, null);
    }//GEN-LAST:event_buttonCopyToClipboardActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        DroidMainFrame parent = (DroidMainFrame) getParent();
        long count = parent.getProfileCount();
        // if the count is -1, it means something went wrong in counting the folders
        String profileCount = count == -1 ? "Unknown" : String.valueOf(count);
        txtProfileCount.setText(profileCount);
    }//GEN-LAST:event_formWindowActivated

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCopyToClipboard;
    private javax.swing.JButton buttonOk;
    private javax.swing.JButton buttonOpenDroidFolder;
    private javax.swing.JButton buttonOpenLogLocation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBuildDate;
    private javax.swing.JLabel labelDroidFolder;
    private javax.swing.JLabel labelJavaLocation;
    private javax.swing.JLabel labelJavaVersion;
    private javax.swing.JLabel labelLogLocation;
    private javax.swing.JLabel labelOSName;
    private javax.swing.JLabel labelProfileCount;
    private javax.swing.JLabel labelVersion;
    private javax.swing.JTextField txtBuildDate;
    private javax.swing.JTextField txtDroidFolder;
    private javax.swing.JTextField txtJavaLocation;
    private javax.swing.JTextField txtJavaVersion;
    private javax.swing.JTextField txtLogLocation;
    private javax.swing.JTextField txtOSName;
    private javax.swing.JTextField txtProfileCount;
    private javax.swing.JTextField txtVersion;
    // End of variables declaration//GEN-END:variables

    private void initData(AboutDialogData data) {
        txtVersion.setText(data.getDroidVersion());
        txtBuildDate.setText(data.getBuildTimeStamp());
        txtJavaVersion.setText(data.getJavaVersion());
        txtJavaLocation.setText(data.getJavaLocation());
        txtOSName.setText(data.getOperatingSystem());
        txtDroidFolder.setText(data.getDroidFolder());
        txtLogLocation.setText(data.getLogFolder());
    }
}