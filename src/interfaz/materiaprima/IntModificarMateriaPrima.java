package interfaz.materiaprima;

import entidad.MateriaPrima;
import entidad.Proveedor;
import gestor.GestorMateriasPrimas;
import gestor.GestorProveedores;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.hibernate.collection.PersistentBag;
import utilidades.Campos;


/**
 * Permite modificar una materia prima.
 */
public class IntModificarMateriaPrima extends javax.swing.JDialog
{
    /* Atributos */
    private Session sesion;
    private MateriaPrima matPrim;
    private GestorMateriasPrimas gesMatPrim;
    private GestorProveedores gesProv;
    private ArrayList<Proveedor> listaProveedoresDisponibles;
    private ArrayList<Proveedor> listaProveedoresSeleccionados;
    
    private ArrayList<String> cadenasProveedores;
    private DefaultListModel modeloListaProveedoresDisponibles;
    private DefaultListModel modeloListaProveedoresSeleccionados;
    
    private int idMateriaPrima;
    private String nombreActualMatPrim;
    
    
    /* Constructor */
    public IntModificarMateriaPrima(java.awt.Frame parent, boolean modal,
            Session sesion, int id)
    {
        super(parent, modal);
        initComponents();
        
        this.sesion = sesion;
        gesMatPrim = new GestorMateriasPrimas(sesion);
        gesProv = new GestorProveedores(sesion);
        listaProveedoresDisponibles = new ArrayList<>();
        listaProveedoresSeleccionados = new ArrayList<>();
        
        modeloListaProveedoresDisponibles = new DefaultListModel();        
        modeloListaProveedoresSeleccionados = new DefaultListModel();
        
        cadenasProveedores = new ArrayList<>();
        
        idMateriaPrima = id;
        matPrim = gesMatPrim.buscarPorId(idMateriaPrima);
        
        jtfNombre.setText(matPrim.getNombre());
        String precio = Double.toString(matPrim.getPrecio());
        jtfPrecio.setText(precio);
        
        llenarAmbasListas();
        
        nombreActualMatPrim = matPrim.getNombre();
    }

    
    /* Métodos */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlModificacionDeMateriaPrima = new javax.swing.JLabel();
        jlDatos = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jlPrecio = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();
        jlProveedores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProveedoresDisponibles = new javax.swing.JList();
        jbAnadir = new javax.swing.JButton();
        jlDisponibles = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListProveedoresSeleccionados = new javax.swing.JList();
        jlSeleccionados = new javax.swing.JLabel();
        jbQuitar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Restaurant \"Buen gusto\" - Modificación de materia prima");

        jlModificacionDeMateriaPrima.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlModificacionDeMateriaPrima.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlModificacionDeMateriaPrima.setText("Modificación de materia prima");

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

        jlProveedores.setText("Proveedores:");

        jScrollPane1.setViewportView(jListProveedoresDisponibles);

        jbAnadir.setText("Añadir ->");
        jbAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnadirActionPerformed(evt);
            }
        });

        jlDisponibles.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jlDisponibles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDisponibles.setText("disponibles");

        jScrollPane2.setViewportView(jListProveedoresSeleccionados);

        jlSeleccionados.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jlSeleccionados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSeleccionados.setText("seleccionados");

        jbQuitar.setText("<- Quitar");
        jbQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbModificar)
                .addGap(18, 18, 18)
                .addComponent(jbCancelar)
                .addGap(210, 210, 210))
            .addComponent(jlModificacionDeMateriaPrima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlProveedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
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
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlModificacionDeMateriaPrima)
                .addGap(18, 18, 18)
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
                    .addComponent(jlProveedores)
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
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbCancelar))
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
     * @param evt el evento de pulsación del botón 'Cancelar'
     */        
    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    /**
     * Modifica una materia prima con todos los datos ingresados.
     * 
     * @param evt el evento de pulsación sobre el botón 'Modificar'
     */    
    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
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
        /* MODIFICACIÓN */
        else
        {
            // obteniendo a la materia prima
            gesMatPrim = new GestorMateriasPrimas(sesion);
            gesProv = new GestorProveedores(sesion);
            matPrim = gesMatPrim.buscarPorId(idMateriaPrima);

            // armando el objeto 'Materia prima'
            matPrim.setNombre(jtfNombre.getText().trim());
            Float precio = Float.parseFloat(jtfPrecio.getText().trim());
            matPrim.setPrecio(precio);
                        
            // guardo el contenido del modelo de proveedores seleccionados en un
            // arreglo de cadenas
            ArrayList<String> provElegString = new ArrayList<>();
            for(int i = 0 ; i < modeloListaProveedoresSeleccionados.size() ; i++)
            {
                provElegString.add((String) modeloListaProveedoresSeleccionados.get(i));
            }
            
            // creo un arreglo de proveedores y guardo en él todos los proveedores
            // del arreglo de cadenas
            ArrayList<Proveedor> provEleg = new ArrayList<>();
            for(String provActualString : provElegString)
            {                
                Proveedor provActual = new Proveedor();
                int indGuion = provActualString.indexOf("-");
                String idProvString = String.valueOf(provActualString.substring(0, indGuion-1));
                provActual = gesProv.buscarPorId(Integer.parseInt(idProvString));
                provEleg.add(provActual);
            }
            
            // relación muchos a muchos: a la materia prima le asigno los múltiples
            // proveedores, y a cada uno de los proveedores le asigno la materia prima
            for(Proveedor prov : provEleg)
            {
                ArrayList<MateriaPrima> arrMatPrim = new ArrayList<>();
                arrMatPrim.add(matPrim);
                prov.setMateriasPrimas(arrMatPrim);
            }
            matPrim.setProveedores(provEleg);
            
            /* Comprobación de registros duplicados */
            ArrayList<MateriaPrima> repetidos = new ArrayList<>();
            // si el usuario no cambió el nombre de la materia prima, entonces
            // no se realiza la comprobación por registros duplicados
            if(jtfNombre.getText().equals(nombreActualMatPrim))
            {
                
            }
            else
            {            
                // cerciorándome de que no haya en la base de datos otra materia
                // prima con ese nombre
                String hql = "FROM MateriaPrima M WHERE M.nombre = '" 
                        + jtfNombre.getText() + "'";
                Query query = sesion.createQuery(hql);
                repetidos = (ArrayList<MateriaPrima>) query.list();
            }
            
            
            // si no se eligen materias primas para el producto elaborado, se
            // le pregunta al usuario si desea continuar con el guardado del
            // producto elaborado
            if(provEleg.isEmpty() == true)
            {
                int seleccion = JOptionPane.showConfirmDialog(
                        null,
                        "¿Está seguro que desea crear una materia prima sin "
                                + "proveedores?",
                        "Materia prima sin proveedores",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE);
                
                if(seleccion == JOptionPane.YES_OPTION)
                {            
                    // si no se encontró ninguna materia prima con ese nombre, entonces
                    // se puede proceder con la modificación
                    if(repetidos.isEmpty() == true)
                    {               
                        // guardando objetos en la base de datos
                        gesMatPrim.guardarOActualizar(matPrim);

                        this.dispose();
                    }
                    // caso contrario, muestro un mensaje de error
                    else
                    {
                        JOptionPane.showMessageDialog(null,
                                "No se puede modificar esta materia prima porque ya"
                                        + " existe otra con este nombre en la base de datos",
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
                // si no se encontró ninguna materia prima con ese nombre, entonces
                // se puede proceder con la modificación
                if(repetidos.isEmpty() == true)
                {               
                    // guardando objetos en la base de datos
                    gesMatPrim.guardarOActualizar(matPrim);

                    this.dispose();
                }
                // caso contrario, muestro un mensaje de error
                else
                {
                    JOptionPane.showMessageDialog(null,
                            "No se puede modificar esta materia prima porque ya"
                                   + " existe otra con este nombre en la base de datos",
                            "Registro duplicado",
                            JOptionPane.ERROR_MESSAGE); 
                }                
            }
        }
    }//GEN-LAST:event_jbModificarActionPerformed

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
     * Transfiere un proveedor de la lista de disponibles a la lista de
     * seleccionados.
     * 
     * @param evt el evento de clic sobre el botón 'Añadir'
     */         
    private void jbAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnadirActionPerformed
        if(jListProveedoresDisponibles.isSelectionEmpty() == true)
        {
            // nada
        }
        else
        {        
            // guardo todas las cadenas seleccionadas en un arreglo de cadenas
            cadenasProveedores =
                    (ArrayList<String>) jListProveedoresDisponibles.getSelectedValuesList();

            // recorro dicho arreglo, y con ello voy agregando las cadenas al modelo
            // de proveedores seleccionados y quitándolas del modelo de proveedores
            // disponibles
            for(String cadenaActual : cadenasProveedores)
            {
                modeloListaProveedoresSeleccionados.addElement(cadenaActual);
                modeloListaProveedoresDisponibles.removeElement(cadenaActual);
            }

            // agrego el modelo al gráfico de lista
            jListProveedoresDisponibles.setModel(modeloListaProveedoresDisponibles);
            jListProveedoresSeleccionados.setModel(modeloListaProveedoresSeleccionados);     
        }
    }//GEN-LAST:event_jbAnadirActionPerformed

    /**
     * Transfiere un proveedor de la lista de seleccionados a la lista de
     * disponibles.
     * 
     * @param evt el evento de clic sobre el botón 'Quitar'
     */         
    private void jbQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitarActionPerformed
        if(jListProveedoresSeleccionados.isSelectionEmpty() == true)
        {
            // nada
        }
        else
        {
            // guardo todas las cadenas seleccionadas en un arreglo de cadenas
            cadenasProveedores =
                    (ArrayList<String>) jListProveedoresSeleccionados.getSelectedValuesList();

            // recorro dicho arreglo, y con ello voy agregando las cadenas al modelo
            // de proveedores disponibles y quitándolas del modelo de proveedores
            // seleccionados
            for(String cadenaActual : cadenasProveedores)
            {
                modeloListaProveedoresDisponibles.addElement(cadenaActual);
                modeloListaProveedoresSeleccionados.removeElement(cadenaActual);
            }

            // agrego el modelo al gráfico de lista
            jListProveedoresDisponibles.setModel(modeloListaProveedoresDisponibles);
            jListProveedoresSeleccionados.setModel(modeloListaProveedoresSeleccionados);    
        }
    }//GEN-LAST:event_jbQuitarActionPerformed

    /**
     * Se llenan ambas listas, la de 'Seleccionados' con los proveedores
     * correspondientes actualmente con la materia prima actual, y la de
     * 'Disponibles' con el resto.
     */    
    private void llenarAmbasListas()
    {        
        /* Lista seleccionados */
        // obtengo todos los proveedores y los guardo en un objeto
        // 'PersistentBag'. Luego, copio todos estos objetos en un ArrayList
        PersistentBag temp = (PersistentBag) matPrim.getProveedores();        
        listaProveedoresSeleccionados.addAll(temp);
        
        // un arreglo para guardar todos los id de los proveedores seleccionados
        ArrayList<Integer> idSeleccionados = new ArrayList<>();
        
        // creo el modelo y lo coloco en la lista 'Seleccionados'
        for(Proveedor provSel : listaProveedoresSeleccionados)
        {
            idSeleccionados.add(provSel.getId());            
            String cadenaProv = provSel.getId() + " - " + provSel.getNombre();
            
            modeloListaProveedoresSeleccionados.addElement(cadenaProv); // se añade al modelo
        }        
        jListProveedoresSeleccionados.setModel(modeloListaProveedoresSeleccionados);
        
        
        /* Lista disponibles */
        listaProveedoresDisponibles = gesProv.getListaProveedoresActivos();
        
        // en este for, elimino del arreglo disponibles a todos los proveedores
        // cuyo id sea igual a alguno existente en el arreglo seleccionados
        for(int i = 0 ; i < idSeleccionados.size() ; i++)
        {
            // empiezo a recorrer el arreglo de id seleccionados, y asigno el 
            // actual al int idSel
            int idSel = idSeleccionados.get(i);
            
            // empiezo a recorrer el arreglo de arreglos de proveedores
            // disponibles, y si el id de alguno coincide con el id que estoy
            // examinando en este momento, elimino el proveedor del arreglo
            // de disponibles
            int j = 0;
            for(Proveedor prov : listaProveedoresDisponibles)
            {
                if(prov.getId() == idSel)
                {
                    listaProveedoresDisponibles.remove(j);
                    break;
                }
                j++;
            }
        }
        
        // creo el modelo y lo coloco en la lista 'disponibles'
        for(Proveedor prov : listaProveedoresDisponibles)
        {            
            String cadenaProv = prov.getId() + " - " + prov.getNombre();
            
            modeloListaProveedoresDisponibles.addElement(cadenaProv); // se añade al modelo
        }    
        
        // añado el modelo al gráfico lista
        jListProveedoresDisponibles.setModel(modeloListaProveedoresDisponibles); 
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jListProveedoresDisponibles;
    private javax.swing.JList jListProveedoresSeleccionados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAnadir;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbQuitar;
    private javax.swing.JLabel jlDatos;
    private javax.swing.JLabel jlDisponibles;
    private javax.swing.JLabel jlModificacionDeMateriaPrima;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlProveedores;
    private javax.swing.JLabel jlSeleccionados;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPrecio;
    // End of variables declaration//GEN-END:variables
}
