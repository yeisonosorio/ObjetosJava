/**Representa los atriubutos de un Televisor
 * @author Yeison Osorio
 */
public class TV {
    /**
     * Representa la marca de la TV
     */
    private String brand;
    /**
     *Representa el modelo de la TV
     */
    private String model;
    /**
     *Representa las pulgadas de la TV
     */
    private String inches;

    /**
     * Crea una instancía de la clase Fruta
     */
    public TV() {
    }

    /**
     * Crea una instancía de la clase Fruta con parametros
     *
     * @param brand
     * @param model
     * @param inches
     */
    public TV(String brand, String model, String inches) {
        this.brand = brand;
        this.model = model;
        this.inches = inches;
    }

    /**
     * Get y set son representan el acceso a propiedades de los objetos
     * @return
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getInches() {
        return inches;
    }

    public void setInches(String inches) {
        this.inches = inches;
    }


    /**
     * Convertir a String (es decir, a una cadena de texto) cualquier objeto
     * @param model
     * @return
     */
    public String model(String model) {
        System.out.println("el modelo es LG");
        return null;
    }


}
