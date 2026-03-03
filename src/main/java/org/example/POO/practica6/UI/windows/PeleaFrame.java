package org.example.POO.practica6.UI.windows;

import org.example.POO.practica6.LOGIC.models.Humano;
import org.example.POO.practica6.LOGIC.models.Mounstro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PeleaFrame extends JFrame {

    //Atributos
    private JPanel panelHumano;
    private JPanel panelMounstro;
    private JButton btnPelear;
    private JLabel lblWinner;

    private Humano humano;
    private Mounstro mounstro;

    //labels de humano
    private JLabel lblNombreHumano;
    private JLabel lblVidaHumano;
    private JLabel lblDañoHumano;
    private JLabel lblValentiaHumano;
    private JLabel etiquetaImagenHumano;
    private JLabel etiquetaImagenMounstro;

    //labels del mounstro
    private JLabel lblNombreMounstro;
    private JLabel lblVidaMounstro;
    private JLabel lblDañoMounstro;
    private JLabel lblRugidoMounstro;

    //Metodos
    public PeleaFrame(Humano humano, Mounstro mounstro) {
        this.humano = humano;
        this.mounstro = mounstro;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setBackground(Color.WHITE);
        setTitle("Ventana de Mariano");

        panelHumano = new JPanel();
        panelHumano.setBackground(Color.RED);
        //Humano image
        ImageIcon icono = new ImageIcon(getClass().getResource("/images/humano.png"));
        Image imagen = icono.getImage();
        Image imagenRedimensionada = imagen.getScaledInstance(100, 80, Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionado = new ImageIcon(imagenRedimensionada);
        etiquetaImagenHumano = new JLabel(iconoRedimensionado);

        panelHumano.add(etiquetaImagenHumano);
        panelHumano.add(lblNombreHumano = new JLabel(humano.getNombre()));
        panelHumano.add(lblVidaHumano = new JLabel(String.valueOf(humano.getVida())));
        panelHumano.add(lblDañoHumano = new JLabel(String.valueOf(humano.getDanio())));
        panelHumano.add(lblValentiaHumano = new JLabel(String.valueOf(humano.getValentia())));

        panelMounstro = new JPanel();
        panelMounstro.setBackground(Color.YELLOW);
        //Mounstro image
        ImageIcon icono2 = new ImageIcon(getClass().getResource("/images/mounstro.png"));
        Image imagen2 = icono2.getImage();
        Image imagenRedimensionada2 = imagen2.getScaledInstance(100, 80, Image.SCALE_SMOOTH);
        ImageIcon iconoRedimensionado2 = new ImageIcon(imagenRedimensionada2);
        etiquetaImagenMounstro = new JLabel(iconoRedimensionado2);

        panelMounstro.add(etiquetaImagenMounstro);
        panelMounstro.add(lblNombreMounstro = new JLabel(mounstro.getNombre()));
        panelMounstro.add(lblVidaMounstro = new JLabel(String.valueOf(mounstro.getVida())));
        panelMounstro.add(lblDañoMounstro = new JLabel(String.valueOf(mounstro.getDanio())));
        panelMounstro.add(lblRugidoMounstro = new JLabel(String.valueOf(mounstro.getRugido())));

        btnPelear = new JButton("Pelear");

        //al darle click al boton...
        btnPelear.addActionListener(new ActionListener() {
            //harás lo que dice este metodo...
            @Override
            public void actionPerformed(ActionEvent e) {
                pelear(humano, mounstro);
            }
        });

        lblWinner = new JLabel("");

        add(panelHumano, BorderLayout.WEST);
        add(panelMounstro, BorderLayout.EAST);
        add(lblWinner, BorderLayout.CENTER);
        add(btnPelear, BorderLayout.PAGE_END);

        setVisible(true);
    }

    public void pelear(Humano humano, Mounstro mounstro){

        humano.restarVida(mounstro.getDanio());
        mounstro.restarVida(humano.getDanio());

        if(humano.getVida() <= 0){
            btnPelear.setEnabled(false);
            lblWinner.setText("Ganó " + mounstro.getNombre());
            lblVidaHumano.setText("0");
            return;
        }
        if(mounstro.getVida() <= 0){
            btnPelear.setEnabled(false);
            lblWinner.setText("Ganó " + humano.getNombre());
            lblVidaMounstro.setText("0");
            return;
        }else{
            lblVidaHumano.setText(String.valueOf(humano.getVida()));
            lblVidaMounstro.setText(String.valueOf(mounstro.getVida()));
        }
    }
}
