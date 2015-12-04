package posto.view;

import posto.controller.PostoController;
import posto.model.TableModelPosto;
import posto.model.TableModelCombustivel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;

/**
 * @author Zilly
 */
public class PostoGUI extends javax.swing.JFrame {

    private PostoController controller;
    private TableModelPosto tabelaPosto;
    private TableModelCombustivel tabelaComb;

    /**
     * Creates new form PostoGUI
     */
    public PostoGUI() {
        tabelaPosto = new TableModelPosto();
        //tabela é criada com arrayList vazio por default
        tabelaComb = new TableModelCombustivel();
        controller = new PostoController(this, tabelaPosto, tabelaComb);

        initComponents();
    }

    //----------------------------Getters dos TextField
    public JFormattedTextField getJtBairro() {
        return jtBairro;
    }

    public JFormattedTextField getJtBandeira() {
        return jtBandeira;
    }

    public JFormattedTextField getJtCep() {
        return jtCep;
    }

    public JFormattedTextField getJtCnpj() {
        return jtCnpj;
    }

    public JFormattedTextField getJtEndereco() {
        return jtEndereco;
    }

    public JFormattedTextField getJtNomeFantasia() {
        return jtNomeFantasia;
    }

    public JFormattedTextField getJtRazaoSocial() {
        return jtRazaoSocial;
    }

    public JFormattedTextField getJtHistorico() {
        return jtHistorico;
    }

    public JFormattedTextField getJtDataColeta() {
        return jtDataColeta;
    }

    public JFormattedTextField getJtPrecoVenda() {
        return jtPrecoVenda;
    }

    public JFormattedTextField getJtTipoComb() {
        return jtTipoComb;
    }

    //--------------------------------Getter do TextField da Pesquisa
    public JFormattedTextField getJtPesquisa() {
        return jtPesquisa;
    }

    //--------------------------Getter do JLabel que mostra a imagem do posto
    public JLabel getImgPosto() {
        return imgPosto;
    }

    //------------------------------Getters de botões 
    public JButton getBtnAlterarPosto() {
        return btnAlterarPosto;
    }

    public JButton getBtnRemoverPosto() {
        return btnRemoverPosto;
    }

    public JButton getBtnAlterarComb() {
        return btnAlterarComb;
    }

    public JButton getBtnRemoverComb() {
        return btnRemoverComb;
    }

    public JButton getBtnInserirComb() {
        return btnInserirComb;
    }

    public JButton getBtnLimparComb() {
        return btnLimparComb;
    }

    //----------------------Getters para a tabela dos Postos
    public JTable getJtTabelaPosto() {
        return jtTabelaPosto;
    }

    //--------------------------Getters para a tabela dos Combustíveis
    public JTable getJtTabelaComb() {
        return jtTabelaComb;
    }

    //----------------------Getter do FileChooser
    public JFileChooser getFc() {
        return fc;
    }

    //--------------------Cria Option Pane com mensagem de erro
    public void showError(String msg) {
        JOptionPane.showMessageDialog(this, msg);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fc = new javax.swing.JFileChooser();
        jLabel8 = new javax.swing.JLabel();
        jtHistorico = new javax.swing.JFormattedTextField();
        btnLimparPosto = new javax.swing.JButton();
        btnRemoverPosto = new javax.swing.JButton();
        btnInserirPosto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAlterarPosto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabelaPosto = new javax.swing.JTable();
        imgPosto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTabelaComb = new javax.swing.JTable();
        btnImgChooser = new javax.swing.JButton();
        btnLimparComb = new javax.swing.JButton();
        btnAlterarComb = new javax.swing.JButton();
        btnRemoverComb = new javax.swing.JButton();
        btnInserirComb = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtCnpj = new javax.swing.JFormattedTextField();
        jtCep = new javax.swing.JFormattedTextField();
        jtRazaoSocial = new javax.swing.JFormattedTextField();
        jtNomeFantasia = new javax.swing.JFormattedTextField();
        jtBandeira = new javax.swing.JFormattedTextField();
        jtEndereco = new javax.swing.JFormattedTextField();
        jtBairro = new javax.swing.JFormattedTextField();
        jtTipoComb = new javax.swing.JFormattedTextField();
        jtDataColeta = new javax.swing.JFormattedTextField();
        jtPrecoVenda = new javax.swing.JFormattedTextField();
        jtPesquisa = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuBar = new javax.swing.JMenu();
        btnSalvarArq = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btnSair = new javax.swing.JMenuItem();

        fc.setAcceptAllFileFilterUsed(false);
        fc.setCurrentDirectory(new java.io.File("D:\\Google Drive\\facul\\semestre_03\\github\\paradigmas-elc117\\java\\T10\\src\\file\\img"));
        fc.setFileFilter(new ImgPostoFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setText("CEP");

        btnLimparPosto.setText("Limpar");
        btnLimparPosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparPostoActionPerformed(evt);
            }
        });

        btnRemoverPosto.setText("Remover");
        btnRemoverPosto.setEnabled(false);
        btnRemoverPosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverPostoActionPerformed(evt);
            }
        });

        btnInserirPosto.setText("Inserir");
        btnInserirPosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirPostoActionPerformed(evt);
            }
        });

        jLabel1.setText("CNPJ");

        btnAlterarPosto.setText("Alterar");
        btnAlterarPosto.setEnabled(false);
        btnAlterarPosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarPostoActionPerformed(evt);
            }
        });

        jLabel3.setText("Razão Social");

        jLabel4.setText("Nome Fantasia");

        jLabel5.setText("Bandeira");

        jLabel6.setText("Endereço");

        jLabel7.setText("Bairro");

        jtTabelaPosto.setModel(tabelaPosto);
        jtTabelaPosto.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtTabelaPosto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTabelaPostoMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtTabelaPostoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtTabelaPosto);

        imgPosto.setForeground(java.awt.SystemColor.activeCaptionBorder);

        jtTabelaComb.setModel(tabelaComb);
        jtTabelaComb.setName("j"); // NOI18N
        jtTabelaComb.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtTabelaComb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTabelaCombMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtTabelaCombMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jtTabelaComb);

        btnImgChooser.setText("Escolher Imagem");
        btnImgChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImgChooserActionPerformed(evt);
            }
        });

        btnLimparComb.setText("Limpar");
        btnLimparComb.setEnabled(false);
        btnLimparComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCombActionPerformed(evt);
            }
        });

        btnAlterarComb.setText("Alterar");
        btnAlterarComb.setEnabled(false);
        btnAlterarComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCombActionPerformed(evt);
            }
        });

        btnRemoverComb.setText("Remover");
        btnRemoverComb.setEnabled(false);
        btnRemoverComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverCombActionPerformed(evt);
            }
        });

        btnInserirComb.setText("Inserir");
        btnInserirComb.setEnabled(false);
        btnInserirComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirCombActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo de Combustível");

        jLabel9.setText("Data de Coleta ");

        jLabel10.setText("Preço de Venda");

        try {
            jtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jtDataColeta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisaKeyReleased(evt);
            }
        });

        jLabel11.setText("Nome do Arquivo do Histórico");

        jLabel12.setText("Pesquisa por Bairro");

        jMenuBar.setText("File");

        btnSalvarArq.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        btnSalvarArq.setText("Salvar Arquivo");
        btnSalvarArq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarArqActionPerformed(evt);
            }
        });
        jMenuBar.add(btnSalvarArq);
        jMenuBar.add(jSeparator2);

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jMenuBar.add(btnSair);

        jMenuBar1.add(jMenuBar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimparPosto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarPosto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverPosto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInserirPosto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtHistorico))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                        .addComponent(jtRazaoSocial)
                                        .addComponent(jtNomeFantasia)
                                        .addComponent(jtBandeira)
                                        .addComponent(jtEndereco))
                                    .addComponent(jtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(imgPosto, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(btnImgChooser)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel10))
                                            .addGap(25, 25, 25))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtTipoComb)
                                        .addComponent(jtDataColeta)
                                        .addComponent(jtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(51, 51, 51))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap()))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnLimparComb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterarComb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemoverComb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInserirComb)
                                .addGap(66, 66, 66))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtTipoComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtDataColeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimparComb)
                            .addComponent(btnAlterarComb)
                            .addComponent(btnRemoverComb)
                            .addComponent(btnInserirComb))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jtBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(imgPosto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnImgChooser)
                            .addComponent(jLabel11)
                            .addComponent(jtHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimparPosto)
                            .addComponent(btnAlterarPosto)
                            .addComponent(btnRemoverPosto)
                            .addComponent(btnInserirPosto))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarPostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarPostoActionPerformed
        controller.updatePosto();
    }//GEN-LAST:event_btnAlterarPostoActionPerformed

    private void btnInserirPostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirPostoActionPerformed
        controller.addPosto();
    }//GEN-LAST:event_btnInserirPostoActionPerformed

    private void btnLimparPostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparPostoActionPerformed
        controller.clearPosto();
    }//GEN-LAST:event_btnLimparPostoActionPerformed

    private void btnRemoverPostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverPostoActionPerformed
        controller.deletePosto();
    }//GEN-LAST:event_btnRemoverPostoActionPerformed

    private void jtTabelaPostoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTabelaPostoMouseReleased
        controller.selectPosto();
    }//GEN-LAST:event_jtTabelaPostoMouseReleased

    private void jtTabelaPostoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTabelaPostoMouseClicked
        controller.selectPosto();
    }//GEN-LAST:event_jtTabelaPostoMouseClicked

    private void btnImgChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImgChooserActionPerformed
        controller.selectImg();
    }//GEN-LAST:event_btnImgChooserActionPerformed

    private void btnLimparCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCombActionPerformed
        controller.clearComb();
    }//GEN-LAST:event_btnLimparCombActionPerformed

    private void btnAlterarCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCombActionPerformed
        controller.updateComb();
    }//GEN-LAST:event_btnAlterarCombActionPerformed

    private void btnRemoverCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverCombActionPerformed
        controller.deleteComb();
    }//GEN-LAST:event_btnRemoverCombActionPerformed

    private void btnInserirCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirCombActionPerformed
        controller.addComb();
    }//GEN-LAST:event_btnInserirCombActionPerformed

    private void jtTabelaCombMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTabelaCombMouseClicked
        controller.selectComb();
    }//GEN-LAST:event_jtTabelaCombMouseClicked

    private void jtTabelaCombMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTabelaCombMouseReleased
        controller.selectComb();
    }//GEN-LAST:event_jtTabelaCombMouseReleased

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarArqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarArqActionPerformed
        controller.salvarArq();
    }//GEN-LAST:event_btnSalvarArqActionPerformed

    private void jtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisaKeyReleased
        controller.pesquisa();
    }//GEN-LAST:event_jtPesquisaKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarComb;
    private javax.swing.JButton btnAlterarPosto;
    private javax.swing.JButton btnImgChooser;
    private javax.swing.JButton btnInserirComb;
    private javax.swing.JButton btnInserirPosto;
    private javax.swing.JButton btnLimparComb;
    private javax.swing.JButton btnLimparPosto;
    private javax.swing.JButton btnRemoverComb;
    private javax.swing.JButton btnRemoverPosto;
    private javax.swing.JMenuItem btnSair;
    private javax.swing.JMenuItem btnSalvarArq;
    private javax.swing.JFileChooser fc;
    private javax.swing.JLabel imgPosto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenuBar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JFormattedTextField jtBairro;
    private javax.swing.JFormattedTextField jtBandeira;
    private javax.swing.JFormattedTextField jtCep;
    private javax.swing.JFormattedTextField jtCnpj;
    private javax.swing.JFormattedTextField jtDataColeta;
    private javax.swing.JFormattedTextField jtEndereco;
    private javax.swing.JFormattedTextField jtHistorico;
    private javax.swing.JFormattedTextField jtNomeFantasia;
    private javax.swing.JFormattedTextField jtPesquisa;
    private javax.swing.JFormattedTextField jtPrecoVenda;
    private javax.swing.JFormattedTextField jtRazaoSocial;
    private javax.swing.JTable jtTabelaComb;
    private javax.swing.JTable jtTabelaPosto;
    private javax.swing.JFormattedTextField jtTipoComb;
    // End of variables declaration//GEN-END:variables
}
