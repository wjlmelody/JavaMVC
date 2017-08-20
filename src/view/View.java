package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {
    public String select_quote(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
        //java.io.InputStreamReader继承了Reader类
        String read = null;
        System.out.print("请输入编号进行查询：");
        try {
            read = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return read;
    }

    public void show(String quote){
        System.out.println(quote);

    }

    public void error(String quote){
        System.out.println(quote);
    }

}
