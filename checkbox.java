import java.awt.*;
class checkbox
{
    public static void main(String args[])
    {
        Frame  fr=new Frame("Program to display textfield, Textarea,button and label");
        fr.setSize(500,500);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
       Checkbox b1=new Checkbox("English");
       Checkbox b2=new Checkbox("Marathi");
       Checkbox b3=new Checkbox("Hindi");
       Checkbox b4=new Checkbox("Sanskrit");
        
        fr.add(b1);
        fr.add(b2);
        fr.add(b3);
        fr.add(b4);
        
    }

}