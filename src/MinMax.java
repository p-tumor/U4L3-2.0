import java.util.ArrayList;

public class MinMax {
    private ArrayList<Integer> numberList;
    public MinMax(){
        numberList = new ArrayList<>();
    }
    public void addNumber(int number){
        numberList.add(number);
    }
    public int findMinimum(){
        int min = numberList.get(0);
        for(int x = 1; x < numberList.size();x++){
            if (numberList.get(x) < min){
                min = numberList.get(x);
            }
        }
        return min;
    }
    public int findMaximum(){
        int max = numberList.get(0);
        for(int x = 1; x < numberList.size();x++){
            if (numberList.get(x) > max){
                max = numberList.get(x);
            }
        }
        return max;
    }

    public int getNumberListSize() {
        return numberList.size();
    }
}
