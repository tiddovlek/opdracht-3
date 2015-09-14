package hoofdstuk8;

import java.applet.Applet;
import java.awt.TextField;

@SuppressWarnings("serial")
public class H123 extends Applet {
	TextField tekstvak;
	TextField tekstvak2;
    public void init() {
    tekstvak = new TextField("");
    tekstvak2 = new TextField("");
    
    add(tekstvak);
    add(tekstvak2);
    }
}


