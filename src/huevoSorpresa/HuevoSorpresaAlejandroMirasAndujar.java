package huevoSorpresa;
/** Este es el Javadoc de la clase HuevoSorpresa
 * @author alex_
 * @version 1.0
 * @since 14 de mayo de 2024
 */
public class HuevoSorpresaAlejandroMirasAndujar {
    private int unidades;//número de huevos que quedan 
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    private double precio_max;//precio máximo que puede tener un huevo sorpresa
    
    /**
     * Constructor sin parámetros, por defecto
     */
public HuevoSorpresaAlejandroMirasAndujar(){}

/**
 * Este es el constructor con parámetros. El objeto, para instanciarse, necesita
 * recibir las unidades, el precio, la sorpresa que lleva dentro y el precio máximo
 * @param unidades las unidades que hay del objeto HuevoSorpresa
 * @param precio el precio del objeto HuevoSorpresa
 * @param sorpresa la sorpresa que lleva dentro el objeto HuevoSorpresa
 * @param precio_max el precio máximo del objeto HuevoSorpresa
 */
public HuevoSorpresaAlejandroMirasAndujar(int unidades, double precio, String sorpresa, double precio_max){
    this.unidades=unidades;
    this.precio=precio;
    this.sorpresa=sorpresa;
    this.precio_max=precio_max;
}

/**
 * Método que nos permite saber cuántas unidades hay de un objeto HuevoSorpresa
 * @return devuelve las unidades que hay de un objeto HuevoSorpresa
 */
public int obtenerUnidades(){return this.getUnidades();}

/**
 * Método que nos permite saber el precio del objeto HuevoSorpresa
 * @return devuelve el precio del objeto HuevoSorpresa
 */
public double obtenerPrecio(){return this.getPrecio();}

/**
 * Método que nos permite modificar las unidades de un objeto HuevoSorpresa
 * @param unidades hay que introducir el nuevo número de unidades del objeto
 * HuevoSorpresa
 */
public void modificarUnidades(int unidades){this.setUnidades(unidades);}

/**
 * Método que nos permite sacar huevos sorpresa 
 * @param unidades el número de huevos que queremos sacar
 * @param dinero el dinero que introducimos para sacar huevos
 * @param sorpresa la sorpresa que lleva dentro
 * @throws Exception salta la excepción si la cantidad de dinero es negativa, o no hay suficiente dinero o 
 * indicamos una cantidad negativa de huevos sorpresa
 */

public void sacarHuevosSorpresas(int unidades, double dinero, String sorpresa) throws Exception{
   if (dinero <= 0) {
   	throw new Exception("Se necesita una cantidad de dinero positiva");
        }
   if (dinero <(unidades * getPrecio())) {
   	throw new Exception("No tiene suficiente dinero");
        }
   if (unidades<= 0){
        throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
    }
    if( this.getUnidades()<unidades){
        throw new Exception("No hay suficientes huevos sorpresa en la tienda");
    }
    this.modificarUnidades(this.obtenerUnidades()-unidades);
}

/**
 * Método que nos permite aumentar el precio de los objetos HuevoSorpresa
 * @param aumento escribimos la cantidad que aumentará el precio del objeto HuevoSorpresa
 * @throws Exception salta la excepción si el aumento es negativo o superamos el precio máximo
 */
public void aumentarPrecio(double aumento) throws Exception{
    if(aumento <= 0) {
        throw new Exception("El aumento debe ser positivo");
    }
    if( getPrecio_max()<getPrecio() + aumento ){
        throw new Exception("No se puede superar el precio máximo");
    }
        setPrecio(getPrecio() + aumento);
}

    /** Método get para saber las unidades del objeto HuevoSorpresa
     * @return devuelve las unidades de objetos HuevoSorpresa
     */
    public int getUnidades() {
        return unidades;
    }

    /** Método que permite modificar las unidades del objeto HuevoSorpresa
     * @param unidades introducimos el nuevo número de unidades del objeto HuevoSorpresa
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /** Método que nos devuelve el precio del objeto HuevoSorpresa
     * @return devuelve el precio del objeto HuevoSorpresa
     */
    public double getPrecio() {
        return precio;
    }

    /** Método que nos permite modificar el precio del objeto HuevoSorpresa
     * @param precio introducimos el nuevo precio del objeto HuevoSorpresa
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /** Método que nos devuelve la sorpresa que lleva dentro el objeto HuevoSorpresa
     * @return devuelve la sorpresa que lleva dentro el objeto HuevoSorpresa
     */
    public String getSorpresa() {
        return sorpresa;
    }

    /** Método para modificar la sorpresa del objeto HuevoSorpresa
     * @param sorpresa escribimos la nueva sorpresa del objeto HuevoSorpresa
     */
    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    /** Método que nos devuelve el precio máximo del objeto HuevoSorpresa
     * @return nos devuelve el precio máximo del objeto HuevoSorpresa
     */
    public double getPrecio_max() {
        return precio_max;
    }

    /** Método para cambiar el precio máximo del objeto HuevoSorpresa
     * @param precio_max Escribimos el nuevo precio del objeto HuevoSorpresa
     */
    public void setPrecio_max(double precio_max) {
        this.precio_max = precio_max;
    }
}