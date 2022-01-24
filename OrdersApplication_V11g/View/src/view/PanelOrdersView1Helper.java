package view;

import com.jgoodies.forms.layout.*;

import java.awt.*;
import java.awt.event.*;

import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.text.*;

import oracle.adf.model.*;
import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.*;

import oracle.jbo.uicli.binding.*;
import oracle.jbo.uicli.controls.*;
import oracle.jbo.uicli.jui.*;

import oracle.jdeveloper.layout.*;

public class PanelOrdersView1Helper extends JPanel implements JUPanel {

    //PageDefinition File	
    private JUPanelBinding panelBinding = new JUPanelBinding("view_PanelOrdersView1Helper1PageDef");
    private JPanel dataPanel = new JPanel();
    private BorderLayout borderLayout = new BorderLayout();

    private FormLayout panelLayout = new FormLayout("f:3dlu:n, f:d:n, f:3dlu:n, f:d:g, f:3dlu:n", "c:3dlu:n, c:d:n, c:3dlu:n, c:d:n, c:3dlu:n, c:d:n, c:3dlu:n, c:d:n, c:3dlu:n");
    private JTextField mOrderId = new JTextField();
    private JLabel labelmOrderId = new JLabel();
    private JTextField mOrderDate = new JTextField();
    private JLabel labelmOrderDate = new JLabel();
    private JTextField mOrderStatusCode = new JTextField();
    private JLabel labelmOrderStatusCode = new JLabel();
    private JTextField mOrderTotal = new JTextField();
    private JLabel labelmOrderTotal = new JLabel();
    private JScrollPane jScrollPane1 = new JScrollPane();

    /**The default constructor for panel
     */
    public PanelOrdersView1Helper() {
    }

    /**the JbInit method
     */
    public void jbInit() throws Exception {
        dataPanel.setLayout(panelLayout);
        dataPanel.setMinimumSize(new Dimension(100, 100));
        jScrollPane1.setMinimumSize(new Dimension(100, 100));
        jScrollPane1.setEnabled(true);
        jScrollPane1.setViewportView(dataPanel);
        this.setLayout(borderLayout);
        //Add the controls to the layout
        dataPanel.add(labelmOrderId, new CellConstraints("2 , 2 ,1,1,default," + CellConstraints.FILL));
        dataPanel.add(mOrderId, new CellConstraints("4, 2 ,1,1,default," + CellConstraints.FILL));
        dataPanel.add(labelmOrderDate, new CellConstraints("2 , 4 ,1,1,default," + CellConstraints.FILL));
        dataPanel.add(mOrderDate, new CellConstraints("4, 4 ,1,1,default," + CellConstraints.FILL));
        dataPanel.add(labelmOrderStatusCode, new CellConstraints("2 , 6 ,1,1,default," + CellConstraints.FILL));
        dataPanel.add(mOrderStatusCode, new CellConstraints("4, 6 ,1,1,default," + CellConstraints.FILL));
        dataPanel.add(labelmOrderTotal, new CellConstraints("2 , 8 ,1,1,default," + CellConstraints.FILL));
        dataPanel.add(mOrderTotal, new CellConstraints("4, 8 ,1,1,default," + CellConstraints.FILL));

        labelmOrderId.setLabelFor(mOrderId);
        labelmOrderId.setText(panelBinding.findCtrlValueBinding("OrderId").getLabel());
        mOrderId.setToolTipText(panelBinding.findCtrlValueBinding("OrderId").getTooltip());
        mOrderId.setColumns(15);

        labelmOrderDate.setLabelFor(mOrderDate);
        labelmOrderDate.setText(panelBinding.findCtrlValueBinding("OrderDate").getLabel());
        mOrderDate.setToolTipText(panelBinding.findCtrlValueBinding("OrderDate").getTooltip());
        mOrderDate.setColumns(15);

        labelmOrderStatusCode.setLabelFor(mOrderStatusCode);
        labelmOrderStatusCode.setText(panelBinding.findCtrlValueBinding("OrderStatusCode").getLabel());
        mOrderStatusCode.setToolTipText(panelBinding.findCtrlValueBinding("OrderStatusCode").getTooltip());
        mOrderStatusCode.setColumns(15);

        labelmOrderTotal.setLabelFor(mOrderTotal);
        labelmOrderTotal.setText(panelBinding.findCtrlValueBinding("OrderTotal").getLabel());
        mOrderTotal.setToolTipText(panelBinding.findCtrlValueBinding("OrderTotal").getTooltip());
        mOrderTotal.setColumns(15);
        add(jScrollPane1, BorderLayout.CENTER);
        //BindingCodes
        mOrderId.setToolTipText((panelBinding.findCtrlValueBinding("OrderId")).getTooltip());
        mOrderId.setColumns(panelBinding.findCtrlValueBinding("OrderId").getDisplayWidth());
        mOrderId.setDocument((Document)panelBinding.bindUIControl("OrderId", mOrderId));
        mOrderDate.setToolTipText((panelBinding.findCtrlValueBinding("OrderDate")).getTooltip());
        mOrderDate.setColumns(panelBinding.findCtrlValueBinding("OrderDate").getDisplayWidth());
        mOrderDate.setDocument((Document)panelBinding.bindUIControl("OrderDate", mOrderDate));
        mOrderStatusCode.setToolTipText((panelBinding.findCtrlValueBinding("OrderStatusCode")).getTooltip());
        mOrderStatusCode.setColumns(panelBinding.findCtrlValueBinding("OrderStatusCode").getDisplayWidth());
        mOrderStatusCode.setDocument((Document)panelBinding.bindUIControl("OrderStatusCode", mOrderStatusCode));
        mOrderTotal.setToolTipText((panelBinding.findCtrlValueBinding("OrderTotal")).getTooltip());
        mOrderTotal.setColumns(panelBinding.findCtrlValueBinding("OrderTotal").getDisplayWidth());
        mOrderTotal.setDocument((Document)panelBinding.bindUIControl("OrderTotal", mOrderTotal));

        if ("Hide".equalsIgnoreCase(panelBinding.getDisplayHint("OrdersView1", "OrderId", null))) {
            dataPanel.remove(mOrderId);
            dataPanel.remove(labelmOrderId);
        }
        if ("Hide".equalsIgnoreCase(panelBinding.getDisplayHint("OrdersView1", "OrderDate", null))) {
            dataPanel.remove(mOrderDate);
            dataPanel.remove(labelmOrderDate);
        }
        if ("Hide".equalsIgnoreCase(panelBinding.getDisplayHint("OrdersView1", "OrderStatusCode", null))) {
            dataPanel.remove(mOrderStatusCode);
            dataPanel.remove(labelmOrderStatusCode);
        }
        if ("Hide".equalsIgnoreCase(panelBinding.getDisplayHint("OrdersView1", "OrderTotal", null))) {
            dataPanel.remove(mOrderTotal);
            dataPanel.remove(labelmOrderTotal);
        }

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

        PanelOrdersView1Helper panel = new PanelOrdersView1Helper();
        panel.setBindingContext(JUTestFrame.startTestFrame("view.DataBindings.cpx", "null", panel,
                                                           panel.getPanelBinding(), new Dimension(400, 300)));
        panel.revalidate();
    }
}
