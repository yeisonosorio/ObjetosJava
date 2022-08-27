import java.util.Date;

/**Representa los atributos de una persona
 * @author Yeison Osorio
 */
public class Person {
    /**
     * Representa el nombre de la persona
     */
    private String name;

    /**
     *Representa el segundo nombre de la persona
     */
    private String lastName;

    /**
     *Representa el cumpleaños de la persona
     */
    private Date dateBirth;

    /**
     * Representa la altura de la persona
     */
    private float height;

    /**
     * Crea una instancía de la clase Fruta
     */
    public Person() {
    }

    /**
     * Crea una instancía de la clase Fruta con parametros
     *
     * @param name
     * @param lastName
     * @param dateBirth
     * @param height
     */
    public Person(String name, String lastName, Date dateBirth, float height) {
        this.name = name;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
        this.height = height;
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    /**Convertir a String (es decir, a una cadena de texto) cualquier objeto
     * @return
     */

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateBirth=" + dateBirth +
                ", height=" + height +
                '}';
    }
}
