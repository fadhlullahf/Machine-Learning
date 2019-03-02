/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package malin1;
import java.sql.Array;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class data {
    data[] dt = new data[160];
    private int id;
    private String age;
    private String workclass;
    private String education;
    private String marital;
    private String occupation;
    private String relationship;
    private String houseperweek;
    private int income;
    
    public data(int id,String age,String workclass,String education,String marital,String occupation,String relationship,String houseperweek,int income){
        this.id=id;
        this.age=age;
        this.workclass=workclass;
        this.education=education;
        this.marital=marital;
        this.occupation=occupation;
        this.relationship=relationship;
        this.houseperweek=houseperweek;
        this.income=income;  
    }
    public void setid(int id){
        this.id=id;
    }
    public void setage(String age){
        this.age=age;
    }
    public void seteducation(String education){
        this.education=education;
    }
    public void setmarital(String marital){
        this.marital=marital;
    }
    public void sethouseperweek(String houseperweek){
        this.houseperweek=houseperweek;
    }
    public void setincome(int income){
        this.income=income;
    }
    public int id(){
        return id;
    }
    public String age(){
        return age;
    } 
    public String workclass(){
        return workclass;
    }
    public String education (){
        return education;
    }
    public String marital(){
        return marital;
    }
    public String occupation(){
        return occupation;
    }
    public String relationship(){
        return relationship;
    }
    public String houseperweek(){
        return houseperweek;
    }
    public int income(){
        return income;
    }
    
    
}