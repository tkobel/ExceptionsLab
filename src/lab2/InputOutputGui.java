package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;
    public static final String ERR = "Error";
    public static final String AIOB_ERR = "The following index is out of bounds: ";

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        try {
            String fullName = JOptionPane.showInputDialog("Enter full name:");
            String lastName = nameService.extractLastName(fullName);
            String msg = "Your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        }
        catch (ArrayIndexOutOfBoundsException aiob) {
            JOptionPane.showMessageDialog(null, AIOB_ERR + aiob.getMessage(), ERR, JOptionPane.ERROR_MESSAGE);
        }
    }
     
}
