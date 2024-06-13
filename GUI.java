import javax.swing.*;
class GUI{
    public static void main(String args[]){
        JFrame jf = new JFrame("GUI Screen");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500,400);
        JButton pressButton = new JButton("Press");
        jf.getContentPane().add(pressButton);
        jf.getContentPane().add(pressButton);
        jf.setVisible(true);
    }
}