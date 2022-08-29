/**Representa una Motocicleta con sus diferentes atributos
 * @author Yeison Osorio
 */
public class Motorcycle {
    /**
     * Representa la marca de la motocicleta
     */
    protected String brand;
    /**
     *Representa el modelo de la motocicleta
     */
    protected int model;
    /**
     *Representa el cilindraje de la motocicleta
     */
    protected int cylinderCapacity;
    /**
     *Representa el valor del seguro de la motocicleta
     */
    protected double safeValue;

    /**
     * Crea una instancía de la clase Fruta
     */
    public Motorcycle() {
    }

    /**
     * Crea una instancía de la clase Fruta con parametros
     *
     * @param brand
     * @param model
     * @param cylinderCapacity
     * @param safeValue
     */
    public Motorcycle(String brand, int model, int cylinderCapacity, double safeValue) {
        this.brand = brand;
        this.model = model;
        this.cylinderCapacity = cylinderCapacity;
        this.safeValue = safeValue;
    }

    /**
     * Get y set son representan el acceso a las propiedades de los objetos
     * @return
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public double getSafeValue() {
        return safeValue;
    }

    public void setSafeValue(double safeValue) {
        this.safeValue = safeValue;
    }


    /**
     * Representa un metodo para calculcular del descuento del seguro dependiendo el modelo de la moticicleta y recibe como parametros el modelo y el cilindraje
     * @param model
     * @param cylinderCapacity
     * @return
     */
    public double secureDiscount(int model, int cylinderCapacity) {
        double discount = 0;

        if ( model >= 2000 ) && ( model < 2010 ) {
            discount = safeValue * 0.10;
        } else if ( model >= 2010 ) && ( model < 2020 ) {
            discount = safeValue * 0.20;
        } else {
            discount = safeValue * 0.30;
        }
        return discount;
    }
}
