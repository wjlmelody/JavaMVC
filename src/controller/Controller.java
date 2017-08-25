package controller;

import model.Model;
import view.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controller {
    private Model model;
    private View view;
    private String selectStr;

    public Controller() {
        this.model = new Model();
        this.view = new View();
        this.selectStr = "";
    }

    public void run() {
        view.select.setTitle("名人名言检索");
        view.select.setVisible(true);
        //加上这一句就可以把Frame放在最中间了
        view.select.setLocationRelativeTo(null);
        //如果没有这一句，在点击关闭Frame的时候程序其实还是在执行状态中的，加上这一句才算是真正的把资源释放掉了
        view.select.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JTextField jTextField = view.select.getJTextField();

        jTextField.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e) {
                int keyChar = e.getKeyChar();
                if(keyChar >= KeyEvent.VK_0 && keyChar <= KeyEvent.VK_9){

                }else{
                    e.consume(); //关键，屏蔽掉非法输入
                }
            }
        });

        JButton jButton = view.select.getJButton();

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_clicked();
            }
        });
    }

    public void btn_clicked() {
        selectStr = view.select.getJTextFieldText();
        try {
            Integer index = Integer.parseInt(selectStr);
            String quote = model.get_quote(index);
            view.show(quote);
        } catch (Exception e) {
            view.error("索引值为空");
        }
    }
}