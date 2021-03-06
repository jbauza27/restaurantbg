package interfaz.productoelaborado;

import entidad.MateriaPrima;
import entidad.ProductoElaborado;
import gestor.GestorMateriasPrimas;
import gestor.GestorProductosElaborados;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import utilidades.Campos;


/**
 * Formulario para dar de alta un producto elaborado.
 */
public class IntAltaProductoElaborado extends javax.swing.JDialog
{
    /* Atributos */
    private Session sesion;
    private GestorProductosElaborados gesProdElab;
    private GestorMateriasPrimas gesMatPrim;
    private ArrayList<MateriaPrima> listaMateriasPrimas;
    
    private ArrayList<String> cadenasMateriasPrimas;
    private DefaultListModel modeloListaMateriasPrimasDisponibles;
    private DefaultListModel modeloListaMateriasPrimasSeleccionadas;
    
    
    /* Constructor */
    public IntAltaProductoElaborado(java.awt.Frame parent, boolean modal,
            Session sesion)
    {
        super(parent, modal);
        initComponents();
        
        this.sesion = sesion;        
        jlMensaje.setVisible(false);
        gesProdElab = new GestorProductosElaborados(sesion);
        gesMatPrim = new GestorMateriasPrimas(sesion);        
        listaMateriasPrimas = gesMatPrim.getListaMateriasPrimas();
        
        modeloListaMateriasPrimasDisponibles = new DefaultListModel();        
        modeloListaMateriasPrimasSeleccionadas = new DefaultListModel();
        
        cadenasMateriasPrimas = new ArrayList<>();
        
        llenarListaMateriasPrimasDisponibles();
    }

    
    /* Métodos */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlAltaDeProductosElaborados = new javax.swing.JLabel();
        jlDatos = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlPrecio = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();
        jlMateriasPrimas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListMateriasPrimasDisponibles = new javax.swing.JList();
        jbAnadir = new javax.swing.JButton();
        jlDisponibles = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListMateriasPrimasSeleccionadas = new javax.swing.JList();
        jlSeleccionados = new javax.swing.JLabel();
        jbQuitar = new javax.swing.JButton();
        jbDarDeAlta = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jlMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Restaurant \"Buen gusto\" - Alta de productos elaborados");

        jlAltaDeProductosElaborados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlAltaDeProductosElaborados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAltaDeProductosElaborados.setText("Alta de productos elaborados");

        jlDatos.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jlDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDatos.setText("Datos");

        jlNombre.setText("Nombre:");

        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });

        jlPrecio.setText("Precio:");

        jtfPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPrecioKeyTyped(evt);
            }
        });

        jlMateriasPrimas.setText("Materias primas:");

        jScrollPane1.setViewportView(jListMateriasPrimasDisponibles);

        jbAnadir.setText("Añadir ->");
        jbAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnadirActionPerformed(evt);
            }
        });

        jlDisponibles.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jlDisponibles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDisponibles.setText("disponibles");

        jScrollPane2.setViewportView(jListMateriasPrimasSeleccionadas);

        jlSeleccionados.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jlSeleccionados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSeleccionados.setText("seleccionados");

        jbQuitar.setText("<- Quitar");
        jbQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitarActionPerformed(evt);
            }
        });

        jbDarDeAlta.setText("Dar de alta");
        jbDarDeAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDarDeAltaActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMensaje.setText("Mensaje");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlMateriasPrimas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(jlPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jtfPrecio, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlDisponibles, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                .addGap(100, 100, 100))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbAnadir))
                                .addGap(29, 29, 29)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSeleccionados, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbDarDeAlta)
                .addGap(18, 18, 18)
                .addComponent(jbSalir)
                .addGap(210, 210, 210))
            .addComponent(jlMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jlAltaDeProductosElaborados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlAltaDeProductosElaborados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrecio)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMateriasPrimas)
                    .addComponent(jlDisponibles)
                    .addComponent(jlSeleccionados))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jbAnadir)
                        .addGap(18, 18, 18)
                        .addComponent(jbQuitar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDarDeAlta)
                    .addComponent(jbSalir))
                .addGap(18, 18, 18)
                .addComponent(jlMensaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Cierra la ventana sin guardar ningún cambio.
     * 
     * @param evt el evento de pulsación sobre el botón 'Cancelar'
     */    
    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    /**
     * Da de alta un producto elaborado que contiene todos los datos ingresados.
     * 
     * @param evt el evento de pulsación del botón 'Dar de alta'
     */    
    private void jbDarDeAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDarDeAltaActionPerformed
        /* VALIDACIONES */
        String mensajeDeError = "Se han producido los siguientes errores:\n\n";
        boolean error = false;
        
        /* Me cercioro que no hay campos vacíos */
        if(jtfNombre.getText().equals("") || jtfPrecio.getText().equals(""))
        {
            mensajeDeError = mensajeDeError + "- Debe llenar todos los campos.\n";
            error = true;
        }        
        
        
        /* Si existen errores, envío una notificación al usuario, caso contrario, 
         * guardo los datos en la base de datos. */
        if(error == true)
        {
            JOptionPane.showMessageDialog(null,
                    mensajeDeError,
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        /* ALTA */
        else
        {
            // armando objeto 'Producto elaborado'
            ProductoElaborado prodElab = new ProductoElaborado();
                        
            prodElab.setActivo(true);
            prodElab.setNombre(jtfNombre.getText().trim());
            Float precio = Float.parseFloat(jtfPrecio.getText().trim());
            prodElab.setPrecio(precio);
            prodElab.setCantidad(0);
            
            // guardo el contenido del modelo de materias primas seleccionadas en un
            // arreglo de cadenas
            ArrayList<String> matPrimElegString = new ArrayList<>();
            for(int i = 0 ; i < modeloListaMateriasPrimasSeleccionadas.size() ; i++)
            {
                matPrimElegString.add((String) modeloListaMateriasPrimasSeleccionadas.get(i));
            }
            
            // creo un arreglo de materias primas y guardo en él todas las materias primas
            // del arreglo de cadenas
            ArrayList<MateriaPrima> matPrimEleg = new ArrayList<>();
            for(String matPrimActualString : matPrimElegString)
            {                
                MateriaPrima matPrimActual = new MateriaPrima();
                int indGuion = matPrimActualString.indexOf("-");
                String idMatPrimString = String.valueOf(matPrimActualString.substring(0, indGuion-1));
                matPrimActual = gesMatPrim.buscarPorId(Integer.parseInt(idMatPrimString));
                matPrimEleg.add(matPrimActual);
            }
            
            // relación muchos a muchos: al producto elaborado le asigno múltiples
            // materias primas, y a cada una de las materias primas le asigno
            // un producto elaborado
            for(MateriaPrima matPrim : matPrimEleg)
            {
                ArrayList<ProductoElaborado> arrProdElab = new ArrayList<>();
                arrProdElab.add(prodElab);
                matPrim.setProductosElaborados(arrProdElab);
            }
            prodElab.setMateriasPrimas(matPrimEleg);
            
            
            // cerciorándome de que no haya en la base de datos otro
            // producto elaborado con ese nombre
            ArrayList<ProductoElaborado> repetidos = new ArrayList<>();
            String hql = "FROM ProductoElaborado P WHERE P.nombre = '" 
                    + jtfNombre.getText() + "'";
            Query query = sesion.createQuery(hql);
            repetidos = (ArrayList<ProductoElaborado>) query.list();
            
            // si no se eligen materias primas para el producto elaborado, se
            // le pregunta al usuario si desea continuar con el guardado del
            // producto elaborado
            if(matPrimEleg.isEmpty() == true)
            {
                int seleccion = JOptionPane.showConfirmDialog(
                        null,
                        "¿Está seguro que desea crear un producto elaborado sin "
                                + "materias primas?",
                        "Producto elaborado sin materias primas",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE);
                
                if(seleccion == JOptionPane.YES_OPTION)
                {
                    // si no se encontró ningún producto elaborado con ese nombre entonces
                    // se puede darlo de alta en la base de datos
                    if(repetidos.isEmpty() == true)
                    {
                        // guardando objetos en la base de datos
                        gesProdElab.guardarOActualizar(prodElab);

                        // impresión de mensaje confirmando éxito
                        jlMensaje.setVisible(true);
                        jlMensaje.setText("Producto elaborado " + prodElab.getNombre()
                               + " agregado a la base de datos");
                    }
                    // caso contrario, muestro un mensaje de error
                    else
                    {
                        JOptionPane.showMessageDialog(null,
                                "No puede dar de alta este producto elaborado porque "
                                        + "ya existe en la base de datos",
                                "Registro duplicado",
                                JOptionPane.ERROR_MESSAGE); 
                    }                    
                }
                else
                {
                    // no se guarda el objeto
                }
            }
            else
            {
                // si no se encontró ningún producto elaborado con ese nombre entonces
                // se puede darlo de alta en la base de datos
                if(repetidos.isEmpty() == true)
                {
                    // guardando objetos en la base de datos
                    gesProdElab.guardarOActualizar(prodElab);

                    // impresión de mensaje confirmando éxito
                    jlMensaje.setVisible(true);
                    jlMensaje.setText("Producto elaborado " + prodElab.getNombre()
                            + " agregado a la base de datos");
                }
                // caso contrario, muestro un mensaje de error
                else
                {
                    JOptionPane.showMessageDialog(null,
                            "No puede dar de alta este producto elaborado porque "
                                    + "ya existe en la base de datos",
                            "Registro duplicado",
                            JOptionPane.ERROR_MESSAGE); 
                }                
            }
        }
    }//GEN-LAST:event_jbDarDeAltaActionPerformed

    /**
     * Permite que solamente se ingresen letras y en un máximo de 30.
     * 
     * @param evt el evento de tipeo
     */    
    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        Campos.configurarCampo(evt, 30, "Cadena");
    }//GEN-LAST:event_jtfNombreKeyTyped

    /**
     * Permite que solamente se ingresen números con punto y en un máximo de 7.
     * 
     * @param evt el evento de tipeo
     */         
    private void jtfPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPrecioKeyTyped
        Campos.configurarCampo(evt, 7, "NúmerosConPunto");
    }//GEN-LAST:event_jtfPrecioKeyTyped

    /**
     * Transfiere una materia prima de la lista de disponibles a la lista de
     * seleccionadas.
     * 
     * @param evt el evento de clic sobre el botón 'Añadir'
     */       
    private void jbAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnadirActionPerformed
        if(jListMateriasPrimasDisponibles.isSelectionEmpty() == true)
        {
            // nada
        }
        else
        {        
            // guardo todas las cadenas seleccionadas en un arreglo de cadenas
            cadenasMateriasPrimas =
                    (ArrayList<String>) jListMateriasPrimasDisponibles.getSelectedValuesList();

            // recorro dicho arreglo, y con ello voy agregando las cadenas al modelo
            // de materias primas seleccionadas y quitándolas del modelo de materias primas
            // disponibles
            for(String cadenaActual : cadenasMateriasPrimas)
            {
                modeloListaMateriasPrimasSeleccionadas.addElement(cadenaActual);
                modeloListaMateriasPrimasDisponibles.removeElement(cadenaActual);
            }

            // agrego el modelo al gráfico de lista
            jListMateriasPrimasDisponibles.setModel(modeloListaMateriasPrimasDisponibles);
            jListMateriasPrimasSeleccionadas.setModel(modeloListaMateriasPrimasSeleccionadas);     
        }
    }//GEN-LAST:event_jbAnadirActionPerformed

    /**
     * Transfiere una materia prima de la lista de seleccionadas a la lista de
     * disponibles.
     * 
     * @param evt el evento de clic sobre el botón 'Quitar'
     */       
    private void jbQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitarActionPerformed
        if(jListMateriasPrimasSeleccionadas.isSelectionEmpty() == true)
        {
            // nada
        }
        else
        {
            // guardo todas las cadenas seleccionadas en un arreglo de cadenas
            cadenasMateriasPrimas =
                    (ArrayList<String>) jListMateriasPrimasSeleccionadas.getSelectedValuesList();

            // recorro dicho arreglo, y con ello voy agregando las cadenas al modelo
            // de materias primas disponibles y quitándolas del modelo de materias primas
            // seleccionadas
            for(String cadenaActual : cadenasMateriasPrimas)
            {
                modeloListaMateriasPrimasDisponibles.addElement(cadenaActual);
                modeloListaMateriasPrimasSeleccionadas.removeElement(cadenaActual);
            }

            // agrego el modelo al gráfico de lista
            jListMateriasPrimasDisponibles.setModel(modeloListaMateriasPrimasDisponibles);
            jListMateriasPrimasSeleccionadas.setModel(modeloListaMateriasPrimasSeleccionadas);    
        }
    }//GEN-LAST:event_jbQuitarActionPerformed

    /**
     * Llena la lista 'disponibles' con todas las materias primas existentes.
     */    
    private void llenarListaMateriasPrimasDisponibles()
    {        
        for(MateriaPrima matPrim : listaMateriasPrimas)
        {
            String cadenaMateriaPrima = matPrim.getId() + " - " + matPrim.getNombre();
            
            modeloListaMateriasPrimasDisponibles.addElement(cadenaMateriaPrima); // se muestra en el listado                        
        }    
        
        // añado el modelo al gráfico lista
        jListMateriasPrimasDisponibles.setModel(modeloListaMateriasPrimasDisponibles); 
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jListMateriasPrimasDisponibles;
    private javax.swing.JList jListMateriasPrimasSeleccionadas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAnadir;
    private javax.swing.JButton jbDarDeAlta;
    private javax.swing.JButton jbQuitar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlAltaDeProductosElaborados;
    private javax.swing.JLabel jlDatos;
    private javax.swing.JLabel jlDisponibles;
    private javax.swing.JLabel jlMateriasPrimas;
    private javax.swing.JLabel jlMensaje;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlSeleccionados;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPrecio;
    // End of variables declaration//GEN-END:variables
}
