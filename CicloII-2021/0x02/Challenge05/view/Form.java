package view;

import controller.Dao;
import model.Meat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Johanna Zuluaga, Javier Andrés Garzón Patarroyo
 */
public class Form extends javax.swing.JFrame {

    private ArrayList<Meat> list = new ArrayList<>();

    public Form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        nameValue = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        meatList = new javax.swing.JList<>();
        amountLabel = new javax.swing.JLabel();
        amountValue = new javax.swing.JTextField();
        animalLabel = new javax.swing.JLabel();
        animalValue = new javax.swing.JTextField();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        hairLabel = new javax.swing.JLabel();
        hairValue = new javax.swing.JTextField();
        checkBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        idValue = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        newBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        nameValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameValueActionPerformed(evt);
            }
        });

        nameLabel.setText("Nombre");

        saveBtn.setText("Guardar");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(meatList);

        amountLabel.setText("Cantidad");

        amountValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountValueActionPerformed(evt);
            }
        });

        animalLabel.setText("Animal");

        animalValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalValueActionPerformed(evt);
            }
        });

        editBtn.setText("Editar");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Eliminar");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        title.setText("CARNES");

        hairLabel.setText("Pelo (con/sin)");

        hairValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hairValueActionPerformed(evt);
            }
        });

        checkBtn.setText("Revisar conexión a la base de datos");
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancelar");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        newBtn.setText("Nuevo");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(checkBtn))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idValue, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title)
                            .addComponent(nameLabel)
                            .addComponent(nameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountLabel)
                            .addComponent(amountValue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(animalLabel)
                            .addComponent(animalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hairLabel)
                            .addComponent(hairValue, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(18, 18, 18)
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(amountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amountValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(animalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(animalValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hairLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hairValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn)
                    .addComponent(deleteBtn)
                    .addComponent(saveBtn)
                    .addComponent(newBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelBtn)
                .addGap(17, 17, 17)
                .addComponent(checkBtn))
        );

        pack();
    }// </editor-fold>
    /**
     * ****** Start our handling code *******
     */

    private void nameValueActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {
        Meat meat = new Meat();
        String id = this.idValue.getText();
        if (id != "") {
            meat.setId(id);
        }
        String name = this.nameValue.getText();
        meat.setName(name);
        String amount = this.amountValue.getText();
        meat.setAmount(amount);
        String animal = this.animalValue.getText();
        meat.setAnimal(animal);
        String hair = this.hairValue.getText();
        meat.setHair(hair);

        if ("".equals(name) || "".equals(amount) || "".equals(animal) || "".equals(hair)) {
            JOptionPane.showMessageDialog(rootPane, "Todos los campos son obligatorios");
            return;
        }

        Dao dao = new Dao();
        dao.saveOne(meat);
        updateList();
        cleanFields();
        //JOptionPane.showMessageDialog(rootPane, "Agregado!");
    }

    private void animalValueActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int index = this.meatList.getSelectedIndex();
        Meat meat = list.get(index);
        Dao dao = new Dao();
        dao.deleteOne(meat.getId());
        updateList();
        //JOptionPane.showMessageDialog(rootPane, "Eliminado!");
    }

    private void hairValueActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void checkBtnActionPerformed(java.awt.event.ActionEvent evt) {
        Dao dao = new Dao();
        dao.testConnection();
    }

    private void formComponentShown(java.awt.event.ComponentEvent evt) {
        updateList();
    }

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int index = this.meatList.getSelectedIndex();
        Meat meat = list.get(index);
        this.idValue.setText(meat.getId());
        this.nameValue.setText(meat.getName());
        this.amountValue.setText(meat.getAmount());
        this.animalValue.setText(meat.getAnimal());
        this.hairValue.setText(meat.getHair());
        //JOptionPane.showMessageDialog(rootPane, "listo para actualizar!");
    }

    private void amountValueActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {
        cleanFields();
    }

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {
        cleanFields();
    }
//2:57

    private void updateList() {
        Dao dao = new Dao();
        list = dao.readAll();

        DefaultListModel data = new DefaultListModel();
        for (byte i = 0; i < list.size(); i++) {
            Meat meat = list.get(i);
            data.addElement(meat.getMeat());
        }
        this.meatList.setModel(data);
    }

    private void cleanFields() {
        this.idValue.setText("");
        this.nameValue.setText("");
        this.amountValue.setText("");
        this.animalValue.setText("");
        this.hairValue.setText("");
    }

    /**
     * ****** End our handling code *******
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountValue;
    private javax.swing.JLabel animalLabel;
    private javax.swing.JTextField animalValue;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton checkBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel hairLabel;
    private javax.swing.JTextField hairValue;
    private javax.swing.JLabel idValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> meatList;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameValue;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel title;
    // End of variables declaration
}
