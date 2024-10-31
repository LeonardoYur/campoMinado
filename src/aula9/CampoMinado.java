
package aula9;

import java.awt.Color;
import javax.swing.JLabel;


public class CampoMinado extends javax.swing.JFrame {

    private final Color CASA_CLARA = new Color(170, 215, 81);
    private final Color CASA_ESCURA = new Color(162, 209, 73);
    private final Color CASA_CLARA_USADA = new Color(229, 194, 159);
    private final Color CASA_ESCURA_USADA = new Color(215, 184, 153);
    private final Color COR_NUMERO_UM = new Color(25, 118, 210);
    private final Color COR_NUMERO_DOIS = new Color(56, 142, 60);
    private final Color COR_NUMERO_TRES = new Color(211, 47, 47);
    private final Color COR_NUMERO_QUATRO = new Color(123, 31, 162);
    private final Color COR_NUMERO_CINCO = new Color(255, 143, 0);

    JLabel[] campos;
    int campoMinado[];
    int bomba[];

    public CampoMinado() {
        initComponents();

        campos = new JLabel[]{lblCampo0, lblCampo1, lblCampo2, lblCampo3, lblCampo4, lblCampo5, lblCampo6, lblCampo7, lblCampo8, lblCampo9, lblCampo10, lblCampo11, lblCampo12, lblCampo13, lblCampo14, lblCampo15, lblCampo16, lblCampo17, lblCampo18, lblCampo19, lblCampo20, lblCampo21, lblCampo22, lblCampo23, lblCampo24, lblCampo25, lblCampo26, lblCampo27, lblCampo28, lblCampo29, lblCampo30, lblCampo31, lblCampo32, lblCampo33, lblCampo34, lblCampo35, lblCampo36, lblCampo37, lblCampo38, lblCampo39, lblCampo40, lblCampo41, lblCampo42, lblCampo43, lblCampo44, lblCampo45, lblCampo46, lblCampo47, lblCampo48, lblCampo49, lblCampo50, lblCampo51, lblCampo52, lblCampo53, lblCampo54, lblCampo55, lblCampo56, lblCampo57, lblCampo58, lblCampo59, lblCampo60, lblCampo61, lblCampo62, lblCampo63};
        bomba = new int[]{0, 0, 0, 0, 0, 0, 0};
        campoMinado = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < 7; i++) {
            int test = (int) (Math.random() * 63);
            bomba[i] = test;
            System.out.println(bomba[i]);
        }

        System.out.println("=======================");
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 64; i++) {
                if (bomba[j] == i) {
                    campoMinado[i] = -1;
                    if (i > 7) {
                        campoMinado[i - 7]++;
                    }
                    if (i > 8) {
                        campoMinado[i - 8]++;
                    }
                    if (i > 9) {
                        campoMinado[i - 9]++;
                    }
                    if (i != 0) {
                        campoMinado[i - 1]++;
                    }
                    if (i < 56) {
                        campoMinado[i + 7]++;
                    }
                    if (i < 55) {
                        campoMinado[i + 8]++;
                    }
                    if (i < 54) {
                        campoMinado[i + 9]++;
                    }
                    if (i != 63) {
                        campoMinado[i + 1]++;
                    }
                }

            }
        }

        for (int i = 0; i < 64; i++) {
            campos[i].setText(""+campoMinado[i]);
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JLabel label = campos[i * 8 + j];

                if ((i + j) % 2 == 0) {
                    label.setBackground(CASA_CLARA);
                } else {
                    label.setBackground(CASA_ESCURA);
                }
            }
        }
    }

    public void Jogar() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCampo0 = new javax.swing.JLabel();
        lblCampo1 = new javax.swing.JLabel();
        lblCampo2 = new javax.swing.JLabel();
        lblCampo3 = new javax.swing.JLabel();
        lblCampo4 = new javax.swing.JLabel();
        lblCampo5 = new javax.swing.JLabel();
        lblCampo6 = new javax.swing.JLabel();
        lblCampo7 = new javax.swing.JLabel();
        lblCampo8 = new javax.swing.JLabel();
        lblCampo9 = new javax.swing.JLabel();
        lblCampo10 = new javax.swing.JLabel();
        lblCampo11 = new javax.swing.JLabel();
        lblCampo12 = new javax.swing.JLabel();
        lblCampo13 = new javax.swing.JLabel();
        lblCampo14 = new javax.swing.JLabel();
        lblCampo15 = new javax.swing.JLabel();
        lblCampo16 = new javax.swing.JLabel();
        lblCampo17 = new javax.swing.JLabel();
        lblCampo18 = new javax.swing.JLabel();
        lblCampo19 = new javax.swing.JLabel();
        lblCampo20 = new javax.swing.JLabel();
        lblCampo21 = new javax.swing.JLabel();
        lblCampo22 = new javax.swing.JLabel();
        lblCampo23 = new javax.swing.JLabel();
        lblCampo24 = new javax.swing.JLabel();
        lblCampo25 = new javax.swing.JLabel();
        lblCampo26 = new javax.swing.JLabel();
        lblCampo27 = new javax.swing.JLabel();
        lblCampo28 = new javax.swing.JLabel();
        lblCampo29 = new javax.swing.JLabel();
        lblCampo30 = new javax.swing.JLabel();
        lblCampo31 = new javax.swing.JLabel();
        lblCampo32 = new javax.swing.JLabel();
        lblCampo33 = new javax.swing.JLabel();
        lblCampo34 = new javax.swing.JLabel();
        lblCampo35 = new javax.swing.JLabel();
        lblCampo36 = new javax.swing.JLabel();
        lblCampo37 = new javax.swing.JLabel();
        lblCampo38 = new javax.swing.JLabel();
        lblCampo39 = new javax.swing.JLabel();
        lblCampo40 = new javax.swing.JLabel();
        lblCampo41 = new javax.swing.JLabel();
        lblCampo42 = new javax.swing.JLabel();
        lblCampo43 = new javax.swing.JLabel();
        lblCampo44 = new javax.swing.JLabel();
        lblCampo45 = new javax.swing.JLabel();
        lblCampo46 = new javax.swing.JLabel();
        lblCampo47 = new javax.swing.JLabel();
        lblCampo48 = new javax.swing.JLabel();
        lblCampo49 = new javax.swing.JLabel();
        lblCampo50 = new javax.swing.JLabel();
        lblCampo51 = new javax.swing.JLabel();
        lblCampo52 = new javax.swing.JLabel();
        lblCampo53 = new javax.swing.JLabel();
        lblCampo54 = new javax.swing.JLabel();
        lblCampo55 = new javax.swing.JLabel();
        lblCampo56 = new javax.swing.JLabel();
        lblCampo57 = new javax.swing.JLabel();
        lblCampo58 = new javax.swing.JLabel();
        lblCampo59 = new javax.swing.JLabel();
        lblCampo60 = new javax.swing.JLabel();
        lblCampo61 = new javax.swing.JLabel();
        lblCampo62 = new javax.swing.JLabel();
        lblCampo63 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new java.awt.GridLayout(8, 8));

        lblCampo0.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo0.setOpaque(true);
        lblCampo0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo0MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo0);

        lblCampo1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo1.setOpaque(true);
        lblCampo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo1MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo1);

        lblCampo2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo2.setOpaque(true);
        lblCampo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo2MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo2);

        lblCampo3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo3.setOpaque(true);
        lblCampo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo3MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo3);

        lblCampo4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo4.setOpaque(true);
        lblCampo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo4MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo4);

        lblCampo5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo5.setOpaque(true);
        lblCampo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo5MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo5);

        lblCampo6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo6.setOpaque(true);
        lblCampo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo6MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo6);

        lblCampo7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo7.setOpaque(true);
        lblCampo7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo7MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo7);

        lblCampo8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo8.setOpaque(true);
        lblCampo8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo8MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo8);

        lblCampo9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo9.setOpaque(true);
        lblCampo9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo9MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo9);

        lblCampo10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo10.setOpaque(true);
        lblCampo10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo10MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo10);

        lblCampo11.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo11.setOpaque(true);
        lblCampo11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo11MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo11);

        lblCampo12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo12.setOpaque(true);
        lblCampo12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo12MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo12);

        lblCampo13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo13.setOpaque(true);
        lblCampo13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo13MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo13);

        lblCampo14.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo14.setOpaque(true);
        lblCampo14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo14MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo14);

        lblCampo15.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo15.setOpaque(true);
        lblCampo15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo15MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo15);

        lblCampo16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo16.setOpaque(true);
        lblCampo16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo16MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo16);

        lblCampo17.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo17.setOpaque(true);
        lblCampo17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo17MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo17);

        lblCampo18.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo18.setOpaque(true);
        lblCampo18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo18MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo18);

        lblCampo19.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo19.setOpaque(true);
        lblCampo19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo19MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo19);

        lblCampo20.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo20.setOpaque(true);
        lblCampo20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo20MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo20);

        lblCampo21.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo21.setOpaque(true);
        lblCampo21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo21MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo21);

        lblCampo22.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo22.setOpaque(true);
        lblCampo22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo22MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo22);

        lblCampo23.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo23.setOpaque(true);
        lblCampo23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo23MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo23);

        lblCampo24.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo24.setOpaque(true);
        lblCampo24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo24MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo24);

        lblCampo25.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo25.setOpaque(true);
        lblCampo25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo25MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo25);

        lblCampo26.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo26.setOpaque(true);
        lblCampo26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo26MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo26);

        lblCampo27.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo27.setOpaque(true);
        lblCampo27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo27MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo27);

        lblCampo28.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo28.setOpaque(true);
        lblCampo28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo28MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo28);

        lblCampo29.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo29.setOpaque(true);
        lblCampo29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo29MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo29);

        lblCampo30.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo30.setOpaque(true);
        lblCampo30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo30MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo30);

        lblCampo31.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo31.setOpaque(true);
        lblCampo31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo31MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo31);

        lblCampo32.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo32.setOpaque(true);
        lblCampo32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo32MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo32);

        lblCampo33.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo33.setOpaque(true);
        lblCampo33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo33MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo33);

        lblCampo34.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo34.setOpaque(true);
        lblCampo34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo34MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo34);

        lblCampo35.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo35.setOpaque(true);
        lblCampo35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo35MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo35);

        lblCampo36.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo36.setOpaque(true);
        lblCampo36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo36MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo36);

        lblCampo37.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo37.setOpaque(true);
        lblCampo37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo37MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo37);

        lblCampo38.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo38.setOpaque(true);
        lblCampo38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo38MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo38);

        lblCampo39.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo39.setOpaque(true);
        lblCampo39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo39MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo39);

        lblCampo40.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo40.setOpaque(true);
        lblCampo40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo40MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo40);

        lblCampo41.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo41.setOpaque(true);
        lblCampo41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo41MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo41);

        lblCampo42.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo42.setOpaque(true);
        lblCampo42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo42MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo42);

        lblCampo43.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo43.setOpaque(true);
        lblCampo43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo43MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo43);

        lblCampo44.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo44.setOpaque(true);
        lblCampo44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo44MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo44);

        lblCampo45.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo45.setOpaque(true);
        lblCampo45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo45MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo45);

        lblCampo46.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo46.setOpaque(true);
        lblCampo46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo46MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo46);

        lblCampo47.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo47.setOpaque(true);
        lblCampo47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo47MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo47);

        lblCampo48.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo48.setOpaque(true);
        lblCampo48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo48MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo48);

        lblCampo49.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo49.setOpaque(true);
        lblCampo49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo49MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo49);

        lblCampo50.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo50.setOpaque(true);
        lblCampo50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo50MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo50);

        lblCampo51.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo51.setOpaque(true);
        lblCampo51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo51MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo51);

        lblCampo52.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo52.setOpaque(true);
        lblCampo52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo52MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo52);

        lblCampo53.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo53.setOpaque(true);
        lblCampo53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo53MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo53);

        lblCampo54.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo54.setOpaque(true);
        lblCampo54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo54MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo54);

        lblCampo55.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo55.setOpaque(true);
        lblCampo55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo55MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo55);

        lblCampo56.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo56.setOpaque(true);
        lblCampo56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo56MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo56);

        lblCampo57.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo57.setOpaque(true);
        lblCampo57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo57MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo57);

        lblCampo58.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo58.setOpaque(true);
        lblCampo58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo58MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo58);

        lblCampo59.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo59.setOpaque(true);
        lblCampo59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo59MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo59);

        lblCampo60.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo60.setOpaque(true);
        lblCampo60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo60MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo60);

        lblCampo61.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo61.setOpaque(true);
        lblCampo61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo61MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo61);

        lblCampo62.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo62.setOpaque(true);
        lblCampo62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo62MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo62);

        lblCampo63.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblCampo63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCampo63.setOpaque(true);
        lblCampo63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCampo63MouseClicked(evt);
            }
        });
        getContentPane().add(lblCampo63);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCampo0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo0MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo0MouseClicked

    private void lblCampo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo1MouseClicked

    private void lblCampo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo2MouseClicked

    private void lblCampo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo3MouseClicked

    private void lblCampo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo4MouseClicked

    private void lblCampo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo5MouseClicked

    private void lblCampo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo6MouseClicked

    private void lblCampo7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo7MouseClicked

    private void lblCampo8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo8MouseClicked

    private void lblCampo9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo9MouseClicked

    private void lblCampo10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo10MouseClicked

    private void lblCampo11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo11MouseClicked

    private void lblCampo12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo12MouseClicked

    private void lblCampo13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo13MouseClicked

    private void lblCampo14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo14MouseClicked

    private void lblCampo15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo15MouseClicked

    private void lblCampo16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo16MouseClicked

    private void lblCampo17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo17MouseClicked

    private void lblCampo18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo18MouseClicked

    private void lblCampo19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo19MouseClicked

    private void lblCampo20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo20MouseClicked

    private void lblCampo21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo21MouseClicked

    private void lblCampo22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo22MouseClicked

    private void lblCampo23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo23MouseClicked

    private void lblCampo24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo24MouseClicked

    private void lblCampo25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo25MouseClicked

    private void lblCampo26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo26MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo26MouseClicked

    private void lblCampo27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo27MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo27MouseClicked

    private void lblCampo28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo28MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo28MouseClicked

    private void lblCampo29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo29MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo29MouseClicked

    private void lblCampo30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo30MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo30MouseClicked

    private void lblCampo31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo31MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo31MouseClicked

    private void lblCampo32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo32MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo32MouseClicked

    private void lblCampo33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo33MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo33MouseClicked

    private void lblCampo34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo34MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo34MouseClicked

    private void lblCampo35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo35MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo35MouseClicked

    private void lblCampo36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo36MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo36MouseClicked

    private void lblCampo37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo37MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo37MouseClicked

    private void lblCampo38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo38MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo38MouseClicked

    private void lblCampo39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo39MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo39MouseClicked

    private void lblCampo40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo40MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo40MouseClicked

    private void lblCampo41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo41MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo41MouseClicked

    private void lblCampo42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo42MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo42MouseClicked

    private void lblCampo43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo43MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo43MouseClicked

    private void lblCampo44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo44MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo44MouseClicked

    private void lblCampo45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo45MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo45MouseClicked

    private void lblCampo46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo46MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo46MouseClicked

    private void lblCampo47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo47MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo47MouseClicked

    private void lblCampo48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo48MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo48MouseClicked

    private void lblCampo49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo49MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo49MouseClicked

    private void lblCampo50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo50MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo50MouseClicked

    private void lblCampo51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo51MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo51MouseClicked

    private void lblCampo52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo52MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo52MouseClicked

    private void lblCampo53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo53MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo53MouseClicked

    private void lblCampo54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo54MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo54MouseClicked

    private void lblCampo55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo55MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo55MouseClicked

    private void lblCampo56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo56MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo56MouseClicked

    private void lblCampo57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo57MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo57MouseClicked

    private void lblCampo58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo58MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo58MouseClicked

    private void lblCampo59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo59MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo59MouseClicked

    private void lblCampo60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo60MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo60MouseClicked

    private void lblCampo61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo61MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo61MouseClicked

    private void lblCampo62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo62MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo62MouseClicked

    private void lblCampo63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCampo63MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCampo63MouseClicked

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
        java.util.logging.Logger.getLogger(CampoMinado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(CampoMinado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(CampoMinado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(CampoMinado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new CampoMinado().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCampo0;
    private javax.swing.JLabel lblCampo1;
    private javax.swing.JLabel lblCampo10;
    private javax.swing.JLabel lblCampo11;
    private javax.swing.JLabel lblCampo12;
    private javax.swing.JLabel lblCampo13;
    private javax.swing.JLabel lblCampo14;
    private javax.swing.JLabel lblCampo15;
    private javax.swing.JLabel lblCampo16;
    private javax.swing.JLabel lblCampo17;
    private javax.swing.JLabel lblCampo18;
    private javax.swing.JLabel lblCampo19;
    private javax.swing.JLabel lblCampo2;
    private javax.swing.JLabel lblCampo20;
    private javax.swing.JLabel lblCampo21;
    private javax.swing.JLabel lblCampo22;
    private javax.swing.JLabel lblCampo23;
    private javax.swing.JLabel lblCampo24;
    private javax.swing.JLabel lblCampo25;
    private javax.swing.JLabel lblCampo26;
    private javax.swing.JLabel lblCampo27;
    private javax.swing.JLabel lblCampo28;
    private javax.swing.JLabel lblCampo29;
    private javax.swing.JLabel lblCampo3;
    private javax.swing.JLabel lblCampo30;
    private javax.swing.JLabel lblCampo31;
    private javax.swing.JLabel lblCampo32;
    private javax.swing.JLabel lblCampo33;
    private javax.swing.JLabel lblCampo34;
    private javax.swing.JLabel lblCampo35;
    private javax.swing.JLabel lblCampo36;
    private javax.swing.JLabel lblCampo37;
    private javax.swing.JLabel lblCampo38;
    private javax.swing.JLabel lblCampo39;
    private javax.swing.JLabel lblCampo4;
    private javax.swing.JLabel lblCampo40;
    private javax.swing.JLabel lblCampo41;
    private javax.swing.JLabel lblCampo42;
    private javax.swing.JLabel lblCampo43;
    private javax.swing.JLabel lblCampo44;
    private javax.swing.JLabel lblCampo45;
    private javax.swing.JLabel lblCampo46;
    private javax.swing.JLabel lblCampo47;
    private javax.swing.JLabel lblCampo48;
    private javax.swing.JLabel lblCampo49;
    private javax.swing.JLabel lblCampo5;
    private javax.swing.JLabel lblCampo50;
    private javax.swing.JLabel lblCampo51;
    private javax.swing.JLabel lblCampo52;
    private javax.swing.JLabel lblCampo53;
    private javax.swing.JLabel lblCampo54;
    private javax.swing.JLabel lblCampo55;
    private javax.swing.JLabel lblCampo56;
    private javax.swing.JLabel lblCampo57;
    private javax.swing.JLabel lblCampo58;
    private javax.swing.JLabel lblCampo59;
    private javax.swing.JLabel lblCampo6;
    private javax.swing.JLabel lblCampo60;
    private javax.swing.JLabel lblCampo61;
    private javax.swing.JLabel lblCampo62;
    private javax.swing.JLabel lblCampo63;
    private javax.swing.JLabel lblCampo7;
    private javax.swing.JLabel lblCampo8;
    private javax.swing.JLabel lblCampo9;
    // End of variables declaration//GEN-END:variables
}
