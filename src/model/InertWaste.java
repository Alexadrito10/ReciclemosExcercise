package model;
 
public class InertWaste extends Waste implements Nocivity{

    private String advices;

    public InertWaste(String id , String name , String origin,String color, int descompositionTime, String advices){
        
        super(id,name,origin,color,descompositionTime);
        this.advices = advices;

    }
    public double calculateNocivity (int descompositionTime){


        double result = 0.0;
        String comparing= super.getOrigin();

        if (comparing.equals("industrial")){

            result = 0.1*(double)descompositionTime;

        }
        if (comparing.equals("domicilary")){
            result = 0.05*(double)descompositionTime;
        }
        if (comparing.equals("construction")){
            result = 0.08*(double)descompositionTime;
        }
        if (comparing.equals("municipal")){
            result = 0.12*(double)descompositionTime;
        }
        if (comparing.equals("hospital")){
            result = 0.15*(double)descompositionTime;

        }
        return result;



   }

}
