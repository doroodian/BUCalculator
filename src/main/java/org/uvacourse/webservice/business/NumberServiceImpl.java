/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.uvacourse.webservice.business;

/**
 *
 * @author Phoenix
 */

public class NumberServiceImpl {
    
    
    public Integer getAddition(Integer firstNum,Integer SecondNum){
        
      return firstNum+SecondNum;  
    }
    public Integer getSubstraction(Integer firstNum,Integer SecondNum){
        
      return firstNum-SecondNum;  
    }
    public Integer getMultiplication(Integer firstNum,Integer SecondNum){
        
      return firstNum*SecondNum;  
    }
    
    public int[] getDivision(Integer firstNum,Integer SecondNum){
        //here for preventing a division on Zero I created a flag. we have a
        //integer list with two element , first one gonna have the flag second
        //one the value, if the flag is 0 it means there is division on Zero
        //if the flag is 1, that means you can use the Value.
        if (SecondNum !=0) 
            return new int[] {1,firstNum/SecondNum};  
        else return new int[]{0,0};
        
      
    }
}
