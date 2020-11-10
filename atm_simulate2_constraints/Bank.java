/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atm_simulate2_constraints;

/**
 *
 * @author Shreetesh M
 */
abstract class Bank {

    private static long currentAmount = 1000000;
    private static final long maximum = 4000000;
    private static long minimum = 500;
    private static boolean status = true;

    public static long totalWithdrawn = 0;
    public static long totalDeposited = 0;

    public static long getCurrent(){
        return currentAmount;
    }

    public static long getMaximum(){
        return maximum;
    }

    public static long getMinimum(){
        return minimum;
    }

    public static boolean getStatus(){
        return status;
    }

    public static void setCurrentBy(long x){
        currentAmount+=x;
    }

    public static void setStatus(boolean s){
        status = s;
    }

}
