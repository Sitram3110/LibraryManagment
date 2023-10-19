package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

public class QuanLyMuonTra extends JFrame {
    JPanel BorrowManagement, importManagement;

    public QuanLyMuonTra() {
        initComponent();
    }

    public void initComponent() {
        setTitle("QUẢN LÝ DANH MỤC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(900, 500);
        setVisible(true);

        JLabel label = new JLabel("Quản lý danh mục");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Segoe UI", Font.BOLD, 60));

        BorrowManagement = new JPanel();
        BorrowManagement.setLayout(new BorderLayout());

        JPanel borrowNorth = new JPanel();
        borrowNorth.setPreferredSize(new Dimension(900, 100));
        borrowNorth.setBackground(Color.MAGENTA);
        BorrowManagement.add(borrowNorth, BorderLayout.NORTH);

        JPanel borrowSouth = new JPanel();
        borrowSouth.setPreferredSize(new Dimension(900, 300));
        // borrowSouth.setBackground(Color.GRAY);
        BorrowManagement.add(borrowSouth, BorderLayout.SOUTH);

        JPanel borrowEast = new JPanel();
        borrowEast.setPreferredSize(new Dimension(100, 50));
        borrowEast.setBackground(new Color(255, 255, 204));
        BorrowManagement.add(borrowEast, BorderLayout.EAST);

        JPanel borrowWest = new JPanel();
        borrowWest.setPreferredSize(new Dimension(100, 50));
        borrowWest.setBackground(new Color(255, 255, 204));
        BorrowManagement.add(borrowWest, BorderLayout.WEST);

        JPanel borrowCenter = new JPanel();
        borrowCenter.setPreferredSize(new Dimension(700, 50));
        borrowCenter.setBackground(new Color(255, 255, 204));
        BorrowManagement.add(borrowCenter, BorderLayout.CENTER);

        // import
        importManagement = new JPanel();
        importManagement.setLayout(new BorderLayout());

        JPanel importNorth = new JPanel();
        importNorth.setPreferredSize(new Dimension(900, 50));
        importNorth.setBackground(Color.MAGENTA);
        importManagement.add(importNorth, BorderLayout.NORTH);

        JPanel importSouth = new JPanel();
        importSouth.setPreferredSize(new Dimension(900, 350));
        importSouth.setBackground(new Color(255, 255, 204));
        importManagement.add(importSouth, BorderLayout.SOUTH);

        JPanel importEast = new JPanel();
        importEast.setPreferredSize(new Dimension(200, 400));
        importEast.setBackground(new Color(255, 255, 204));
        importManagement.add(importEast, BorderLayout.EAST);

        JPanel importWest = new JPanel();
        importWest.setPreferredSize(new Dimension(200, 400));
        importWest.setBackground(new Color(255, 255, 204));
        importManagement.add(importWest, BorderLayout.WEST);

        JPanel importCenter = new JPanel();
        importCenter.setPreferredSize(new Dimension(500, 100));
        importCenter.setBackground(new Color(255, 255, 204));
        importManagement.add(importCenter, BorderLayout.CENTER);

        // Create Label in BorrowPanel
        JLabel borrowLabel = new JLabel("Các Phiếu Mượn Đã Đăng Ký");
        borrowNorth.add(borrowLabel);
        borrowLabel.setFont(new Font("Segoe UI", Font.BOLD, 30));

        // Create searchField
        JTextField searchField = new JTextField();
        searchField.setPreferredSize(new Dimension(200, 30));
        borrowCenter.add(searchField);

        // Create JRadioButton and ButtonGroup
        JRadioButton readButton = new JRadioButton("Theo tên độc giả");
        borrowCenter.add(readButton);
        JRadioButton borrowButton = new JRadioButton("Theo mã phiếu mượn");
        borrowCenter.add(borrowButton);

        // Create ButtonGroup
        ButtonGroup typeGroup = new ButtonGroup();
        typeGroup.add(readButton);
        typeGroup.add(borrowButton);

        // Create JPanel in borrowCenter
        JPanel funcPanel = new JPanel();
        borrowSouth.setLayout(new BorderLayout());
        // borrowSouth.add(funcPanel, BorderLayout.NORTH);
        // funcPanel.setBackground(new Color(0, 0, 0));

        JPanel borrowTablePanel = new JPanel();
        borrowTablePanel.setBackground(new Color(255, 255, 204));
        borrowTablePanel.setPreferredSize(new Dimension(900, 300));
        borrowSouth.add(borrowTablePanel, BorderLayout.SOUTH);

        // Create JTable and DefaultTableModel
        JTable BorrowTable = new JTable();
        String[] columnNames = { "Mã độc giả", "Tên độc giả", "Mật khẩu", "Số điện thoại", "Ngày sinh", "Email",
                "Giới tính" };
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        BorrowTable = new JTable(tableModel);
        BorrowTable.getTableHeader().setReorderingAllowed(false);

        // Add BorrowTable to TablePanel
        borrowTablePanel.add(new JScrollPane(BorrowTable));
        /////
        // importManagement
        // create JLabel
        JLabel importInfo = new JLabel("Danh sach phieu nhap sach");
        importInfo.setFont(new Font("Segoe UI", Font.BOLD, 30));
        importNorth.add(importInfo);
        JTextField searchbar = new JTextField();
        searchbar.setPreferredSize(new Dimension(200, 30));
        importCenter.add(searchbar);
        // create the JTable
        JTable importTable = new JTable();
        // add JTable
        String[] element = { "employee_id", "user_name", "pass", "position", "surname", "name", "gender", "birth",
                "email", "phone", "address" };
        DefaultTableModel importTableModel = new DefaultTableModel(element, 0);
        importTable = new JTable(importTableModel);
        importTable.getTableHeader().setResizingAllowed(false);
        importSouth.add(new JScrollPane(importTable));
        // Create tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Danh Sách Phiếu Mượn", BorrowManagement);
        tabbedPane.addTab("Danh Sách Phiếu Nhập", importManagement);
        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuanLyMuonTra());
    }
}
