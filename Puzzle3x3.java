import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseListener.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Klasse Puzzle3x3.
 * 
 * @Cenk Orhan  
 * @
 */

public class Puzzle3x3
{
    private JFrame frame;
    private JPanel panel;
    private JLabel l0,l1,l2,l3,l4,l5,l6,l7,leer,dummy,counter;
    private JButton b1;
    int i = 0;

    protected Puzzle3x3()
    {
        frame = new JFrame();
        
        b1 = new JButton("Menü");

        l0 = new JLabel("0");
        l0.setFont(new Font("ARIAL", Font.BOLD,22));
        
        l1 = new JLabel("1");
        l1.setFont(new Font("ARIAL", Font.BOLD,22));
        
        l2 = new JLabel("2");
        l2.setFont(new Font("ARIAL", Font.BOLD,22));
        
        l3 = new JLabel("3");
        l3.setFont(new Font("ARIAL", Font.BOLD,22));
        
        l4 = new JLabel("4");
        l4.setFont(new Font("ARIAL", Font.BOLD,22));
        
        l5 = new JLabel("5");
        l5.setFont(new Font("ARIAL", Font.BOLD,22));
        
        l6 = new JLabel("6");
        l6.setFont(new Font("ARIAL", Font.BOLD,22));
        
        l7 = new JLabel("7");
        l7.setFont(new Font("ARIAL", Font.BOLD,22)); 
        
        leer = new JLabel(" ");
        leer.setFont(new Font("ARIAL", Font.BOLD,22));
        
        dummy = new JLabel(" ");
        counter = new JLabel("Counter 0");

        frame.setTitle("4x4 Puzzle");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 120, 10, 10));
        panel.setLayout(new GridLayout(4,3,30,40));
        panel.add(l5);
        panel.add(l2);
        panel.add(l0);
        panel.add(l1);
        panel.add(leer);
        panel.add(l3);
        panel.add(l6);
        panel.add(l7);
        panel.add(l4);
        panel.add(b1);
        panel.add(dummy);
        panel.add(counter);
        

        l0.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    
                    String label = l0.getText();
                    if(l2.getText().equals(" "))
                    {
                        l2.setText(label);
                        l0.setText(" ");
                        
                    }
                    if(l3.getText().equals(" "))
                    {
                        l3.setText(label);
                        l0.setText(" ");
                        
                    }
                    i++;
                    counter.setText("Counter" +" "+ i );
                }

            });

        l1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l1.getText();
                    if(l5.getText().equals(" "))
                    {
                        l5.setText(label);
                        l1.setText(" ");
                    }
                    if(l6.getText().equals(" "))
                    {
                        l6.setText(label);
                        l1.setText(" ");

                    }
                    if(leer.getText().equals(" "))
                    {
                        leer.setText(label);
                        l1.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" +" "+ i );
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
                    if(l5.getText().equals(" "))
                    {
                        l5.setText(label);
                        l2.setText(" ");

                    }
                    if(l0.getText().equals(" "))
                    {
                        l0.setText(label);
                        l2.setText(" ");

                    }
                    i++;
                    counter.setText("Counter" +" "+ i );
                }
                
            });

        l3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l3.getText();
                    if(l4.getText().equals(" "))
                    {
                        l4.setText(label);
                        l3.setText(" ");
                    }
                    if(l0.getText().equals(" "))
                    {
                        l0.setText(label);
                        l3.setText(" ");
                    }
                    if(leer.getText().equals(" "))
                    {
                        leer.setText(label);
                        l3.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" +" "+ i );
                }
                
            });    

        l4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l4.getText();
                    if(l7.getText().equals(" "))
                    {
                        l7.setText(label);
                        l4.setText(" ");
                    }
                    if(l3.getText().equals(" "))
                    {
                        l3.setText(label);
                        l4.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" +" "+ i );
                }
            }); 
        l5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l5.getText();
                    if(l2.getText().equals(" "))
                    {
                        l2.setText(label);
                        l5.setText(" ");
                    }
                    if(l1.getText().equals(" "))
                    {
                        l1.setText(label);
                        l5.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" +" "+ i );
                }
            }); 
        l6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l6.getText();
                    if(l7.getText().equals(" "))
                    {
                        l7.setText(label);
                        l6.setText(" ");
                    }
                    if(l1.getText().equals(" "))
                    {
                        l1.setText(label);
                        l6.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" +" "+ i );
                }

            });    

        l7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = l7.getText();
                    if(l4.getText().equals(" "))
                    {
                        l4.setText(label);
                        l7.setText(" ");
                    }
                    if(leer.getText().equals(" "))
                    {
                        leer.setText(label);
                        l7.setText(" ");
                    }
                    if(l6.getText().equals(" "))
                    {
                        l6.setText(label);
                        l7.setText(" ");
                    }
                    i++;
                    counter.setText("Counter" +" "+ i );
                }
            });
        
        leer.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    String label = leer.getText();
                    if(l2.getText().equals(" "))
                    {
                        l2.setText(label);
                        leer.setText(" ");
                    }
                    if(l1.getText().equals(" "))
                    {
                        l1.setText(label);
                        leer.setText(" ");
                    }
                    if(l3.getText().equals(" "))
                    {
                        l3.setText(label);
                        leer.setText(" ");
                    }
                    if(l7.getText().equals(" "))
                    {
                        l7.setText(label);
                        leer.setText(" ");

                    }
                    i++;
                    counter.setText("Counter" +" "+ i );
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
        frame.setTitle("3x3 Puzzle");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null); 

    }

}
