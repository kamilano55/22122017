/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Pretinho
 */
public class teclasPermitidas extends PlainDocument{
    @Override
    public void insertString(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{
        super.insertString(offset, str.toUpperCase().replaceAll("[^a-z|^A-Z|^ |^,|^ç]",""), attr);
    }
    
    public void replace(int offset, String str, javax.swing.text.AttributeSet attr)
    throws BadLocationException{
        super.insertString(offset, str.toUpperCase().replaceAll("[^a-z|^A-Z|^ |^,|^ç]",""), attr);
    }
    
}
