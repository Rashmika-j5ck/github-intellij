package q;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;




public class java_table {
    public static void main(String[] args) {
        JFrame frame = new JFrame("full gui");
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        openItem.setEnabled(false);
        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        String[] col = {"Name", "ID", "Marks"};
        Object[][] data = {
                {"Amal", " CS/2022/020", " 85"},
                {"Nimali", "ET/2022/014", "77"},
                {"Kamal", "CT/2022/011", "92"}
        };

        DefaultTableModel model = new DefaultTableModel(data, col) {
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };


        JTable table = new JTable(model);
        JScrollPane scroll = new JScrollPane(table);
        frame.add(scroll,BorderLayout.CENTER);


        JPanel panel = new JPanel(new FlowLayout());
        panel.setBackground(Color.LIGHT_GRAY);

        panel.add(new JButton("save"));
        panel.add(new JButton("update"));
        panel.add(new JButton("delete"));

        frame.add(panel,BorderLayout.SOUTH);

        frame.setSize(600,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);







    }

        }



















