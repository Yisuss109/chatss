package Ejercicios_Libros;
// Los componentes JTextField y JPasswordField.
  import java.awt.FlowLayout;
  import java.awt.event.ActionEvent;
  import java.awt.event.ActionListener;
  import javax.swing.*;

public class CampoTextoMarco extends JFrame {
    private final JTextField CampoTexto1;// campo de texto con tamaño fijo
    private final JTextField campoTexto2; // campo de texto con texto
    private final JTextField campoTexto3; // campo de texto con texto y tamaño
    private final JPasswordField campoContrasenia; // campo de contraseña con texto
    //El constructor de CampoTextoMarco agrega objetos JTextField a JFrame
     public CampoTextoMarco(){
         super("Prueva de JTextField y JPsswordField");
         setLayout(new FlowLayout());
          // construye campo de texto con 10 columnas
          CampoTexto1 = new JTextField(10);
          add(CampoTexto1); // agrega campoTexto1 a JFrame
         // construye campo de texto con texto predeterminado
         campoTexto2 = new JTextField("Escriba el texto aqui");
         add(campoTexto2); // agrega campoTexto2 a JFrame
          // construye campo de texto con texto predeterminado y 21 columnas
         campoTexto3 = new JTextField("Campo de texto no editable",21);
         campoTexto3.setEditable(false); // deshabilita la edición
         add(campoTexto3); // agrega campoTexto3 a JFrame
         // construye campo de contraseña con texto predeterminado
         campoContrasenia = new JPasswordField("Texto oculto");
          add(campoContrasenia); // agrega campoContrasenia a JFrame

         // registra los manejadores de eventos
         ManejadorCampoTexto manejador = new ManejadorCampoTexto();
         CampoTexto1.addActionListener(manejador);
         campoTexto2.addActionListener(manejador);
         campoTexto3.addActionListener(manejador);
         campoContrasenia.addActionListener(manejador);
     }
    // clase interna privada para el manejo de eventos
    private class ManejadorCampoTexto implements ActionListener {
        // procesa los eventos de campo de texto
 @Override
 public void actionPerformed(ActionEvent evento){
    String cadena="";
     // el usuario oprimió Intro en el objeto JTextField campoTexto1
      if (evento.getSource() == CampoTexto1)
      cadena = String.format("CampoTexto1: %s",
              evento.getActionCommand());

      // el usuario oprimió Intro en el objeto JTextField campoTexto2
      else if (evento.getSource() == campoTexto2)
      cadena = String.format("campoTexto2: %s", evento.getActionCommand());

      // el usuario oprimió Intro en el objeto JTextField campoTexto3
      else if (evento.getSource() == campoTexto3)
      cadena = String.format("campoTexto3: %s", evento.getActionCommand());
      // el usuario oprimió Intro en el objeto JTextField campoContrasenia
      else if (evento.getSource() == campoContrasenia)
      cadena = String.format("campoContraseña: %s", evento.getActionCommand());

      // muestra el contenido del objeto JTextField
     JOptionPane.showMessageDialog(null, cadena);
        }
            }

}