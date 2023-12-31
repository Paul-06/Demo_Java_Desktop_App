/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package proyecto_gm.Comunicacion;


import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Date;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;
import proyecto_gm.Comunicacion.*;
import proyecto_gm.Facultades.DatosFacultades;

/**
 *
 * @author pc_sistemas2022
 */
public class frmListaComunicacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmListaComunicacion
     */
    JDesktopPane panelPadre;
    public void AsignarPadre(JDesktopPane padre){
        this.panelPadre = padre;
    }
    public frmListaComunicacion() {
        initComponents();
        HabilitarBotones(true);
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtOrigenFiltro = new javax.swing.JTextField();
        txtDestinoFiltro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboFlujo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtFechaInicialFiltro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFechaFinalFiltro = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        rbVerTodo = new javax.swing.JRadioButton();
        rbVerFiltrado = new javax.swing.JRadioButton();

        setClosable(true);
        setForeground(java.awt.Color.lightGray);
        setIconifiable(true);
        setResizable(true);
        setTitle("COMUNICACIONES");
        setToolTipText("");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Proyecto", "Codigo", "Periodo", "Tipo", "Cod.Doc", "Origen", "Destino", "Flujo", "Asunto", "Fecha", "Cod.Doc.Resp", "Dias", "estado", "Enlace"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("Origen");

        txtOrigenFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrigenFiltroKeyTyped(evt);
            }
        });

        txtDestinoFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDestinoFiltroKeyTyped(evt);
            }
        });

        jLabel2.setText("Destino");

        jLabel3.setText("Flujo");

        cboFlujo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Emision", "Recepcion" }));

        jLabel4.setText("Estado");

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proceso", "Resuelto", "Archivado" }));

        jLabel6.setText("Fecha inicial");

        txtFechaInicialFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaInicialFiltroKeyTyped(evt);
            }
        });

        jLabel7.setText("Fecha Final");

        txtFechaFinalFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaFinalFiltroKeyTyped(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbVerTodo);
        rbVerTodo.setText("Ver registros");
        rbVerTodo.setName("opciones"); // NOI18N
        rbVerTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVerTodoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbVerFiltrado);
        rbVerFiltrado.setText("Ver registros filtrado");
        rbVerFiltrado.setName("opciones"); // NOI18N
        rbVerFiltrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVerFiltradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1357, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbVerTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbVerFiltrado)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrigenFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(txtDestinoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboFlujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaInicialFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaFinalFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtOrigenFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbVerFiltrado)
                        .addComponent(rbVerTodo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtFechaFinalFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDestinoFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(cboFlujo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtFechaInicialFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void HabilitarBotones(boolean estado){
        btnAgregar.setEnabled(estado);
        btnEditar.setEnabled(estado);
        btnEliminar.setEnabled(estado);
   
    }
    private String LeerCeldaActual(int columnaActual){
                        
       
        return tblDatos.getValueAt(tblDatos.getSelectedRow(), columnaActual).toString();
    }
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //        desbloquear();btnGuardar.setEnabled(true);btnDeshacer.setEnabled(true);
        frmComunicacion frm = new frmComunicacion(panelPadre, Utilitario.EstadoProceso.NUEVO);
        frm.show();
        
        //frmComunicacion.entidad.setId(title);
        
        //HabilitarBotones(false);
       
       
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
 
 try{
     String prueba = "";
     if(tblDatos.getSelectedRowCount() == 0){
         JOptionPane.showMessageDialog(this, "Debe seleccionar un registro");
         return;
     }
     String proyecto = LeerCeldaActual(0);
        String codigo = LeerCeldaActual(1);
        String periodo = LeerCeldaActual(2);
        String tipo = LeerCeldaActual(3);
        String codDoc = LeerCeldaActual(4);
        String origen = LeerCeldaActual(5);
        String destino = LeerCeldaActual(6);
        String flujo = LeerCeldaActual(7);
        String asunto = LeerCeldaActual(8);
        //fecha
        String fecha = LeerCeldaActual(9);
        String codDocResp = LeerCeldaActual(10);
        String estado = LeerCeldaActual(11);
        String enlace = LeerCeldaActual(12);
                Comunicacion comunicacion = new Comunicacion();
                comunicacion.setId(codigo);
                comunicacion.setNombreProyecto(proyecto);
                comunicacion.setIdPeriodo(periodo);
                
                comunicacion.setCodDoc(codDoc);
                comunicacion.setOrigen(origen);
                comunicacion.setDestino(destino);
                //System.out.println("metodo");
                comunicacion.setFlujo(Integer.parseInt(flujo));
                //System.out.println("Paso previo a setcod doc respuesta");
                //formateando la fecha a fecha Java
                String anio = fecha.substring(6,10);        
                String mes = fecha.substring(3,5);
                String dia = fecha.substring(0,2);
                String fechaJava = anio + "-" +mes+"-"+ dia;
                
                comunicacion.setFecha(Date.valueOf(fechaJava));
                comunicacion.setTipo(Integer.parseInt(tipo));
                //System.out.println("tipo");
                comunicacion.setAsunto(asunto);
                //System.out.println("asunto");
                comunicacion.setCodDocRespuesta("");
                //System.out.println("Paso setcod doc respuesta");
                comunicacion.setCodDocRespuesta(codDocResp);
                if(estado.equals("") == true ){
                    //comunicacion.setEstado(0);
                    //System.out.println("Paso previo  estado");
                    comunicacion.setEstado(0);
                    //System.out.println("Paso estado");
                    //comunicacion.setEstado(Integer.parseInt("0"));
                }else{
                    comunicacion.setEstado(Integer.parseInt(estado));
                }
                //comunicacion.setEstado(Integer.parseInt(estado));
                comunicacion.setEnlace(enlace);
                System.err.println("Paso enlace");
                
 frmComunicacion frm = new frmComunicacion(panelPadre, Utilitario.EstadoProceso.EDITAR ,comunicacion);
 frm.show();

 }catch(HeadlessException | NumberFormatException ex){
     System.out.println("Error al cargar datos " +ex.getMessage());
 }
        

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        //        int fila = tblCargo.getSelectedRow();
        //        if (fila<0){
            //
            //            JOptionPane.showMessageDialog(null,
                //                "Debe seleccionar una fila de la tabla" );
            //
            //        }else {
            //            int confirmar=JOptionPane.showConfirmDialog(null,
                //                "Esta seguro que desea Eliminar el registro? ");
            //            if(JOptionPane.OK_OPTION==confirmar) {
                //                modelo.removeRow(fila);
                //                JOptionPane.showMessageDialog(null,"Registro Eliminado" );
                //            }
            //        }
        //        bloquear();
    }//GEN-LAST:event_btnEliminarActionPerformed
    private void OcultarColumnas(){
        /*
    System.out.println("Ocultar columnas: " + this.tblDatos.getColumnModel().getColumnCount());
    this.tblDatos.getColumnModel().getColumn(1).setPreferredWidth(0);
    this.tblDatos.getColumnModel().getColumn(1).setMaxWidth(0);
    this.tblDatos.getColumnModel().getColumn(1).setMinWidth(0);
    this.tblDatos.removeColumn(this.tblDatos.getColumnModel().getColumn(1));
    
    this.tblDatos.getColumnModel().getColumn(2).setPreferredWidth(0);
    this.tblDatos.getColumnModel().getColumn(2).setMaxWidth(0);
    this.tblDatos.getColumnModel().getColumn(2).setMinWidth(0);
    this.tblDatos.removeColumn(this.tblDatos.getColumnModel().getColumn(2));       
    
    this.tblDatos.getColumnModel().getColumn(3).setWidth(0);
    this.tblDatos.getColumnModel().getColumn(3).setMaxWidth(0);
    this.tblDatos.getColumnModel().getColumn(3).setMinWidth(0);
    System.out.println("Ocultar columnas: " + this.tblDatos.getColumnModel().getColumnCount());
    this.tblDatos.removeColumn(this.tblDatos.getColumnModel().getColumn(3));
    */
    
        for (int i = 0; i < tblDatos.getColumnCount(); i++) {
            if(tblDatos.getColumnName(i).equals("Codigo")){
                tblDatos.removeColumn(this.tblDatos.getColumnModel().getColumn(i));
            }
            if(tblDatos.getColumnName(i).equals("Periodo")){
                tblDatos.removeColumn(this.tblDatos.getColumnModel().getColumn(i));
            }
            if(tblDatos.getColumnName(i).equals("Tipo")){
                tblDatos.removeColumn(this.tblDatos.getColumnModel().getColumn(i));
            }
            if(tblDatos.getColumnName(i).equals("Flujo")){
                tblDatos.removeColumn(this.tblDatos.getColumnModel().getColumn(i));
            }
            
            if(tblDatos.getColumnName(i).equals("Estado")){
                tblDatos.removeColumn(this.tblDatos.getColumnModel().getColumn(i));
            }
        }
    

    //this.tblDatos.removeColumn(this.tblDatos.getColumnModel().getColumn(14));
    
    

    }
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
    DatosComunicacion.Listar(tblDatos);
    System.out.println("Evento internal frame opened");
    OcultarColumnas();
    
    
    rbVerTodo.setSelected(true);
    
    //configuracion por defecto
    txtDestinoFiltro.setText("");
            txtOrigenFiltro.setText("");
            cboEstado.setSelectedIndex(0);
            cboFlujo.setSelectedIndex(0);
            
            txtDestinoFiltro.setEnabled(false);
            txtOrigenFiltro.setEnabled(false);
            txtDestinoFiltro.setEnabled(false);
            cboEstado.setEnabled(false);
            cboFlujo.setEnabled(false);
   
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        //DatosComunicacion.Listar(tblDatos);
        //al cerrar el formulario hijo, realizar el proceso de actualizar en el grilla
        //Utilitario.MostrarMensaje("Recargar la pagina", Utilitario.TipoMensaje.informativo);
        DatosComunicacion.Listar(tblDatos);
        System.out.println("Evento internal frame activated");
        OcultarColumnas();
        String fechaInicio = "", fechaFinal = "";
        String sFecha = Utilitario.TraerFechaActual();
        
        txtFechaFinalFiltro.setText(sFecha);
        
        String sFechaInicial = Utilitario.TraerFechaInicial();
        txtFechaInicialFiltro.setText(sFechaInicial);
        
        txtFechaInicialFiltro.setEnabled(false);
        txtFechaFinalFiltro.setEnabled(false);
        
    }//GEN-LAST:event_formInternalFrameActivated

    private void txtOrigenFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrigenFiltroKeyTyped
//         txtOrigenFiltro.addKeyListener(new KeyAdapter(){
//             public void keyReleased(final KeyEvent e){
//                 String cadena = (txtOrigenFiltro.getText());
//                 txtOrigenFiltro.setText(cadena);
//                 FiltrarPorOrigen();
//             }
//         });
//         
//         TRSFiltro = new TableRowSorter(tblDatos.getModel());
//         tblDatos.setRowSorter(TRSFiltro);
    }//GEN-LAST:event_txtOrigenFiltroKeyTyped

    private void txtDestinoFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDestinoFiltroKeyTyped
//       txtDestinoFiltro.addKeyListener(new KeyAdapter(){
//             public void keyReleased(final KeyEvent e){
//                 String cadena = (txtDestinoFiltro.getText());
//                 txtDestinoFiltro.setText(cadena);
//                 FiltrarPorDestino();
//             }
//         });
//         
//         TRSFiltro = new TableRowSorter(tblDatos.getModel());
//         tblDatos.setRowSorter(TRSFiltro);
    }//GEN-LAST:event_txtDestinoFiltroKeyTyped

    private void txtFechaInicialFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaInicialFiltroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaInicialFiltroKeyTyped

    private void txtFechaFinalFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaFinalFiltroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaFinalFiltroKeyTyped
    private void ActivarFiltro(){
    String parFiltro = "";
        if(rbVerTodo.isSelected()){
            parFiltro = "N";
            txtDestinoFiltro.setText("");
            txtOrigenFiltro.setText("");
            cboEstado.setSelectedIndex(0);
            cboFlujo.setSelectedIndex(0);
            txtFechaFinalFiltro.setText("");
            txtFechaInicialFiltro.setText("");
            
            txtFechaFinalFiltro.setEnabled(false);
            txtFechaInicialFiltro.setEnabled(false);
            txtDestinoFiltro.setEnabled(false);
            txtOrigenFiltro.setEnabled(false);
            txtDestinoFiltro.setEnabled(false);
            cboEstado.setEnabled(false);
            cboFlujo.setEnabled(false);
        }else if(rbVerFiltrado.isSelected()){
            parFiltro = "S";
            txtDestinoFiltro.setEnabled(true);
            txtOrigenFiltro.setEnabled(true);
            txtDestinoFiltro.setEnabled(true);
            txtFechaFinalFiltro.setEnabled(true);
            txtFechaInicialFiltro.setEnabled(true);
            cboEstado.setEnabled(true);
            cboFlujo.setEnabled(true);
        }
        DatosComunicacion.Listar(tblDatos, parFiltro, txtFechaInicialFiltro.getText(), 
            txtFechaFinalFiltro.getText(), cboEstado.getSelectedIndex(), 
            cboFlujo.getSelectedIndex(), txtOrigenFiltro.getText(), txtDestinoFiltro.getText());
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
   
        ActivarFiltro();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void rbVerFiltradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVerFiltradoActionPerformed
        txtDestinoFiltro.setEnabled(true);
            txtOrigenFiltro.setEnabled(true);
            txtDestinoFiltro.setEnabled(true);
            txtFechaFinalFiltro.setEnabled(true);
            txtFechaInicialFiltro.setEnabled(true);
            cboEstado.setEnabled(true);
            cboFlujo.setEnabled(true);
            
        String fechaInicio = "", fechaFinal = "";
        fechaInicio = Utilitario.TraerFechaActual();        
        txtFechaFinalFiltro.setText(fechaInicio);
        
        fechaFinal = Utilitario.TraerFechaInicial();
        txtFechaInicialFiltro.setText(fechaFinal);
            
    }//GEN-LAST:event_rbVerFiltradoActionPerformed

    private void rbVerTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVerTodoActionPerformed
        ActivarFiltro();
    }//GEN-LAST:event_rbVerTodoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JComboBox<String> cboFlujo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbVerFiltrado;
    private javax.swing.JRadioButton rbVerTodo;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtDestinoFiltro;
    private javax.swing.JTextField txtFechaFinalFiltro;
    private javax.swing.JTextField txtFechaInicialFiltro;
    private javax.swing.JTextField txtOrigenFiltro;
    // End of variables declaration//GEN-END:variables
}
