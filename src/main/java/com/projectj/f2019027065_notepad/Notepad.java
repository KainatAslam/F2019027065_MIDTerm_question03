
package com.projectj.f2019027065_notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Notepad extends javax.swing.JFrame implements ActionListener{
    String textcopy;
    
    public Notepad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        horizontalbar = new javax.swing.JScrollBar();
        Verticallbar = new javax.swing.JScrollBar();
        toolbarpanel = new javax.swing.JPanel();
        savebtn = new javax.swing.JButton();
        newbtn = new javax.swing.JButton();
        undobtn = new javax.swing.JButton();
        redobtn = new javax.swing.JButton();
        zoominbtn = new javax.swing.JButton();
        zoomoutbtn = new javax.swing.JButton();
        printbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        menubarmain = new javax.swing.JMenuBar();
        Filemenu = new javax.swing.JMenu();
        newmenu = new javax.swing.JMenuItem();
        openmenu = new javax.swing.JMenuItem();
        savemenu = new javax.swing.JMenuItem();
        saveasmenu = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        printmenu = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        exitmenu = new javax.swing.JMenuItem();
        editmenu = new javax.swing.JMenu();
        copymenu = new javax.swing.JMenuItem();
        cutmenu = new javax.swing.JMenuItem();
        pastemenu = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        undomenu = new javax.swing.JMenuItem();
        redomenu = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        selectallmenu = new javax.swing.JMenuItem();
        viewmenu = new javax.swing.JMenu();
        zoominmenu = new javax.swing.JMenuItem();
        zoomoutmenu = new javax.swing.JMenuItem();
        helpmenu = new javax.swing.JMenu();
        hellpmenu = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Verticallbar.setOrientation(javax.swing.JScrollBar.HORIZONTAL);

        toolbarpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/save.png"))); // NOI18N
        savebtn.setActionCommand("savetbn");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        newbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/new.png"))); // NOI18N
        newbtn.setActionCommand("newfilebtn");
        newbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbtnActionPerformed(evt);
            }
        });

        undobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/undo.png"))); // NOI18N
        undobtn.setActionCommand("undobtn");

        redobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/redo.png"))); // NOI18N
        redobtn.setActionCommand("redobtn");

        zoominbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/zoom.png"))); // NOI18N
        zoominbtn.setActionCommand("zoominbtn");

        zoomoutbtn.setBackground(new java.awt.Color(255, 255, 255));
        zoomoutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/zoomout.png"))); // NOI18N
        zoomoutbtn.setActionCommand("zomoutbtn");

        printbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/print.png"))); // NOI18N
        printbtn.setActionCommand("printbtn");
        printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout toolbarpanelLayout = new javax.swing.GroupLayout(toolbarpanel);
        toolbarpanel.setLayout(toolbarpanelLayout);
        toolbarpanelLayout.setHorizontalGroup(
            toolbarpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbarpanelLayout.createSequentialGroup()
                .addComponent(newbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(undobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zoominbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zoomoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(567, Short.MAX_VALUE))
        );
        toolbarpanelLayout.setVerticalGroup(
            toolbarpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(toolbarpanelLayout.createSequentialGroup()
                .addComponent(newbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(toolbarpanelLayout.createSequentialGroup()
                .addGroup(toolbarpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(printbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(zoomoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(zoominbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(redobtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(undobtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savebtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        Filemenu.setText("File");
        Filemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilemenuActionPerformed(evt);
            }
        });

        newmenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        newmenu.setText("New");
        newmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newmenuActionPerformed(evt);
            }
        });
        Filemenu.add(newmenu);

        openmenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        openmenu.setText("Open");
        openmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openmenuActionPerformed(evt);
            }
        });
        Filemenu.add(openmenu);

        savemenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        savemenu.setText("Save");
        savemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savemenuActionPerformed(evt);
            }
        });
        Filemenu.add(savemenu);

        saveasmenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        saveasmenu.setText("Save As");
        Filemenu.add(saveasmenu);
        Filemenu.add(jSeparator1);

        printmenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        printmenu.setText("Print");
        printmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printmenuActionPerformed(evt);
            }
        });
        Filemenu.add(printmenu);
        Filemenu.add(jSeparator2);

        exitmenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        exitmenu.setText("Exit");
        exitmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitmenuActionPerformed(evt);
            }
        });
        Filemenu.add(exitmenu);

        menubarmain.add(Filemenu);

        editmenu.setText("Edit");

        copymenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        copymenu.setText("Copy");
        copymenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copymenuActionPerformed(evt);
            }
        });
        editmenu.add(copymenu);

        cutmenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cutmenu.setText("Cut");
        cutmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutmenuActionPerformed(evt);
            }
        });
        editmenu.add(cutmenu);

        pastemenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        pastemenu.setText("Paste");
        pastemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastemenuActionPerformed(evt);
            }
        });
        editmenu.add(pastemenu);
        editmenu.add(jSeparator3);

        undomenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        undomenu.setText("Undo");
        editmenu.add(undomenu);

        redomenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        redomenu.setText("Redo");
        editmenu.add(redomenu);
        editmenu.add(jSeparator4);

        selectallmenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        selectallmenu.setText("Select All");
        selectallmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectallmenuActionPerformed(evt);
            }
        });
        editmenu.add(selectallmenu);

        menubarmain.add(editmenu);

        viewmenu.setText("View");

        zoominmenu.setText("Zoom In");
        viewmenu.add(zoominmenu);

        zoomoutmenu.setText("Zoom Out");
        viewmenu.add(zoomoutmenu);

        menubarmain.add(viewmenu);

        helpmenu.setText("Help");

        hellpmenu.setText("Help?");
        helpmenu.add(hellpmenu);

        menubarmain.add(helpmenu);

        setJMenuBar(menubarmain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Verticallbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toolbarpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horizontalbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(horizontalbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolbarpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Verticallbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void savemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savemenuActionPerformed
               JFileChooser save = new JFileChooser();
                save.setApproveButtonText("Save");
                int act = save.showOpenDialog(this);
                if(act!=JFileChooser.APPROVE_OPTION){
                return;
                }
                
                File filename = new File(save.getSelectedFile()+ ".txt");
                BufferedWriter bufwriter = null;
                try {
                        bufwriter = new BufferedWriter(new FileWriter(filename));
                        textarea.write(bufwriter);
                    } catch (Exception e) {
                    }
    }//GEN-LAST:event_savemenuActionPerformed

    private void exitmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitmenuActionPerformed
                System.exit(0);
    }//GEN-LAST:event_exitmenuActionPerformed

    private void copymenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copymenuActionPerformed
        textcopy= textarea.getSelectedText();
    }//GEN-LAST:event_copymenuActionPerformed

    private void cutmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutmenuActionPerformed
        textcopy = textarea.getSelectedText();
        textarea.replaceRange("",textarea.getSelectionStart(), textarea.getSelectionEnd());
    }//GEN-LAST:event_cutmenuActionPerformed

    private void pastemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastemenuActionPerformed
        textarea.insert(textcopy, textarea.getCaretPosition());
    }//GEN-LAST:event_pastemenuActionPerformed

    private void FilemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilemenuActionPerformed
             
            
    }//GEN-LAST:event_FilemenuActionPerformed

    private void selectallmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectallmenuActionPerformed
        textarea.selectAll();
    }//GEN-LAST:event_selectallmenuActionPerformed

    private void newmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newmenuActionPerformed
             newmenu.addActionListener(this);
             textarea.setText("");
    }//GEN-LAST:event_newmenuActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
                JFileChooser save = new JFileChooser();
                save.setApproveButtonText("Save");
                int act = save.showOpenDialog(this);
                if(act!=JFileChooser.APPROVE_OPTION){
                return;
                }
                
                File filename = new File(save.getSelectedFile()+ ".txt");
                BufferedWriter bufwriter = null;
                try {
                        bufwriter = new BufferedWriter(new FileWriter(filename));
                        textarea.write(bufwriter);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void newbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbtnActionPerformed
             newbtn.addActionListener(this);
             textarea.setText("");
    }//GEN-LAST:event_newbtnActionPerformed

    private void openmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openmenuActionPerformed
                JFileChooser choose = new JFileChooser();
                choose.setAcceptAllFileFilterUsed(false);
                FileNameExtensionFilter restrict  = new FileNameExtensionFilter("Only .txt Files", "txt");
                choose.addChoosableFileFilter(restrict);
                
                int act = choose.showOpenDialog(this);
                if (act != JFileChooser.APPROVE_OPTION) {
                           return;
                                                        }
                File file = choose.getSelectedFile();
                         try {
                        BufferedReader bufread = new BufferedReader(new FileReader(file));
                        textarea.read(bufread, null);
                        } catch (Exception e) {
                            }
    }//GEN-LAST:event_openmenuActionPerformed

    private void printmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printmenuActionPerformed
                try {
                        textarea.print();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_printmenuActionPerformed

    private void printbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbtnActionPerformed
        try {
                        textarea.print();
        } catch (Exception e) {
    }//GEN-LAST:event_printbtnActionPerformed
    }
    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Filemenu;
    private javax.swing.JScrollBar Verticallbar;
    private javax.swing.JMenuItem copymenu;
    private javax.swing.JMenuItem cutmenu;
    private javax.swing.JMenu editmenu;
    private javax.swing.JMenuItem exitmenu;
    private javax.swing.JMenuItem hellpmenu;
    private javax.swing.JMenu helpmenu;
    private javax.swing.JScrollBar horizontalbar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenuBar menubarmain;
    private javax.swing.JButton newbtn;
    private javax.swing.JMenuItem newmenu;
    private javax.swing.JMenuItem openmenu;
    private javax.swing.JMenuItem pastemenu;
    private javax.swing.JButton printbtn;
    private javax.swing.JMenuItem printmenu;
    private javax.swing.JButton redobtn;
    private javax.swing.JMenuItem redomenu;
    private javax.swing.JMenuItem saveasmenu;
    private javax.swing.JButton savebtn;
    private javax.swing.JMenuItem savemenu;
    private javax.swing.JMenuItem selectallmenu;
    private javax.swing.JTextArea textarea;
    private javax.swing.JPanel toolbarpanel;
    private javax.swing.JButton undobtn;
    private javax.swing.JMenuItem undomenu;
    private javax.swing.JMenu viewmenu;
    private javax.swing.JButton zoominbtn;
    private javax.swing.JMenuItem zoominmenu;
    private javax.swing.JButton zoomoutbtn;
    private javax.swing.JMenuItem zoomoutmenu;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
