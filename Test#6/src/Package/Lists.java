package Package;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    private final List<Rectangle> rectangleList;
    private Rectangle[] rectangles;

    public Lists(){
        rectangleList = new ArrayList<>();
    }
    @Override
    public String toString(){
        return "Lists" + rectangleList;
    }
    public boolean add(Rectangle rectangle){
        return rectangleList.add(rectangle);
    }

    public void remove(Rectangle rectangle){
        rectangleList.remove(rectangle);
    }

    //Нахожу элемент с максимальной и минимальной площадью;

    public double maxSquare(){
        double MAX = 0;
        for (Rectangle rectangle : rectangles){
            if(MAX < rectangle.Area()){
                MAX = rectangle.Area();
            }
        }
        return MAX;
    }
    public double minSquare() {
        double MIN = 0;
        for(Rectangle rectangle : rectangles){
            if(MIN < rectangle.Area()){
                MIN = rectangle.Area();
            }
        }
        return MIN;
    }

}