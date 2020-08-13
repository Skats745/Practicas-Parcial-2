
package Vista;

import Modelo.ClsFactory;
import Modelo.ClsSetFigura;
import Interface.Interfaz;

public class Frmfig extends javax.swing.JFrame {

    
    public Frmfig() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combobox = new javax.swing.JComboBox<>();
        identificar = new javax.swing.JButton();
        Base = new javax.swing.JLabel();
        Lado = new javax.swing.JLabel();
        Altura = new javax.swing.JLabel();
        Radio = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elije una figura", "Circulo", "Cuadrado", "Rectangulo", "Triangulo", " " }));
        combobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboboxSeleccion(evt);
            }
        });
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        identificar.setText("Identificar");
        identificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identificarActionPerformed(evt);
            }
        });

        Base.setText("Base");

        Lado.setText("Lado");

        Altura.setText("Altura");

        Radio.setText("Radio");

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identificar)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Base)
                                .addComponent(Lado))
                            .addComponent(Altura)
                            .addComponent(Radio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Base)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Altura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Radio))
                .addGap(18, 18, 18)
                .addComponent(identificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
    }//GEN-LAST:event_comboboxActionPerformed

    private void identificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identificarActionPerformed
        if ("Circulo".equals(combobox.getSelectedItem().toString())) {

            ClsSetFigura circulo = new ClsSetFigura();
            Interfaz cir = ClsFactory.getinsfig(combobox.getSelectedItem().toString());
            circulo.setRadio(Double.parseDouble(this.txt4.getText()));
            String perimet = String.valueOf(cir.perimetro(circulo));
            String area = String.valueOf(cir.area(circulo));

            this.txtarea.setText(cir.descripcion() + " \n con area: " + area + " y perimetro : " + perimet);

        }

        if ("Cuadrado".equals(combobox.getSelectedItem().toString())) {

            ClsSetFigura cuadrado = new ClsSetFigura();
            Interfaz cua = ClsFactory.getinsfig(combobox.getSelectedItem().toString());
            cuadrado.setLado(Double.parseDouble(this.txt2.getText()));
            String perimet = String.valueOf(cua.perimetro(cuadrado));
            String area = String.valueOf(cua.area(cuadrado));

            this.txtarea.setText(cua.descripcion() + "con area: " + area + " y perimetro : " + perimet);

        }
        if ("Triangulo".equals(combobox.getSelectedItem().toString())) {

            ClsSetFigura triangulo = new ClsSetFigura();
            Interfaz Tri = ClsFactory.getinsfig(combobox.getSelectedItem().toString());
            triangulo.setBase(Double.parseDouble(this.txt1.getText()));
            triangulo.setAltura(Double.parseDouble(this.txt3.getText()));
            String perimet = String.valueOf(Tri.perimetro(triangulo));
            String area = String.valueOf(Tri.area(triangulo));

            this.txtarea.setText(Tri.descripcion() + " con area: " + area + " y perimetro : " + perimet);

        }

        if ("Rectangulo".equals(combobox.getSelectedItem().toString())) {

            ClsSetFigura rectangulo = new ClsSetFigura();
            Interfaz rec = ClsFactory.getinsfig(combobox.getSelectedItem().toString());
            rectangulo.setLado(Double.parseDouble(this.txt2.getText()));
            rectangulo.setAltura(Double.parseDouble(this.txt3.getText()));
            String perimet = String.valueOf(rec.perimetro(rectangulo));
            String area = String.valueOf(rec.area(rectangulo));

            this.txtarea.setText(rec.descripcion() + " con area: " + area + " y perimetro : " + perimet);

        }
        if ("Elije una figura".equals(combobox.getSelectedItem().toString())) {
            this.txtarea.setText("Selecciona una figura");
        }
    }//GEN-LAST:event_identificarActionPerformed

    private void comboboxSeleccion(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboboxSeleccion
        if ("Circulo".equals(combobox.getSelectedItem().toString())) {

            this.txt3.setVisible(false);
            this.txt1.setVisible(false);
            this.txt2.setVisible(false);
            this.txt4.setVisible(true);

            this.Altura.setVisible(false);
            this.Lado.setVisible(false);
            this.Base.setVisible(false);
            this.Radio.setVisible(true);

        }

        if ("Cuadrado".equals(combobox.getSelectedItem().toString())) {

            this.txt3.setVisible(false);
            this.txt1.setVisible(false);
            this.txt2.setVisible(true);
            this.txt4.setVisible(false);

            this.Altura.setVisible(false);
            this.Lado.setVisible(true);
            this.Base.setVisible(false);
            this.Radio.setVisible(false);

        }
        if ("Triangulo".equals(combobox.getSelectedItem().toString())) {

            this.txt3.setVisible(true);
            this.txt1.setVisible(true);
            this.txt2.setVisible(false);
            this.txt4.setVisible(false);

            this.Altura.setVisible(true);
            this.Lado.setVisible(false);
            this.Base.setVisible(true);
            this.Radio.setVisible(false);

        }

        if ("Rectangulo".equals(combobox.getSelectedItem().toString())) {

            this.txt3.setVisible(true);
            this.txt1.setVisible(false);
            this.txt2.setVisible(true);
            this.txt4.setVisible(false);

            this.Altura.setVisible(true);
            this.Lado.setVisible(true);
            this.Base.setVisible(false);
            this.Radio.setVisible(false);

        }
        if ("Elije una figura".equals(combobox.getSelectedItem().toString())) {
            this.txtarea.setText("Selecciona una figura");
        }
    }//GEN-LAST:event_comboboxSeleccion
    
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmfig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Altura;
    private javax.swing.JLabel Base;
    private javax.swing.JLabel Lado;
    private javax.swing.JLabel Radio;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JButton identificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}
