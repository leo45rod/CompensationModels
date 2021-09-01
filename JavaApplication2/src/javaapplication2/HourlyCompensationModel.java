/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Leo45
 */
public class HourlyCompensationModel extends CompensationModel{
    private double wage, hours;
    public HourlyCompensationModel(double wage, double hours){
        this.wage=wage;
        this.hours=hours;
    }
    @Override
    public double earnings(){
        if(this.hours>40)
            return this.wage*40+(1.5*this.wage)*(this.hours-40);
        else
            return this.wage*this.hours;
    }
    @Override
    public void raise(double percent){
        this.wage=this.wage+(this.wage*percent);
    }
    @Override
    public String toString(){
        return "Hourly Compensation with:\nWage of: "+this.wage+"\nHours Worked of: "+this.hours+"\nEarnings: "+this.earnings();
    }
}
