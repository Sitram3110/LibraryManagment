package GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

public class TraCuu extends JFrame {
    public TraCuu() {
        initComponent(); // Initialize the components in the constructor
    }

    public void initComponent() {
        setTitle("Tra Cuu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(900, 500);
        setVisible(true);
        setLayout(new BorderLayout());

        // Create JPanel of border layout
        JPanel north = new JPanel();
        JPanel south = new JPanel();
        JPanel west = new JPanel();
        JPanel east = new JPanel();
        JPanel center = new JPanel();

        // Set preferred size for panels
        north.setPreferredSize(new Dimension(900, 50));
        south.setPreferredSize(new Dimension(900, 250));
        center.setPreferredSize(new Dimension(700, 200)); // Adjusted the width to match the frame
        center.setBackground(new Color(255, 255, 204));

        // Add panels to the layout
        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        add(east, BorderLayout.EAST);
        add(west, BorderLayout.WEST);
        add(center, BorderLayout.CENTER);

        // Create JLabel in the header
        JLabel searchLabel = new JLabel("Tim kiem sach");
        JTextField searchField = new JTextField(20); // Added a width of 20 columns
        JButton searchButton = new JButton("Tim kiem");

        north.setLayout(new FlowLayout());
        north.add(searchLabel);
        north.add(searchField);
        north.add(searchButton);

        // center
        JLabel cateFiltLabel = new JLabel("Loc theo danh muc");
        JTextField cateFilt = new JTextField();
        cateFilt.setPreferredSize(new Dimension(200, 30));
        JLabel genreFiltLabel = new JLabel("Loc theo the loai");
        JTextField genreFilt = new JTextField();
        genreFilt.setPreferredSize(new Dimension(200, 30));

        // create comboBox
        JComboBox<String> catefiltBox, genrefiltBox;
        // create combobox for panelBot
        String[] category = { "--Tim theo danh muc--", "Phi công", "Tiếp viên", "Bán vé" };
        catefiltBox = new JComboBox<>(category);
        String[] genre = { "--Tim theo danh muc--", "Phi công", "Tiếp viên", "Bán vé" };
        genrefiltBox = new JComboBox<>(genre);

        // crate Table
        JTable searchTable = new JTable();
        String[] columnNames = { "employeexxx", "user_name", "pass", "position", "surname", "name", "gender", "birth",
                "email", "phone", "address" };
        // add table
        south.add(searchTable);
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        searchTable = new JTable(tableModel);
        searchTable.getTableHeader().setResizingAllowed(false);
        JPanel panelTable = new JPanel();
        panelTable.setPreferredSize(new Dimension(900, 250));
        panelTable.add(searchTable);
        south.setLayout(new BorderLayout());
        south.add(new JScrollPane(searchTable), BorderLayout.NORTH);
        // south.setBackground(Color.CYAN);
        center.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add some padding
        // Add components to center with specified constraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        center.add(cateFiltLabel, gbc);

        gbc.gridx = 1;
        center.add(catefiltBox, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        center.add(genreFiltLabel, gbc);

        gbc.gridx = 1;
        center.add(genrefiltBox, gbc);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TraCuu());
    }
}
