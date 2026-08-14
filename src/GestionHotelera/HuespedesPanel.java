package GestionHotelera;
import javax.swing.*;
import java.awt.*;

public class HuespedesPanel extends JPanel{
    // texto
    private JLabel etiNombre;
    private JLabel etiApellido;
    private JLabel etiIdentificacion;
    private JLabel etiTelefono;
    private JLabel etiCorreo;
    private JLabel etiNacionalidad;

    // cuadro donde se escribe
    private JTextField camNombre;
    private JTextField camApellido;
    private JTextField camTelefono;
    private JTextField camIdentificacion;
    private JTextField camCorreo;

    // lista desplegable
    private JComboBox<String> comNacionalidad;

    private JButton botonNuevo;
    private JButton botonGuardar;
    private JButton botonEditar;
    private JButton botonEliminar;
    private JButton botonLimpiar;

    public HuespedesPanel(){

        crearComponentes();
        organizarComponentes();
    }

    private void crearComponentes(){
        etiNombre = new JLabel("Nombre:");
        etiApellido = new JLabel("Apellido:");
        etiIdentificacion = new JLabel("Identificación:");
        etiTelefono = new JLabel("Teléfono:");
        etiCorreo = new JLabel("Correo:");
        etiNacionalidad = new JLabel("Nacionalidad:");

        camNombre = new JTextField();
        camApellido = new JTextField();
        camIdentificacion = new JTextField();
        camTelefono = new JTextField();
        camCorreo = new JTextField();

        comNacionalidad = new JComboBox<>();
        comNacionalidad.addItem("Costa Rica");
        comNacionalidad.addItem("Panamá");
        comNacionalidad.addItem("Colombia");
        comNacionalidad.addItem("Paraguay");
        comNacionalidad.addItem("Canada");

        botonEditar = new JButton("Editar");
        botonNuevo = new JButton("Nuevo");
        botonEliminar = new JButton("Eliminar");
        botonGuardar = new JButton("Guarda");
        botonLimpiar = new JButton("Limpiar");
    }

    private void organizarComponentes(){
        setLayout(new GridLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(etiNombre,gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(camNombre,gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(etiApellido,gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(camNombre,gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(etiIdentificacion,gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(camIdentificacion,gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(etiTelefono,gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(camTelefono,gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(etiCorreo,gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(camCorreo,gbc);
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(etiNacionalidad,gbc);
        gbc.gridx = 1;
        gbc.gridy = 5;
        add(comNacionalidad,gbc);
    }

}
