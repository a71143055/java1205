package GUI.view;

import GUI.entity.OrderEntity;
import GUI.repository.OrderRepository;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class OrderInfoView extends JPanel {
    JPanel panN = new JPanel(new GridLayout(2,1));
    JPanel panC = new JPanel();

    JPanel pan1 = new JPanel();
    JPanel pan2 = new JPanel();

    JTextField tfSearch = new JTextField(20);
    DefaultTableModel tableModel;
    JTable table;
    String[] header = {"주문번호","주문고객","주문제품","수량","배송지","주문일자"};

    public OrderInfoView() {
        setLayout(new BorderLayout());

        panN.add(pan1);
        panN.add(pan2);

        add(panN, "North");
        add(panC, "Center");

        addPan1();
        addPan2();
        addTable();

        initList("");
    }

    public void addPan1() {
        JLabel lblTitle = new JLabel("검색 프로그램");
        pan1.add(lblTitle);
    }

    public void addPan2() {
        JLabel lblSearch = new JLabel("검색어 : ");
        JButton btnSearch = new JButton("검색");
        btnSearch.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String searchWord = tfSearch.getText();
                initList(searchWord);
            }
        });
        pan2.add(lblSearch);
        pan2.add(tfSearch);
        pan2.add(btnSearch);
    }

    public void addTable() {
        tableModel = new DefaultTableModel(header, 15) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(tableModel);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(200);
        columnModel.getColumn(3).setPreferredWidth(50);
        columnModel.getColumn(4).setPreferredWidth(50);
        columnModel.getColumn(5).setPreferredWidth(100);

        JScrollPane scrollPane = new JScrollPane(table);
        panC.add(scrollPane);
    }

    public void initList(String searchWord) {
        OrderRepository orderRepository = new OrderRepository();
        ArrayList<OrderEntity> orderList = orderRepository.getOrderList("");
        tableModel.setRowCount(orderList.size());
        int i = 0;
        for (OrderEntity orderEntity : orderList) {
            table.setValueAt(orderEntity.getOrderNum(),i,0);
            table.setValueAt(orderEntity.getOrderCustomer(),i,1);
            table.setValueAt(orderEntity.getOrderProduct(),i,2);
            table.setValueAt(orderEntity.getAmount(),i,3);
            table.setValueAt(orderEntity.getDestination(),i,4);
            table.setValueAt(orderEntity.getOrderDate(),i,5);
            i++;
        }
    }
}