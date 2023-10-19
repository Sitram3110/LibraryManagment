package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ThongKe extends JFrame {
    private JPanel readerStatic, bookStatic, fineStatic;
    private JPanel readerNorth, readerSouth, ReaderWest, ReaderCenter, ReaderEast, bookNorth, bookSouth, bookEast,
            bookCenter, bookWest, fineSouth, fineEast, fineNorth, fineCenter, fineWest;
    private JTable readerTable, bookTable, fineTable;

    public ThongKe() {
        initComponent();
    }

    public void initComponent() {
        setTitle("THONG KE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(900, 500);
        setVisible(true);
        setLayout(new BorderLayout());
        readerStatic.setLayout(new BorderLayout());
        bookStatic.setLayout(new BorderLayout());
        fineStatic.setLayout(new BorderLayout());

        // set Panel into BorderLayout
        // readerStatic
        readerStatic.add(readerNorth, BorderLayout.NORTH);
        readerStatic.add(readerSouth, BorderLayout.SOUTH);
        readerStatic.add(ReaderEast, BorderLayout.EAST);
        readerStatic.add(ReaderWest, BorderLayout.WEST);
        readerStatic.add(ReaderCenter, BorderLayout.CENTER);
        // bookStatic
        bookStatic.add(bookNorth, BorderLayout.NORTH);
        bookStatic.add(bookSouth, BorderLayout.SOUTH);
        bookStatic.add(bookEast, BorderLayout.EAST);
        bookStatic.add(bookWest, BorderLayout.WEST);
        bookStatic.add(bookCenter, BorderLayout.CENTER);
        // fineStatic
        fineStatic.add(fineNorth, BorderLayout.NORTH);
        fineStatic.add(fineSouth, BorderLayout.SOUTH);
        fineStatic.add(fineEast, BorderLayout.EAST);
        fineStatic.add(fineWest, BorderLayout.WEST);
        fineStatic.add(fineCenter, BorderLayout.CENTER);
        // create table
        // create contain panel
        JPanel panelReader = new JPanel();
        JPanel panelBook = new JPanel();
        JPanel panelFine = new JPanel();
        // reader
        String[] readerCol = { "employee_id", "user_name", "pass", "position", "surname", "name", "gender", "birth",
                "email", "phone", "address" };
        // JTable readerTable = new JTable(tableModel);
        DefaultTableModel tableModel = new DefaultTableModel(readerCol, 0);
        readerTable = new JTable(tableModel);
        readerTable.getTableHeader().setResizingAllowed(false);
        panelReader.add(readerTable);
        readerSouth.add(new JScrollPane(readerTable), BorderLayout.CENTER);

        // create tabbed
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Thong Ke Ban Doc", readerStatic);
        tabbedPane.addTab("Thong Ke Sach", bookStatic);
        tabbedPane.addTab("Thong Ke Tine Phat", fineStatic);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuanLyDocGia());
    }
}
