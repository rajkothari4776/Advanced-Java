import java.awt.*;
import java.applet.*;

public class borderdemo extends Applet
{
    public void init()
    {
        Button b1= new Button("NORTH");
        Button b2= new Button("SOUTH");
        Button b3= new Button("EAST");
        Button b4= new Button("WEST");
        Button b5= new Button("CENTER");

        setLayout(new BorderLayout());
        add(b1,BorderLayout.NORTH);
        add(b2,BorderLayout.SOUTH);
        add(b3,BorderLayout.EAST);
        add(b4,BorderLayout.WEST);
        add(b5,BorderLayout.CENTER);


    }
}
/*<applet code="borderdemo" width=500 height=500></applet>*/

//Page 16 Border Layout