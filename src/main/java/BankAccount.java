/**
 * Representa una Cuenta Bancaria con todos sus atributos
 *
 * @author
 */
public class BankAccount {
    /**
     *Representa el numero del cuenta de bancaria
     */
    private int accountNumber;
    /**
     *Representa el estado de cuenta de una pantalla (activa o inactiva)
     */
    protected boolean activated;


    /**
     * Crea una instancía de la clase Fruta
     */
    public BankAccount() {
    }

    /**
     * Crea una instancía de la clase Fruta con parametros
     *
     * @param accountNumber
     * @param activated
     */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    /**
     * Get y set son representan el acceso a las propiedades de los objetos
     *
     * @return
     */

    public int getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public boolean isActivated() {
        return activated;
    }


    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**Convertir a String (es decir, a una cadena de texto) cualquier objeto
     * @return
     */
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "accountNumber=" + accountNumber +
                ", activated=" + activated +
                '}';
    }
}
