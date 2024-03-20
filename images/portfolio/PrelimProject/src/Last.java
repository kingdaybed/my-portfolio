import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Last extends JFrame {
    public Last() {
        setTitle("Button Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JButton button1 = new JButton("Show Message");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello, I'm Neil David");
            }
        });

        JButton button2 = new JButton("Calculator");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	JFrame frame = new JFrame("Calculator");
            	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	frame.setSize(300, 400);

            	JPanel panel = new JPanel();
            	frame.add(panel);

            	panel.setLayout(new GridLayout(4, 4));

            	String[] buttons = {
            	    "7", "8", "9", "/",
            	    "4", "5", "6", "*",
            	    "1", "2", "3", "-",
            	    "C", "0", "=", "+"
            	};

            	for (String buttonText : buttons) {
            	    JButton button = new JButton(buttonText);
            	    panel.add(button);
            	}

            	frame.setVisible(true);
            	
            	
            }
        });

        JButton button3 = new JButton("Input Picture");
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                int result = fileChooser.showOpenDialog(null);
                
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    
                 
                    Image image = Toolkit.getDefaultToolkit().getImage(selectedFile.getAbsolutePath()); 
                    JLabel imageLabel = new JLabel(new ImageIcon(image));
                    imageLabel.setPreferredSize(new Dimension(200, 200));
                    panel.setLayout(new BorderLayout());
                    panel.add(imageLabel, BorderLayout.CENTER);
                    panel.revalidate();
                    panel.repaint();
                }

            	
            }
        });

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Last();
    }
}