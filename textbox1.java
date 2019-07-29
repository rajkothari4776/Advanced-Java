import java.awt.*;
class textbox1
{
    public static void main(String args[])
    {
        Frame  fr=new Frame("Program to display textfield, Textarea,button and label");
        fr.setSize(500,500);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);
        Label l1=new Label("Enter your name:");
        TextField t1= new TextField(10);
        Label l2= new Label("Enter your Address:");
        TextArea t2= new TextArea(10,20);
        Button b1=new Button("Submit");
        fr.add(l1);
        fr.add(t1);
        fr.add(l2);
        fr.add(t2);
        fr.add(b1);
    }

}