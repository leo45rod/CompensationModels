/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.*;
/**
 *
 * @author Leo45
 */
public class BasePlusCommissionCompensationModel extends CommissionCompensationModel {
    private double baseSalary;
    public BasePlusCommissionCompensationModel (double grossSales, double commissionRate, double baseSalary){
        super(grossSales, commissionRate);
        this.baseSalary=baseSalary;
    }
    @Override
    public double earnings(){
        return (super.earnings() + baseSalary);
    }
    @Override
    public void raise(double percent){
        this.baseSalary=this.baseSalary+(this.baseSalary*percent);
        this.commissionRate=this.commissionRate+(this.commissionRate*percent);
    }
    @Override
    public String toString(){
        return "Base Plus Commission Compensation with:\nGross Sales of: "+this.grossSales+"\nCommission Rate of: "+this.commissionRate+"\nBase Salary of: "+this.baseSalary+"\nEarnings: "+this.earnings();
    }
}
