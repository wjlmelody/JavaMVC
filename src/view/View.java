package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {

    public Select select;
    public JFrame jFrame;

    public View(){
        this.select = new Select();
        this.jFrame = new JFrame();
    }

    public void show(String quote){
        Show f = new Show(this.jFrame);
        f.setTitle("名人名言显示");
        f.setVisible(true);
        //加上这一句就可以把Frame放在最中间了
        f.setLocationRelativeTo(null);
        //如果没有这一句，在点击关闭Frame的时候程序其实还是在执行状态中的，加上这一句才算是真正的把资源释放掉了
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f.setTextArea(quote);
        f.getTextArea().setLineWrap(true);        //激活自动换行功能
        f.getTextArea().setWrapStyleWord(true);            // 激活断行不断字功能
        f.getJButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });
    }

    public void error(String quote){
        Show f = new Show(this.jFrame);
        f.setTitle("错误提示");
        f.setVisible(true);
        //加上这一句就可以把Frame放在最中间了
        f.setLocationRelativeTo(null);
        //如果没有这一句，在点击关闭Frame的时候程序其实还是在执行状态中的，加上这一句才算是真正的把资源释放掉了
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f.setTextArea(quote);
        f.getTextArea().setLineWrap(true);        //激活自动换行功能
        f.getTextArea().setWrapStyleWord(true);            // 激活断行不断字功能
        f.getJButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispose();
            }
        });
    }
}
