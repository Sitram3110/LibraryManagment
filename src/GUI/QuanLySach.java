package GUI;

import javax.swing.*;
import java.awt.*;

public class QuanLySach extends JFrame {
    private JPanel BookManager, CategoryManager;
    private JLabel maSach, tenSach, maTheloai, theLoai, giaTien, namXuatban, tacGia, NXB, maDanhmuc, tenDanhmuc, tomtat;
    private JTextField maSachField, tenSachField, maTheloaiField, theLoaiField, giaTienField, namXuatbanField,
            tacGiaField, NXBField, maDanhmucField, tenDanhmucField, tomtatField;

    public QuanLySach() {
        initComponent();
    }

    public void initComponent() {
        setTitle("QUẢN LÝ DANH MỤC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(900, 500);
        setVisible(true);

        JLabel label = new JLabel("Quản lý danh mục");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Segoe UI", Font.BOLD, 30));

        BookManager = new JPanel();
        BookManager.setLayout(new BorderLayout());

        JPanel bookNorth = new JPanel();
        bookNorth.setPreferredSize(new Dimension(900, 50));
        bookNorth.setBackground(Color.MAGENTA);
        BookManager.add(bookNorth, BorderLayout.NORTH);

        JPanel bookSouth = new JPanel();
        bookSouth.setPreferredSize(new Dimension(900, 150));
        bookSouth.setBackground(Color.GRAY);
        bookSouth.setLayout(new BorderLayout());
        BookManager.add(bookSouth, BorderLayout.SOUTH);

        JPanel bookEast = new JPanel();
        bookEast.setPreferredSize(new Dimension(50, 300));
        bookEast.setBackground(Color.CYAN);
        BookManager.add(bookEast, BorderLayout.EAST);

        JPanel bookWest = new JPanel();
        bookWest.setPreferredSize(new Dimension(500, 300));
        bookWest.setBackground(Color.GREEN);
        BookManager.add(bookWest, BorderLayout.WEST);

        JPanel bookCenter = new JPanel();
        bookCenter.setPreferredSize(new Dimension(350, 300));
        bookCenter.setBackground(Color.YELLOW);
        BookManager.add(bookCenter, BorderLayout.CENTER);

        CategoryManager = new JPanel();
        CategoryManager.setLayout(new BorderLayout());

        JPanel CategoryNorth = new JPanel();
        CategoryNorth.setPreferredSize(new Dimension(900, 50));
        CategoryNorth.setBackground(Color.MAGENTA);
        CategoryManager.add(CategoryNorth, BorderLayout.NORTH);

        JPanel CategorySouth = new JPanel();
        CategorySouth.setPreferredSize(new Dimension(900, 250));
        CategorySouth.setBackground(Color.GRAY);
        CategoryManager.add(CategorySouth, BorderLayout.SOUTH);

        JPanel CategoryEast = new JPanel();
        CategoryEast.setPreferredSize(new Dimension(50, 200));
        CategoryEast.setBackground(Color.CYAN);
        CategoryManager.add(CategoryEast, BorderLayout.EAST);

        JPanel CategoryWest = new JPanel();
        CategoryWest.setPreferredSize(new Dimension(50, 200));
        CategoryWest.setBackground(Color.GREEN);
        CategoryManager.add(CategoryWest, BorderLayout.WEST);

        JPanel CategoryCenter = new JPanel();
        CategoryCenter.setPreferredSize(new Dimension(50, 200));
        CategoryCenter.setBackground(Color.BLACK);
        CategoryManager.add(CategoryCenter, BorderLayout.CENTER);

        maSach = new JLabel("Ma Sach");
        tenSach = new JLabel("Ten Sach");
        maTheloai = new JLabel("Ma The Loai");
        theLoai = new JLabel("The Loai");
        giaTien = new JLabel("Gia Tien");
        namXuatban = new JLabel("Nam Xuatban");
        tacGia = new JLabel("Tac Gia");
        NXB = new JLabel("Nha Xuat Ban");
        maDanhmuc = new JLabel("Ma Danhmuc");
        tenDanhmuc = new JLabel("Ten Danhmuc");
        tomtat = new JLabel("Tom Tat");

        maSachField = new JTextField();
        maSachField.setPreferredSize(new Dimension(200, 30));
        tenSachField = new JTextField();
        tenSachField.setPreferredSize(new Dimension(200, 30));
        maTheloaiField = new JTextField();
        maTheloaiField.setPreferredSize(new Dimension(200, 30));
        theLoaiField = new JTextField();
        theLoaiField.setPreferredSize(new Dimension(200, 30));
        giaTienField = new JTextField();
        giaTienField.setPreferredSize(new Dimension(200, 30));
        namXuatbanField = new JTextField();
        namXuatbanField.setPreferredSize(new Dimension(200, 30));
        tacGiaField = new JTextField();
        tacGiaField.setPreferredSize(new Dimension(200, 30));
        NXBField = new JTextField();
        NXBField.setPreferredSize(new Dimension(200, 30));
        maDanhmucField = new JTextField();
        maDanhmucField.setPreferredSize(new Dimension(200, 30));
        tenDanhmucField = new JTextField();
        tenDanhmucField.setPreferredSize(new Dimension(200, 30));
        tomtatField = new JTextField();
        tomtatField.setPreferredSize(new Dimension(200, 60));

        String[] positions = { "--Chọn tiêu chí--", "Mã máy bay", "Mã hãng", "Model" };
        JComboBox<String> maTLComboBox = new JComboBox<>(positions);
        String[] Cate = { "--Chọn tiêux chí--", "Mã máy bay", "XXX", "Model" };
        JComboBox<String> CategoryComboBox = new JComboBox<>(Cate);

        bookWest.setLayout(new GridBagLayout());
        bookCenter.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // BookWest
        gbc.gridx = 0;
        gbc.gridy = 0;
        bookWest.add(maSach, gbc);

        gbc.gridx = 1;
        bookWest.add(maSachField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        bookWest.add(tenSach, gbc);

        gbc.gridx = 1;
        bookWest.add(tenSachField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        bookWest.add(maTheloai, gbc);

        gbc.gridx = 1;
        bookWest.add(maTLComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        bookWest.add(theLoai, gbc);

        gbc.gridx = 1;
        bookWest.add(theLoaiField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        bookWest.add(giaTien, gbc);

        gbc.gridx = 1;
        bookWest.add(giaTienField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        bookWest.add(namXuatban, gbc);

        gbc.gridx = 1;
        bookWest.add(namXuatbanField, gbc);

        // bookCenter
        gbc.gridx = 0;
        gbc.gridy = 0;
        bookCenter.add(tacGia, gbc);

        gbc.gridx = 1;
        bookCenter.add(tacGiaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        bookCenter.add(NXB, gbc);

        gbc.gridx = 1;
        bookCenter.add(NXBField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        bookCenter.add(maDanhmuc, gbc);

        gbc.gridx = 1;
        bookCenter.add(CategoryComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        bookCenter.add(tenDanhmuc, gbc);

        gbc.gridx = 1;
        bookCenter.add(tenDanhmucField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        bookCenter.add(tomtat, gbc);

        gbc.gridx = 1;
        bookCenter.add(tomtatField, gbc);
        // btnPanel in BookSouth
        JPanel btnPanel = new JPanel();
        JButton AddBtn = new JButton("Thêm mới");
        JButton EditBtn = new JButton("Sửa");
        JButton DelBtn = new JButton("Xóa");
        JButton StatusBtn = new JButton("Tình Trạng");
        JButton searchBtn = new JButton("Hỗ trợ tìm kiếm");
        JButton RefreshBtn = new JButton("Làm mới");
        btnPanel.setLayout(new FlowLayout());
        btnPanel.add(AddBtn);
        btnPanel.add(EditBtn);
        btnPanel.add(DelBtn);
        btnPanel.add(StatusBtn);
        btnPanel.add(searchBtn);
        btnPanel.add(RefreshBtn);
        // add BtnPanel to bookSouth
        bookSouth.add(btnPanel, BorderLayout.NORTH);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Doanh thu", BookManager);
        tabbedPane.addTab("Nhân viên bán hàng", CategoryManager);
        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuanLySach());
    }
}
