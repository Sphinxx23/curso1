package Laberinto;

import java.util.Scanner;

public class Laberinto {

    //Este es nuestro inventario, la posicion 0 determina si tenemos la llave o no,
    // la posicion 1 es el codigo de la puerta de salida, la posicion 2 es las vidas que tenemos para probar el codigo de la puerta
    public static int[] inventario = {0, 0, 3};
    //Codigo de la puerta de salida
    public static int codigoPuerta = ((int) (Math.random() * (10000 - 1000) + 1000));

    /**
     * Generamos todo el mapa de laberinto
     *
     * @return Tabla de chars con todo el contenido del laberinto
     * (Paredes,salidas,cofre,llave)
     */
    //Generamos el mapa general del laberinto y el cofre y llave con una llamada a un metodo externo
    public static char[][] generarLaberinto() {
        char[][] mapa = {{'#', '#', '#', ' ', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                        {'#', '#', '#', 'S', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                        {'#', '#', ' ', 'X', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#', ' ', ' ', '#', '#', '#'},
                        {'#', '#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', '#'},
                        {'#', '#', ' ', '#', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', '#'},
                        {'#', '#', ' ', '#', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#'},
                        {'#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#', '#'},
                        {'#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', '#', '#', '#', '#', '#'},
                        {'#', '#', '#', '#', '#', '#', ' ', ' ', '#', '#', '#', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', '#'},
                        {'#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', '#'},
                        {'#', '#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#'},
                        {'#', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', '#', '#', '#', '#'},
                        {'#', '#', '#', '#', '#', '#', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', '#'},
                        {'#', '#', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', '#'},
                        {'#', '#', ' ', ' ', ' ', ' ', '#', ' ', ' ', '#', '#', ' ', ' ', '#', ' ', ' ', ' ', ' ', 'F', ' '},
                        {'#', '#', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', ' ', '#', '#'},
                        {'#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', ' ', ' ', ' ', ' ', '#', ' ', ' ', '#', '#'},
                        {'#', '#', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#', ' ', ' ', ' ', ' ', '#', '#', ' ', '#', '#'},
                        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                        {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#',}};
        generarRandom(mapa);
        return mapa;
    }

    /**
     * Nos modifica el mapa que hemos generado en generarLaberinto añadiendo el
     * cofre y la lleve en un lugar aleatorio cada partida (Comprobando que hay
     * un espacio en blanco antes de generar el objeto)
     *
     * @param mapa (Tabla de char con las paredes y las salidas)
     *
     */
    //Generacion random del cofre y de la llave, comprobando que no pueden sobreponerse entre ellos ni con ninguna pared
    public static void generarRandom(char[][] mapa) {
        int aux1, aux2;
        do {
            aux1 = (int) (Math.random() * (18 - 3) + 3);
            aux2 = (int) (Math.random() * (18 - 3) + 3);
        } while (!(hayVacio(mapa, aux1, aux2)));
        mapa[aux1][aux2] = 'K';

        do {
            aux1 = (int) (Math.random() * (18 - 3) + 3);
            aux2 = (int) (Math.random() * (18 - 3) + 3);
        } while (!(hayVacio(mapa, aux1, aux2)));
        mapa[aux1][aux2] = 'C';

    }


    /*
    //Muestra el mapa completo
    public static void mostrarMatrizPorPantalla(char[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j] + "   ");
            }
            System.out.println("");
        }
    }

     */
    /**
     * Muestra un espacio de 3 x 3 de la vision del jugador en el laberinto
     *
     * @param mapa tabla de char que contiene todo el mapa del laberinto
     * @param posicion array de String que contiene la fila y la columna en la
     * que esta el jugador
     *
     */
    //Muestra una porcion 3x3 del mapa dependiendo de la posicion en la que se encuentre el jugador
    public static void mostrarMatrizReducida(char[][] mapa, String[] posicion) {
        int auxX, auxY;

        auxX = (Integer.parseInt(posicion[0]) - 1);
        auxY = (Integer.parseInt(posicion[1]) - 1);

        for (int i = auxX; i < auxX + 3; i++) {
            for (int j = auxY; j < auxY + 3; j++) {
                System.out.print(mapa[i][j] + "   ");
            }
            System.out.println("");
        }
    }

    /**
     * Pedimos la direccion o accion al usuario
     *
     * @param mapa tabla de char que contiene todo el mapa del laberinto
     * @return variable de tipo int que controla el fin del juego, si auxN = 0
     * el jugador sigue en el laberinto si auxN=-1 el laberinto termina
     */
    //Pedimos al usuario su proxima acción/movimiento y comprobamos la entrada
    public static int pedirDireccion(char[][] mapa) {
        int auxN = 0;
        String recoger;
        char accion = ' ';
        Scanner escaner = new Scanner(System.in);
        do {
            System.out.println("¿Quieres moverte?(I=Izquierda,D=Derecha,A=Arriba,B=Abajo) o realizar una accion (N=Ver inventario)");
            recoger = escaner.nextLine();
            if (!recoger.isEmpty()) {
                accion = recoger.charAt(0);
                accion=Character.toUpperCase(accion);
            } else {
                System.out.println("Introduce una letra");
                continue; //Este continue es porque si la cadena introducida esta vacía, revienta el programa
            }
        } while (accion != 'I' && accion != 'D' && accion != 'A' && accion != 'B' && accion != 'N');
        auxN = movimiento(accion, mapa);

        return auxN;
    }

    /**
     * Consigue la posicion de el jugador (Fila y columna) y los junta en un
     * String
     *
     * @param mapa tabla de char que contiene todo el mapa del laberinto
     * @return variable de tipo String que contiene la fila y la columna del
     * jugador
     */
    //Recogemos la posicion recorriendonos la matriz, una vez recogida concateno en un StringBuilder y lo devuelvo en forma de String para usar la posicion posteriormente
    public static String controlPosicion(char[][] mapa) {
        StringBuilder aux = new StringBuilder();
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == 'X') {
                    aux.append(i + "," + j);
                }
            }
        }
        return aux.toString();
    }

    /**
     * Separa un string para meterlo en un array (El separador en el string debe
     * ser una ',')
     *
     * @param cadAux String que contiene la fila y la columna de el jugador
     * @return un array de string con la fila en la posicion 0 y la columna en
     * la posicion 1
     */
    //Hacemos split del String que viene de controlPosicion para obtener un array de Strings y
    // manejarlo más facil en los movimientos luego
    public static String[] posSplit(String cadAux) {
        String[] splitCad;
        splitCad = cadAux.split(",");
        return splitCad;
    }

    /**
     * Comprueba si hay una pared en la posicion que se le envia (fila,columna)
     *
     * @param mapa tabla de char que contiene todo el mapa del laberinto
     * @param fila int que contiene la fila
     * @param columna int que contiene la columna
     * @return true si hay una pared y false si no hay una pared
     */
    //Método para comprobar si hay pared (#) antes de realizar movimiento
    public static boolean hayPared(char[][] mapa, int fila, int columna) {
        if (mapa[fila][columna] == '#') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Comprueba si hay una llave en la posicion que se le envia (fila,columna)
     *
     * @param mapa tabla de char que contiene todo el mapa del laberinto
     * @param fila int que contiene la fila
     * @param columna int que contiene la columna
     * @return true si hay una llave y false si no hay llave
     */
    //Método para comprobar si hay llave (K) antes de realizar movimiento
    public static boolean hayLlave(char[][] mapa, int fila, int columna) {
        if (mapa[fila][columna] == 'K') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Comprueba si hay un cofre en la posicion que se le envia (fila,columna)
     *
     * @param mapa tabla de char que contiene todo el mapa del laberinto
     * @param fila int que contiene la fila
     * @param columna int que contiene la columna
     * @return true si hay un cofre y false si no hay cofre
     */
    //Método para comprobar si hay cofre (C) antes de realizar movimiento
    public static boolean hayCofre(char[][] mapa, int fila, int columna) {
        if (mapa[fila][columna] == 'C') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Comprueba si hay una puerta de final en la posicion que se le envia
     * (fila,columna)
     *
     * @param mapa tabla de char que contiene todo el mapa del laberinto
     * @param fila int que contiene la fila
     * @param columna int que contiene la columna
     * @return true si hay una puerta de final y false si no hay puerta de final
     */
    //Método para comprobar si hay salida (F) antes de realizar movimiento
    public static boolean hayFinal(char[][] mapa, int fila, int columna) {
        if (mapa[fila][columna] == 'F') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Comprueba si hay una salida en la posicion que se le envia (fila,columna)
     *
     * @param mapa tabla de char que contiene todo el mapa del laberinto
     * @param fila int que contiene la fila
     * @param columna int que contiene la columna
     * @return true si hay una salida y false si no hay salida
     */
    //Método para comprobar si hay salida (rendición) (S) antes de realizar movimiento
    public static boolean haySalida(char[][] mapa, int fila, int columna) {
        if (mapa[fila][columna] == 'S') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Comprueba si hay una espacio en blanco en la posicion que se le envia
     * (fila,columna)
     *
     * @param mapa tabla de char que contiene todo el mapa del laberinto
     * @param fila int que contiene la fila
     * @param columna int que contiene la columna
     * @return true si hay espacio en blanco y false si no lo hay
     */
    //Método para comprobar si hay espacio en blanco (al que poder moderse) antes de realizar movimiento
    public static boolean hayVacio(char[][] mapa, int fila, int columna) {
        if (mapa[fila][columna] == ' ') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Cambia la posicion 0 (La llave) a 1 del array inventario cuando
     * encontramos la llave
     */
    //Al moverse a la casilla de la llave (K) la recoges y cambia el inventario [0] a 1, para indicar que ya la has recogido
    public static void conseguirLlave() {
        System.out.println("Has encontrado la llave");
        inventario[0] = 1;
    }

    /**
     * Cambia la posicion 1 (Codigo de la puerta) a el codigo generado al
     * ejecutar el laberinto del array inventario cuando abrimos el cofre,
     * tambien resta 1 a la posicion de las llaves (0) y nos muestra por
     * pantalla el codigo
     */
    //Al moverse a la casilla del cofre y tener la llave, se abre y nos muestra la clave de 4 dígitos para abrir la puerta
    public static void abrirCofre() {
        inventario[1] = codigoPuerta;
        inventario[0] = 0;
        System.out.println("Has encontrado un cofre, lo abres con la llave que llevas y dentro hay papel con una combinacion " + inventario[1]);
    }

    /**
     * Mueve al jugador horizontalmente a la posicion que llega desde cada uno
     * de los metodos de movimiento
     *
     * @param aux1 int que contiene la fila
     * @param aux2 int que contiene la columna a la que queremos desplazarnos
     * (-1 cuando queremos ir a la izquierda +1 cuando queremos ir a la derecha)
     * @param aux3 int que contiene la columna
     * @param mapa tabla de char que contiene todo el mapa del laberinto
     */
    //Realizar los diferentes movimientos intercambiando posicion del personaje (X) con espacio vacío ( )
    public static void realizarMovimientoHorizontal(int aux1, int aux2, int aux3, char[][] mapa) {
        mapa[aux1][aux3] = ' ';
        mapa[aux1][aux2] = 'X';
    }

    /**
     * Mueve al jugador verticalmente a la posicion que llega desde cada uno de
     * los metodos de movimiento
     *
     * @param aux1 int que contiene la fila a la que queremos desplazarnos (-1
     * cuando queremos ir arriba +1 cuando queremos ir abajo)
     * @param aux2 int que contiene la columna
     * @param aux3 int que contiene la fila
     * @param mapa tabla de char que contiene todo el mapa del laberinto
     */
    public static void realizarMovimientoVertical(int aux1, int aux2, int aux3, char[][] mapa) {
        mapa[aux3][aux2] = ' ';
        mapa[aux1][aux2] = 'X';
    }

    /**
     * Concentra todas las llamadas a los metodos de reconocimiento cuando el
     * jugador quiere moverse hacia la izquierda
     *
     * @param mapa tabla de char que contiene todo el mapa del laberinto
     * @param posicion array de String que contiene la fila y la columna en la
     * que esta el jugador
     * @return variable de tipo int que controla el fin del juego, si auxN = 0
     * el jugador sigue en el laberinto si auxN=-1 el laberinto termina
     */
    //Comprobaciones para moverse a la izquierda o no recibiendo la posición actual del jugador
    public static int moverJugadorIzq(char[][] mapa, String[] posicion) {
        int auxN = 0;
        int aux1 = Integer.parseInt(posicion[0]);
        int aux2 = Integer.parseInt(posicion[1]) - 1;
        int aux3 = Integer.parseInt(posicion[1]);

        if (hayPared(mapa, aux1, aux2)) { //Se comprueba si hay pared, para no realizar el movimiento
            System.out.println("Hay pared");
        } else if (hayLlave(mapa, aux1, aux2)) { //Se comprueba si hay llave para cogerla y reemplazarla al realizar movimiento
            conseguirLlave();
            realizarMovimientoHorizontal(aux1, aux2, aux3, mapa);
        } else if (hayCofre(mapa, aux1, aux2)) { //Se comprueba si hay cofre, si no tienes la llave todavía salta un aviso y si la tiene, abre el cofre y realiza el movimiento
            if (inventario[0] == 1) {
                realizarMovimientoHorizontal(aux1, aux2, aux3, mapa);
                abrirCofre();
            } else {
                System.out.println("Has encontrado un cofre, pero no tienes llave con que abrirlo");
            }
        } else if (hayVacio(mapa, aux1, aux2)) { //Comprueba si hay espacio en blanco para poder realizar el movimiento
            System.out.println("Avanzas hacia la izquierda");
            realizarMovimientoHorizontal(aux1, aux2, aux3, mapa);
        } else if (hayFinal(mapa, aux1, aux2)) { //Comprueba si hay salida (F) para dar paso al método de salidaF
            auxN = salidaF();
        } else if (haySalida(mapa, aux1, aux2)) { //Comprueba si hay salida de rendición (S) y da paso al método de salidaS
            auxN = salidaS();
        }
        return auxN;
    }

    /**
     * Concentra todas las llamadas a los metodos de reconocimiento cuando el
     * jugador quiere moverse hacia la derecha
     *
     * @param mapa tabla de char que contiene todo el mapa del laberinto
     * @param posicion array de String que contiene la fila y la columna en la
     * que esta el jugador
     * @return variable de tipo int que controla el fin del juego, si auxN = 0
     * el jugador sigue en el laberinto si auxN=-1 el laberinto termina
     */
    //Comprobaciones para moverse a la derecha o no recibiendo la posición actual del jugador
    public static int moverJugadorDcha(char[][] mapa, String[] posicion) {
        int auxN = 0;
        int aux1 = Integer.parseInt(posicion[0]);
        int aux2 = Integer.parseInt(posicion[1]) + 1;
        int aux3 = Integer.parseInt(posicion[1]);

        if (hayPared(mapa, aux1, aux2)) { //Se comprueba si hay pared, para no realizar el movimiento
            System.out.println("Hay pared");
        } else if (hayLlave(mapa, aux1, aux2)) { //Se comprueba si hay llave para cogerla y reemplazarla al realizar movimiento
            conseguirLlave();
            realizarMovimientoHorizontal(aux1, aux2, aux3, mapa);
        } else if (hayCofre(mapa, aux1, aux2)) { //Se comprueba si hay cofre, si no tienes la llave todavía salta un aviso y si la tiene, abre el cofre y realiza el movimiento
            if (inventario[0] == 1) {
                realizarMovimientoHorizontal(aux1, aux2, aux3, mapa);
                abrirCofre();
            } else {
                System.out.println("Has encontrado un cofre, pero no tienes llave con que abrirlo");
            }
        } else if (hayVacio(mapa, aux1, aux2)) { //Comprueba si hay espacio en blanco para poder realizar el movimiento
            System.out.println("Avanzas hacia la derecha");
            realizarMovimientoHorizontal(aux1, aux2, aux3, mapa);
        } else if (hayFinal(mapa, aux1, aux2)) { //Comprueba si hay salida (F) para dar paso al método de salidaF
            auxN = salidaF();
        } else if (haySalida(mapa, aux1, aux2)) { //Comprueba si hay salida de rendición (S) y da paso al método de salidaS
            auxN = salidaS();
        }

        return auxN;
    }

    /**
     * Pide al jugador el codigo de la puerta para comprobarlo, si lo acierta
     * sale del laberinto si no lo acierta le quita una vida
     *
     * @return variable de tipo int que controla el fin del juego, si auxN = 0
     * el jugador sigue en el laberinto si auxN=-1 el laberinto termina
     */
    //En la salida (F) pide la clave numérica, si la aciertas terminas y ganas la partida,
    // por cada intento fallido pierdes una vida, si pierdes todas termina la partida y muestra la clave correcta
    public static int salidaF() {
        int auxN = 0;
        Scanner escaner = new Scanner(System.in);
        int digitosContra;

        do {
            System.out.println("Has encontrado la salida, introduce la contraseña de 4 DÍGITOS para comprobar si es correcta");
            while (!escaner.hasNextInt()) {
                System.out.println("Por favor, introduce solo números, no pierdes ninguna vida");
                escaner.next(); // Consumir la entrada no válida (como un String)
            }
            digitosContra = escaner.nextInt();
        } while (digitosContra < 1000 || digitosContra > 9999);

        if (digitosContra == codigoPuerta) {
            System.out.println("Enhorabuena, has finalizado el juego!!");
            auxN = -1;
        } else {
            inventario[2]--;
            System.out.println("Clave incorrecta, has perdido 1 vida (Vidas restantes = " + inventario[2] + ")");
        }
        if (inventario[2] == 0) {
            System.out.println("Has perdido todas tus vidas, FIN DEL JUEGO (El codigo de la puerta era: " + codigoPuerta + ")");
        }
        return auxN;
    }

    /**
     * Pide al jugador un string, si el jugador dice si abandona el juego
     * cambiando la variable auxN a -1 si dice que no continua en el juego
     * quedandose en el laberinto
     *
     * @return variable de tipo int que controla el fin del juego, si auxN = 0
     * el jugador sigue en el laberinto si auxN=-1 el laberinto termina
     */
    //En la salida de rendición (S) pregunta al usuario si rendirse, si escribe "Si" finaliza partida,
    // cualquier otra cosa lo mantiene en la misma partida
    public static int salidaS() {
        int auxN = 0;
        Scanner escaner = new Scanner(System.in);
        String respuesta;

        System.out.println("Deseas rendirte? Introduce 'Si' para hacerlo, cualquier otro texto te mantendra en la partida");
        respuesta = escaner.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Gracias por intentarlo, otra vez sera...");
            auxN = -1;
        } else {
            System.out.println("Sigues en la partida, Suerte compañero!!");
        }
        return auxN;
    }

    /**
     * Concentra todas las llamadas a los metodos de reconocimiento cuando el
     * jugador quiere moverse hacia abajo
     *
     * @param mapa tabla de char que contiene todo el mapa del laberinto
     * @param posicion array de String que contiene la fila y la columna en la
     * que esta el jugador
     * @return variable de tipo int que controla el fin del juego, si auxN = 0
     * el jugador sigue en el laberinto si auxN=-1 el laberinto termina
     */
    //Comprobaciones para moverse hacia abajo o no recibiendo la posición actual del jugador
    public static int moverJugadorAbjo(char[][] mapa, String[] posicion) {
        int auxN = 0;
        int aux1, aux2, aux3;
        aux1 = (Integer.parseInt(posicion[0]) + 1);
        aux2 = (Integer.parseInt(posicion[1]));
        aux3 = (Integer.parseInt(posicion[0]));

        if (hayPared(mapa, aux1, aux2)) { //Se comprueba si hay pared, para no realizar el movimiento
            System.out.println("Hay pared");
        } else if (hayLlave(mapa, aux1, aux2)) { //Se comprueba si hay llave para cogerla y reemplazarla al realizar movimiento
            conseguirLlave();
            realizarMovimientoVertical(aux1, aux2, aux3, mapa);
        } else if (hayCofre(mapa, aux1, aux2)) { //Se comprueba si hay cofre, si no tienes la llave todavía salta un aviso y si la tiene, abre el cofre y realiza el movimiento
            if (inventario[0] == 1) {
                realizarMovimientoVertical(aux1, aux2, aux3, mapa);
                abrirCofre();
            } else {
                System.out.println("Has encontrado un cofre, pero no tienes llave con que abrirlo");
            }
        } else if (hayVacio(mapa, aux1, aux2)) { //Comprueba si hay espacio en blanco para poder realizar el movimiento
            System.out.println("Avanzas hacia abajo");
            realizarMovimientoVertical(aux1, aux2, aux3, mapa);
        } else if (hayFinal(mapa, aux1, aux2)) { //Comprueba si hay salida (F) para dar paso al método de salidaF
            auxN = salidaF();
        } else if (haySalida(mapa, aux1, aux2)) { //Comprueba si hay salida de rendición (S) y da paso al método de salidaS
            auxN = salidaS();
        }
        return auxN;
    }

    /**
     * Concentra todas las llamadas a los metodos de reconocimiento cuando el
     * jugador quiere moverse hacia arriba
     *
     * @param mapa tabla de char que contiene todo el mapa del laberinto
     * @param posicion array de String que contiene la fila y la columna en la
     * que esta el jugador
     * @return variable de tipo int que controla el fin del juego, si auxN = 0
     * el jugador sigue en el laberinto si auxN=-1 el laberinto termina
     */
    //Comprobaciones para moverse hacia arriba o no recibiendo la posición actual del jugador
    public static int moverJugadorArrba(char[][] mapa, String[] posicion) {
        int auxN = 0;
        int aux1, aux2, aux3;
        aux1 = (Integer.parseInt(posicion[0]) - 1);
        aux2 = (Integer.parseInt(posicion[1]));
        aux3 = (Integer.parseInt(posicion[0]));

        if (hayPared(mapa, aux1, aux2)) { //Se comprueba si hay pared, para no realizar el movimiento
            System.out.println("Hay pared");
        } else if (hayLlave(mapa, aux1, aux2)) { //Se comprueba si hay llave para cogerla y reemplazarla al realizar movimiento
            conseguirLlave();
            realizarMovimientoVertical(aux1, aux2, aux3, mapa);
        } else if (hayCofre(mapa, aux1, aux2)) { //Se comprueba si hay cofre, si no tienes la llave todavía salta un aviso y si la tiene, abre el cofre y realiza el movimiento
            if (inventario[0] == 1) {
                realizarMovimientoVertical(aux1, aux2, aux3, mapa);
                abrirCofre();
            } else {
                System.out.println("Has encontrado un cofre, pero no tienes llave con que abrirlo");
            }
        } else if (hayVacio(mapa, aux1, aux2)) { //Comprueba si hay espacio en blanco para poder realizar el movimiento
            System.out.println("Avanzas hacia arriba");
            realizarMovimientoVertical(aux1, aux2, aux3, mapa);
        } else if (hayFinal(mapa, aux1, aux2)) { //Comprueba si hay salida (F) para dar paso al método de salidaF
            auxN = salidaF();
        } else if (haySalida(mapa, aux1, aux2)) { //Comprueba si hay salida de rendición (S) y da paso al método de salidaS
            auxN = salidaS();
        }
        return auxN;
    }

    /**
     * Comprueba la accion introducica por el usuario en el metodo
     * pedirDireccion y dependiendo la indicada llama a los metodos
     * correspondientes
     *
     * @param movUsuario char que cotiene el movimiento o la accion dada por el
     * usuario
     * @param mapa tabla de char que contiene todo el mapa del laberinto
     * @return variable de tipo int que controla el fin del juego, si auxN = 0
     * el jugador sigue en el laberinto si auxN=-1 el laberinto termina
     */
    // Comprueba la dirección o acción que ha escrito el usuario anteriormente y llama a el método correspondiente
    public static int movimiento(char movUsuario, char[][] mapa) {
        String[] array;
        String aux, verInventario;
        int auxN = 0;
        aux = controlPosicion(mapa);
        array = posSplit(aux);
        switch (movUsuario) {
            case 'I':
                auxN = moverJugadorIzq(mapa, array);
                break;
            case 'D':
                auxN = moverJugadorDcha(mapa, array);
                break;
            case 'A':
                auxN = moverJugadorArrba(mapa, array);
                break;
            case 'B':
                auxN = moverJugadorAbjo(mapa, array);
                break;
            case 'N':
                verInventario = verInventario();
                System.out.println(verInventario);
                break;
        }
        return auxN;
    }

    /**
     * Analiza el inventario del jugador y mete todo en un String para
     * posteriormente monstrarlo por pantalla
     *
     * @return String que contiene todos los elementos del inventario para ser
     * mostrado posteriormente
     */
    //En caso que el usuario escriba la acción N le muestra su inventario, primero le muestra si tiene la llave o no
    // luego le muesta si tiene el papel con la contraseña y por ultimo le muestra las vidas restantes
    private static String verInventario() {
        StringBuilder verInventario = new StringBuilder();

        verInventario.append("Tu inventario:\n");
        if (inventario[0] == 0) // Slot de la llave
        {
            verInventario.append("Llave: Vacío\n");
        } else {
            verInventario.append("Llave: x" + inventario[0] + "\n");
        }
        if (inventario[1] == 0) // Slot de el codigo
        {
            verInventario.append("Código: _ _ _ _ \n");
        } else {
            verInventario.append("Papel con la contraseña: " + inventario[1] + "\n");
        }
        verInventario.append("Vidas restantes: " + inventario[2]);

        return verInventario.toString();
    }

    public static void main(String[] args) {
        int auxN = 0;
        char[][] mapa;
        String[] tempSplit;
        mapa = generarLaberinto();
        do {
            //mostrarMatrizPorPantalla(mapa);
            tempSplit = posSplit(controlPosicion(mapa));
            mostrarMatrizReducida(mapa, tempSplit);
            auxN = pedirDireccion(mapa);
        } while (auxN == 0 && inventario[2] > 0);
    }
}
