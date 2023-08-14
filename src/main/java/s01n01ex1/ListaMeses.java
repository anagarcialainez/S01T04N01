package s01n01ex1;

import java.util.ArrayList;
import java.util.List;

public class ListaMeses {
    private List<String> meses;

    public ListaMeses(){
        meses = new ArrayList<>();
    }

    public List<String> getMeses() {
        return meses;
    }

    public void insertarMes(String nomMes){
        meses.add(nomMes);
    }

}
