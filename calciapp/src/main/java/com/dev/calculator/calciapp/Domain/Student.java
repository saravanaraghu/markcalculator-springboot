package com.dev.calculator.calciapp.Domain;

public class Student {
    private int maths;
    private int physics;
    private int chemistry;

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public int getTotal(){
        return maths+physics+chemistry;
    }
    public double getAvg(){
        return (maths+physics+chemistry)/3;
    }

    public String getResult(){
        double avg = (maths+physics+chemistry)/3;
        if(avg > 50){
            return "Pass";
        }else {
            return "Fail";
        }
    }
}
