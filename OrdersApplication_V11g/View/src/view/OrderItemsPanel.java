package view;

import java.awt.*;

import java.awt.BorderLayout;

import java.util.ArrayList;

import javax.swing.*;

import javax.swing.JScrollPane;

import javax.swing.JTable;

import javax.swing.table.TableModel;

import oracle.adf.model.*;
import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.*;

import oracle.jbo.uicli.binding.*;
import oracle.jbo.uicli.binding.JUIteratorBinding;
import oracle.jbo.uicli.controls.*;
import oracle.jbo.uicli.controls.JUNavigationBar;
import oracle.jbo.uicli.jui.*;

import oracle.jdeveloper.layout.*;


public class OrderItemsPanel extends JPanel implements JURegionPanel {

    //PageDefinition File	
    private JUPanelBinding panelBinding = new JUPanelBinding("view_OrderItemsPanelPageDef");
    private BorderLayout borderLayout1 = new BorderLayout();
    private JUNavigationBar jUNavigationBar1 = new JUNavigationBar();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JTable jTable1 = new JTable();

    /**The default constructor for panel
     */
    public OrderItemsPanel() {
    }

    /**the JbInit method
     */
    public void jbInit() throws Exception {
        this.setLayout(borderLayout1);
        this.add(jUNavigationBar1, BorderLayout.NORTH);
        jScrollPane1.getViewport().add(jTable1, null);
        this.add(jScrollPane1, BorderLayout.CENTER);
        jUNavigationBar1.setModel(JUNavigationBar.createViewBinding(panelBinding, jUNavigationBar1, "OrderItemsView2", null, "OrderItemsView2Iterator1"));
        jTable1.setModel((TableModel)panelBinding.bindUIControl("OrderItemsView21",jTable1));
    }


    /**JUPanel implementation
     */
    public JUPanelBinding getPanelBinding() {
        return panelBinding;
    }

    public void bindNestedContainer(JUPanelBinding ctr) {
        if (panelBinding.getPanel() == null) {
            ctr.setPanel(this);
            panelBinding.release(DCDataControl.REL_VIEW_REFS);
            panelBinding = ctr;
            registerProjectGlobalVariables(panelBinding.getBindingContext());
            try {
                jbInit();
            } catch (Exception ex) {
                ex.printStackTrace();
                ctr.reportException(ex);
            }
        }
    }

    private void registerProjectGlobalVariables(BindingContext bindCtx) {
        JUUtil.registerNavigationBarInterface(panelBinding, bindCtx);
    }

    private void unRegisterProjectGlobalVariables(BindingContext bindCtx) {
        JUUtil.unRegisterNavigationBarInterface(panelBinding, bindCtx);
    }

    public void setBindingContext(BindingContext bindCtx) {
        if (panelBinding.getPanel() == null) {
            panelBinding = panelBinding.setup(bindCtx, this);
            registerProjectGlobalVariables(bindCtx);
            panelBinding.refreshControl();
            try {
                jbInit();
                panelBinding.refreshControl();
            } catch (Exception ex) {
                panelBinding.reportException(ex);
            }
        }
    }


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception exemp) {
            exemp.printStackTrace();
        }

        OrderItemsPanel panel = new OrderItemsPanel();
        panel.setBindingContext(JUTestFrame.startTestFrame("view.DataBindings.cpx", "null", panel,
                                                           panel.getPanelBinding(), new Dimension(400, 300)));
        panel.revalidate();
    }


}
