package GestionHotelera;
import javax.swing.*;
import java.awt.*;

public class DashboardPanel extends JPanel {

    private JPanel tarjetaDisponibles;
    private JPanel tarjetaOcupadas;
    private JPanel tarjetaReservadas;
    private JPanel tarjetaIngresos;

    public DashboardPanel(){
        crearComponentes();
        organizarComponenetes();
    }

    private void crearComponentes(){
        tarjetaDisponibles = new JPanel();
        tarjetaOcupadas = new JPanel();
        tarjetaReservadas = new JPanel();
        tarjetaIngresos = new JPanel();
    }

    private void organizarComponenetes(){
        setLayout(new GridLayout(2,2,15,15));
        tarjetaDisponibles.add(new JLabel("Habitaciones disponibles: 10"));
        tarjetaOcupadas.add(new JLabel("Habitaciones ocupadas: 5"));
        tarjetaReservadas.add(new JLabel("Reservaciones activas: 8"));
        tarjetaIngresos.add(new JLabel("Ingresos: ₡850000"));

        add(tarjetaDisponibles);
        add(tarjetaOcupadas);
        add(tarjetaReservadas);
        add(tarjetaIngresos);
    }

}
