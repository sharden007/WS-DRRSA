/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import javax.swing.JTextArea;

/**
 *
 * @author shawn.harden
 */
public abstract class CustomOutputStream extends OutputStream {

    public CustomOutputStream(JTextArea jTextArea) { PrintStream printStream = new PrintStream(new CustomOutputStream(jTextArea) {
        
        
        @Override
        public void write(int i) throws IOException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });
    }
    
}
