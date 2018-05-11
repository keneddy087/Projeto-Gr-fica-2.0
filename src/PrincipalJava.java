
import br.com.keneddy.objeto.Aluno;
import br.com.keneddy.objeto.Notas;
import br.com.keneddy.objeto.TipoAvaliacao;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SATC
 */
public class PrincipalJava extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalJava
     */
    public PrincipalJava() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPNotas = new javax.swing.JPanel();
        jBCalcular = new javax.swing.JButton();
        JLNotas = new javax.swing.JLabel();
        JLNota1 = new javax.swing.JLabel();
        JLNota2 = new javax.swing.JLabel();
        JLNota3 = new javax.swing.JLabel();
        JLNota4 = new javax.swing.JLabel();
        JTNota1 = new javax.swing.JTextField();
        JTNota2 = new javax.swing.JTextField();
        JTNota3 = new javax.swing.JTextField();
        JTNota4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        JLDisciplina = new javax.swing.JLabel();
        jTFDisciplina = new javax.swing.JTextField();
        jCombinacao = new javax.swing.JComboBox<>();
        JLTitulo = new javax.swing.JLabel();
        JPAlunos = new javax.swing.JPanel();
        JLAluno = new javax.swing.JLabel();
        JLMatricula = new javax.swing.JLabel();
        JTMatricula = new javax.swing.JTextField();
        JLNome = new javax.swing.JLabel();
        JTNome = new javax.swing.JTextField();
        JBCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPNotas.setBackground(new java.awt.Color(0, 102, 102));
        JPNotas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBCalcular.setText("Calcular");
        jBCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalcularActionPerformed(evt);
            }
        });

        JLNotas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLNotas.setText("Notas:");

        JLNota1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLNota1.setText("N1");

        JLNota2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLNota2.setText("N2");

        JLNota3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLNota3.setText("N3");

        JLNota4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLNota4.setText("N4");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        JLDisciplina.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLDisciplina.setText("Nome da Disciplina:");

        jCombinacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Prova", "Seminario", "Trabalho", " " }));

        javax.swing.GroupLayout JPNotasLayout = new javax.swing.GroupLayout(JPNotas);
        JPNotas.setLayout(JPNotasLayout);
        JPNotasLayout.setHorizontalGroup(
            JPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNotasLayout.createSequentialGroup()
                .addGroup(JPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNotasLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(JLDisciplina))
                    .addGroup(JPNotasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTFDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPNotasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCombinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNotasLayout.createSequentialGroup()
                        .addComponent(JLNota4)
                        .addGroup(JPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPNotasLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(JLNotas))
                            .addGroup(JPNotasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBCalcular)
                                    .addComponent(JTNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(JPNotasLayout.createSequentialGroup()
                        .addComponent(JLNota3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(JPNotasLayout.createSequentialGroup()
                            .addComponent(JLNota1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(JTNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPNotasLayout.createSequentialGroup()
                            .addComponent(JLNota2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(JTNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
        );
        JPNotasLayout.setVerticalGroup(
            JPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPNotasLayout.createSequentialGroup()
                .addGroup(JPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPNotasLayout.createSequentialGroup()
                        .addComponent(JLNotas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(JPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLNota1))
                        .addGap(18, 18, 18)
                        .addGroup(JPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLNota2))
                        .addGap(21, 21, 21)
                        .addGroup(JPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLNota3))
                        .addGap(18, 18, 18)
                        .addGroup(JPNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLNota4)))
                    .addGroup(JPNotasLayout.createSequentialGroup()
                        .addComponent(JLDisciplina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCombinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(13, 13, 13)
                .addComponent(jBCalcular)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JLTitulo.setBackground(new java.awt.Color(255, 0, 51));
        JLTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLTitulo.setText("Calculo da Média:");

        JPAlunos.setBackground(new java.awt.Color(0, 102, 102));
        JPAlunos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JPAlunos.setForeground(new java.awt.Color(0, 0, 204));

        JLAluno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLAluno.setText("Aluno:");

        JLMatricula.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLMatricula.setText("Mátricula:");

        JLNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLNome.setText("Nome:");

        JBCadastrar.setText("Cadastrar");
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPAlunosLayout = new javax.swing.GroupLayout(JPAlunos);
        JPAlunos.setLayout(JPAlunosLayout);
        JPAlunosLayout.setHorizontalGroup(
            JPAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBCadastrar)
                    .addComponent(JLNome)
                    .addGroup(JPAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JLAluno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLMatricula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(JTMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(JTNome))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        JPAlunosLayout.setVerticalGroup(
            JPAlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPAlunosLayout.createSequentialGroup()
                .addComponent(JLAluno)
                .addGap(18, 18, 18)
                .addComponent(JLMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(JLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBCadastrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(JPNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(JLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(JLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalcularActionPerformed
       TipoAvaliacao tipo = null;
       Aluno a = new Aluno(JTNome.getText(), Integer.parseInt(JTMatricula.getText()));
       switch(jCombinacao.getSelectedIndex()){
           case 0:
           {
            tipo = TipoAvaliacao.PROVA;  
            break;
           } 
           case 1:
           {
            tipo = TipoAvaliacao.SEMINARIO;
            break;
           }
           case 2:
           {
           tipo = TipoAvaliacao.TRABALHO;
           break;
           }
           
       }
       try {
       a.getNotas().add(new Notas(jTFDisciplina.getText(), tipo, Float.parseFloat(JTNota1.getText())));
       }catch(NumberFormatException nfe) {
       JOptionPane.showMessageDialog(this, "Você Digitou um caracter inválido!!"+nfe);
       throw new RuntimeException();
       }
       try {
       a.getNotas().add(new Notas(jTFDisciplina.getText(), tipo, Float.parseFloat(JTNota2.getText())));
       }catch(NumberFormatException nfe) {
   
       JOptionPane.showMessageDialog(this, "Você Digitou um Caraceter inválido"+nfe);
       throw new RuntimeException();
               }
       try {
       a.getNotas().add(new Notas(jTFDisciplina.getText(), tipo, Float.parseFloat(JTNota3.getText())));
        }catch(NumberFormatException nfe) {
       JOptionPane.showMessageDialog(this, "Você Digitou um caracter inválido!!"+nfe);
       throw new RuntimeException();
        }
       try {
       a.getNotas().add(new Notas(jTFDisciplina.getText(), tipo, Float.parseFloat(JTNota4.getText())));
        }catch(NumberFormatException nfe) {
       JOptionPane.showMessageDialog(this, "Você Digitou um caracter inválido!!"+nfe);
       throw new RuntimeException();
        } 
       JOptionPane.showMessageDialog(null, a.toString()      
               + "\n" + "media: " + a.calcularMedia());
    }//GEN-LAST:event_jBCalcularActionPerformed
    
    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        // TODO add your handling code here:
        String nome = JTNome.getText();
        int matricula = 0;
        try{
        matricula = Integer.parseInt(JTMatricula.getText());
        }catch(NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Você Digitou um caracter inválido!!"+nfe);
            throw new RuntimeException();
        }
        Aluno j = new Aluno(nome, matricula);
        JOptionPane.showMessageDialog(this, j.toString());  
    }//GEN-LAST:event_JBCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JLabel JLAluno;
    private javax.swing.JLabel JLDisciplina;
    private javax.swing.JLabel JLMatricula;
    private javax.swing.JLabel JLNome;
    private javax.swing.JLabel JLNota1;
    private javax.swing.JLabel JLNota2;
    private javax.swing.JLabel JLNota3;
    private javax.swing.JLabel JLNota4;
    private javax.swing.JLabel JLNotas;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JPanel JPAlunos;
    private javax.swing.JPanel JPNotas;
    private javax.swing.JTextField JTMatricula;
    private javax.swing.JTextField JTNome;
    private javax.swing.JTextField JTNota1;
    private javax.swing.JTextField JTNota2;
    private javax.swing.JTextField JTNota3;
    private javax.swing.JTextField JTNota4;
    private javax.swing.JButton jBCalcular;
    private javax.swing.JComboBox<String> jCombinacao;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFDisciplina;
    // End of variables declaration//GEN-END:variables
}
