
package cadastro;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JFrameProduto extends javax.swing.JFrame {

    public JFrameProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1Cod = new javax.swing.JLabel();
        JTextFieldCod = new javax.swing.JTextField();
        jLabel2Prod = new javax.swing.JLabel();
        jTextField2Prod = new javax.swing.JTextField();
        jLabel3Quant = new javax.swing.JLabel();
        jTextField3Quant = new javax.swing.JTextField();
        Precom = new javax.swing.JLabel();
        jTextField4Precom = new javax.swing.JTextField();
        jLabel5Preven = new javax.swing.JLabel();
        jTextField5Preven = new javax.swing.JTextField();
        Fornen = new javax.swing.JLabel();
        jButton1Inser = new javax.swing.JButton();
        jButton2List = new javax.swing.JButton();
        jButton3Atual = new javax.swing.JButton();
        jButton4Excluir = new javax.swing.JButton();
        jLabel1Fornen = new javax.swing.JLabel();
        jTextField1Fornen = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1Cod.setText("Cod:");

        jLabel2Prod.setText("Produto");

        jTextField2Prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ProdActionPerformed(evt);
            }
        });

        jLabel3Quant.setText("Quantidade");

        Precom.setText("Preço de Compra");

        jLabel5Preven.setText("Preço de Venda");

        Fornen.setText("Fornecedor");

        jButton1Inser.setText("Inserir");
        jButton1Inser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1InserActionPerformed(evt);
            }
        });

        jButton2List.setText("Listagem");
        jButton2List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ListActionPerformed(evt);
            }
        });

        jButton3Atual.setText("Atualizar");
        jButton3Atual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3AtualActionPerformed(evt);
            }
        });

        jButton4Excluir.setText("Excluir");
        jButton4Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ExcluirActionPerformed(evt);
            }
        });

        jTextField1Fornen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1FornenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1Cod, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3Quant)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3Quant, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2Prod)
                                .addGap(33, 33, 33)
                                .addComponent(jTextField2Prod, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel5Preven)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField5Preven, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(271, 271, 271)
                                .addComponent(jLabel1Fornen)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1Inser)
                        .addGap(87, 87, 87)
                        .addComponent(jButton2List)
                        .addGap(89, 89, 89)
                        .addComponent(jButton3Atual)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Precom)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4Precom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Fornen)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1Fornen, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jButton4Excluir)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Cod)
                    .addComponent(JTextFieldCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2Prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2Prod)
                    .addComponent(jTextField1Fornen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fornen))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5Preven)
                    .addComponent(jTextField5Preven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1Fornen)
                    .addComponent(jLabel3Quant)
                    .addComponent(jTextField3Quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precom)
                    .addComponent(jTextField4Precom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Inser)
                    .addComponent(jButton4Excluir)
                    .addComponent(jButton3Atual)
                    .addComponent(jButton2List))
                .addGap(53, 53, 53))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Cadastro de Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        jMenu1.setText("Menu");

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextField1FornenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1FornenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FornenActionPerformed

    private void jButton4ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ExcluirActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/produto?useTimezone=true&serverTimezone=UTC", "root", "");

            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("DELETE FROM produto WHERE cod='" + this.JTextFieldCod.getText() + "'");
            JOptionPane.showMessageDialog(rootPane, "produto excluído");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
                                 
    }//GEN-LAST:event_jButton4ExcluirActionPerformed

    private void jButton3AtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3AtualActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/produto?useTimezone=true&serverTimezone=UTC", "root", "");
            java.sql.Statement st = conn.createStatement();
            st.executeUpdate("UPDATE produto SET cod='"
                + this.JTextFieldCod.getText() + "',precocompra='"
                + this.jTextField4Precom.getText()             
                + "' ,produto='" + this.jTextField2Prod.getText()
                + "' ,quantidade='" + this.jTextField3Quant.getText()
                + "' ,precovenda='" + this.jTextField5Preven.getText()
                + "' ,fornecedor='" + this.jTextField1Fornen.getText()  + "'");
            JOptionPane.showMessageDialog(rootPane, "Produto atualizado");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton3AtualActionPerformed

    private void jButton2ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ListActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn;
     conn = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/produto?useTimezone=true&serverTimezone=UTC", "root", "");
            java.sql.Statement st = conn.createStatement();
            st.executeQuery("select * from Produto");
            ResultSet rs = st.getResultSet();
            while (rs.next()) {
                System.out.print(rs.getString("cod") + ", ");
                System.out.print(rs.getString("quantidade") + ", ");
                System.out.println(rs.getString("precovenda"));
                System.out.println(rs.getString("produto"));
                System.out.println(rs.getString("fornecedor"));
                System.out.println(rs.getString("precocompra"));              
            }       
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }                                          
    }//GEN-LAST:event_jButton2ListActionPerformed

    private void jButton1InserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1InserActionPerformed
        java.sql.Connection con;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = java.sql.DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/produto?useTimezone=true&serverTimezone=UTC", "root","");
        }
        catch (ClassNotFoundException | SQLException e) {
            throw new java.lang.RuntimeException("erro ao conectar");
        }
        String Cod = this.JTextFieldCod.getText();
        String Precom = this.jTextField4Precom.getText();
        String Prod = this.jTextField2Prod.getText();
        String Preven = this.jTextField5Preven.getText();
        String Quant = this.jTextField3Quant.getText();
        String Fornen = this.jTextField1Fornen.getText();

        String comando = "insert into produto (cod, precocompra, produto, precovenda, quantidade, fornecedor)" +
        "values " + "('"+Cod+"','" +Precom+"','"+Prod+"','"+Preven+"','" +Quant+"','"+Fornen+"')";

        try(    java.sql.Statement stmt = con.createStatement()) {
            stmt.executeUpdate(comando);
        }
        catch(java.sql.SQLException e){
            throw new java.lang.RuntimeException(e.getMessage());
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(jLabel1Cod.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con.close();
        }
        catch (Exception e) {
            throw new java.lang.RuntimeException("erro fechar");
        }
    }//GEN-LAST:event_jButton1InserActionPerformed

    private void jTextField2ProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ProdActionPerformed

    }//GEN-LAST:event_jTextField2ProdActionPerformed
 
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fornen;
    private javax.swing.JTextField JTextFieldCod;
    private javax.swing.JLabel Precom;
    private javax.swing.JButton jButton1Inser;
    private javax.swing.JButton jButton2List;
    private javax.swing.JButton jButton3Atual;
    private javax.swing.JButton jButton4Excluir;
    private javax.swing.JLabel jLabel1Cod;
    private javax.swing.JLabel jLabel1Fornen;
    private javax.swing.JLabel jLabel2Prod;
    private javax.swing.JLabel jLabel3Quant;
    private javax.swing.JLabel jLabel5Preven;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1Fornen;
    private javax.swing.JTextField jTextField2Prod;
    private javax.swing.JTextField jTextField3Quant;
    private javax.swing.JTextField jTextField4Precom;
    private javax.swing.JTextField jTextField5Preven;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
