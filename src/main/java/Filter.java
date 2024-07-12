import java.util.ArrayList;
import java.util.List;

class Filter {

    protected int treshold;
    Logger logger = Logger.getInstance();

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> sourse) {

        List<Integer> filteredList = new ArrayList<>();
        for (int i : sourse) {
            if (i >= treshold) {
                logger.log("Элемент " + i + " проходит");
                filteredList.add(i);
            } else {
                logger.log("Элемент " + i + " не проходит");
            }
        }
        logger.log("Список отфильтрован");
        return filteredList;
    }
}