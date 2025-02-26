import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame; //Importación de la clase JFrame
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class FrmJuego extends JFrame { //JFrame es una clase de java heredada por FrmJuego

    public FrmJuego(){ //Este es el método que llama la extension new creada en la clase "App".
       
        //--- CREAR VENTANA DE LA INTERFAZ ---//
        setSize(500,200); //Sirve para definir el tamaño de la ventana en pixeles para cuando se inicie el programa. "setSize" hace alución a que es un método del JFrame, pr eso no fue necesario empezar con "this."
        setTitle("Juguemos a los dados");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Para que cuando cierre la ventana se cierre el programa automaticamente.
        setLayout(null);// Como mas adelante se querrá darle las coordenadas en las que se ubicaran las imagenes y que no salga la distribucion que se tiene por defecto se usa esta instruccion para no tener inconvenientes con la definicion de las ubicaciones de las imagenes en la ventana.

        //--- DISEÑO DE LA INTERFAZ ---//
        //Se usarán etiquetas, las cuales se encuentran en la clase JLabel y botones que son objetos de la clase JButton, la cantidad de etiquetas y de botones que se necesiten los determina la cantidad que se requieran en la ventana de la APP.

        //---- ETIQUETAS ---//
        JLabel lblDado1 = new JLabel(); //Creación de un objetos de la clase JLabel, nombrado como lblDado1, instanciado como un JLabel, recordar importar JLabel, este JLabel se está declarando para mostrar la imagen de un dado, por lo que se debe crear una carpeta dentro de "src" llamada imagenes y pegar en ella las imagenes que se van a utilizar

        String nombreImagen="/imagenes/1.jpg";// Para poder cargar la imagen de un dado debo tener el nombre de la imagene, por lo tatno se declara una variable de tipo Strring con el nombre de ese archivo.

        //--- CARGAR LA IMAGEN ---//
        ImageIcon imagen=new ImageIcon(getClass().getResource(nombreImagen)); //Clase de java para cargar la imagen, para guardar el nombre del archivo se crea una instancia de la clase con el método constructor con "new ImageIcon" y se le pasa como parámetro en el parentesis la imagen que se quiere mostrar mediante la instruccion getClass().getResource(nombre imagen) dentro del parentesis


        //--- ASIGNAR LA IMAGEN A LA ETIQUETA ---//
        lblDado1.setIcon(imagen);//mediante la instruccipón anterior se cargo la imagen, luego esta se lleva al JLabel mediante la instruccion setIcon. Para poder mostrar la imagen se deben trabajar dos instrucciones 1.Los bounds (ancho y alto), coordenadas donde se ubicará la imagen en la ventana y el ancho se puede definir con la instruccion nombre imagen.getIconWidth() y el alto con la instruccion con nombre imagen.getIconHeigth().

        lblDado1.setBounds(10,10,imagen.getIconWidth(), imagen.getIconHeight());
        getContentPane().add(lblDado1);//El último paso para hacer aparecer la imagen requiere del uso de la instruccion getContentPane que trae el panel de la ventana y el método a agregar.

        //El diseño de la venta requiere otro Label (Otra figura de un dado)
        JLabel lblDado2=new JLabel();
        lblDado2.setIcon(imagen);
        lblDado2.setBounds(10 + imagen.getIconWidth(), 10, imagen.getIconWidth(), imagen.getIconHeight()); // Para la altura del otro dado se coloca a la misma del anterior y se le suma el ancho del anterior
        getContentPane().add(lblDado2);

        //--- ETIQUETA PARA EL TITULO DE LOS LANZAMIENTOS ---//
        JLabel lblTitulo1 = new JLabel ("Lanzamientos");
        lblTitulo1.setBounds(50 + 2*imagen.getIconWidth(), 10, 100, 25);
        lblTitulo1.setHorizontalAlignment(SwingConstants.CENTER); //Centrar el titulo, "SwingConstants" es la instruccioón que sirve para definir la horientacion del texto
        getContentPane().add(lblTitulo1);

        JLabel lblTitulo2 = new JLabel ("Cenas");
        lblTitulo2.setBounds(160 + 2*imagen.getIconWidth(), 10, 100, 25);
        lblTitulo2.setHorizontalAlignment(SwingConstants.CENTER); 
        getContentPane().add(lblTitulo2);

        // --------------------------------------------------------------------------------------------------//

        //Instancias de la cantidad de lanzaminetos y cenas
        JLabel lblLanzamientos = new JLabel();
        lblLanzamientos.setBounds(50 + 2*imagen.getIconWidth(),40,100,100); //Coordenadas ancho y largo del objetos, debajo del titulo de lanzamientos, entonces la x es igual que la del titulo de lanzamiento, ancho ajustado segun la necesidad.

        //Cambiar el color del fondo
        lblLanzamientos.setBackground(new Color(0,0,0));//Las 3 coordenadas hacen referencia a los 3 pixeles que se necesitan para definir un color "0,0,0" significa fondo negro

        //Cambiar el color de la letra
        lblLanzamientos.setForeground(new Color(51, 255, 0));//(51, 255, 0) forman un verde chillon

        //Cambiar tipo de letra
        lblLanzamientos.setFont(new Font("Tahoma",1,72));//Estilo, negrita y tamaño

        //Mostrar el texto inicial que quiero que aparezca al iniciar el juego, o sea, cero.
        lblLanzamientos.setText("0");

        //Alineacion del texto a la derecha
        lblLanzamientos.setHorizontalAlignment(SwingConstants.RIGHT);

        //Colocar el texto opaco
        lblLanzamientos.setOpaque(true); //Para que el fondo del contador aparezca negro

        getContentPane().add(lblLanzamientos);



        JLabel lblCenas = new JLabel();
        lblCenas.setBounds(160 + 2*imagen.getIconWidth(),40,100,100);
        lblCenas.setBackground(new Color(0,0,0));
        lblCenas.setForeground(new Color(51, 255, 0));
        lblCenas.setFont(new Font("Tahoma",1,72));
        lblCenas.setText("0");
        lblCenas.setHorizontalAlignment(SwingConstants.RIGHT);
        lblCenas.setOpaque(true);
        getContentPane().add(lblCenas);
        

        // --------------------------------------------------------------------------------------------------//

        //Agregar los botones
        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(10,15 + imagen.getIconHeight(),100,25);
        getContentPane().add(btnIniciar);

        JButton btnLanzar = new JButton("Lanzar");
        btnLanzar.setBounds(10,45 + imagen.getIconHeight(),100,25);
        getContentPane().add(btnLanzar);

    }

}
