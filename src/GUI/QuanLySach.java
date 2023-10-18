package GUI;

import javax.swing.*;
import java.awt.*;

public class QuanLySach extends JFrame {
    private JPanel BookManagement, CategoryManagement;
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

        BookManagement = new JPanel();
        BookManagement.setLayout(new BorderLayout());

        JPanel bookNorth = new JPanel();
        bookNorth.setPreferredSize(new Dimension(900, 50));
        bookNorth.setBackground(Color.MAGENTA);
        BookManagement.add(bookNorth, BorderLayout.NORTH);

        JPanel bookSouth = new JPanel();
        bookSouth.setPreferredSize(new Dimension(900, 150));
        bookSouth.setBackground(Color.GRAY);
        bookSouth.setLayout(new BorderLayout());
        BookManagement.add(bookSouth, BorderLayout.SOUTH);

        JPanel bookEast = new JPanel();
        bookEast.setPreferredSize(new Dimension(50, 300));
        bookEast.setBackground(Color.CYAN);
        BookManagement.add(bookEast, BorderLayout.EAST);

        JPanel bookWest = new JPanel();
        bookWest.setPreferredSize(new Dimension(500, 300));
        bookWest.setBackground(Color.GREEN);
        BookManagement.add(bookWest, BorderLayout.WEST);

        JPanel bookCenter = new JPanel();
        bookCenter.setPreferredSize(new Dimension(350, 300));
        bookCenter.setBackground(Color.YELLOW);
        BookManagement.add(bookCenter, BorderLayout.CENTER);
        // Category
        CategoryManagement = new JPanel();
        CategoryManagement.setLayout(new BorderLayout());

        JPanel CategoryNorth = new JPanel();
        CategoryNorth.setPreferredSize(new Dimension(900, 50));
        CategoryNorth.setBackground(Color.MAGENTA);
        CategoryManagement.add(CategoryNorth, BorderLayout.NORTH);

        JPanel CategorySouth = new JPanel();
        CategorySouth.setPreferredSize(new Dimension(900, 50));
        CategorySouth.setBackground(Color.GRAY);
        CategoryManagement.add(CategorySouth, BorderLayout.SOUTH);

        JPanel CategoryEast = new JPanel();
        CategoryEast.setPreferredSize(new Dimension(100, 400));
        CategoryEast.setBackground(new Color(255, 255, 204));
        CategoryManagement.add(CategoryEast, BorderLayout.EAST);

        JPanel CategoryWest = new JPanel();
        CategoryWest.setPreferredSize(new Dimension(400, 400));
        CategoryWest.setBackground(new Color(255, 255, 204));
        CategoryManagement.add(CategoryWest, BorderLayout.WEST);

        JPanel CategoryCenter = new JPanel();
        CategoryCenter.setPreferredSize(new Dimension(400, 400));
        CategoryCenter.setBackground(new Color(255, 255, 204));
        CategoryManagement.add(CategoryCenter, BorderLayout.CENTER);

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

        // CategoryManagement
        JLabel categoryLabel = new JLabel("QUAN LY DANH MUC");
        categoryLabel.setHorizontalAlignment(JLabel.CENTER); // Căn giữa nội dung của JLabel
        CategoryNorth.add(categoryLabel);
        // create Label in categoryWest
        JLabel infoLabel = new JLabel("Thong tin danh muc Sach");
        infoLabel.setHorizontalAlignment(JLabel.CENTER); // Căn giữa nội dung của JLabel

        JLabel maDanhmuc = new JLabel("Ma Danh muc");
        JLabel tenDanhmuc = new JLabel("Ten Danh muc");

        // create JTextField
        JTextField maDanhmucField = new JTextField();
        maDanhmucField.setPreferredSize(new Dimension(200, 30));
        JTextField tenDanhmucField = new JTextField();
        tenDanhmucField.setPreferredSize(new Dimension(200, 30));
        // create JButton
        JButton addCateBtn = new JButton("Them");
        JButton editCateBtn = new JButton("Sua");
        JButton saveCateBtn = new JButton("Luu");
        JButton refreshCateBtn = new JButton("Lam moi");
        // make CategoryWest,CategoryCenter into GridBagLayout
        CategoryWest.setLayout(new GridBagLayout());
        CategoryCenter.setLayout(new GridBagLayout());
        GridBagConstraints gbcC = new GridBagConstraints();
        gbcC.insets = new Insets(5, 5, 5, 5);
        gbcC.gridx = 0;
        gbcC.gridy = 0;
        CategoryWest.add(infoLabel, gbcC);

        gbcC.gridx = 0;
        gbcC.gridy = 1;
        CategoryWest.add(maDanhmuc, gbcC);

        gbcC.gridx = 1;
        CategoryWest.add(maDanhmucField, gbcC);

        gbcC.gridx = 0;
        gbcC.gridy = 2;
        CategoryWest.add(tenDanhmuc, gbcC);

        gbcC.gridx = 1;
        CategoryWest.add(tenDanhmucField, gbcC);

        gbcC.gridx = 0;
        gbcC.gridy = 3;
        CategoryWest.add(addCateBtn, gbcC);

        gbcC.gridx = 1;
        CategoryWest.add(saveCateBtn, gbcC);

        gbcC.gridx = 0;
        gbcC.gridy = 4;
        CategoryWest.add(editCateBtn, gbcC);

        gbcC.gridx = 1;
        CategoryWest.add(refreshCateBtn, gbcC);
        // CategoryCenter
        JTextField searchField = new JTextField();
        searchField.setPreferredSize(new Dimension(200, 30));
        JLabel searchLabel = new JLabel("Tim kiem");
        gbcC.gridx = 0;
        gbcC.gridy = 1;
        CategoryCenter.add(searchField, gbcC);

        gbcC.gridx = 1;
        CategoryCenter.add(searchLabel, gbcC);

        // GenreManagement
        JPanel GenreManagement = new JPanel();
        GenreManagement.setLayout(new BorderLayout());
        JPanel GenreNorth = new JPanel();
        GenreNorth.setPreferredSize(new Dimension(900, 50));
        JPanel GenreSouth = new JPanel();
        GenreSouth.setPreferredSize(new Dimension(900, 50));
        JPanel GenreWest = new JPanel();
        GenreWest.setPreferredSize(new Dimension(400, 400));
        JPanel GenreEast = new JPanel();
        GenreEast.setPreferredSize(new Dimension(100, 400));
        JPanel GenreCenter = new JPanel();
        GenreCenter.setPreferredSize(new Dimension(400, 400));

        // add Genre into GenreManagement
        GenreManagement.add(GenreNorth, BorderLayout.NORTH);
        GenreManagement.add(GenreSouth, BorderLayout.SOUTH);
        GenreManagement.add(GenreWest, BorderLayout.WEST);
        GenreManagement.add(GenreEast, BorderLayout.EAST);
        GenreManagement.add(GenreCenter, BorderLayout.CENTER);
        // set background color
        GenreNorth.setBackground(Color.CYAN);
        GenreCenter.setBackground(Color.GREEN);
        GenreEast.setBackground(Color.RED);

        // config component
        JLabel genreLabel = new JLabel("QUAN LY THE LOAI");
        genreLabel.setHorizontalAlignment(JLabel.CENTER); // Căn giữa nội dung của JLabel
        GenreNorth.add(genreLabel);
        // create Label in categoryWest
        JLabel genreInfo = new JLabel("Thong tin The Loai Sach");
        genreInfo.setHorizontalAlignment(JLabel.CENTER); // Căn giữa nội dung của JLabel

        JLabel maTheloai = new JLabel("Ma The Loai");
        JLabel tenTheloai = new JLabel("Ten The Loai");

        // create JTextField
        JTextField maTheloaiField = new JTextField();
        maTheloaiField.setPreferredSize(new Dimension(200, 30));
        JTextField tenTheloaiField = new JTextField();
        tenTheloaiField.setPreferredSize(new Dimension(200, 30));
        // create JButton
        JButton addGenreBtn = new JButton("Them");
        JButton editGenreBtn = new JButton("Sua");
        JButton saveGenreBtn = new JButton("Luu");
        JButton refreshGenreBtn = new JButton("Lam moi");
        // make GenreWest,GenreCenter into GridBagLayout
        GenreWest.setLayout(new GridBagLayout());
        GenreCenter.setLayout(new GridBagLayout());
        GridBagConstraints gbcG = new GridBagConstraints();
        gbcG.insets = new Insets(5, 5, 5, 5);
        gbcG.gridx = 0;
        gbcG.gridy = 0;
        GenreWest.add(genreInfo, gbcG);

        gbcG.gridx = 0;
        gbcG.gridy = 1;
        GenreWest.add(maTheloai, gbcG);

        gbcG.gridx = 1;
        GenreWest.add(maTheloaiField, gbcG);

        gbcG.gridx = 0;
        gbcG.gridy = 2;
        GenreWest.add(tenTheloai, gbcG);

        gbcG.gridx = 1;
        GenreWest.add(tenTheloaiField, gbcG);

        gbcG.gridx = 0;
        gbcG.gridy = 3;
        GenreWest.add(addGenreBtn, gbcG);

        gbcG.gridx = 1;
        GenreWest.add(saveGenreBtn, gbcG);

        gbcG.gridx = 0;
        gbcG.gridy = 4;
        GenreWest.add(editGenreBtn, gbcG);

        gbcG.gridx = 1;
        GenreWest.add(refreshGenreBtn, gbcG);
        // GenreCenter
        JTextField searchGenreField = new JTextField();
        searchGenreField.setPreferredSize(new Dimension(200, 30));
        JLabel searchGenreLabel = new JLabel("Tim kiem");
        gbcG.gridx = 0;
        gbcG.gridy = 1;
        GenreCenter.add(searchGenreField, gbcG);

        gbcG.gridx = 1;
        GenreCenter.add(searchGenreLabel, gbcG);

        // AuthorManagement
        JPanel AuthManagement = new JPanel();
        AuthManagement.setLayout(new BorderLayout());
        JPanel AuthNorth = new JPanel();
        AuthNorth.setPreferredSize(new Dimension(900, 50));
        JPanel AuthSouth = new JPanel();
        AuthSouth.setPreferredSize(new Dimension(900, 50));
        JPanel AuthWest = new JPanel();
        AuthWest.setPreferredSize(new Dimension(400, 400));
        JPanel AuthEast = new JPanel();
        AuthEast.setPreferredSize(new Dimension(100, 400));
        JPanel AuthCenter = new JPanel();
        AuthCenter.setPreferredSize(new Dimension(400, 400));

        // add Auth into AuthManagement
        AuthManagement.add(AuthNorth, BorderLayout.NORTH);
        AuthManagement.add(AuthSouth, BorderLayout.SOUTH);
        AuthManagement.add(AuthWest, BorderLayout.WEST);
        AuthManagement.add(AuthEast, BorderLayout.EAST);
        AuthManagement.add(AuthCenter, BorderLayout.CENTER);
        // set background color
        AuthNorth.setBackground(Color.CYAN);
        AuthCenter.setBackground(Color.GREEN);
        AuthEast.setBackground(Color.LIGHT_GRAY);

        // config component
        JLabel AuthLabel = new JLabel("QUAN LY Tac Gia");
        AuthLabel.setHorizontalAlignment(JLabel.CENTER); // Căn giữa nội dung của JLabel
        AuthNorth.add(AuthLabel);
        // create Label in categoryWest
        JLabel AuthInfo = new JLabel("Thong tin Tac Gia Sach");
        AuthInfo.setHorizontalAlignment(JLabel.CENTER); // Căn giữa nội dung của JLabel

        JLabel maTacgia = new JLabel("Ma Tac Gia");
        JLabel tenTacgia = new JLabel("Ten Tac Gia");

        // create JTextField
        JTextField maTacgiaField = new JTextField();
        maTacgiaField.setPreferredSize(new Dimension(200, 30));
        JTextField tenTacgiaField = new JTextField();
        tenTacgiaField.setPreferredSize(new Dimension(200, 30));
        // create JButton
        JButton addAuthBtn = new JButton("Them");
        JButton editAuthBtn = new JButton("Sua");
        JButton saveAuthBtn = new JButton("Luu");
        JButton refreshAuthBtn = new JButton("Lam moi");
        // make AuthWest,AuthCenter into GridBagLayout
        AuthWest.setLayout(new GridBagLayout());
        AuthCenter.setLayout(new GridBagLayout());
        GridBagConstraints gbcA = new GridBagConstraints();
        gbcA.insets = new Insets(5, 5, 5, 5);
        gbcA.gridx = 0;
        gbcA.gridy = 0;
        AuthWest.add(AuthInfo, gbcA);

        gbcA.gridx = 0;
        gbcA.gridy = 1;
        AuthWest.add(maTacgia, gbcA);

        gbcA.gridx = 1;
        AuthWest.add(maTacgiaField, gbcA);

        gbcA.gridx = 0;
        gbcA.gridy = 2;
        AuthWest.add(tenTacgia, gbcA);

        gbcA.gridx = 1;
        AuthWest.add(tenTacgiaField, gbcA);

        gbcA.gridx = 0;
        gbcA.gridy = 3;
        AuthWest.add(addAuthBtn, gbcA);

        gbcA.gridx = 1;
        AuthWest.add(saveAuthBtn, gbcA);

        gbcA.gridx = 0;
        gbcA.gridy = 4;
        AuthWest.add(editAuthBtn, gbcA);

        gbcA.gridx = 1;
        AuthWest.add(refreshAuthBtn, gbcA);
        // AuthCenter
        JTextField searchAuthField = new JTextField();
        searchAuthField.setPreferredSize(new Dimension(200, 30));
        JLabel searchAuthLabel = new JLabel("Tim kiem");
        gbcA.gridx = 0;
        gbcA.gridy = 1;
        AuthCenter.add(searchAuthField, gbcA);

        gbcA.gridx = 1;
        AuthCenter.add(searchAuthLabel, gbcA);

        // create tabbed
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Quan Ly Sach", BookManagement);
        tabbedPane.addTab("Quan Ly Danh Muc", CategoryManagement);
        tabbedPane.addTab("Quan Ly The Loai", GenreManagement);
        tabbedPane.addTab("Quan Ly Tac Gia", AuthManagement);
        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuanLySach());
    }
}
