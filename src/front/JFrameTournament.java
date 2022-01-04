/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Enzou
 */
public class JFrameTournament extends JFrame {
    
    public JFrameTournament() {
        super("Tournament");
        constrFen();
    }
    
    private void constrFen() {
        Dimension tailleMoniteur = Toolkit.getDefaultToolkit().getScreenSize();
        int longueur = tailleMoniteur.width * 3/4;
        int hauteur = tailleMoniteur.height * 3/4;
        setSize(longueur,hauteur);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(constrPan());
        setVisible(true);
    }
    
    private JPanel constrPan() {
        JPanel screen = new JPanel();
        JPanel navBar = new JPanel();
        JPanel content = new JPanel();
        
        navBar.add(new JButton("🏠"));
        navBar.add(new JButton("Les joueurs"));
        navBar.add(new JButton("Les tournois"));
        navBar.add(new JButton("Se déconnecter"));
        
        content.setBackground(Color.BLUE);
        
        screen.setLayout(new BoxLayout(screen, BoxLayout.PAGE_AXIS));
        screen.add(navBar);
        screen.add(content);
        return screen;
    }
}
