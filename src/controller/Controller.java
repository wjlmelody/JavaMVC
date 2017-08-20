package controller;

import model.Model;
import view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(){
        this.model = new Model();
        this.view = new View();
    }

    public void run(){
        String n = view.select_quote();
        try{
            Integer index = Integer.parseInt(n);
            String quote = model.get_quote(index);
            view.show(quote);
        }
        catch (Exception e){
            view.error("不合法的索引值");
        }
    }
}
