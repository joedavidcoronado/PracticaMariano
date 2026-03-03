package org.example.POO.practica7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//hacer una vetana con un boton en el centro que cuando le dé click se poonga el fondo negro
public class VetanaFrame extends JFrame {

    //ATRIBUTOS
    private JButton btnCambiar;

    //METODOS
    public VetanaFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setTitle("Practica 07");
        setBackground(Color.WHITE);

        btnCambiar = new JButton("Cambiar");

        btnCambiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.BLACK);
            }
        });

        add(btnCambiar, BorderLayout.PAGE_END);

        setVisible(true);
    }
}
