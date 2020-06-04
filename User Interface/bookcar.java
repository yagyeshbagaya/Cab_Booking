
import com.swing.picker.date.DateTextField;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gupta's
 */
public class bookcar extends javax.swing.JFrame {

    /**
     * Creates new form bookcar
     */
     DateTextField dt1;
        DateTextField dt2;
       
    int carid;
    String security;
    public bookcar(int carid,String cname,String woutd,String wd,String security,String photo) {
        initComponents();
        setSize(1000,1200);
        setTitle("Book Car");
        setVisible(true);
        this.carid = carid;
        this.security=security;
        
        tf1.setText(cname);
        tf2.setText(woutd);
        tf3.setText(wd);
        tf4.setText(security);
        
        dt1 = new DateTextField();
        dt2 = new DateTextField();
        
        
        dt1.setBounds(100, 350, 100, 100);
        dt2.setBounds(450, 350, 100, 100);
        
        
         try {
                URL url = new URL("http://localhost:8888/GetResource/" + photo);
                     BufferedImage bufferedImage = ImageIO.read(url);
              BufferedImage  newimage = resize(bufferedImage, 310, 250);
               lb1.setIcon(new ImageIcon(newimage));
                     
            } catch (Exception ex) {
                ex.printStackTrace();
            }
         
         add(dt1);
         add(dt2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        lb1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt1 = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Car Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 60, 70, 30);

        tf1.setEditable(false);
        getContentPane().add(tf1);
        tf1.setBounds(520, 60, 150, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Price Without Driver");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(380, 120, 160, 30);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jRadioButton2.setText("Price With  Driver");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(380, 170, 140, 40);

        tf2.setEditable(false);
        getContentPane().add(tf2);
        tf2.setBounds(560, 120, 110, 30);

        tf3.setEditable(false);
        getContentPane().add(tf3);
        tf3.setBounds(560, 180, 110, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Security");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 240, 130, 30);

        tf4.setEditable(false);
        getContentPane().add(tf4);
        tf4.setBounds(560, 240, 110, 30);

        lb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lb1);
        lb1.setBounds(30, 60, 310, 220);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Start Date");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 330, 70, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("End Date");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(440, 330, 56, 20);

        bt1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt1.setIcon(new javax.swing.ImageIcon("C:\\Users\\gupta's\\Documents\\NetBeansProjects\\cabbooking 2\\cabbooking 2\\src\\photos\\book now.png")); // NOI18N
        bt1.setText("BOOK  NOW");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(280, 470, 140, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        String radio = "";
        
        if(jRadioButton1.isSelected()){
            radio = tf2.getText().toString();
        }
        if (jRadioButton2.isSelected()){
            radio = tf3.getText().toString();
        }
       
        System.out.println(radio);
//        confirmbooking obj=new confirmbooking(carid,);


 Date d = dt1.getDate();
        
        System.out.println(d);
       
       System.out.println(d.getDate());
       System.out.println(d.getMonth()+1);
       System.out.println(d.getYear()+1900);
       
       
        System.out.println("---------------------------------------------------------------");
       
       Date d2 = dt2.getDate();
        System.out.println(d2);
        
        System.out.println(d2.getDate());
       System.out.println(d2.getMonth()+1);
       System.out.println(d2.getYear()+1900);
       
       
       long duration = d2.getTime() - d.getTime();
       long getdays = TimeUnit.MILLISECONDS.toDays(duration);
       
        System.out.println(""+duration);
        System.out.println("No of Days ....."+getdays);
         
        
        if(getdays <= 0){
            System.out.println("value in negative");
            JOptionPane.showMessageDialog(rootPane, "Enter correct Date");
        }
        else {
            System.out.println("value in positive");
                    confirmbooking obj = new confirmbooking(carid,radio,d,d2,getdays,security);
        }

        
    }//GEN-LAST:event_bt1ActionPerformed

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
            java.util.logging.Logger.getLogger(bookcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookcar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new bookcar().setVisible(true);
            }
        });
    }
    BufferedImage resize(BufferedImage image, int width, int height) {
        BufferedImage bi = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) bi.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();
        return bi;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lb1;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    // End of variables declaration//GEN-END:variables
}
