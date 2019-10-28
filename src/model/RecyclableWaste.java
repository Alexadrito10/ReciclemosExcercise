package model;

public class RecyclableWaste extends Waste implements Nocivity {
    //Atributes

    private String type="";
    public static final String PAPER = "paper";
    public static final String CARTON = "carton";
    public static final String GLASSES = "glasses";
    public static final String PLASTIC = "plastic";
    public static final String METAL = "metal";
    private String properUse="";


    //constructor

   public RecyclableWaste(String type, String properUse,String id , String name , String origin,String color, int descompositionTime){
       super(name, origin, color, descompositionTime);
       this.type=type;
       this.properUse=properUse;   
   }
   //methods

   public getType(){
       return type;
   }
   public getProperUse(){
       return properUse;
   }


   public double calculateNocivity (int descompositionTime){


        double result = 0.0;
        String comparing= super.getOrigin();

        if (comparing.equals("industrial")){

            result = 0.08*(double)descompositionTime;

        }
        if (comparing.equals("domicilary")){
            result = 0.03*(double)descompositionTime;
        }
        if (comparing.equals("construction")){
            result = 0.06*(double)descompositionTime;
        }
        if (comparing.equals("municipal")){
            result = 0.1*(double)descompositionTime;
        }
        if (comparing.equals("hospital")){
            result = 0.13*(double)descompositionTime;

        }
        return result;



   }

    @Override
    public String toString() {
        return "\n type: "+ type +"\n proper use: "+ properUse + super.toString();
    }


    
}