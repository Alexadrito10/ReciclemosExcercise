
package model;


public class BiodegradableWaste extends Waste implements Nocivity{
    private boolean composting; 

    

    public  BiodegradableWaste(String id , String name , String origin,String color, int descompositionTime,boolean composting){
        super(id,name,origin,color,descompositionTime);
        this.composting = composting;
    }
    public void setComposting(boolean composting){
        
        this.composting = composting;

    }
}