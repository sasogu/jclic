/*
 * File    : AuthorSettingsDlg.java
 * Created : 20-jun-2002 13:23
 * By      : fbusquets
 *
 * JClic - Authoring and playing system for educational activities
 *
 * Copyright (C) 2000 - 2005 Francesc Busquets & Departament
 * d'Educacio de la Generalitat de Catalunya
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details (see the LICENSE file).
 */

package edu.xtec.jclic;

import edu.xtec.jclic.bags.MediaBagEditor;
import edu.xtec.util.Messages;
import edu.xtec.util.StrUtils;

/**
 *
 * @author  Francesc Busquets (fbusquets@xtec.cat)
 * @version 13.08.29
 */
public class AuthorSettingsDlg extends edu.xtec.util.ExtendedJDialog {

    AuthorSettings settings;
    public boolean result;
    java.awt.Component parent;
    Messages msg;
    
    /** Creates new form SettingsDlg */
    public AuthorSettingsDlg(AuthorSettings settings, java.awt.Component parent) {
        super(parent, "", true);
        this.parent=parent;
        this.settings=settings;
        msg=settings.rb.getOptions().getMessages();
        setTitle(msg.get("settings_title"));
        result=false;
        initComponents();
        centerOver(parent);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    javax.swing.ButtonGroup reportGroup = new javax.swing.ButtonGroup();
    javax.swing.ButtonGroup mediaGroup = new javax.swing.ButtonGroup();
    javax.swing.JTabbedPane mainPane = new javax.swing.JTabbedPane();
    javax.swing.JPanel generalPane = new javax.swing.JPanel();
    javax.swing.JLabel lookLb = new javax.swing.JLabel();
    lookCombo = new javax.swing.JComboBox(edu.xtec.util.LFUtil.VALUES);
    javax.swing.JLabel langLb = new javax.swing.JLabel();
    langCombo = new javax.swing.JComboBox(Messages.getDescriptiveLanguageCodes(msg.getLocale()));
    javax.swing.JLabel countryLb = new javax.swing.JLabel();
    countryField = new javax.swing.JTextField();
    javax.swing.JLabel variantLb = new javax.swing.JLabel();
    variantField = new javax.swing.JTextField();
    javax.swing.JLabel browserLb = new javax.swing.JLabel();
    browserField = new javax.swing.JTextField();
    imgSizePanel = new javax.swing.JPanel();
    javax.swing.JLabel maxImgWidthLb = new javax.swing.JLabel();
    maxImgWidthText = new javax.swing.JTextField();
    javax.swing.JLabel maxImgHeightLb = new javax.swing.JLabel();
    maxImgHeightText = new javax.swing.JTextField();
    javax.swing.JPanel mediaPane = new javax.swing.JPanel();
    javax.swing.JPanel mediaSystemPanel = new javax.swing.JPanel();
    mDefaultBtn = new javax.swing.JRadioButton();
    mJMFbtn = new javax.swing.JRadioButton();
    mQTbtn = new javax.swing.JRadioButton();
    javax.swing.JPanel htmlPane = new javax.swing.JPanel();
    javax.swing.JLabel codebaseLb = new javax.swing.JLabel();
    codebaseTxt = new javax.swing.JTextField();
    javax.swing.JLabel colorLb = new javax.swing.JLabel();
    colorButton = new edu.xtec.jclic.beans.ColorButton();
    colorButton.setOptions(settings.rb.getOptions());
    javax.swing.JLabel widthLb = new javax.swing.JLabel();
    widthText = new javax.swing.JTextField();
    javax.swing.JLabel heightLb = new javax.swing.JLabel();
    heightText = new javax.swing.JTextField();
    javax.swing.JLabel JScodebaseLb = new javax.swing.JLabel();
    JScodebaseTxt = new javax.swing.JTextField();
    javax.swing.JPanel btPanel = new javax.swing.JPanel();
    javax.swing.JButton okButton = new javax.swing.JButton();
    javax.swing.JButton cancelButton = new javax.swing.JButton();

    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosing(java.awt.event.WindowEvent evt) {
        closeDialog(evt);
      }
    });

    mainPane.setToolTipText(msg.get("settings_report_tooltip"));
    mainPane.setPreferredSize(new java.awt.Dimension(500, 400));

    generalPane.setToolTipText(msg.get("settings_general_tooltip"));
    generalPane.setLayout(new java.awt.GridBagLayout());

    lookLb.setLabelFor(lookCombo);
    lookLb.setText(msg.get("settings_look"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    generalPane.add(lookLb, gridBagConstraints);

    lookCombo.setSelectedItem(settings.lookAndFeel);
    lookCombo.setToolTipText(msg.get("settings_look_tooltip"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    generalPane.add(lookCombo, gridBagConstraints);

    langLb.setLabelFor(langCombo);
    langLb.setText(msg.get("settings_language"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    generalPane.add(langLb, gridBagConstraints);

    langCombo.setSelectedItem(Messages.getDescriptiveLanguageCode(settings.language));
    langCombo.setToolTipText(msg.get("settings_language_tooltip"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    generalPane.add(langCombo, gridBagConstraints);

    countryLb.setLabelFor(countryField);
    countryLb.setText(msg.get("settings_country"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    generalPane.add(countryLb, gridBagConstraints);

    countryField.setText(settings.country);
    countryField.setToolTipText(msg.get("settings_country_tooltip"));
    countryField.setMinimumSize(new java.awt.Dimension(75, 21));
    countryField.setPreferredSize(new java.awt.Dimension(200, 21));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    generalPane.add(countryField, gridBagConstraints);

    variantLb.setLabelFor(variantField);
    variantLb.setText(msg.get("settings_variant"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    generalPane.add(variantLb, gridBagConstraints);

    variantField.setText(settings.variant);
    variantField.setToolTipText(msg.get("settings_variant_tooltip"));
    variantField.setMinimumSize(new java.awt.Dimension(75, 21));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    generalPane.add(variantField, gridBagConstraints);

    browserLb.setText(msg.get("settings_browser"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    generalPane.add(browserLb, gridBagConstraints);

    browserField.setText(settings.preferredBrowser);
    browserField.setToolTipText(msg.get("settings_browser_tooltip"));
    browserField.setMinimumSize(new java.awt.Dimension(75, 21));
    browserField.setPreferredSize(new java.awt.Dimension(200, 21));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    generalPane.add(browserField, gridBagConstraints);

    imgSizePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(msg.get("img_max_size")));
    imgSizePanel.setLayout(new java.awt.GridBagLayout());

    maxImgWidthLb.setLabelFor(maxImgWidthText);
    maxImgWidthLb.setText(msg.get("WIDTH"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    imgSizePanel.add(maxImgWidthLb, gridBagConstraints);

    maxImgWidthText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    maxImgWidthText.setText(Integer.toString(settings.imgMaxWidth));
    maxImgWidthText.setToolTipText(msg.get("img_max_width_tooltip"));
    maxImgWidthText.setPreferredSize(new java.awt.Dimension(50, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    imgSizePanel.add(maxImgWidthText, gridBagConstraints);

    maxImgHeightLb.setLabelFor(maxImgHeightText);
    maxImgHeightLb.setText(msg.get("HEIGHT"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    imgSizePanel.add(maxImgHeightLb, gridBagConstraints);

    maxImgHeightText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    maxImgHeightText.setText(Integer.toString(settings.imgMaxHeight));
    maxImgHeightText.setToolTipText(msg.get("img_max_height_tooltip"));
    maxImgHeightText.setPreferredSize(new java.awt.Dimension(50, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    imgSizePanel.add(maxImgHeightText, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    generalPane.add(imgSizePanel, gridBagConstraints);

    mainPane.addTab(msg.get("settings_general"), new javax.swing.ImageIcon(getClass().getResource("/edu/xtec/resources/icons/settings.gif")), generalPane, ""); // NOI18N

    mediaPane.setToolTipText(msg.get("settings_media_tooltip"));
    mediaPane.setLayout(new java.awt.GridBagLayout());

    mediaSystemPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(msg.get("settings_media_system")));
    mediaSystemPanel.setLayout(new java.awt.GridBagLayout());

    mediaGroup.add(mDefaultBtn);
    mDefaultBtn.setSelected(edu.xtec.jclic.Constants.DEFAULT.equals(settings.mediaSystem));
    mDefaultBtn.setText(msg.get("settings_media_default"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 3);
    mediaSystemPanel.add(mDefaultBtn, gridBagConstraints);

    mediaGroup.add(mJMFbtn);
    mJMFbtn.setSelected(edu.xtec.jclic.Constants.JMF.equals(settings.mediaSystem));
    mJMFbtn.setText(msg.get("settings_media_jmf"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
    mediaSystemPanel.add(mJMFbtn, gridBagConstraints);

    mediaGroup.add(mQTbtn);
    mQTbtn.setSelected(edu.xtec.jclic.Constants.QT.equals(settings.mediaSystem));
    mQTbtn.setText(msg.get("settings_media_qt"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(0, 3, 3, 3);
    mediaSystemPanel.add(mQTbtn, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    mediaPane.add(mediaSystemPanel, gridBagConstraints);

    mainPane.addTab(msg.get("settings_media"), new javax.swing.ImageIcon(getClass().getResource("/edu/xtec/resources/icons/audio_on.gif")), mediaPane, ""); // NOI18N

    htmlPane.setToolTipText(msg.get("settings_applet_tooltip"));
    htmlPane.setLayout(new java.awt.GridBagLayout());

    codebaseLb.setLabelFor(codebaseTxt);
    codebaseLb.setText(msg.get("applet_codebase"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    htmlPane.add(codebaseLb, gridBagConstraints);

    codebaseTxt.setText(settings.appletCodeBase);
    codebaseTxt.setToolTipText(msg.get("applet_codebase_tooltip"));
    codebaseTxt.setPreferredSize(new java.awt.Dimension(300, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    htmlPane.add(codebaseTxt, gridBagConstraints);

    colorLb.setLabelFor(colorButton);
    colorLb.setText(msg.get("applet_bgcolor"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    htmlPane.add(colorLb, gridBagConstraints);

    colorButton.setToolTipText(msg.get("applet_bgcolor_tooltip"));
    colorButton.setColor(settings.appletBgColor);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    htmlPane.add(colorButton, gridBagConstraints);

    widthLb.setLabelFor(widthText);
    widthLb.setText(msg.get("WIDTH"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    htmlPane.add(widthLb, gridBagConstraints);

    widthText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    widthText.setText(settings.appletWidth);
    widthText.setToolTipText(msg.get("applet_width_tooltip"));
    widthText.setPreferredSize(new java.awt.Dimension(50, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    htmlPane.add(widthText, gridBagConstraints);

    heightLb.setLabelFor(heightText);
    heightLb.setText(msg.get("HEIGHT"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    htmlPane.add(heightLb, gridBagConstraints);

    heightText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    heightText.setText(settings.appletHeight);
    heightText.setToolTipText(msg.get("applet_height_tooltip"));
    heightText.setPreferredSize(new java.awt.Dimension(50, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    htmlPane.add(heightText, gridBagConstraints);

    JScodebaseLb.setLabelFor(JScodebaseTxt);
    JScodebaseLb.setText(msg.get("js_codebase"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(20, 2, 2, 2);
    htmlPane.add(JScodebaseLb, gridBagConstraints);

    JScodebaseTxt.setText(settings.jsCodeBase);
    JScodebaseTxt.setToolTipText(msg.get("js_codebase_tooltip"));
    JScodebaseTxt.setPreferredSize(new java.awt.Dimension(300, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(20, 2, 2, 2);
    htmlPane.add(JScodebaseTxt, gridBagConstraints);

    mainPane.addTab(msg.get("settings_html"), new javax.swing.ImageIcon(getClass().getResource("/edu/xtec/resources/icons/html_doc.gif")), htmlPane); // NOI18N

    getContentPane().add(mainPane, java.awt.BorderLayout.CENTER);

    okButton.setText(msg.get("OK"));
    okButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        okButtonActionPerformed(evt);
      }
    });
    btPanel.add(okButton);

    cancelButton.setText(msg.get("CANCEL"));
    cancelButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cancelButtonActionPerformed(evt);
      }
    });
    btPanel.add(cancelButton);

    getContentPane().add(btPanel, java.awt.BorderLayout.SOUTH);

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        result=false;
        closeDialog(null);
        
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

        if(accept()){
            result=true;
            closeDialog(null);
        }
                
        // Add your handling code here:
    }//GEN-LAST:event_okButtonActionPerformed

    public boolean accept(){
        String p1=null;
        
        settings.lookAndFeel=(String)lookCombo.getSelectedItem();
        settings.preferredBrowser=browserField.getText();
        settings.language=Messages.getLanguageFromDescriptive((String)langCombo.getSelectedItem());
        settings.country=StrUtils.nullableString(countryField.getText());
        settings.variant=StrUtils.nullableString(variantField.getText());               
        
        if(mJMFbtn.isSelected())
            settings.mediaSystem=edu.xtec.jclic.Constants.JMF;
        else if(mQTbtn.isSelected())
            settings.mediaSystem=edu.xtec.jclic.Constants.QT;
        else
            settings.mediaSystem=edu.xtec.jclic.Constants.DEFAULT;
        
        settings.appletCodeBase=StrUtils.secureString(codebaseTxt.getText(), AuthorSettings.DEFAULT_APPLET_CODEBASE);
        settings.appletWidth=StrUtils.secureString(widthText.getText(), AuthorSettings.DEFAULT_APPLET_WIDTH);
        settings.appletHeight=StrUtils.secureString(heightText.getText(), AuthorSettings.DEFAULT_APPLET_HEIGHT);
        settings.appletBgColor=colorButton.getColor();
        
        settings.jsCodeBase=StrUtils.secureString(JScodebaseTxt.getText(), AuthorSettings.DEFAULT_JS_CODEBASE);

        settings.imgMaxWidth=Integer.parseInt(StrUtils.secureString(maxImgWidthText.getText(), Integer.toString(MediaBagEditor.DEFAULT_IMG_MAX_WIDTH)));
        settings.imgMaxHeight=Integer.parseInt(StrUtils.secureString(maxImgHeightText.getText(), Integer.toString(MediaBagEditor.DEFAULT_IMG_MAX_HEIGHT)));
        
        return true;
    }        
        
    /** Closes the dialog */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField JScodebaseTxt;
  private javax.swing.JTextField browserField;
  private javax.swing.JTextField codebaseTxt;
  private edu.xtec.jclic.beans.ColorButton colorButton;
  private javax.swing.JTextField countryField;
  private javax.swing.JTextField heightText;
  private javax.swing.JPanel imgSizePanel;
  private javax.swing.JComboBox langCombo;
  private javax.swing.JComboBox lookCombo;
  private javax.swing.JRadioButton mDefaultBtn;
  private javax.swing.JRadioButton mJMFbtn;
  private javax.swing.JRadioButton mQTbtn;
  private javax.swing.JTextField maxImgHeightText;
  private javax.swing.JTextField maxImgWidthText;
  private javax.swing.JTextField variantField;
  private javax.swing.JTextField widthText;
  // End of variables declaration//GEN-END:variables

}
