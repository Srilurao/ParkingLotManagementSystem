public class Vechile {

    private String vechileType;
    private String vechileNumber;

    public Vechile(String vechileType, String VechileNumber){
        this.vechileType = vechileType;
        this.vechileNumber = VechileNumber;
    }

    public String getVechileType(){
        return vechileType;
    }

    public String getVechileNumber(){
        return vechileNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
               "vechileNumber='" + vechileNumber + '\'' +
               '}';
    }
    
}
