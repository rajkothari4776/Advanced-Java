import java.awt.*;
import java.applet.*;

public class griddemo1 extends Applet
{
    public void init()
    {
        Button b1= new Button("b1");
        Button b2= new Button("b2");
        Button b3= new Button("b3");
        Button b4= new Button("b4");
        Button b5= new Button("b5");
        Button b6= new Button("b6");
        Button b7= new Button("b7");
        Button b8= new Button("b8");
        Button b9= new Button("b9");

        setLayout(new GridLayout(3,3));
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);


    }
}
/*applet code="griddemo1" width=500 height=500></applet>*/
