package model;

public abstract class  Waste {
    private String id; 
    private String name;
    private String origin;
    public static final String INDUSTRIAL = "industrial";
    public static final String DOMICILIARY = "domicilary";
    public static final String MUNICIPAL = "municipal";
    public static final String CONSTRUCTION = "construction";
    public static final String HOSPITAL = "hospital";
    private int descompositionTime;



    public Waste (){
        
    }

}