package statemachine.year2.cdplayer;

import javax.swing.JLabel;

import statemachine.year1.library.GraphicalMachine;
import statemachine.year1.cdplayer.CDPlayer1.ControlGUI;

public class CDPlayer2 extends GraphicalMachine {

    public static void main(String argv[]) {
        new CDPlayer2();
    }
    
    public CDPlayer2() {
        super(new ControlGUI(),new CDPlayerMachine(),ControlGUI.POWER_ON_COMMAND);
    }

    /**
     * Handle updates to the state machine, display the current state in the GUI
     */
    @Override
    public void update() {
        ((JLabel)gui.getComponent("state")).setText(machine.getStateName());
        ((JLabel)gui.getComponent("track")).setText(new Integer(((CDPlayerMachine)machine).getTrack()).toString());
    }

}