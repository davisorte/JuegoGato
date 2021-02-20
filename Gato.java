package miJuego;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;
class  Gato extends JFrame implements  ActionListener {
    public static  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    String si;
    int cont=0;
    String gato[][]=new String [3][3];
    public Gato(){
        setTitle("El gato");
        setBounds(450,150,370,380);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        
        b1=new JButton();
        b1.setBounds(70, 50, 70, 70);
        b1.setBackground(Color.orange);
        add(b1);
        b1.addActionListener(this);
        
        b2=new JButton();
        b2.setBounds(142, 50, 70, 70);
        add(b2);
        b2.setBackground(Color.orange);
        b2.addActionListener(this);
        
        b3=new JButton();
        b3.setBounds(214, 50, 70, 70);
        add(b3);
        b3.setBackground(Color.orange);
        b3.addActionListener(this);
        
        b4=new JButton();
        b4.setBounds(70, 123, 70, 70);
        add(b4);
        b4.setBackground(Color.orange);
        b4.addActionListener(this);
        
        b5=new JButton();
        b5.setBounds(142, 123, 70, 70);
        add(b5);
        b5.setBackground(Color.orange);
        b5.addActionListener(this);
        
        b6=new JButton();
        b6.setBounds(214, 123, 70, 70);
        add(b6);
        b6.setBackground(Color.orange);
        b6.addActionListener(this);
        
        b7=new JButton();
        b7.setBounds(70, 196, 70, 70);
        add(b7);
        b7.setBackground(Color.orange);
        b7.addActionListener(this);
        
        b8=new JButton();
        b8.setBounds(142, 196, 70, 70);
        add(b8);
        b8.setBackground(Color.orange);
        b8.addActionListener(this);
        
        b9=new JButton();
        b9.setBounds(214, 196, 70, 70);
        add(b9);
        b9.setBackground(Color.orange);
        b9.addActionListener(this);  
    }
    public static void main(String[] args) {
       Gato miGato=new Gato();
       miGato.setVisible(true);
     
    }
     public void actionPerformed(ActionEvent e) {
       boolean t=false;
        if(e.getSource()==b1){
            cont++;
            if(cont%2==0)
                b1.setText("0");
            else if(cont%2==1)
                 b1.setText("X");    
            if(b1.getText()==null){
                
            }else{
                b1.setEnabled(false);
                b1.setBackground(Color.PINK);
                gato[0][0]=b1.getText();
            }
        }
        else if(e.getSource()==b2){
            cont++;
            if(cont%2==0)
                b2.setText("0");
            else if(cont%2==1)
                 b2.setText("X"); 
            if(b2.getText()==null){
                
            }else{
                b2.setEnabled(false);
                b2.setBackground(Color.PINK);
                gato[0][1]=b2.getText();
            }   
        }
        else  if(e.getSource()==b3){
             cont++;
            if(cont%2==0)
                b3.setText("0");
            else if(cont%2==1)
                 b3.setText("X"); 
            if(b3.getText()==null){
                
            }else{
                b3.setEnabled(false);
                b3.setBackground(Color.PINK);
                gato[0][2]=b3.getText();
            } 
        }
        else  if(e.getSource()==b4){
            cont++;
             if(cont%2==0)
                b4.setText("0");
            else if(cont%2==1)
                 b4.setText("X"); 
            if(b4.getText()==null){
                
            }else{
                b4.setEnabled(false);
                b4.setBackground(Color.PINK);
                gato[1][0]=b4.getText();
            } 
        }
        else  if(e.getSource()==b5){
            cont++;
            if(cont%2==0)
                b5.setText("0");
            else if(cont%2==1)
                 b5.setText("X"); 
            if(b5.getText()==null){
                
            }else{
                b5.setEnabled(false);
                b5.setBackground(Color.PINK);
                gato[1][1]=b5.getText();
            }
        }
        else  if(e.getSource()==b6){
            cont++;
            if(cont%2==0)
                b6.setText("0");
            else if(cont%2==1)
                b6.setText("X"); 
            if(b6.getText()==null){
                
            }else{
                b6.setEnabled(false);
                b6.setBackground(Color.PINK);
                gato[1][2]=b6.getText();
            }
            
        }
        else  if(e.getSource()==b7){
            cont++;
            if(cont%2==0)
                b7.setText("0");
            else if(cont%2==1)
                 b7.setText("X"); 
            if(b7.getText()==null){   
            }else{
                b7.setEnabled(false);
                b7.setBackground(Color.PINK);
                gato[2][0]=b7.getText();
            }
        }
        else  if(e.getSource()==b8){
            cont++;
            if(cont%2==0)
                b8.setText("0");
            else if(cont%2==1)
                 b8.setText("X"); 
            if(b8.getText()==null){
                
            }else{
                b8.setEnabled(false);
                b8.setBackground(Color.PINK);
                gato[2][1]=b8.getText();
            }
        }
        else  if(e.getSource()==b9){
            cont++;
             if(cont%2==0)
                b9.setText("0");
            else if(cont%2==1)
                 b9.setText("X"); 
            if(b9.getText()==null){
                
            }else{
                b9.setEnabled(false);
                b9.setBackground(Color.PINK);
                gato[2][2]=b9.getText();
            } 
        }
        if(gato[0][0]=="X" && gato[0][1]=="X" && gato[0][2]=="X"){
            t=true;  
            b1.setBackground(Color.blue);
            b2.setBackground(Color.blue);
            b3.setBackground(Color.blue);
            JOptionPane.showMessageDialog(null,"Ganaste X");
            dispose();
            Gato miGato=new Gato();
            miGato.setVisible(true);
        } 
        else if(gato[0][0]=="0" && gato[0][1]=="0" && gato[0][2]=="0"){
            t=true;  
            b1.setBackground(Color.DARK_GRAY);
            b2.setBackground(Color.DARK_GRAY);
            b3.setBackground(Color.DARK_GRAY);
            JOptionPane.showMessageDialog(null,"Ganaste 0");
            dispose();
            Gato miGato=new Gato();
            miGato.setVisible(true);
        }
       else if(gato[1][0]=="X" && gato[1][1]=="X" && gato[1][2]=="X"){
            t=true;  
            b4.setBackground(Color.GREEN);
            b5.setBackground(Color.GREEN);
            b6.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null,"Ganaste X");
            dispose();
            Gato miGato=new Gato();
            miGato.setVisible(true);
        }    
       else if(gato[1][0]=="0" && gato[1][1]=="0" && gato[1][2]=="0"){
            t=true;  
            b4.setBackground(Color.GRAY);
            b5.setBackground(Color.GRAY);
            b6.setBackground(Color.GRAY);
            JOptionPane.showMessageDialog(null,"Ganaste 0");
            dispose();
            Gato miGato=new Gato();
            miGato.setVisible(true);
           
       } 
       else if(gato[2][0]=="X" && gato[2][1]=="X" && gato[2][2]=="X"){
            t=true;  
            b7.setBackground(Color.LIGHT_GRAY);
            b8.setBackground(Color.LIGHT_GRAY);
            b9.setBackground(Color.LIGHT_GRAY);
            JOptionPane.showMessageDialog(null,"Ganaste X");
            dispose();
            Gato miGato=new Gato();
            miGato.setVisible(true);
        }    
       else if(gato[2][0]=="0" && gato[2][1]=="0" && gato[2][2]=="0"){
            t=true;  
            b7.setBackground(Color.YELLOW);
            b8.setBackground(Color.YELLOW);
            b9.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(null,"Ganaste 0");
            dispose();
            Gato miGato=new Gato();
            miGato.setVisible(true);
       }  
       //------------de arriba hacia abajo---------
        else if(gato[0][0]=="X" && gato[1][0]=="X" && gato[2][0]=="X"){
            t=true;  
            b1.setBackground(Color.cyan);
            b4.setBackground(Color.cyan);
            b7.setBackground(Color.cyan);
            JOptionPane.showMessageDialog(null,"Ganaste X");
            dispose();
            Gato miGato=new Gato();
            miGato.setVisible(true);
        }    
       else if(gato[0][0]=="0" && gato[1][0]=="0" && gato[2][0]=="0"){
            t=true;  
            b1.setBackground(Color.cyan);
            b4.setBackground(Color.cyan);
            b7.setBackground(Color.cyan);
            JOptionPane.showMessageDialog(null,"Ganaste 0");
             dispose();
            Gato miGato=new Gato();
            miGato.setVisible(true);
       } 
       else if(gato[0][1]=="X" && gato[1][1]=="X" && gato[2][1]=="X"){
            t=true;  
            b2.setBackground(Color.orange);
            b5.setBackground(Color.orange);
            b8.setBackground(Color.orange);
            JOptionPane.showMessageDialog(null,"Ganaste X");
            dispose();
            Gato miGato=new Gato();
            miGato.setVisible(true);
            
        }    
       else if(gato[0][1]=="0" && gato[1][1]=="0" && gato[2][1]=="0"){
            t=true;  
            b2.setBackground(Color.white);
            b5.setBackground(Color.white);
            b8.setBackground(Color.white);
            JOptionPane.showMessageDialog(null,"Ganaste 0");
            dispose();
            Gato miGato=new Gato();
            miGato.setVisible(true);
            
       } 
       else if(gato[0][2]=="X" && gato[1][2]=="X" && gato[2][2]=="X"){
            t=true;  
            b3.setBackground(Color.white);
            b6.setBackground(Color.white);
            b9.setBackground(Color.white);
            JOptionPane.showMessageDialog(null,"Ganaste X");
            dispose();
            Gato miGato=new Gato();
            miGato.setVisible(true);
           
        }    
       else if(gato[0][2]=="0" && gato[1][2]=="0" && gato[2][2]=="0"){
            t=true;  
            b3.setBackground(Color.GREEN);
            b6.setBackground(Color.GREEN);
            b9.setBackground(Color.GREEN);
            JOptionPane.showMessageDialog(null,"Ganaste O");
            dispose();
            Gato miGato=new Gato();
            miGato.setVisible(true);
           
       }   
       //-----------------Diagonales---------------------
       else if(gato[0][0]=="X" && gato[1][1]=="X" && gato[2][2]=="X"){
            t=true;  
            b1.setBackground(Color.MAGENTA);
            b5.setBackground(Color.MAGENTA);
            b9.setBackground(Color.MAGENTA);
            JOptionPane.showMessageDialog(null,"Ganaste X");
            dispose();
            Gato miGato=new Gato();
            miGato.setVisible(true);
        }    
       else if(gato[0][0]=="0" && gato[1][1]=="0" && gato[2][2]=="0"){
            t=true;  
            b1.setBackground(Color.MAGENTA);
            b5.setBackground(Color.MAGENTA);
            b9.setBackground(Color.MAGENTA);
            JOptionPane.showMessageDialog(null,"Ganaste 0");
            dispose();
            Gato miGato=new Gato();
            miGato.setVisible(true);
         
            
       } 
       else if(gato[0][2]=="X" && gato[1][1]=="X" && gato[2][0]=="X"){
            t=true;  
            b3.setBackground(Color.lightGray);
            b5.setBackground(Color.lightGray);
            b7.setBackground(Color.lightGray);
            JOptionPane.showMessageDialog(null,"Ganaste X");
            dispose();
           
          
           Gato miGato=new Gato();
           miGato.setVisible(true);
           
        }    
       else if(gato[0][2]=="0" && gato[1][1]=="0" && gato[2][0]=="0"){
            t=true;  
            b3.setBackground(Color.lightGray);
            b5.setBackground(Color.lightGray);
            b7.setBackground(Color.lightGray);
            JOptionPane.showMessageDialog(null,"Ganaste 0");
             dispose();
          
           Gato miGato=new Gato();
           miGato.setVisible(true); 
       }
        if (t==false && cont==9){
           JOptionPane.showMessageDialog(null,"No ganaste");
           Gato miGato=new Gato();
           miGato.setVisible(true); 
        }      
           
    }
}

