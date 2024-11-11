import java.awt.BorderLayout; 
import java.awt.GridLayout; 
import java.awt.Image; 
import java.awt.image.BufferedImage; 
import java.io.File; 
import java.io.IOException; 
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener.*;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.imageio.ImageIO; 
import javax.swing.ImageIcon; 
import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.JPanel; 

/**
 * Klasse PuzzleImage.
 * 
 * @Cenk Orhan
 * @
 */
public class PuzzleImage  
{ 
    private JFrame frame;
    private JPanel panel; 
    private JLabel[] labels; //ein Array ist hier die bessere Wahl, da man mit hilfe einer Methode die Icons auf die labels packen kann
    private JLabel dummy,leer,counter;
    private ImageIcon icon,zero; 
    private int raster = 3;
    private JButton b1;
    int i = 0;
    private File file;

    public PuzzleImage(File file)
    { 
        this.file = file;
        frame = new JFrame("Image");
        zero = new ImageIcon();
        b1 = new JButton("Menu");

        labels = new JLabel[raster * raster]; 

        for (int i=0; i<labels.length; i++)
        { 
            labels[i] = new JLabel(); 
        } 

        leer = new JLabel();
        leer.setIcon(zero);

        dummy = new JLabel(" ");

        counter = new JLabel("Counter 0");

        panel = new JPanel(); 
        panel.setLayout(new GridLayout(raster+1, raster, 2, 2));
        panel.add(labels[3],BorderLayout.CENTER);
        panel.add(labels[7],BorderLayout.CENTER);
        panel.add(labels[1],BorderLayout.CENTER);
        panel.add(labels[4],BorderLayout.CENTER);
        panel.add(labels[6],BorderLayout.CENTER);
        panel.add(labels[5],BorderLayout.CENTER);
        panel.add(labels[2],BorderLayout.CENTER);
        panel.add(labels[0],BorderLayout.CENTER);
        panel.add(leer,BorderLayout.CENTER);
        panel.add(b1);
        panel.add(dummy);
        panel.add(counter);

        frame.add(panel, BorderLayout.CENTER); 
        frame.setSize(600, 600); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true); 

        cutAndSet(file); 

        labels[0].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    Icon s1 = labels[0].getIcon();
                    if(labels[2].getIcon()==zero)
                    {
                        labels[2].setIcon(s1);
                        labels[0].setIcon(zero);

                    }
                    if(labels[6].getIcon()==zero)
                    {
                        labels[6].setIcon(s1);
                        labels[0].setIcon(zero);

                    }
                    if(leer.getIcon()==zero)
                    {
                        leer.setIcon(s1);
                        labels[0].setIcon(zero);

                    }
                    i++;
                    counter.setText("Counter" +" "+ i );
                }

            });

        labels[1].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    Icon s1 = labels[1].getIcon();
                    if(labels[7].getIcon()==zero)
                    {
                        labels[7].setIcon(s1);
                        labels[1].setIcon(zero);

                    }
                    if(labels[5].getIcon()==zero)
                    {
                        labels[5].setIcon(s1);
                        labels[1].setIcon(zero);

                    }

                    i++;
                    counter.setText("Counter" +" "+ i );
                }

            });

        labels[2].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    Icon s1 = labels[2].getIcon();
                    if(labels[4].getIcon()==zero)
                    {
                        labels[4].setIcon(s1);
                        labels[2].setIcon(zero);

                    }
                    if(labels[0].getIcon()==zero)
                    {
                        labels[0].setIcon(s1);
                        labels[2].setIcon(zero);

                    }

                    i++;
                    counter.setText("Counter" +" "+ i );
                }

            }); 

        labels[3].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    Icon s1 = labels[3].getIcon();
                    if(labels[7].getIcon()==zero)
                    {
                        labels[7].setIcon(s1);
                        labels[3].setIcon(zero);

                    }
                    if(labels[4].getIcon()==zero)
                    {
                        labels[4].setIcon(s1);
                        labels[3].setIcon(zero);

                    }

                    i++;
                    counter.setText("Counter" +" "+ i );
                }

            }); 

        labels[4].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    Icon s1 = labels[4].getIcon();
                    if(labels[2].getIcon()==zero)
                    {
                        labels[2].setIcon(s1);
                        labels[4].setIcon(zero);

                    }
                    if(labels[6].getIcon()==zero)
                    {
                        labels[6].setIcon(s1);
                        labels[4].setIcon(zero);

                    }
                    if(labels[3].getIcon()==zero)
                    {
                        labels[3].setIcon(s1);
                        labels[4].setIcon(zero);

                    }
                    i++;
                    counter.setText("Counter" +" "+ i );
                }

            }); 

        labels[5].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    Icon s1 = labels[5].getIcon();
                    if(labels[1].getIcon()==zero)
                    {
                        labels[1].setIcon(s1);
                        labels[5].setIcon(zero);

                    }
                    if(labels[6].getIcon()==zero)
                    {
                        labels[6].setIcon(s1);
                        labels[5].setIcon(zero);

                    }
                    if(leer.getIcon()==zero)
                    {
                        leer.setIcon(s1);
                        labels[5].setIcon(zero);

                    }
                    i++;
                    counter.setText("Counter" +" "+ i );
                }

            });  

        labels[6].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    Icon s1 = labels[6].getIcon();
                    if(labels[7].getIcon()==zero)
                    {
                        labels[7].setIcon(s1);
                        labels[6].setIcon(zero);

                    }
                    if(labels[4].getIcon()==zero)
                    {
                        labels[4].setIcon(s1);
                        labels[6].setIcon(zero);

                    }
                    if(labels[0].getIcon()==zero)
                    {
                        labels[0].setIcon(s1);
                        labels[6].setIcon(zero);

                    }
                    if(labels[5].getIcon()==zero)
                    {
                        labels[5].setIcon(s1);
                        labels[6].setIcon(zero);

                    }
                    i++;
                    counter.setText("Counter" +" "+ i );
                }

            });   

        labels[7].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    Icon s1 = labels[7].getIcon();
                    if(labels[3].getIcon()==zero)
                    {
                        labels[3].setIcon(s1);
                        labels[7].setIcon(zero);

                    }
                    if(labels[1].getIcon()==zero)
                    {
                        labels[1].setIcon(s1);
                        labels[7].setIcon(zero);

                    }
                    if(labels[6].getIcon()==zero)
                    {
                        labels[6].setIcon(s1);
                        labels[7].setIcon(zero);

                    }
                    i++;
                    counter.setText("Counter" +" "+ i );
                }

            }); 

        leer.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    Icon s1 = leer.getIcon();
                    if(labels[5].getIcon()==zero)
                    {
                        labels[5].setIcon(s1);
                        leer.setIcon(zero);

                    }
                    if(labels[0].getIcon()==zero)
                    {
                        labels[0].setIcon(s1);
                        leer.setIcon(zero);

                    }

                    i++;
                    counter.setText("Counter" +" "+ i );
                }

            }); 

        b1.addActionListener(new ActionListener(){
                public void  actionPerformed(ActionEvent e)
                {
                    frame.setVisible(false);//das Hauptmenü soll verschwinden
                    new Main_screen(); 
                }
            });         

    } 

    private BufferedImage loadImage(File file)//Hinweis: der angegebene Pfad für den Konstruktor new File ist bei MacOs anders zu beschriften!!
    { 
        File imgFile = file; 
        BufferedImage buffIm = null; 
        try { 
            buffIm = ImageIO.read(imgFile); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
        return buffIm; 
    } 

    private void cutAndSet(File file)//einzelne Ausschnitte jeweils auf die JLabels im Array packen
    { 
        BufferedImage bi = loadImage(file);
        bi.getGraphics().drawImage(bi, 0, 0, null);
        Image Img; 
        int a = (int) Math.sqrt(labels.length); // a = 3;
        for(int i=0; i<a; i++)
        { 
            for(int j=0; j<a; j++)
            { 
                Img = bi.getSubimage(j*(frame.getWidth()/a), i*(frame.getHeight()/a), frame.getWidth()/a, frame.getHeight()/a); 
                icon = new ImageIcon(Img); 
                labels[(i*a+j)].setIcon(icon); 
            } 
        } 
    }//ziel dieser Methode war es, eine allgemeine Form der Gittererstellung herzustellen.

}
