package Forms;

import javafx.scene.Group;
import javafx.scene.Node;

import java.util.ArrayList;
import java.util.List;

public abstract class FormOption<Type> extends Group {
    private Type selected=null;
    List<Type> options=new ArrayList<>();

    public Type getSelected(){ return selected;}

    public void setSelected(Type selected){
        this.selected=selected;
    }

    public List<Type> getOptions(){
        return options;
    }

    public abstract void setOptions();

}
