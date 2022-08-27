/**Representa un Mouse con todos sus atributos
 * @author Yeison Osorio
 */
public class Mouse {

    /**
     *Representa el DPI de un moouse magnitud que se usa para medir la sensibilidad, cuanto más alto sea el DPI, más lejos se irá el cursor moviéndolo muy poco
     */
    private String dpi;
    /**
     *Representa el click derecho de un mouse
     */
    public String rightClick;
    /**
     *Representa el click izquierdo de un mouse
     */
    public String leftClick;
    /**
     *Representa La rueda de desplazamiento del mouse, el disco de plástico duro o goma dura
     */
    public String scrollWheel;

    /**
     * Crea una instancía de la clase Fruta
     */
    public Mouse() {
    }

    /**
     * Crea una instancía de la clase Fruta con parametros
     *
     * @param dpi
     * @param rightClick
     * @param leftClick
     * @param scrollWheel
     */
    public Mouse(String dpi, String rightClick, String leftClick, String scrollWheel) {
        this.dpi = dpi;
        this.rightClick = rightClick;
        this.leftClick = leftClick;
        this.scrollWheel = scrollWheel;
    }

    /**
     * Get y set son representan el acceso a las propiedades de los objetos
     * @return
     */
    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getRightClick() {
        return rightClick;
    }

    public void setRightClick(String rightClick) {
        this.rightClick = rightClick;
    }

    public String getLeftClick() {
        return leftClick;
    }

    public void setLeftClick(String leftClick) {
        this.leftClick = leftClick;
    }

    public String getScrollWheel() {
        return scrollWheel;
    }

    public void setScrollWheel(String scrollWheel) {
        this.scrollWheel = scrollWheel;
    }


    /**
     * Convertir a String (es decir, a una cadena de texto) cualquier objeto
     * @return
     */
    @Override
    public String toString() {
        return "Mouse{" +
                "dpi='" + dpi + '\'' +
                ", rightClick='" + rightClick + '\'' +
                ", leftClick='" + leftClick + '\'' +
                ", scrollWheel='" + scrollWheel + '\'' +
                '}';
    }
}
