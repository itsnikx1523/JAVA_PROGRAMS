import java.awt.FlowLayout;
import javax.swing.Jframe;
import javax.swing.Jlabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class LabelFrame extends Jframe
{
private final JLabel labell1;
private final JLabel labell2;
private final JLabel label3;
public LabelFrame()
{
super("Testing Jlabel");
setLayout(new FlowLayout());
label1=new Jlabel("Label with text");
label1.setToolTipText("This is label");
add(label1);
Icon bug=new ImageIcon(getClass().getResources("bug1.png"));
label2=new JLabel("Label with text and icon",bug,SwingConstants.LEFT);
labell2.setToolTipText("this is label 2");
add(label2);
labell3=new JLabel();
label3.setText("Label with icon and text at bottom");
labell3.setIcon(bug);
labell3.setHorizontalTextPosition(SwingConstants.CENTER);
labell3.setVerticalTextPosition(SwingConstants.BOTTOM);
labell3.setToolTipText("This is label3");
add(labell3);
}
}

