package com.company;

public class Skeleton extends Boss {
    private int numberOfArrows;


    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        if (numberOfArrows < 0){
            System.out.println("the arrows are gone");
        } else {
            this.numberOfArrows = numberOfArrows;
        }
    }

    public  String printInfo (){
        return super.printInfo() + " " +  weapon.getSniper() + ","  + " " + "КОЛИЧЕСТВО СТРЕЛ - " + numberOfArrows;
    }
}
