import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JFileChooser;

import java.io.File;

import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;

/**
 * Klasse main_screen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Main_screen  {

    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JFileChooser fc;

    protected Main_screen() 
    {

        frame = new JFrame();

        JLabel label = new JLabel("Wähle dein Spiel", SwingConstants.CENTER);
        //zentriert die Schrift
        label.setFont(new Font("Arial", Font.BOLD,20));
        //definiert Schriftgröße und Schriftart
        label.setVerticalAlignment(JLabel.CENTER);

        JButton button3x3 = new JButton("3x3 Puzzle");
        button3x3.setForeground(Color.RED);
        button3x3.setFont(new Font("ARIAL",Font.BOLD,18));
        
        JButton button4x4 = new JButton("4x4 Puzzle");
        button4x4.setForeground(Color.BLUE);
        button4x4.setFont(new Font("ARIAL",Font.BOLD,18));
        
        JButton button5x5 = new JButton("5x5 Puzzle");
        button5x5.setForeground(Color.GREEN);
        button5x5.setFont(new Font("ARIAL",Font.BOLD,18));
        
        JButton buttonSetImage = new JButton("Image");
        buttonSetImage.setForeground(Color.MAGENTA);
        buttonSetImage.setFont(new Font("ARIAL",Font.BOLD,18));
        
        JButton beenden = new JButton("Beenden");
        beenden.setFont(new Font("ARIAL",Font.BOLD,18));
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(3,3));
        panel.add(button3x3);
        panel.add(button4x4);
        panel.add(button5x5);
        panel.add(buttonSetImage);
        panel.add(label);
        panel.add(beenden);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setTitle("The Sliding Puzzle");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null); //zentriert das Frame;
        
        button3x3.addActionListener(new ActionListener(){//anonyme Klasse
                public void  actionPerformed(ActionEvent e)
                {
                    frame.setVisible(false);//das Hauptmenü soll verschwinden
                    new Puzzle3x3(); 
                }
            });
            
        button4x4.addActionListener(new ActionListener(){//anonyme Klasse
                public void  actionPerformed(ActionEvent e)
                {
                    frame.setVisible(false);//das Hauptmenü soll verschwinden
                    new Puzzle4x4(); 
                }
            });  
        
        button5x5.addActionListener(new ActionListener(){//anonyme Klasse
                public void  actionPerformed(ActionEvent e)
                {
                    frame.setVisible(false);//das Hauptmenü soll verschwinden
                    new Puzzle5x5(); 
                }
            }); 
            
        buttonSetImage.addActionListener(new ActionListener(){//anonyme Klasse
                public void  actionPerformed(ActionEvent e)
                {
                    frame.setVisible(false);//das Hauptmenü soll verschwinden
                    
                    fc = new JFileChooser();//macht hier mehr Sinn, da Platformübergreifend das Projekt bewertet wird.
                    int val = fc.showOpenDialog(null);
                    File file = fc.getSelectedFile();
                    if (val == JFileChooser.APPROVE_OPTION)
                    {
                        new PuzzleImage(file);
                    }
                    else
                    {
                        new Main_screen();//wird kein File ausgewählt, so geht man zurück ins Main_screen()
                    }
                }
            });     
        
        beenden.addActionListener(new ActionListener(){//anonyme Klasse
                public void  actionPerformed(ActionEvent e)
                {
                    System.exit(0); 
                }
            });     
    }
}
