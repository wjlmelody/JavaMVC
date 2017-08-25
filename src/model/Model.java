package model;

import database.Database;

public class Model {

    private Database database;

    public Model(){
        this.database = new Database();
    }

    public String get_quote(Integer index) {
        String value;
        try {
            String[] Arrays = database.getArrays();
            value = Arrays[index];
        } catch (Exception e) {
            return "未找到该名人名言";
        }
        return value;
    }
}
