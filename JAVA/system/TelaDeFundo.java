package system;

import java.awt.Graphics;
import java.awt.Image;

public class TelaDeFundo extends javax.swing.JInternalFrame {

   
    public TelaDeFundo() {
        super(null,false,false,false);
        initComponents();
        try{
            fundo = javax.imageio.ImageIO.read(new java.net.URL(getClass().getResource("fundo.jpg"),"fundo.jpg"));           
        }catch (Exception e){}
    }
    
        public void paint(Graphics Fundo)
        {
            Fundo.drawImage(fundo, 0,0,getWidth(),getHeight(),this);
        }        
        
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

protected static Image fundo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
