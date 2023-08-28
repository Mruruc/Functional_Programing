package com.mruruc.functional_interfaces.funcations.custom_interface;


/*

 * I1 => First Input Type,
 * I2 => Second Input Type,
 * O => Output Type.

 */

@FunctionalInterface
public interface My_BiFunction <I1,I2,O>{
    O execute(I1 input1,I2 input2);
}
