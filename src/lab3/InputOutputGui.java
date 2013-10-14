package lab3;

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
    public static final String NO_SPACE_ERR = "A full name must contain at space"
            + " between the first and last name.";

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
        catch(NoSpaceException nse) {
            JOptionPane.showMessageDialog(null, nse.getMessage(), ERR, JOptionPane.ERROR_MESSAGE);
        }
    }
     
}
