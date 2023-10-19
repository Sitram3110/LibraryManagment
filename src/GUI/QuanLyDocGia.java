package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class QuanLyDocGia extends JFrame {
    private JLabel maDocgia, tenDocgia, matkhau, SDT, ngaysinh, Email, sex;
    private JTextField maDocgiaField, tenDocgiaField, matkhauField, SDTField, ngaysinhField, EmailField;

    public QuanLyDocGia() {
        initComponent();
    }

    public void initComponent() {
        setTitle("QUẢN LÝ ĐỘC GIẢ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(900, 500);
        setVisible(true);
        setLayout(new BorderLayout());

        // Tạo một JLabel
        JLabel label = new JLabel("Quản lý độc giả!");
        label.setHorizontalAlignment(JLabel.CENTER); // Căn giữa nội dung của JLabel
        // set font for label
        label.setFont(new Font("Segoe UI", Font.BOLD, 30));
        // Tạo Panel thuộc BorderLayout
        JPanel SouthPanel = new JPanel();
        JPanel NorthPanel = new JPanel();
        JPanel CenterPanel = new JPanel();
        JPanel WestPanel = new JPanel();
        JPanel EastPanel = new JPanel();
        // Đặt màu nền
        NorthPanel.setBackground(Color.YELLOW);
        SouthPanel.setBackground(new Color(255, 255, 204));
        CenterPanel.setBackground(new Color(255, 255, 204));
        EastPanel.setBackground(new Color(255, 255, 204));
        WestPanel.setBackground(new Color(255, 255, 204));

        // chỉnh kích thước panel
        NorthPanel.setPreferredSize(new Dimension(900, 50));
        SouthPanel.setPreferredSize(new Dimension(900, 250));
        CenterPanel.setPreferredSize(new Dimension(350, 200)); // Corrected size
        WestPanel.setPreferredSize(new Dimension(350, 200)); // Corrected size
        EastPanel.setPreferredSize(new Dimension(150, 200)); // Corrected size
        // Thêm JLabel vào NorthPanel
        NorthPanel.add(label);

        // Thêm Panel vào JFrame
        add(NorthPanel, BorderLayout.NORTH);
        add(SouthPanel, BorderLayout.SOUTH);
        add(CenterPanel, BorderLayout.CENTER);
        add(WestPanel, BorderLayout.WEST);
        add(EastPanel, BorderLayout.EAST);

        // Đặt tên JLabel
        maDocgia = new JLabel("Mã Độc Giả");
        tenDocgia = new JLabel("Tên Độc Giả");
        matkhau = new JLabel("Mật Khẩu");
        SDT = new JLabel("Số Điện Thoại");
        ngaysinh = new JLabel("Ngày Sinh");
        Email = new JLabel("Email");
        sex = new JLabel("Giới Tính");

        // Create JRadioButton and ButtonGroup
        JRadioButton MaleRadioButton = new JRadioButton("Nam");
        JRadioButton FemaleRadioButton = new JRadioButton("Nữ");

        ButtonGroup sexGroup = new ButtonGroup();
        sexGroup.add(MaleRadioButton);
        sexGroup.add(FemaleRadioButton);

        // tạo Field
        maDocgiaField = new JTextField();
        maDocgiaField.setPreferredSize(new Dimension(200, 30));
        tenDocgiaField = new JTextField();
        tenDocgiaField.setPreferredSize(new Dimension(200, 30));
        matkhauField = new JTextField();
        matkhauField.setPreferredSize(new Dimension(200, 30));
        SDTField = new JTextField();
        SDTField.setPreferredSize(new Dimension(200, 30));
        ngaysinhField = new JTextField();
        ngaysinhField.setPreferredSize(new Dimension(200, 30));
        EmailField = new JTextField();
        EmailField.setPreferredSize(new Dimension(200, 30));

        // set the SouthPanel to BorderLayout
        // SouthPanel.setPreferredSize(new Dimension(900, 250));width,height
        SouthPanel.setLayout(new BorderLayout());
        JPanel BtnPanel = new JPanel();
        BtnPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        BtnPanel.setBackground(new Color(255, 255, 204));
        BtnPanel.setPreferredSize(new Dimension(900, 50));
        SouthPanel.add(BtnPanel, BorderLayout.NORTH);
        JPanel TablePanel = new JPanel();
        TablePanel.setBackground(new Color(255, 255, 255));
        TablePanel.setPreferredSize(new Dimension(900, 200));
        SouthPanel.add(TablePanel, BorderLayout.SOUTH);

        // Create the Btn Func
        JButton AddBtn = new JButton("Thêm mới");
        JButton EditBtn = new JButton("Sửa");
        JButton DelBtn = new JButton("Xóa");
        JButton RefreshBtn = new JButton("Làm mới");

        // Create the ReaderTable
        JTable ReaderTable = new JTable();

        // add JTable for panelBot
        String[] columnNames = { " mã độc giả", "tên độc giả", "mật khẩu", "số điện thoại", "ngày sinh", "Email",
                "giới tính" };
        // JTable ReaderTable = new JTable(tableModel);
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        ReaderTable = new JTable(tableModel);
        ReaderTable.getTableHeader().setResizingAllowed(false);
        // ReaderTable.setPreferredSize(new Dimension(900, 100));

        // add ReaderTable to TablePanel
        TablePanel.add(new JScrollPane(ReaderTable));

        // Add Btn to SouthPanel/BtnPanel
        BtnPanel.add(AddBtn);
        BtnPanel.add(EditBtn);
        BtnPanel.add(DelBtn);
        BtnPanel.add(RefreshBtn);
        // Create a new GridBagLayout for CenterPanel
        WestPanel.setLayout(new GridBagLayout());
        CenterPanel.setLayout(new GridBagLayout());

        // Create GridBagConstraints for setting constraints on components
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add some padding

        // Add components to WestPanel with specified constraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        WestPanel.add(maDocgia, gbc);

        gbc.gridx = 1;
        WestPanel.add(maDocgiaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        WestPanel.add(tenDocgia, gbc);

        gbc.gridx = 1;
        WestPanel.add(tenDocgiaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        WestPanel.add(matkhau, gbc);

        gbc.gridx = 1;
        WestPanel.add(matkhauField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        WestPanel.add(sex, gbc);

        gbc.gridx = 1;
        WestPanel.add(MaleRadioButton, gbc);
        gbc.gridx = 2; // Adjusted column index
        WestPanel.add(FemaleRadioButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 0;
        CenterPanel.add(SDT, gbc);

        gbc.gridx = 1;
        CenterPanel.add(SDTField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        CenterPanel.add(ngaysinh, gbc);

        gbc.gridx = 1;
        CenterPanel.add(ngaysinhField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        CenterPanel.add(Email, gbc);

        gbc.gridx = 1;
        CenterPanel.add(EmailField, gbc);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuanLyDocGia());
    }
}
