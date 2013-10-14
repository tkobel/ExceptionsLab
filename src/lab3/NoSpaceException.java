package lab3;

/**
 *
 * @author Tracy Kobel
 */
public class NoSpaceException extends Exception {
    private static final String MSG = "There must be a space between the first "
            + "and last name.";
    
    public NoSpaceException() {
        super(MSG);
    }
}
