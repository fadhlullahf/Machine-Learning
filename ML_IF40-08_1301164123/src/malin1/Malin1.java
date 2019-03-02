/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malin1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author Asus
 */
public class Malin1 {
    private String[][] data=new String[160][];
    double yes=0;
    double no=0;
    public double hitungpcix(int x,String y, String z){
        double a=0;
        for (int i = 0; i < data.length; i++) {
            if(data[i][8].equals(y) && data[i][x].equals(z))a++;
        }
        return a;
    }
    public String getlabel(String[] x){
        double pcyes=yes/data.length;
        double pcno=no/data.length;
        for (int i = 0; i < 7; i++) {
            pcyes*=hitungpcix(i+1,"<=50K",x[i+1])/yes;
            pcno*=hitungpcix(i+1,">50K",x[i+1])/no;
        }
        if(pcyes>pcno) return "<=50K";
        else return ">50K";
    }
    public String[] load() throws FileNotFoundException{
        String[] hasil=new String[40];
        int i=0;
        File a = new File("TestsetTugas1ML.csv");
        Scanner p = new Scanner(a);
        p.nextLine();
        while (p.hasNext()){
            hasil[i]=getlabel(p.nextLine().split(","));
            i++;
        }
        return hasil;
    }
    public void readdatatrain() throws FileNotFoundException{
        int i=0;
        File a = new File("TrainsetTugas1ML.csv");
        Scanner p = new Scanner(a);
        p.nextLine();
        while (p.hasNext()){
            data[i]=p.nextLine().split(",");
            if (data[i][8].equals(">50K")) no++;
            else yes++;
            i++;
        }
    }
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Malin1 ml = new Malin1();
        ml.readdatatrain();
        String[] hasil=ml.load();
        FileWriter filewriter = new FileWriter("TebakanTugas1ML.csv ");
        try{
            for(int i=0; i<hasil.length; i++){
                filewriter.append(String.valueOf(hasil[i]));
                filewriter.append('\n');
            }
        }catch(Exception e){     
        }
        filewriter.flush();
        filewriter.close();
    }
}