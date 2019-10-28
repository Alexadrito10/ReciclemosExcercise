package model;

public abstract class  Waste implements Nocivity{

    //Atributes //
    private String id= ""; 
    private String name= "";
    private String origin= "";
    private String color = "";
    public static final String INDUSTRIAL = "industrial";
    public static final String DOMICILIARY = "domicilary";
    public static final String MUNICIPAL = "municipal";
    public static final String CONSTRUCTION = "construction";
    public static final String HOSPITAL = "hospital";
    private int descompositionTime =0;

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getOrigin() {
        return this.origin;
    }

    public String getColor() {
        return this.color;
    }

    public int getDescompositionTime() {
        return this.descompositionTime;
    }
   


    ///methods///

    //constructor
    public Waste (String id , String name , String origin,String color, int descompositionTime ){

        this.id = id;
        this.name = name;
        this.origin = origin;
        this.descompositionTime = descompositionTime;

    }

    public void chooseOrigin(int i){
        String r="";
        switch(i){
            case 1:
            r= INDUSTRIAL;
            break;
            case 2:
            r = DOMICILIARY;
            break;
            case 3:
            r = MUNICIPAL;
            break;
            case 4:
            r = CONSTRUCTION;
            break;
            case 5:
            r= HOSPITAL;
        }

        origin = r;
    }

    public String toString() {

        return "/n id: "+ id + "/n name: " +name +"/n origin: "+ origin +"/n color: "+color+ "/n descomposition time in months : "+ descompositionTime;
    }

    public double calculateNocivity(double i){
        double result = 0 ;

         return result;
    }



}