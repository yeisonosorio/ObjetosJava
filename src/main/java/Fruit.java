import java.util.List;

/**Representa las frutas con diferentes atributos
 * @author
 */
public class Fruit {

    /**
     *Representa el nombre de la fruta
     */
    private String name;
    /**
     *Representa el peso de la fruta
     */
    private float averageWeight;
    /**
     *Representa una list de colores de la fruta
     */
    protected List<String> color;

    /**
     * Crea una instancía de la clase Fruta
     */
    public Fruit() {
    }

    /**
     * Crea una instancía de la clase Fruta con parametros
     *
     * @param name
     * @param averageWeight
     * @param color
     */
    public Fruit(String name, float averageWeight, List<String> color) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.color = color;
    }

    /**
     * Get y set son representan el acceso a las propiedades de los objetos
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAverageWeight() {
        return averageWeight;
    }

    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    public List<String> getColor() {
        return color;
    }

    public void setColor(List<String> color) {
        this.color = color;
    }


    /**
     * Convertir a String (es decir, a una cadena de texto) cualquier objeto
     * @return
     */
    @Override
    public String toString() {
        return "Fruta{" +
                "name='" + name + '\'' +
                ", averageWeight=" + averageWeight +
                ", color=" + color +
                '}';
    }
}
