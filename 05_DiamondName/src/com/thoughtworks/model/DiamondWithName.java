package com.thoughtworks.model;


import com.thoughtworks.model.Diamond;

public class DiamondWithName {

    public void drawDiamondWithName(int numberOfLines){
        Diamond diamond = new Diamond();

        diamond.drawCenterTriangle(numberOfLines - 1);
        drawNameCenterOfDiamond();
        diamond.reverseLoop(numberOfLines);
    }

    private void drawNameCenterOfDiamond(){
        System.out.println("Bill");
    }


}
