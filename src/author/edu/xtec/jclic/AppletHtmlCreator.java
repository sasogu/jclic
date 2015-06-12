/*
 * File    : AppletHtmlCreator.java
 * Created : 13-aug-2004 16:35
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

import edu.xtec.jclic.fileSystem.FileSystem;
import edu.xtec.jclic.misc.Utils;
import edu.xtec.jclic.project.JClicProject;
import edu.xtec.util.BrowserLauncher;
import edu.xtec.util.Messages;
import edu.xtec.util.Options;
import edu.xtec.util.StrUtils;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 *
 * @author Francesc Busquets (fbusquets@xtec.cat)
 * @version 13.08.09
 */
public class AppletHtmlCreator extends javax.swing.JPanel implements ActionListener{
    
    Options options;
    AuthorSettings settings;
    static String appletCode =
"<!doctype html public \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n" +
"<html>\n" +
"<head>\n" +
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=%ENCODING\">\n" +
"<title>%TITLE</title>\n" +
"<script language=\"JavaScript\" src=\"%JAR_BASE/jclicplugin.js\" type=\"text/javascript\"></script>\n" +
"</head>\n" +
"<body %BODYPARAMS>\n" +
"%PRE_APPLET\n" +
"<script language=\"JavaScript\">\n" +
"setJarBase('%JAR_BASE');%OTHER\n" +
"writePlugin('%PROJECT', '%WIDTH', '%HEIGHT');\n" +
"</script>\n" +
"%POST_APPLET\n" +
"</body>\n" +
"</html>";
    
    /** Creates new form AppletHtmlCreator */
    public AppletHtmlCreator(Options options, AuthorSettings settings) {
        this.options=options;
        this.settings=settings;
        initComponents();
        fullPageOption.addActionListener(this);
        mixedContentOption.addActionListener(this);
        checkEnabled();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {//GEN-BEGIN:initComponents
        javax.swing.JLabel colorLb;
        javax.swing.JLabel exitUrlLb;
        java.awt.GridBagConstraints gridBagConstraints;
        javax.swing.JLabel heightLb;
        javax.swing.JScrollPane postTextScroll;
        javax.swing.JLabel postTxtLb;
        javax.swing.JScrollPane prevTextScroll;
        javax.swing.JLabel prevTxtLb;
        javax.swing.JLabel titleLb;
        javax.swing.JLabel widthLb;

        bg = new javax.swing.ButtonGroup();
        titleLb = new javax.swing.JLabel();
        titleTxt = new javax.swing.JTextField();
        exitUrlLb = new javax.swing.JLabel();
        exitUrlTxt = new javax.swing.JTextField();
        fullPageOption = new javax.swing.JRadioButton();
        mixedContentOption = new javax.swing.JRadioButton();
        sizePanel = new javax.swing.JPanel();
        colorLb = new javax.swing.JLabel();
        colorButton = new edu.xtec.jclic.beans.ColorButton();
        colorButton.setOptions(options);
        prevTxtLb = new javax.swing.JLabel();
        prevTextScroll = new javax.swing.JScrollPane();
        prevTextEdit = new javax.swing.JTextArea();
        widthLb = new javax.swing.JLabel();
        widthText = new javax.swing.JTextField();
        heightLb = new javax.swing.JLabel();
        heightText = new javax.swing.JTextField();
        centeredChk = new javax.swing.JCheckBox();
        postTxtLb = new javax.swing.JLabel();
        postTextScroll = new javax.swing.JScrollPane();
        postTextEdit = new javax.swing.JTextArea();

        setLayout(new java.awt.GridBagLayout());

        titleLb.setLabelFor(titleTxt);
        titleLb.setText(options.getMsg("applet_page_title"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(titleLb, gridBagConstraints);

        titleTxt.setToolTipText(options.getMsg("applet_page_title_tooltip"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(titleTxt, gridBagConstraints);

        exitUrlLb.setLabelFor(exitUrlTxt);
        exitUrlLb.setText(options.getMsg("applet_exitUrl"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(exitUrlLb, gridBagConstraints);

        exitUrlTxt.setToolTipText(options.getMsg("applet_exitUrl_tooltip"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(exitUrlTxt, gridBagConstraints);

        fullPageOption.setSelected(true);
        fullPageOption.setText(options.getMsg("applet_page_full"));
        bg.add(fullPageOption);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(fullPageOption, gridBagConstraints);

        mixedContentOption.setText(options.getMsg("applet_page_mixed"));
        bg.add(mixedContentOption);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(mixedContentOption, gridBagConstraints);

        sizePanel.setLayout(new java.awt.GridBagLayout());

        sizePanel.setBorder(new javax.swing.border.TitledBorder(options.getMsg("applet_size")));
        sizePanel.setToolTipText(options.getMsg("applet_size_tooltip"));
        colorLb.setLabelFor(colorButton);
        colorLb.setText(options.getMsg("applet_bgcolor"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        sizePanel.add(colorLb, gridBagConstraints);

        colorButton.setToolTipText(options.getMsg("applet_bgcolor_tooltip"));
        colorButton.setColor(settings.appletBgColor);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        sizePanel.add(colorButton, gridBagConstraints);

        prevTxtLb.setLabelFor(prevTextEdit);
        prevTxtLb.setText(options.getMsg("applet_prev_text"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        sizePanel.add(prevTxtLb, gridBagConstraints);

        prevTextScroll.setPreferredSize(new java.awt.Dimension(200, 60));
        prevTextScroll.setMinimumSize(new java.awt.Dimension(200, 60));
        prevTextEdit.setWrapStyleWord(true);
        prevTextEdit.setToolTipText(options.getMsg("applet_prev_text_tooltip"));
        prevTextEdit.setLineWrap(true);
        prevTextScroll.setViewportView(prevTextEdit);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        sizePanel.add(prevTextScroll, gridBagConstraints);

        widthLb.setLabelFor(widthText);
        widthLb.setText(options.getMsg("WIDTH"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        sizePanel.add(widthLb, gridBagConstraints);

        widthText.setToolTipText(options.getMsg("applet_width_tooltip"));
        widthText.setText(settings.appletWidth);
        widthText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        widthText.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        sizePanel.add(widthText, gridBagConstraints);

        heightLb.setLabelFor(heightText);
        heightLb.setText(options.getMsg("HEIGHT"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        sizePanel.add(heightLb, gridBagConstraints);

        heightText.setToolTipText(options.getMsg("applet_height_tooltip"));
        heightText.setText(settings.appletHeight);
        heightText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        heightText.setPreferredSize(new java.awt.Dimension(50, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        sizePanel.add(heightText, gridBagConstraints);

        centeredChk.setToolTipText(options.getMsg("applet_centered_tooltip"));
        centeredChk.setSelected(true);
        centeredChk.setText(options.getMsg("applet_centered"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        sizePanel.add(centeredChk, gridBagConstraints);

        postTxtLb.setLabelFor(postTextEdit);
        postTxtLb.setText(options.getMsg("applet_post_text"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        sizePanel.add(postTxtLb, gridBagConstraints);

        postTextScroll.setPreferredSize(new java.awt.Dimension(200, 60));
        postTextScroll.setMinimumSize(new java.awt.Dimension(200, 60));
        postTextEdit.setWrapStyleWord(true);
        postTextEdit.setToolTipText(options.getMsg("applet_post_text_tooltip"));
        postTextEdit.setLineWrap(true);
        postTextScroll.setViewportView(postTextEdit);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        sizePanel.add(postTextScroll, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(1, 2, 2, 2);
        add(sizePanel, gridBagConstraints);

    }//GEN-END:initComponents
    
    
    public void setValues(JClicProject prj){
        titleTxt.setText(prj.settings.title);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg;
    private javax.swing.JCheckBox centeredChk;
    private edu.xtec.jclic.beans.ColorButton colorButton;
    private javax.swing.JTextField exitUrlTxt;
    private javax.swing.JRadioButton fullPageOption;
    private javax.swing.JTextField heightText;
    private javax.swing.JRadioButton mixedContentOption;
    private javax.swing.JTextArea postTextEdit;
    private javax.swing.JTextArea prevTextEdit;
    private javax.swing.JPanel sizePanel;
    private javax.swing.JTextField titleTxt;
    private javax.swing.JTextField widthText;
    // End of variables declaration//GEN-END:variables
    

    private static AppletHtmlCreator panel;
    
    public static void createHtml(JClicProject prj, AuthorSettings settings, Component parent){
        Options options=prj.getBridge().getOptions();
        Messages msg=options.getMessages();
        if(panel==null)
            panel=new AppletHtmlCreator(options, settings);
        String prjFile=FileSystem.getFileNameOf(prj.getFullPath());
        panel.setValues(prj);
        if(msg.showInputDlg(parent, panel, "applet_create_title")){
            boolean full=panel.fullPageOption.isSelected();
            String title=panel.titleTxt.getText();
            String width=panel.widthText.getText();
            String height=panel.heightText.getText();
            String preApplet=panel.prevTextEdit.getText();
            String postApplet=panel.postTextEdit.getText();
            Color bgColor=panel.colorButton.getColor();
            boolean centered=panel.centeredChk.isSelected();
            StringBuilder optionalParams=new StringBuilder();
            String ps=StrUtils.nullableString(panel.exitUrlTxt.getText());
            if(ps!=null)
                optionalParams.append("\r\nsetExitUrl('").append(ps).append("');");
            int[] filters={Utils.ALL_HTML_FF};
            FileSystem fs=prj.getFileSystem();
            String path="index.htm";
            String fileName=fs.chooseFile(path, true, filters, options, null, parent, false);
            if(fileName!=null){
                try{
                    File file=new File(prj.getFileSystem().getFullFileNamePath(fileName));
                    FileOutputStream fos=prj.getFileSystem().createSecureFileOutputStream(fileName);
                    OutputStreamWriter osw=new OutputStreamWriter(fos, "UTF-8");
                    PrintWriter pw=new PrintWriter(osw);                    
                    //String s=ResourceManager.getResourceText("html/applet.html", true);
                    String s=StrUtils.replace(appletCode, "%ENCODING", /*osw.getEncoding()*/ "UTF-8");
                    s=StrUtils.replace(s, "%JAR_BASE", settings.appletCodeBase);
                    s=StrUtils.replace(s, "%TITLE", title);
                    StringBuilder sb=new StringBuilder();
                    if(full)
                        sb.append("leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\" onLoad=\"window.focus();\"");
                    else{
                        sb.append("bgcolor=#");
                        sb.append(Integer.toHexString(bgColor.getRed()));
                        sb.append(Integer.toHexString(bgColor.getGreen()));
                        sb.append(Integer.toHexString(bgColor.getBlue()));
                    }
                    s=StrUtils.replace(s, "%BODYPARAMS", sb.substring(0));
                    sb.setLength(0);
                    if(!full){
                        if(centered)
                            sb.append("<div align=\"center\">");
                        if(preApplet.length()>0)
                            sb.append(preApplet).append("<br>");
                    }
                    s=StrUtils.replace(s, "%PRE_APPLET", sb.substring(0));
                    s=StrUtils.replace(s, "%OTHER", optionalParams.substring(0));
                    s=StrUtils.replace(s, "%WIDTH", full ? "100%" : width);
                    s=StrUtils.replace(s, "%HEIGHT", full ? "100%" : height);
                    s=StrUtils.replace(s, "%PROJECT", prjFile);
                    sb.setLength(0);
                    if(!full){
                        if(postApplet.length()>0)
                            sb.append("<br>").append(postApplet);
                        if(centered)
                            sb.append("</div>");
                    }
                    // s=StrUtils.replace(s, "%POST_APPLET", postApplet);                    
                    s=StrUtils.replace(s, "%POST_APPLET", sb.substring(0));                    
                    pw.print(s);
                    pw.flush();
                    pw.close();
                    String prompt=StrUtils.replace(msg.get("applet_created_info"), "%s", fileName);
                    if(msg.showQuestionDlgObj(parent, prompt+"\n"+msg.get("applet_created_prompt"), null, "yn")==Messages.YES){
                        BrowserLauncher.openURL(prj.getFileSystem().getUrl(fileName));
                    }
                } catch(Exception ex){
                    options.getMessages().showErrorWarning(parent, "ERROR", ex);
                }
            }
        }
    }
    
    public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
        checkEnabled();
    }
    
    public final void checkEnabled(){
        boolean b=mixedContentOption.isSelected();
        colorButton.setEnabled(b);
        widthText.setEnabled(b);
        heightText.setEnabled(b);
        centeredChk.setEnabled(b);
        prevTextEdit.setEnabled(b);
        postTextEdit.setEnabled(b);
    }
    
}