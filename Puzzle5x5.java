import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseListener.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Klasse Puzzle5x5.
 * 
 * @Cenk Orhan
 * @
 */

public class Puzzle5x5
{
    private JFrame frame;
    private JPanel panel;
    private JLabel l0,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,leer,counter;
    private JLabel dummy1,dummy2,dummy3;
    private JButton b1;
    int i = 0;

    protected Puzzle5x5()
    {
        frame = new JFrame();
        
        b1 = new JButton("Menü");

        l0 = new JLabel("0");
        l0.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l1 = new JLabel("1");
        l1.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l2 = new JLabel("2");
        l2.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l3 = new JLabel("3");
        l3.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l4 = new JLabel("4");
        l4.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l5 = new JLabel("5");
        l5.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l6 = new JLabel("6");
        l6.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l7 = new JLabel("7");
        l7.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l8 = new JLabel("8");
        l8.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l9 = new JLabel("9");
        l9.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l10 = new JLabel("10");
        l10.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l11 = new JLabel("11");
        l11.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l12 = new JLabel("12");
        l12.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l13 = new JLabel("13");
        l13.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l14 = new JLabel("14");
        l14.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l15 = new JLabel("15");
        l15.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l16 = new JLabel("16");
        l16.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l17 = new JLabel("17");
        l17.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l18 = new JLabel("18");
        l18.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l19 = new JLabel("19");
        l19.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l20 = new JLabel("20");
        l20.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l21 = new JLabel("21");
        l21.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l22 = new JLabel("22");
        l22.setFont(new Font("ARIAL", Font.BOLD,20));
        
        l23 = new JLabel("23");
        l23.setFont(new Font("ARIAL", Font.BOLD,20));
        
        leer = new JLabel(" ");
        leer.setFont(new Font("ARIAL", Font.BOLD,20));
        dummy1 = new JLabel(" ");
        dummy2 = new JLabel(" ");
        dummy3 = new JLabel(" ");
        counter = new JLabel("Counter 0");

        frame.setTitle("4x4 Puzzle");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 80, 10, 30));
        panel.setLayout(new GridLayout(6,5,30,30));
        panel.add(l4);
        panel.add(l10);
        panel.add(leer);
        panel.add(l2);
        panel.add(l15);
        panel.add(l11);
        panel.add(l14);
        panel.add(l0);
        panel.add(l7);
        panel.add(l19);
        panel.add(l1);
        panel.add(l3);
        panel.add(l6);
        panel.add(l9);
        panel.add(l23);
        panel.add(l8);
        panel.add(l12);
        panel.add(l13);
        panel.add(l5);
        panel.add(l20);
        panel.add(l16);
        panel.add(l22);
        panel.add(l17);
        panel.add(l21);
        panel.add(l18);
        panel.add(b1);
        panel.add(dummy1);
        panel.add(dummy2);
        panel.add(dummy3);
        panel.add(counter);

        l0.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l0.getText();
                    if(l14.getText().equals(" "))
                    {
                        l14.setText(label);
                        l0.setText(" ");
                    }
                    if(l6.getText().equals(" "))
                    {
                        l6.setText(label);
                        l0.setText(" ");
                    }
                    if(l7.getText().equals(" "))
                    {
                        l7.setText(label);
                        l0.setText(" ");
                    }
                    if(leer.getText().equals(" "))
                    {
                        leer.setText(label);
                        l0.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }

            });

        l1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l1.getText();
                    if(l11.getText().equals(" "))
                    {
                        l11.setText(label);
                        l1.setText(" ");
                    }
                    if(l3.getText().equals(" "))
                    {
                        l3.setText(label);
                        l1.setText(" ");

                    }
                    if(l8.getText().equals(" "))
                    {
                        l8.setText(label);
                        l1.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }

            });    

        l2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l2.getText();
                    if(leer.getText().equals(" "))
                    {
                        leer.setText(label);
                        l2.setText(" ");
                    }
                    if(l7.getText().equals(" "))
                    {
                        l7.setText(label);
                        l2.setText(" ");

                    }
                    if(l15.getText().equals(" "))
                    {
                        l15.setText(label);
                        l2.setText(" ");

                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }

            });

        l3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l3.getText();
                    if(l14.getText().equals(" "))
                    {
                        l14.setText(label);
                        l3.setText(" ");
                    }
                    if(l1.getText().equals(" "))
                    {
                        l1.setText(label);
                        l3.setText(" ");
                    }
                    if(l6.getText().equals(" "))
                    {
                        l6.setText(label);
                        l3.setText(" ");
                    }
                    if(l12.getText().equals(" "))
                    {
                        l12.setText(label);
                        l3.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }

            });    

        l4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l4.getText();
                    if(l10.getText().equals(" "))
                    {
                        l10.setText(label);
                        l4.setText(" ");
                    }
                    if(l11.getText().equals(" "))
                    {
                        l11.setText(label);
                        l4.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }
            }); 
        l5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l5.getText();
                    if(l9.getText().equals(" "))
                    {
                        l9.setText(label);
                        l5.setText(" ");
                    }
                    if(l13.getText().equals(" "))
                    {
                        l13.setText(label);
                        l5.setText(" ");
                    }
                    if(l20.getText().equals(" "))
                    {
                        l20.setText(label);
                        l5.setText(" ");
                    }
                    if(l21.getText().equals(" "))
                    {
                        l21.setText(label);
                        l5.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }
            }); 
        l6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l6.getText();
                    if(l0.getText().equals(" "))
                    {
                        l0.setText(label);
                        l6.setText(" ");
                    }
                    if(l3.getText().equals(" "))
                    {
                        l3.setText(label);
                        l6.setText(" ");
                    }
                    if(l13.getText().equals(" "))
                    {
                        l13.setText(label);
                        l6.setText(" ");
                    }
                    if(l9.getText().equals(" "))
                    {
                        l9.setText(label);
                        l6.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }

            });    

        l7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l7.getText();
                    if(l2.getText().equals(" "))
                    {
                        l2.setText(label);
                        l7.setText(" ");
                    }
                    if(l0.getText().equals(" "))
                    {
                        l0.setText(label);
                        l7.setText(" ");
                    }
                    if(l9.getText().equals(" "))
                    {
                        l9.setText(label);
                        l7.setText(" ");
                    }
                    if(l19.getText().equals(" "))
                    {
                        l19.setText(label);
                        l7.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }
            });
        l8.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l8.getText();
                    if(l1.getText().equals(" "))
                    {
                        l1.setText(label);
                        l8.setText(" ");
                    }
                    if(l12.getText().equals(" "))
                    {
                        l12.setText(label);
                        l8.setText(" ");
                    }
                    if(l16.getText().equals(" "))
                    {
                        l16.setText(label);
                        l8.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }
            });    
        l9.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l9.getText();
                    if(l7.getText().equals(" "))
                    {
                        l7.setText(label);
                        l9.setText(" ");
                    }
                    if(l6.getText().equals(" "))
                    {
                        l6.setText(label);
                        l9.setText(" ");
                    }
                    if(l5.getText().equals(" "))
                    {
                        l5.setText(label);
                        l9.setText(" ");
                    }
                    if(l23.getText().equals(" "))
                    {
                        l23.setText(label);
                        l9.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }
            });    
        l10.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l10.getText();
                    if(l14.getText().equals(" "))
                    {
                        l14.setText(label);
                        l10.setText(" ");
                    }
                    if(l4.getText().equals(" "))
                    {
                        l4.setText(label);
                        l10.setText(" ");
                    }
                    if(leer.getText().equals(" "))
                    {
                        leer.setText(label);
                        l10.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }

            }); 

        l11.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l11.getText();
                    if(l14.getText().equals(" "))
                    {
                        l14.setText(label);
                        l11.setText(" ");
                    }
                    if(l4.getText().equals(" "))
                    {
                        l4.setText(label);
                        l11.setText(" ");
                    }
                    if(l1.getText().equals(" "))
                    {
                        l1.setText(label);
                        l11.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }
            });  

        l12.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l12.getText();
                    if(l8.getText().equals(" "))
                    {
                        l8.setText(label);
                        l12.setText(" ");
                    }
                    if(l3.getText().equals(" "))
                    {
                        l3.setText(label);
                        l12.setText(" ");
                    }
                    if(l13.getText().equals(" "))
                    {
                        l13.setText(label);
                        l12.setText(" ");
                    }
                    if(l22.getText().equals(" "))
                    {
                        l22.setText(label);
                        l12.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }
            }); 

        l13.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l13.getText();
                    if(l12.getText().equals(" "))
                    {
                        l12.setText(label);
                        l13.setText(" ");
                    }
                    if(l6.getText().equals(" "))
                    {
                        l6.setText(label);
                        l13.setText(" ");
                    }
                    if(l5.getText().equals(" "))
                    {
                        l5.setText(label);
                        l13.setText(" ");
                    }
                    if(l17.getText().equals(" "))
                    {
                        l17.setText(label);
                        l13.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }

            }); 

        l14.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l14.getText();
                    if(l10.getText().equals(" "))
                    {
                        l10.setText(label);
                        l14.setText(" ");
                    }
                    if(l11.getText().equals(" "))
                    {
                        l11.setText(label);
                        l14.setText(" ");
                    }
                    if(l3.getText().equals(" "))
                    {
                        l3.setText(label);
                        l14.setText(" ");
                    }
                    if(l0.getText().equals(" "))
                    {
                        l0.setText(label);
                        l14.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }

            });

        leer.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = leer.getText();
                    if(l10.getText().equals(" "))
                    {
                        l10.setText(label);
                        leer.setText(" ");
                    }
                    if(l0.getText().equals(" "))
                    {
                        l0.setText(label);
                        leer.setText(" ");
                    }
                    if(l2.getText().equals(" "))
                    {
                        l2.setText(label);
                        leer.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }
            }); 

        l15.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l15.getText();
                    if(l2.getText().equals(" "))
                    {
                        l2.setText(label);
                        l15.setText(" ");
                    }
                    if(l19.getText().equals(" "))
                    {
                        l19.setText(label);
                        l15.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }
            });    
        l16.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l16.getText();
                    if(l8.getText().equals(" "))
                    {
                        l8.setText(label);
                        l16.setText(" ");
                    }
                    if(l22.getText().equals(" "))
                    {
                        l22.setText(label);
                        l16.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }
            });    
        l17.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l17.getText();
                    if(l22.getText().equals(" "))
                    {
                        l22.setText(label);
                        l17.setText(" ");
                    }
                    if(l13.getText().equals(" "))
                    {
                        l13.setText(label);
                        l17.setText(" ");
                    }
                    if(l21.getText().equals(" "))
                    {
                        l21.setText(label);
                        l17.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }

            });

        l18.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l18.getText();
                    if(l21.getText().equals(" "))
                    {
                        l21.setText(label);
                        l18.setText(" ");
                    }
                    if(l20.getText().equals(" "))
                    {
                        l20.setText(label);
                        l18.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }
            });
        l19.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l19.getText();
                    if(l15.getText().equals(" "))
                    {
                        l15.setText(label);
                        l19.setText(" ");
                    }
                    if(l7.getText().equals(" "))
                    {
                        l7.setText(label);
                        l19.setText(" ");
                    }
                    if(l23.getText().equals(" "))
                    {
                        l23.setText(label);
                        l19.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }
            });
        l20.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l20.getText();
                    if(l5.getText().equals(" "))
                    {
                        l5.setText(label);
                        l20.setText(" ");
                    }
                    if(l23.getText().equals(" "))
                    {
                        l23.setText(label);
                        l20.setText(" ");
                    }
                    if(l18.getText().equals(" "))
                    {
                        l18.setText(label);
                        l20.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }
            });
        l21.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l21.getText();
                    if(l17.getText().equals(" "))
                    {
                        l17.setText(label);
                        l21.setText(" ");
                    }
                    if(l5.getText().equals(" "))
                    {
                        l5.setText(label);
                        l21.setText(" ");
                    }
                    if(l18.getText().equals(" "))
                    {
                        l18.setText(label);
                        l21.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }
            });
        l22.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l22.getText();
                    if(l17.getText().equals(" "))
                    {
                        l17.setText(label);
                        l22.setText(" ");
                    }
                    if(l16.getText().equals(" "))
                    {
                        l16.setText(label);
                        l22.setText(" ");
                    }
                    if(l12.getText().equals(" "))
                    {
                        l12.setText(label);
                        l22.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }

            }); 

        l23.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l23.getText();
                    if(l19.getText().equals(" "))
                    {
                        l19.setText(label);
                        l23.setText(" ");
                    }
                    if(l9.getText().equals(" "))
                    {
                        l9.setText(label);
                        l23.setText(" ");
                    }
                    if(l20.getText().equals(" "))
                    {
                        l20.setText(label);
                        l23.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" + " " + i);
                }
            }); 
        
        b1.addActionListener(new ActionListener(){//anonyme Klasse
                public void  actionPerformed(ActionEvent e)
                {
                    frame.setVisible(false);//das Hauptmenü soll verschwinden
                    new Main_screen(); 
                }
            });    
            
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("5x5 Puzzle");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null); 

    }

}
