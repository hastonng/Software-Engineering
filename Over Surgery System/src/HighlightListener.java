import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.event.*;
import javax.swing.text.JTextComponent;

public class HighlightListener implements  DocumentListener{
	
	
	JTextComponent comp = null;
    Border defaultBorder = null;
    Border hightlightB = BorderFactory.createLineBorder(java.awt.Color.RED);
    
    public HighlightListener(JTextComponent jtc) {
    	comp = jtc;
    	defaultBorder = comp.getBorder();
    	comp.getDocument().addDocumentListener(this);
    	this.maybeHighlight();
    }

    public void insertUpdate(DocumentEvent e) {
    	maybeHighlight();
    }
    
    public void removeUpdate(DocumentEvent e) {
    	maybeHighlight();
    }
    
    public void changedUpdate(DocumentEvent e) {
    	maybeHighlight();
    }
    
	private void maybeHighlight() {
		
		if(comp.getText().trim().length() > 0) {
			comp.setBorder(defaultBorder);
		}
		else
		{
			comp.setBorder(hightlightB);
		}
	}

   
}
