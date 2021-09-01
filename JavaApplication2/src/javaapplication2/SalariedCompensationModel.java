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
public class SalariedCompensationModel extends CompensationModel{
    private double weeklySalary;
    public SalariedCompensationModel(double weeklySalary){
        this.weeklySalary=weeklySalary;
    }
    @Override
    public double earnings(){ return this.weeklySalary;}
    @Override
    public void raise(double percent){ 
        this.weeklySalary=this.weeklySalary+(this.weeklySalary*percent);
    }
    @Override
    public String toString(){
        return "Salaried Compensation with:\nWeekly Salary of: "+this.weeklySalary+"\nEarnings: "+this.earnings();
    }
}
