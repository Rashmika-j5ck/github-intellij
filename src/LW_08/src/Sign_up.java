
import javax.swing.*;
import java.awt.*;



public class Sign_up extends JFrame{

    JTextField suname,suemail;
    JPasswordField supass;
    JRadioButton male,female;
    JCheckBox robotcheck;

    JTextField siname;
    JPasswordField sipass;

    public Sign_up(){

        setSize(500,600);
        setTitle("Registration Form");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);


        JLabel ti = new JLabel("Sign Up");
        ti.setLocation(120,20);
        ti.setFont(new Font("Arial", Font.BOLD, 26));
        ti.setSize(150,50);

        c.add(ti);


        JLabel name = new JLabel("Name");
        name.setLocation(20,70);
        name.setFont(new Font("Arial", Font.BOLD, 26));
        name.setSize(150,50);

        c.add(name);

        suname = new JTextField();
        suname.setLocation(100,80);
        suname.setFont(new Font("Arial", Font.BOLD, 26));
        suname.setSize(250,30);

        c.add(suname);



        JLabel email = new JLabel("Email");
        email.setLocation(20,170);
        email.setFont(new Font("Arial", Font.BOLD, 26));
        email.setSize(150,50);

        c.add(email);



        suemail = new JTextField();
        suemail.setLocation(100,180);
        suemail.setFont(new Font("Arial", Font.BOLD, 26));
        suemail.setSize(250,30);

        c.add(suemail);










    }

}
