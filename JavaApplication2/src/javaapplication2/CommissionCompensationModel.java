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
public class CommissionCompensationModel extends CompensationModel{
    public double grossSales, commissionRate;
    public CommissionCompensationModel(double grossSales, double commissionRate ){
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;
    }
    public double earnings(){
        return (this.grossSales*this.commissionRate);
    }
    @Override
    public void raise(double percent){
        this.commissionRate=this.commissionRate+(this.commissionRate*percent);
    }
    @Override
    public String toString(){
        return "Commission Compensation with:\nGross Sales of: "+this.grossSales+"\nCommission Rate of: "+this.commissionRate+"\nEarnings: "+this.earnings();
    }
}
