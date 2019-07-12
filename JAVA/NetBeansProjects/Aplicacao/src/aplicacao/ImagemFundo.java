
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.JLabel; 
import javax.swing.JFrame;
import javax.swing.Icon;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;


public class ImagemFundo extends JFrame{
        
    public ImagemFundo(){
    	super("Login");
    	
    	Container container = getContentPane();
    	container.setLayout(new BorderLayout());
    	
    	//aqui vc deve adicionar a imagem que deseja mostrar no JPanel
    	final ImageIcon imageIcon = new ImageIcon("img/imagem.jpg");
      	
    	JPanel painel = new JPanel(new FlowLayout()){
        	Image image = imageIcon.getImage();

        	Image grayImage = GrayFilter.createDisabledImage(image);
        	{
            	setOpaque(false);
        	}

        	public void paint(Graphics g) {
           		g.drawImage(grayImage, 0, 0, this);
            	super.paint(g);
        	}
    	};
    	
    	painel.add(new JLabel("Login:"));
    	painel.add(new JTextField(8));
    	painel.add(new JLabel("Senha:"));
    	painel.add(new JPasswordField(8));
    	painel.add(new JButton("Logar"));
   
 		container.add(painel, BorderLayout.CENTER);
 		   	
    	setSize(140,180);
    	setResizable(false);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
    	new ImagemFundo().setVisible(true);
    }
}
