package GestionHotelera;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;   // hacemos que la ventana "escuche" los eventos

public class VentanaPrincipal extends JFrame implements ActionListener { // ventana swing
   //Paneles
    private JPanel panelMenu;
    private JPanel panelContenido;

    //cada variable representa un botón
    private JButton botonDashboard;
    private JButton botonHabitaciones;
    private JButton botonHuespedes;
    private JButton botonReservaciones;
    private JButton botonSalida;

    public VentanaPrincipal(){
        setTitle("Gestión Hotelera");
        setSize(1000,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Se termina el programa cuando se cierra la ventana

        //división de trabajo para evitar un constructor enorme
        crearComponentes();
        organizarComponentes(); // donde van a ir ubicados
    }

    private void crearComponentes(){
        panelMenu = new JPanel();
        panelContenido = new JPanel();

        botonDashboard = new JButton("Dashboard");
        botonHabitaciones = new JButton("Habitaciones");
        botonHuespedes = new JButton("Huéspedes");
        botonReservaciones = new JButton("Reservaciones");
        botonSalida = new JButton("Salir");

        botonDashboard.addActionListener(this); // cuando se presiona avisa
    }

    private void organizarComponentes(){
        setLayout(new BorderLayout());
        panelMenu.setLayout(new GridLayout(5,1)); // cinco filas una columna
        panelMenu.add(botonDashboard);
        panelMenu.add(botonHabitaciones);
        panelMenu.add(botonHuespedes);
        panelMenu.add(botonReservaciones);
        panelMenu.add(botonSalida);

        panelContenido.setLayout(new BorderLayout());
        panelContenido.add(new JLabel("Bienvenido al sistema",SwingConstants.CENTER), BorderLayout.CENTER);

        add(panelMenu, BorderLayout.WEST);
        add(panelContenido,BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == botonDashboard) {
            panelContenido.removeAll();
            panelContenido.add(new DashboardPanel(), BorderLayout.CENTER);

            panelContenido.revalidate();
            panelContenido.repaint();
        }
    }








}
