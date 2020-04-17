package Forms;

public class MyRadioFormOption extends RadioFormOption<String> {


    public MyRadioFormOption(){
        create();
        System.out.println("in MyClass");
    }

    @Override
    public void setSynonyms() {
        for(String o :getOptions()) {
            this.synonyms.put(o,o);
        }
    }


    @Override
    public void setOptions() {
        this.getOptions().add("option1");
        this.getOptions().add("option2");
        this.getOptions().add("option3");
    }
}
