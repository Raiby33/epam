public class Logic {
    public boolean whatEnd(String answer) {
        boolean desire = switch (answer.toLowerCase()){
            case "No","Nope" -> false;
            default -> true;
        };
        return desire;
    }

    public int maxValue(int a, int b){
        int max;
        if(a > b){
            max = a;
        }else max = b;
        return  max;
    }

    public int minValue(int a, int b){
        int min;
        if(a > b){
            min = b;
        }else min = a;
        return  min;
    }
}
