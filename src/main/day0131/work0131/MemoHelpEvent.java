package day0131.work0131;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MemoHelpEvent extends WindowAdapter implements ActionListener {
   private MemoHelpDesign mhd;

   public MemoHelpEvent(MemoHelpDesign mhd){
       this.mhd = mhd;
   }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        super.windowClosing(e);
    }
}
