import java.awt.*;
class radiobutton
{
    public static void main(String args[])
    {
        Frame  fr=new Frame("Program to display Radio button");
        fr.setSize(500,500);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
        CheckboxGroup cg=new CheckboxGroup();

       Checkbox b1=new Checkbox("English",cg,false);
       Checkbox b2=new Checkbox("Marathi",cg,false);
       Checkbox b3=new Checkbox("Hindi",cg,false);
       Checkbox b4=new Checkbox("Sanskrit",cg,false);
        
        fr.add(b1);
        fr.add(b2);
        fr.add(b3);
        fr.add(b4);
        
    }

}