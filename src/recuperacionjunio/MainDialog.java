/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacionjunio;

import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import sun.nio.cs.ext.GB18030;

/**
 *
 * @author Javier
 */
public class MainDialog extends javax.swing.JDialog {

    Generos genero = new Generos();
    int contador = 0;

    /**
     *
     *
     * @param parent
     * @param modal
     */
    public MainDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        genero.añadirPelis();
        mostrarDatos();

    }

    /**
     * Nos permitira mostrar los datos de una pelicula
     *
     */
    private void mostrarDatos() {
        jTextFieldNombre.setText(Generos.peliculas.get(contador).getNombrePelicula());
        jTextFieldFecha.setText(String.valueOf(Generos.peliculas.get(contador).getFechaSalida()));
        jTextFieldCantidad.setText(String.valueOf(Generos.peliculas.get(contador).getCantidad()));
        jTextFieldPosesion.setText(String.valueOf(Generos.peliculas.get(contador).isEnPosesion()));
        jTextFieldGenero.setText(Generos.peliculas.get(contador).getCategoria());
    }

    private void modificarDatos() {
        Generos.peliculas.get(contador).setNombrePelicula(jTextFieldNombre.getText());
        Generos.peliculas.get(contador).setFechaSalida(Integer.valueOf(jTextFieldFecha.getText()));
        Generos.peliculas.get(contador).setEnPosesion(Boolean.valueOf(jTextFieldPosesion.getText()));
        Generos.peliculas.get(contador).setCantidad(Integer.valueOf(jTextFieldCantidad.getText()));
        Generos.peliculas.get(contador).setCategoria(jTextFieldGenero.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSiguiente = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldCantidad = new javax.swing.JTextField();
        jTextFieldPosesion = new javax.swing.JTextField();
        jTextFieldGenero = new javax.swing.JTextField();
        jButtonAnterior = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonAñadir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonAñadirXML = new javax.swing.JButton();
        jButtonCrearCSV = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonSiguiente.setText("Siguiente Pelicula");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jTextFieldNombre.setText("Nombre");

        jTextFieldFecha.setText("Fecha");

        jTextFieldCantidad.setText("Cantidad");

        jTextFieldPosesion.setText("Posesion");
        jTextFieldPosesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPosesionActionPerformed(evt);
            }
        });

        jTextFieldGenero.setText("Genero");
        jTextFieldGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGeneroActionPerformed(evt);
            }
        });

        jButtonAnterior.setText("Anterior Pelicula");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonNuevo.setText("Nueva");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonAñadir.setText("Añadir");
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Fecha");

        jLabel3.setText("Cantidad");

        jLabel4.setText("Posesion");

        jLabel5.setText("Genero");

        jButtonAñadirXML.setText("Añadir XML");
        jButtonAñadirXML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirXMLActionPerformed(evt);
            }
        });

        jButtonCrearCSV.setText("Crear CSV");
        jButtonCrearCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearCSVActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar en Posicion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButtonAnterior)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2)
                    .addComponent(jButtonSiguiente)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPosesion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonAñadirXML, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jButtonCrearCSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton1)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSiguiente)
                    .addComponent(jButtonAnterior))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPosesion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGenero)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonAñadirXML))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAñadir)
                    .addComponent(jButtonCrearCSV)
                    .addComponent(jButton2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Nos moveremos hacia adelante en el listado de peliculas y nos permitira
     * guardar los datos modificados
     */
    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        //modificacion del objeto
        modificarDatos();

        if (contador < Generos.peliculas.size() - 1) {

            genero.adelantarPelicula(++contador);

            jTextFieldNombre.setText(genero.pelicula.getNombrePelicula());
            jTextFieldFecha.setText(String.valueOf(genero.pelicula.getFechaSalida()));
            jTextFieldPosesion.setText(String.valueOf(genero.pelicula.isEnPosesion()));
            jTextFieldCantidad.setText(String.valueOf(genero.pelicula.getCantidad()));
            jTextFieldGenero.setText(genero.pelicula.getCategoria());
        } else {
            JOptionPane.showMessageDialog(this, "ya no ha mas peliculas");
        }
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jTextFieldGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGeneroActionPerformed

    }//GEN-LAST:event_jTextFieldGeneroActionPerformed
    /**
     * Nos moveremos hacia atras en el listado de peliculas y nos permitira
     * guardar los datos modificados
     */
    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        //modificacion del objeto
        modificarDatos();
        if (contador > 0) {

            genero.adelantarPelicula(--contador);

            jTextFieldNombre.setText(genero.pelicula.getNombrePelicula());
            jTextFieldFecha.setText(String.valueOf(genero.pelicula.getFechaSalida()));
            jTextFieldPosesion.setText(String.valueOf(genero.pelicula.isEnPosesion()));
            jTextFieldCantidad.setText(String.valueOf(genero.pelicula.getCantidad()));
            jTextFieldGenero.setText(genero.pelicula.getCategoria());

        } else {
            JOptionPane.showMessageDialog(this, "ya no ha mas peliculas");
        }
    }//GEN-LAST:event_jButtonAnteriorActionPerformed
    /**
     * nos pondra en blanco todos las areas de texto
     *
     */
    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        jTextFieldNombre.setText("");
        jTextFieldFecha.setText("");
        jTextFieldCantidad.setText("");
        jTextFieldPosesion.setText("");
        jTextFieldGenero.setText("");
    }//GEN-LAST:event_jButtonNuevoActionPerformed
    /**
     * Nos permitira modificar la pelicula
     *
     */
    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // cambiar solo el objeto
        modificarDatos();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        try {
            String nombre = jTextFieldNombre.getText();
            int fechaSalida = Integer.valueOf(jTextFieldFecha.getText());
            int cantidad = Integer.valueOf(jTextFieldCantidad.getText());
            String posesion = jTextFieldPosesion.getText();
            String generos = jTextFieldGenero.getText();

            //guarda en una variable boolean y te la compara a la hora de escribirla
            boolean enPosesion = false;
            if (posesion.equals("true")) {
                enPosesion = true;
            }

            //añade la pelicula
            Generos.peliculas.add(new Peliculas(nombre, fechaSalida, cantidad, enPosesion, generos));

            //al igualarlo nos llevara al final del array
            contador = Generos.peliculas.size() - 1;
            mostrarDatos();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: El valor indicado no es un número");
        }
    }//GEN-LAST:event_jButtonAñadirActionPerformed

    private void jTextFieldPosesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPosesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPosesionActionPerformed

    private void jButtonAñadirXMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirXMLActionPerformed
        //nos crea un objeto filechooser y nos permitira abrirlo
        //el jfileChooser abre la ventana
        JFileChooser leerXML = new JFileChooser();
        //hace que se muestre los ficheros y directorios
        //sin la linea FILES_AND_DIRECTORIES solo se mostrarian los archivos
        leerXML.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        //no se va abrir hasta que no este aprobado
        if (leerXML.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {

            //te da la ruta absoluta de donde esta el archivo puesto
            String direccion = leerXML.getSelectedFile().getAbsolutePath();

            try {
                //crea el archivo XML
                DocumentBuilderFactory fábricaCreadorDocumento = DocumentBuilderFactory.newInstance();
                DocumentBuilder creadorDocumento = fábricaCreadorDocumento.newDocumentBuilder();

                //aqui viene la ruta desde variable direccion
                Document documento = creadorDocumento.parse(direccion);

                //Obtener el elemento raíz del documento
                Element raiz = documento.getDocumentElement();

                //obtiene todo los elementos que tengan la etiqueta pelicula. Todo lo que se llame pelicula
                NodeList datosPeliculas = raiz.getElementsByTagName("Pelicula");

                //Recorrer la lista de Pelicula
                //te recorre los datosPlicula
                for (int i = 0; i < datosPeliculas.getLength(); i++) {
                    //Obtener de la lista una Pelicula tras otro
                    //guarda los datos de todas las peliculas
                    Node pelicula1 = datosPeliculas.item(i);
                    Peliculas añadirPeli = new Peliculas();
                    
                    //Obtener la lista de los datos que contiene la Pelicula
                    NodeList datosPeli = pelicula1.getChildNodes();

                    //Recorrer la lista de los datos que contiene la Pelicula
                    for (int j = 0; j < datosPeli.getLength(); j++) {

                        //Obtener de la lista de datos un dato tras otro
                        Node dato = datosPeli.item(j);

                        //Comprobar que el dato se trata de un nodo de tipo Element
                        if (dato.getNodeType() == Node.ELEMENT_NODE) {

                            //Recoge la informacion de los nodos
                            if (dato.getNodeName().equalsIgnoreCase("nombrePelicula")) {
                                añadirPeli.setNombrePelicula(dato.getFirstChild().getNodeValue());
                            }
                            if (dato.getNodeName().equalsIgnoreCase("fechaSalida")) {
                                añadirPeli.setFechaSalida(Integer.valueOf(dato.getFirstChild().getNodeValue()));
                            }
                            if (dato.getNodeName().equalsIgnoreCase("cantidad")) {
                                añadirPeli.setFechaSalida(Integer.valueOf(dato.getFirstChild().getNodeValue()));
                            }
                            if (dato.getNodeName().equalsIgnoreCase("enPosesion")) {
                                String enPos = dato.getFirstChild().getNodeValue();
                                //Creo una variable booleana para que recoja el String "true" y lo pase como boolean
                                boolean enPosesion = false;
                                if (enPos.equals("true")) {
                                    enPosesion = true;
                                }
                                añadirPeli.setEnPosesion(enPosesion);
                            }
                            if (dato.getNodeName().equalsIgnoreCase("categoria")) {
                                añadirPeli.setCategoria((dato.getFirstChild().getNodeValue()));
                            }
                        }
                    }
                    //Guarda en las caracteristicas del pelicula el xml
                    genero.peliculas.add(añadirPeli);
                }
            } catch (SAXException ex) {
                System.out.println("ERROR: El formato XML del fichero no es correcto\n" + ex.getMessage());
                ex.printStackTrace();
            } catch (IOException ex) {
                System.out.println("ERROR: Se ha producido un error el leer el fichero\n" + ex.getMessage());
                ex.printStackTrace();
            } catch (ParserConfigurationException ex) {
                System.out.println("ERROR: No se ha podido crear el generador de documentos XML\n" + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButtonAñadirXMLActionPerformed

    private void jButtonCrearCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearCSVActionPerformed
        //creacion de una variable con el String
        String nombreFichero = "Filmoteca.txt";
        BufferedWriter bw = null;

        try {
            //creacion del objeto bufferedwritter
            bw = new BufferedWriter(new FileWriter(nombreFichero));

            //recorre el arrayList
            for (int i = 0; i < Generos.peliculas.size(); i++) {
                //recoge la informacion y la guarda en variables
                String texto;
                String nombre = Generos.peliculas.get(i).getNombrePelicula();
                int fechaSalida = Generos.peliculas.get(i).getFechaSalida();
                int cantidad = Generos.peliculas.get(i).getCantidad();
                boolean enPosesion = Generos.peliculas.get(i).isEnPosesion();
                String categoria = Generos.peliculas.get(i).getCategoria();

                //te la muestra
                //"/t" nos hace una tabulacion
                texto = nombre + "\t" + fechaSalida + "\t" + cantidad + "\t" + enPosesion + "\t" + categoria + "\r\n";
                //nos lo escribe en un fichero                
                bw.write(texto);
            }
            JOptionPane.showMessageDialog(this, "filmoteca creada");
        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Error de escritura del fichero");
        } finally {
            try {
                //Cerrar el buffer
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al cerrar el fichero");
            }
        }
    }//GEN-LAST:event_jButtonCrearCSVActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int posMatrizUno = Integer.valueOf(jTextField1.getText());
            int posMatrizDos = Integer.valueOf(jTextField2.getText());
            
            if (posMatrizUno >= 0 && posMatrizUno <= Generos.escaparate.length) {
                if (posMatrizDos >= 0 && posMatrizDos <= Generos.escaparate.length) {
                    Generos.escaparate[posMatrizUno][posMatrizDos] = Generos.peliculas.get(contador);
                } else {
                    JOptionPane.showMessageDialog(this, "El numero Dos tiene que ser mayor que cero");
                }
            } else {
                JOptionPane.showMessageDialog(this, "El numero Dos tiene que ser mayor que cero");
            }
        //recoge una pelicula y la almacena en la posicion indica
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tiene que poner un numero");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Se utiliza el contador para indicar la pelicula en la que se encuentra
        Generos.peliculas.remove(contador);
        //se utiliza el metodo mostrar datos para que se actualizen los datos
        mostrarDatos();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainDialog dialog = new MainDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonAñadirXML;
    private javax.swing.JButton jButtonCrearCSV;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldGenero;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPosesion;
    // End of variables declaration//GEN-END:variables
}
