/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package p10p3d;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;



//int cont=(int)(Math.random()*(MAX-MIN+1)+MIN);

public class Videojuego extends javax.swing.JFrame {
    int vidas=3;
    String vid;
    public Videojuego() {
        initComponents();
        //SE CREA UN SOUND TIPO AUDIOCLIP CON APPLET JAVA, SIN EMBARGO ESTA LIBRERIA/CLASE YA ESTA DESCONTONINUADA PARA JAVA
        try{
            //SELEECIONA EL AUDIO
            AudioClip Sound = java.applet.Applet.newAudioClip(getClass().getResource("ALONE.wav"));
            //INICIA EL AUDIO
            Sound.play();   
        }catch(Exception e){
            System.out.println("Error "+e);
        }
        //INIICIAN LOS TIMERS  
        timerdef.start();
        timerp.start();
        timervid.start(); 
        timerput.start();
        timerb.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblTiempotxt = new javax.swing.JLabel();
        lblTempM = new javax.swing.JLabel();
        lblVidastxt = new javax.swing.JLabel();
        lblVid = new javax.swing.JLabel();
        lblTempS = new javax.swing.JLabel();
        lblPuntos = new javax.swing.JLabel();
        lblPuntaje = new javax.swing.JLabel();
        lblUltimoPower = new javax.swing.JLabel();
        lblUp = new javax.swing.JLabel();
        lblPU = new javax.swing.JLabel();
        lblBombas = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 720));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        panel.setBackground(new java.awt.Color(0, 0, 0));
        panel.setMinimumSize(new java.awt.Dimension(700, 700));
        panel.setPreferredSize(new java.awt.Dimension(720, 720));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        lblTiempotxt.setFont(new java.awt.Font("SWGothg", 0, 24)); // NOI18N
        lblTiempotxt.setText("Tiempo:");

        lblTempM.setFont(new java.awt.Font("SWGothg", 0, 24)); // NOI18N
        lblTempM.setText("00");

        lblVidastxt.setFont(new java.awt.Font("SWGothi", 0, 24)); // NOI18N
        lblVidastxt.setText("Vidas:");

        lblVid.setFont(new java.awt.Font("SWGothg", 0, 24)); // NOI18N
        lblVid.setText("3");

        lblTempS.setFont(new java.awt.Font("SWGothg", 0, 24)); // NOI18N
        lblTempS.setText("00");

        lblPuntos.setFont(new java.awt.Font("SWGothi", 0, 24)); // NOI18N
        lblPuntos.setText("Puntos");

        lblPuntaje.setFont(new java.awt.Font("SWGothg", 0, 24)); // NOI18N
        lblPuntaje.setText("0");

        lblUltimoPower.setFont(new java.awt.Font("SWGothi", 0, 24)); // NOI18N
        lblUltimoPower.setText("Ultimo Power");

        lblUp.setFont(new java.awt.Font("SWGothi", 0, 24)); // NOI18N
        lblUp.setText("Up");

        lblPU.setFont(new java.awt.Font("SWGothi", 0, 24)); // NOI18N

        lblBombas.setFont(new java.awt.Font("SWGothi", 0, 24)); // NOI18N
        lblBombas.setText("Bombas: ");

        lblB.setFont(new java.awt.Font("SWGothi", 0, 24)); // NOI18N
        lblB.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTiempotxt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblTempM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTempS))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVidastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblVid, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBombas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblB))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblUltimoPower)
                                .addComponent(lblPU, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(66, 66, 66)
                                    .addComponent(lblUp))))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTiempotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTempM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTempS, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVidastxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVid, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(lblUltimoPower)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUp)
                .addGap(21, 21, 21)
                .addComponent(lblPU, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBombas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblB, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    //**************** DECLARACION DE VARIABLES ****************//
    
    //Posición inicio
    int x = 360;
    int y = 360;
    
    //OBJETOS
    //Objeto cuadrado (player)
    Rectangle r1 = new Rectangle(x, y,50,50);
    
    //Objeto cuadrado (Power Up Tiempo)
    Rectangle rpt = new Rectangle(0, 0,40,40);
    
    //Objeto cuadrado (Power Up Vida)
    Rectangle rpv = new Rectangle(0, 0,40,40);
    
    //Objeto cuadrado (Power Up Bomba)
    Rectangle rpb = new Rectangle(0, 0,40,40);
    
    //Objetos lasers (obstáculos)
    //DAÑO
    Rectangle rcd1 = new Rectangle(0, 0,0,0);
    Rectangle rcd2 = new Rectangle(0, 0,0,0);
    
    //AVISO
    Rectangle rcd1a = new Rectangle(0, 0,0,0);
    Rectangle rcd2a = new Rectangle(0, 0,0,0);
    
    //DAÑO
    Rectangle rcg1 = new Rectangle(0, 0,0,0);
    Rectangle rcg2 = new Rectangle(0, 0,0,0);
    
    //AVISO
    Rectangle rcg1a = new Rectangle(0, 0,0,0);
    Rectangle rcg2a = new Rectangle(0, 0,0,0);

    
    //BOORDES
    Rectangle bu = new Rectangle(0, 0,5,5);
    Rectangle bd = new Rectangle(0, 0,5,5);
    Rectangle bl = new Rectangle(0, 0,5,5);
    Rectangle br = new Rectangle(0, 0,5,5);
    
    //ALEATORIOS (PARA LOS TIEMPOS)
    int t1=((int)(Math.random()*(10-7+1)+7))*1000; 
    int t2=((int)(Math.random()*(7-5+1)+5))*1000;
    int tput=((int)(Math.random()*(20-15+1)+15))*1000;
    int tpvid=((int)(Math.random()*(40-30+1)+30))*1000;
    int tpb=((int)(Math.random()*(30-20+1)+20))*1000;
    
    //VARIABLES DE TIEMPOS
    int td=1000;
    int tes=50000;
    int temp = 0;
    int min = 0;
    //VARIABLES DE PUNTAJE
    int puntaje = 0;
    int temppunt=0;
    int bomb=0;
    
   // int cont=(int)(Math.random()*(8-5+1)+5);
    //EVENTOS TECLA PRESIONADA
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        Graphics papel = panel.getGraphics();       
        
        //Limpiar panel
        papel.setColor(Color.BLACK);
        papel.fillRect(0, 0, 720, 720);
        
        System.out.println("Tecla: "+evt.getKeyCode());
        
        //BORDES
        papel.setColor(Color.BLUE);
        
        //BORDE SUPERIOR
        bu.x=10;
        bu.y=30;
        bu.height=10;
        bu.width=720;
        
        //BORDE INFERIOR
        bd.x=20;
        bd.y=740;
        bd.height=10;
        bd.width=720;
        
        //BORDE IZQUIERDA
        bl.x=10;
        bl.y=30;
        bl.height=720;
        bl.width=10;
        
        //BORDE DERECHA
        br.x=730;
        br.y=30;
        br.height=720;
        br.width=10;
        
        repaint();
        
        //ESCAPE / MENU
        if(evt.getKeyCode()==27){ 
            Menu m= new Menu();
            m.setVisible(true);
            this.dispose();
        }
        
        //BOMBA X
        if(evt.getKeyCode()==88){ 
            if(bomb>=1){
                //REALENTIZAR TIEMPO X2
                t1=t1*2;
                t2=t2*2;
                
                //ELIMINA TODOS LOS AGTAQUES DE LA PANTALLA
                rcd1.x=0;
                rcd1.y=0;
                rcd1.width=0;
                rcd1.height=0;

                rcd2.x=0;
                rcd2.y=0;
                rcd2.width=0;
                rcd2.height=0;

                rcg1.x=0;
                rcg1.y=0;
                rcg1.width=0;
                rcg1.height=0;

                rcg2.x=0;
                rcg2.y=0;
                rcg2.width=0;
                rcg2.height=0; 
                
                //ELIMINA LA BOMBA USADA
                bomb--;
                String b = Integer.toString(bomb);     
                lblB.setText(b);
            }
            repaint(); 
        }
        
        //ARRIBA
        if(evt.getKeyCode()==38 || evt.getKeyCode()==87){ 
            papel.setColor(Color.WHITE);
            //System.out.println("Arriba");
            r1.y-=10;
            
            //SI INTERSECTA CON BORDE SUPERIOR
            if(r1.intersects(bu)){
                r1.y+=10;
            } 
            repaint(); 
        }
        
        //ABAJO
        if(evt.getKeyCode()==40 || evt.getKeyCode()==83){
        
            papel.setColor(Color.WHITE);
            //System.out.println("Abajo");
            r1.y+=10;
            
            //SI INTERSECTA CON BORDE INFERIOR
            if(r1.intersects(bd)){
                r1.y-=10;
            }
            
            repaint();
        }

        //DERECHA
        if(evt.getKeyCode()==39 || evt.getKeyCode()==68){
            papel.setColor(Color.WHITE);
            //System.out.println("Derecha");
            r1.x+=10;
            
            //SI INTERSECTA CON BORDE DERECHA
            if(r1.intersects(br)){
                r1.x-=10;
            }
            
            repaint();
        }
        
        //IZQUIERDA
        if(evt.getKeyCode()==37 || evt.getKeyCode()==65){
            papel.setColor(Color.WHITE);
            //System.out.println("Izquierda");
            r1.x-=10;
            
            //SI INTERSECTA CON BORDE IZQUIERDA
            if(r1.intersects(bl)){
                r1.x+=10;
            }
            repaint();
        }
        
        //SI COLISIONA CON EL ATAQUE (EL SIGUIENTE PROCESO SE REPITE CON LOS 4 OBSTACULOS)
        if(r1.intersects(rcd1)){
            //RESTA UNA VIDA
            vidas=vidas-1;
            vid=String.valueOf(vidas);
            lblVid.setText(vid);
            
            //REINICIA AL JUGADOR EN SU POSICION ORIGINAL
            r1.x=360;
            r1.y=360;
            
            //ELIMINA TODOS LOS ATAQUES DE LA PANTALLA
            rcd1.x=0;
            rcd1.y=0;
            rcd1.width=0;
            rcd1.height=0;
            
            rcd2.x=0;
            rcd2.y=0;
            rcd2.width=0;
            rcd2.height=0;
            
            rcg1.x=0;
            rcg1.y=0;
            rcg1.width=0;
            rcg1.height=0;
            
            rcg2.x=0;
            rcg2.y=0;
            rcg2.width=0;
            rcg2.height=0;
            
            repaint();
            
        }
        
        if(r1.intersects(rcd2)){
            vidas=vidas-1;
            vid=String.valueOf(vidas);
            lblVid.setText(vid);
            
            r1.x=360;
            r1.y=360;
            
            rcd1.x=0;
            rcd1.y=0;
            rcd1.width=0;
            rcd1.height=0;
            
            rcd2.x=0;
            rcd2.y=0;
            rcd2.width=0;
            rcd2.height=0;
            
            rcg1.x=0;
            rcg1.y=0;
            rcg1.width=0;
            rcg1.height=0;
            
            rcg2.x=0;
            rcg2.y=0;
            rcg2.width=0;
            rcg2.height=0;
            
            repaint();
        }
        
        if(r1.intersects(rcg1)){
            vidas=vidas-1;
            vid=String.valueOf(vidas);
            lblVid.setText(vid);
            
            r1.x=360;
            r1.y=360;
            
            rcd1.x=0;
            rcd1.y=0;
            rcd1.width=0;
            rcd1.height=0;
            
            rcd2.x=0;
            rcd2.y=0;
            rcd2.width=0;
            rcd2.height=0;
            
            rcg1.x=0;
            rcg1.y=0;
            rcg1.width=0;
            rcg1.height=0;
            
            rcg2.x=0;
            rcg2.y=0;
            rcg2.width=0;
            rcg2.height=0;
            
            repaint();
        }
        
        if(r1.intersects(rcg2)){
            vidas=vidas-1;
            vid=String.valueOf(vidas);
            lblVid.setText(vid);
            
            r1.x=360;
            r1.y=360;
            
            rcd1.x=0;
            rcd1.y=0;
            rcd1.width=0;
            rcd1.height=0;
            
            rcd2.x=0;
            rcd2.y=0;
            rcd2.width=0;
            rcd2.height=0;
            
            rcg1.x=0;
            rcg1.y=0;
            rcg1.width=0;
            rcg1.height=0;
            
            rcg2.x=0;
            rcg2.y=0;
            rcg2.width=0;
            rcg2.height=0;
            
            repaint();
        }   
        
        //POWER UO VIDA
        if(r1.intersects(rpv)){
            //AUMENTA PUNTAJE
            puntaje+=1000;
            String p = Integer.toString(puntaje);
            lblPuntaje.setText(p);
            
            //SUBE UNA VIDA
            vidas=vidas+1;
            vid=String.valueOf(vidas);
            lblVid.setText(vid);
            
            //ELIMINA EL POWER UP DE LA PANTALLA
            rpv.x=0;
            rpv.y=0;
            lblPU.setText("Vida Extra");
        }
        
        //GAME OVER (SIN VIDAS)
        if(vidas==0){
            //TERMINA LOS TEMPORIZADORES
            timerdef.stop();
            timerp.stop();
            timervid.stop(); 
            timerput.stop();
            timerb.stop();
            
            //PIDE EL NOMBRE DEL JUGADOR
            String nomp = JOptionPane.showInputDialog("Inserta tu nombre");
            //MUESTRA NOMBRE Y PUNTAJE
            JOptionPane.showMessageDialog(null,"Fin del juego\n El jugador "+nomp+" ha conseguido: "+puntaje+" puntos","ALERTA",JOptionPane.INFORMATION_MESSAGE); 
            
            //REALIZA CONEXION CON LA BASE DE DATOS PARA SUBIR TU PUNTAJE
            try {
            Connection con;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/laserattack","root","");
            Statement st;
            ResultSet rs;
            st=con.createStatement();
            st.executeUpdate("INSERT INTO jugadores (ID, Nombre, Puntaje) VALUES (NULL,'"+nomp+"','"+puntaje+"');");
            con.close();
            //CONFIRMA QUE TU PUNTAJE SE GUARDO
            JOptionPane.showMessageDialog(null,"Puntaje enviado","ALERTA",JOptionPane.INFORMATION_MESSAGE); 
            }catch (Exception e) {
                //ERROR EN CASO DE NO TENER CONEXION CON LA BASE DE DATOS
                System.out.println("Error: "+e);
                JOptionPane.showMessageDialog(null,"Error al agregar puntaje","ALERTA",JOptionPane.INFORMATION_MESSAGE); 
            }
            //REGRESO AL MENU
            Menu m= new Menu();
            m.setVisible(true);
            this.dispose();
        }
        
        //POWER UP TIME
        if(r1.intersects(rpt)){
            //AUMENTA PUNTAJE
            puntaje+=500;
            
            String p = Integer.toString(puntaje);
            lblPuntaje.setText(p);
            
            //MULTIPLICA POR 3 LOS TEMPORIZADORES
            t1=t1*3;
            t2=t2*3;
            rpt.x=0;
            rpt.y=0;
            lblPU.setText("Tiempo");
        }
        
        //POWER UP BOMBA
        if(r1.intersects(rpb)){
            //AUMENTA PUNTAJE
            puntaje+=500;
            String p = Integer.toString(puntaje);
            lblPuntaje.setText(p);
            
            //TE SUMA UNA BOMBA
            bomb++;
            String b = Integer.toString(bomb);     
            lblB.setText(b);
            
            //ELIMINA EL POWER UP
            rpb.x=0;
            rpb.y=0;
            lblPU.setText("Bomba");
        }
        
        
    }//GEN-LAST:event_formKeyPressed
   
    //CONTADOR DEFINITVO
    //TEMPORIZADOR PARA TENER TODOS LOS TEMPORIZADORES Y SINCRONIZAR EL ATAQUE CON EL AVISO DE DONDE APARECER
    Timer timerdef = new Timer(td, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            //TIMER AVISO
            timer.start();
            //TIMER ESPERA
            timeresp.start();
            //TIEMR ATAQUE
            timerad.start();
            
            //TIMER AVISO
            timer2.start();
            //TIMER ESPERA
            timeresp.start();
            //TIMER ATAQUE
            timer2ad.start();
        }
    });
    
    //ADVERTENCIA LINEA DELGADA
    //LOS RANDOMS SON DEL ESPACIO DE PANTALLA
    Timer timerad = new Timer(t1, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {   
            rcd1a.x=(int)(Math.random()*(700-0+1)+0);
            rcd1a.y=20;
            rcd1a.height=730;
            rcd1a.width=50;
            
            rcd2a.x=20;
            rcd2a.y=(int)(Math.random()*(700-0+1)+0);
            rcd2a.height=50;
            rcd2a.width=720;
            
            repaint();            
            t1=((int)(Math.random()*(10-7+1)+7))*1000; 
        }
    });
    
    //ADVERTENCIA LINEA GRUESA
    Timer timer2ad = new Timer(t2, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            
            rcg1a.x=(int)(Math.random()*(700-0+1)+0);
            rcg1a.y=20;
            rcg1a.height=730;
            rcg1a.width=100;
            
            rcg2a.x=20;
            rcg2a.y=(int)(Math.random()*(700-0+1)+0);
            rcg2a.height=100;
            rcg2a.width=720;

            repaint();
            t2=((int)(Math.random()*(7-5+1)+5))*1000;         
        }
    });
    
    //ATAQUE LINEA DELGADA
    Timer timer = new Timer(t1, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {   
            rcd1.x=rcd1a.x;
            rcd1.y=20;
            rcd1.height=730;
            rcd1.width=50;
            
            rcd2.x=20;
            rcd2.y=rcd2a.y;
            rcd2.height=50;
            rcd2.width=720;
            repaint();
            
            t1=((int)(Math.random()*(10-7+1)+7))*1000; 
        }
    });
    
    //ATAQUE LINEA GRUESA
    Timer timer2 = new Timer(t2, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            
            rcg1.x=rcg1a.x;
            rcg1.y=20;
            rcg1.height=730;
            rcg1.width=100;
            
            rcg2.x=20;
            rcg2.y=rcg2a.y;
            rcg2.height=100;
            rcg2.width=720;

            repaint();
            t2=((int)(Math.random()*(7-5+1)+5))*1000;         
        }
    });
    
    //TIEMPO ESPERA
    Timer timeresp = new Timer(tes, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Espera");
        }
    });
    
    //TIEMPO POWER UP TIEMPO
    Timer timerput = new Timer(tput, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) { 
            rpt.x=(int)(Math.random()*(700-0+1)+0);
            rpt.y=(int)(Math.random()*(700-0+1)+0);

            repaint();
            int tput=((int)(Math.random()*(20-15+1)+15))*1000;
        }
    });
    
    //TIEMPO POWER UP VIDA
    Timer timervid = new Timer(tpvid, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) { 
            rpv.x=(int)(Math.random()*(700-0+1)+0);
            rpv.y=(int)(Math.random()*(700-0+1)+0);

            repaint();
            int tpvid=((int)(Math.random()*(40-30+1)+30))*1000;
        }
    });
    
    //TIEMPO POWER UP BOMB
    Timer timerb = new Timer(tpb, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) { 
            rpb.x=(int)(Math.random()*(700-0+1)+0);
            rpb.y=(int)(Math.random()*(700-0+1)+0);

            repaint();
            int tpb=((int)(Math.random()*(30-20+1)+20))*1000;
        }
    });
     
    //TIEMPO RELOJ
    Timer timerp = new Timer(1000, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Tiempo: "+temp);
            temp++;
            temppunt++;
            
            if(temppunt==10){
                puntaje+=100;
                String p = Integer.toString(puntaje);
                lblPuntaje.setText(p);   
                temppunt=0;
            }
            
            //SEGUNDOS DEL 1 AL 10
            if(temp<10){
                String Temp= String.valueOf(temp);           
                lblTempS.setText(":0"+Temp);
            }
            
            //SEGUNDOS MAYOR A 10 Y MENOR A 60
            if(temp>=10 && temp<=59){
                String Temp= String.valueOf(temp);           
                lblTempS.setText(":"+Temp);
            }
            
            //COMPLETA EL MUINUTO
            if(temp==60){
                lblTempS.setText(":00");
                temp=0;
                min++;
                //SI ES MENOR A 10 MINUTOS
                if(min<10){
                    String Min= String.valueOf(min); 
                    lblTempM.setText("0"+Min);
                }
                //SI ES MAYOR A 10 MINUTOS Y MENOR A 59
                if(min>=10 && min<=59){
                    String Min= String.valueOf(min); 
                    lblTempM.setText(Min);
                }        
            }
        }
    });
    
    //NOTA MIENTRAS MAS ARRIBA, MAS AL FONDO SE REDIBUJA
    public void paint(Graphics g){
        super.paint(g); 
        Graphics2D g2d = (Graphics2D) g;     
        
        //BORDES
        g2d.setColor(Color.BLACK);
        g2d.fillRect(bu.x, bu.y,bu.width , bu.height);
        g2d.fillRect(bd.x, bd.y,bd.width , bd.height);
        g2d.fillRect(bl.x, bl.y,bl.width , bl.height);
        g2d.fillRect(br.x, br.y,br.width , br.height);
        
        //LINEA AVISO DELGADA
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(rcd1a.x, rcd1a.y,rcd1a.width , rcd1a.height);
        g2d.fillRect(rcd2a.x, rcd2a.y,rcd2a.width , rcd2a.height);
        
        //LINEA AVISO GRUESA
        g2d.setColor(Color.YELLOW);
        g2d.fillRect(rcg1a.x, rcg1a.y,rcg1a.width , rcg1a.height);
        g2d.fillRect(rcg2a.x, rcg2a.y,rcg2a.width , rcg2a.height);
        
        //POWER UP TIME
        g2d.setColor(Color.BLUE);
        g2d.fillRect(rpt.x, rpt.y, rpt.height, rpt.width);
        
        //POWER UP VIDA
        g2d.setColor(Color.RED);
        g2d.fillRect(rpv.x, rpv.y, rpv.height, rpv.width);
        
        //POWER UP BOMBA
        g2d.setColor(Color.orange);
        g2d.fillRect(rpb.x, rpb.y, rpb.height, rpb.width);
        
        //PLAYER
        g2d.setColor(Color.WHITE);
        g2d.fillRect(r1.x, r1.y, r1.height, r1.width);

        //LINEA ATAQUE DELGADA
        g2d.setColor(Color.WHITE);
        g2d.fillRect(rcd1.x, rcd1.y,rcd1.width , rcd1.height);
        g2d.fillRect(rcd2.x, rcd2.y,rcd2.width , rcd2.height);

        //LINEA ATAQUE GRUESA
        g2d.setColor(Color.WHITE);
        g2d.fillRect(rcg1.x, rcg1.y,rcg1.width , rcg1.height);
        g2d.fillRect(rcg2.x, rcg2.y,rcg2.width , rcg2.height);
        
    }
    
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
            java.util.logging.Logger.getLogger(Videojuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Videojuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Videojuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Videojuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Videojuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblBombas;
    private javax.swing.JLabel lblPU;
    private javax.swing.JLabel lblPuntaje;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel lblTempM;
    private javax.swing.JLabel lblTempS;
    private javax.swing.JLabel lblTiempotxt;
    private javax.swing.JLabel lblUltimoPower;
    private javax.swing.JLabel lblUp;
    private javax.swing.JLabel lblVid;
    private javax.swing.JLabel lblVidastxt;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
