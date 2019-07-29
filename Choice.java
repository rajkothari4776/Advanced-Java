import java.awt.*;
class Choice
{
    public static void main(String args[])
    {
        Frame  fr=new Frame("Program to display textfield, Textarea,button and label");
        fr.setSize(500,500);
        fr.setLayout(new FlowLayout());
        fr.setVisible(true);


        Label l1=new Label("Select City:");

        Choice city=new Choice();
        city.add("MUMBAI");
        city.add("GOA");
        city.add("DELHI");
        city.add("KOLKATA");
        city.add("CHENNAI");
        city.add("JAIPUR");
        city.add("PUNE");
        city.add("LONDON");
        city.add("PARIS");
        city.add("DUBAI");
        fr.add(l1);
        fr.add(city);
    }
}
