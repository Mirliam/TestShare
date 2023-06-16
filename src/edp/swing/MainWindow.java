package edp.swing;

import javafx.beans.property.adapter.JavaBeanBooleanPropertyBuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.concurrent.Flow;

public class MainWindow extends JFrame  {


    private JLabel fnLabel;
    private JTextField fnText;
    private JLabel lnLabel;
    private JTextField lnText;
    private JButton actionButton;

    public MainWindow() {
        super("First swing operation");
        this.setSize(new Dimension(800, 600));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // this.pack(); dostosowanie automatyczne wielkosci okna do elementow
        // okno
        fnLabel = new JLabel("Fist name: ");
        fnText = new JTextField();
        lnLabel = new JLabel("Last name: ");
        ;
        lnText = new JTextField();
        actionButton = new JButton("Wykonaj akcje");
        actionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonclick(evt);
            }

        });
        //this.getContentPane().add(fnLabel);
        // this.add(fnText);
        this.getContentPane().setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        this.getContentPane().add(fnLabel);
        this.getContentPane().add(fnText);
        this.getContentPane().add(lnLabel);
        this.getContentPane().add(lnText);
        this.getContentPane().add(actionButton);
        this.setVisible(true);

    }

    public void buttonclick(ActionEvent e) {
        StringBuffer sb = new StringBuffer();
        //string buffer lepsza wydajnos w konkatyncaji
        sb.append("Event recived");
        sb.append("Time-");
        sb.append(new Date(e.getWhen()).toString());
        sb.append("Source: ");
        sb.append(e.getSource().getClass().getCanonicalName());
        System.out.println(sb.toString());
    }
}
