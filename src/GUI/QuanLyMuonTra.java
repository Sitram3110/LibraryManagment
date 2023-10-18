package GUI;

import javax.swing.*;
import java.awt.*;

public class QuanLyMuonTra extends JFrame {
    JPanel BorrowManagement, ReturnManagement;

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
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Segoe UI", Font.BOLD, 30));
        BorrowManagement = new JPanel();
        BorrowManagement.setLayout(new BorderLayout());

        JPanel borrowNorth = new JPanel();
        borrowNorth.setPreferredSize(new Dimension(900, 50));
        borrowNorth.setBackground(Color.MAGENTA);
        BorrowManagement.add(borrowNorth, BorderLayout.NORTH);

        JPanel borrowSouth = new JPanel();
        borrowSouth.setPreferredSize(new Dimension(900, 150));
        borrowSouth.setBackground(Color.GRAY);
        borrowSouth.setLayout(new BorderLayout());
        BorrowManagement.add(borrowSouth, BorderLayout.SOUTH);

        JPanel borrowEast = new JPanel();
        borrowEast.setPreferredSize(new Dimension(50, 300));
        borrowEast.setBackground(new Color(255, 255, 204));
        BorrowManagement.add(borrowEast, BorderLayout.EAST);

        JPanel borrowWest = new JPanel();
        borrowWest.setPreferredSize(new Dimension(500, 300));
        borrowWest.setBackground(new Color(255, 255, 204));
        BorrowManagement.add(borrowWest, BorderLayout.WEST);

        JPanel borrowCenter = new JPanel();
        borrowCenter.setPreferredSize(new Dimension(350, 300));
        borrowCenter.setBackground(new Color(255, 255, 204));
        BorrowManagement.add(borrowCenter, BorderLayout.CENTER);
        // Return
        ReturnManagement = new JPanel();
        ReturnManagement.setLayout(new BorderLayout());

        JPanel returnNorth = new JPanel();
        returnNorth.setPreferredSize(new Dimension(900, 50));
        returnNorth.setBackground(Color.MAGENTA);
        ReturnManagement.add(returnNorth, BorderLayout.NORTH);

        JPanel returnSouth = new JPanel();
        returnSouth.setPreferredSize(new Dimension(900, 50));
        returnSouth.setBackground(Color.GRAY);
        ReturnManagement.add(returnSouth, BorderLayout.SOUTH);

        JPanel returnEast = new JPanel();
        returnEast.setPreferredSize(new Dimension(100, 400));
        returnEast.setBackground(new Color(255, 255, 204));
        ReturnManagement.add(returnEast, BorderLayout.EAST);

        JPanel returnWest = new JPanel();
        returnWest.setPreferredSize(new Dimension(400, 400));
        returnWest.setBackground(new Color(255, 255, 204));
        ReturnManagement.add(returnWest, BorderLayout.WEST);

        JPanel returnCenter = new JPanel();
        returnCenter.setPreferredSize(new Dimension(400, 400));
        returnCenter.setBackground(new Color(255, 255, 204));
        ReturnManagement.add(returnCenter, BorderLayout.CENTER);
        // create tabbed
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Danh Sach Phieu Muon", BorrowManagement);
        tabbedPane.addTab("Danh Sach Phieu Tra", ReturnManagement);
        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new QuanLySach());
    }
}
