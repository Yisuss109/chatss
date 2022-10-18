package Ejercicios_Libros;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;


public class MarcoSeleccionMultiple  extends JFrame{
    private final JList<String> listaJListColores;//list to save color names
    private final JList<String> listJListCopy;//list into which the color names are to be copied
    private  JButton buttonJButtonCopy; //button to copy selected names
    private static final String[] nameColors = {"Black","Blue","Cyan","Dark gray",
            "Gray","Green","Light grey","Magenta","Orange","Pink","Red","White","Yellow"};
    //Constructor of MultipleSelectionFrame
    public MarcoSeleccionMultiple(){
        super("Multiple choice lists");
        setLayout(new FlowLayout());
        listaJListColores = new JList<String>(nameColors);//color names list
        listaJListColores.setVisibleRowCount(5);//show five rows
        listaJListColores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(listaJListColores));//add list with scroll pane


        buttonJButtonCopy = new JButton("Copy>>>");
        buttonJButtonCopy.addActionListener(
                new ActionListener() //anonymous inner class
                {
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        //places selected values in listJListCopy
                        listJListCopy.setListData(
                                listaJListColores.getSelectedValuesList().toArray(new String[0]));
                    }
                }
        );
        add(buttonJButtonCopy);//add copy button to JFrame
        listJListCopy = new JList<String>();//list to save copied color names
        listJListCopy.setVisibleRowCount(5);//show 5 rows
        listJListCopy.setFixedCellWidth(100);//set the width
        listJListCopy.setFixedCellHeight(15);//set the height
        listJListCopy.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(listJListCopy));//add list with scroll pane
    }

    public MarcoSeleccionMultiple(JList<String> listaJListColores, JList<String> listJListCopy) {
        this.listaJListColores = listaJListColores;
        this.listJListCopy = listJListCopy;
    }
}
