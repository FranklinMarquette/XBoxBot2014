/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.XBoxBot2014.subsystems;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author FrankyMonez
 */
public class XBox extends Joystick{
    
    public XBox(int port) {
        super(port);
    }
    
    public static final int A_BUTTON = 0;
    public static final int B_BUTTON = 1;
    
    public boolean getButtonA() {
     return getRawButton(A_BUTTON);
}
    
    public boolean getButtonB() {
        return getRawButton(B_BUTTON);
    }
    
    
}
