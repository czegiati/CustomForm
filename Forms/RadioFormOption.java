package Forms;

import javafx.scene.control.RadioButton;

import java.util.HashMap;
import java.util.Map;

public abstract class RadioFormOption<Type> extends FormOption<Type>{
    Map<Type,String> synonyms=new HashMap<>();


    public void create(){
        System.out.println("AbsClass");
        setOptions();
        setSynonyms();
        for(Type t:this.options) {
            System.out.println(t+ getSynonym(t));
            this.getChildren().add(new RadioButton(getSynonym(t)));
        }
    }

    public abstract void setSynonyms();

    public Map<Type,String> getSynonyms() {
        return synonyms;
    }

    public String getSynonym(Type id){
        return this.getSynonyms().get(id);
    }
}
