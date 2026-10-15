package file.system;

public abstract class Component {
    protected String name;
    protected int level;

    public Component(String name){
        this.name = name;
        level = 0 ;
    }
    public abstract void print();

    public String tabs(){
        String tabs="";
        for(int i =0; i<level; i++){
            tabs = tabs+"\t";
        }
        return tabs;
    }

}
