package org.example;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
    Window();

  }

  public static String SayHello(String number) {
    int numberInt = Integer.parseInt(number);
    if (numberInt > 7) {
      return "Привет";
    }
    return "Введёное число меньше 7";

  }

  public static String NameCheck(String name) {
    if (name.equals("Вячеслав")) {
      return "Привет, Вячеслав";
    }
    return "Нет такого имени";

  }

  public static String MultiplesOfThree(String text) {
    System.out.println("Введите числа, разделяя их пробелами");
    String numbers = text.trim();
    if (numbers.isEmpty()) {
      return "Вы не ввели ни одного числа";
    }
    List<Integer> numberArray = Stream.of(numbers.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
    String multiple3 = "Числа кратные 3: ";
    for (int i = 0; i < numberArray.size(); i++) {
      if (numberArray.get(i) % 3 == 0) {
        multiple3 = multiple3 + (numberArray.get(i).toString()).concat(", ");
      }
    }
    return multiple3.substring(0, multiple3.length() - 2);

  }

  public static void Window() {
    JFrame frame = new JFrame("ASTON");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200, 200);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    JPanel panel = new JPanel();
    frame.add(panel);
    panel.setLayout(new FlowLayout());
    JButton button1 = new JButton("Число > 7");
    JButton button2 = new JButton("Проверка на Вячеслава");
    JButton button3 = new JButton("Числа кратные 3");
    panel.add(new Label("Выберите задачу!"));
    panel.add(button1);
    panel.add(button2);
    panel.add(button3);
    frame.setContentPane(panel);
    panel.setSize(frame.getSize());
    panel.setVisible(true);
    frame.pack();

    JFrame frame1 = new JFrame();
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame1.setSize(400, 250);
    frame1.setVisible(false);
    frame1.setLocationRelativeTo(null);
    JPanel panel1 = new JPanel();
    panel1.setSize(frame1.getSize());
    frame1.add(panel1);
    panel1.setLayout(new FlowLayout());
    JButton buttonOk1 = new JButton("OK");
    JButton buttonBack1 = new JButton("Назад");
    JButton buttonClean1 = new JButton("Отчистить");
    TextArea text = new TextArea();
    text.setPreferredSize(new Dimension(200, 100));
    panel1.add(new Label("Введите число!"));
    panel1.add(text);
    panel1.add(buttonOk1);
    panel1.add(buttonBack1);
    panel1.add(buttonClean1);
    frame1.pack();


    JFrame frame2 = new JFrame();
    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame2.setSize(400, 250);
    frame2.setVisible(false);
    frame2.setLocationRelativeTo(null);
    JPanel panel2 = new JPanel();
    panel2.setSize(frame2.getSize());
    frame2.add(panel2);
    panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
    JButton buttonOk2 = new JButton("OK");
    JButton buttonBack2 = new JButton("Назад");
    JButton buttonClean2 = new JButton("Отчистить");
    TextArea text2 = new TextArea();
    text2.setPreferredSize(new Dimension(200, 100));
    panel2.add(new Label("Введите имя!"));
    panel2.add(text2);
    panel2.add(buttonOk2);
    panel2.add(buttonBack2);
    panel2.add(buttonClean2);
    frame2.pack();


    JFrame frame3 = new JFrame();
    frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame3.setSize(400, 250);
    frame3.setVisible(false);
    frame3.setLocationRelativeTo(null);
    JPanel panel3 = new JPanel();
    panel3.setSize(frame3.getSize());
    frame3.add(panel3);
    panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
    JButton buttonOk3 = new JButton("OK");
    JButton buttonBack3 = new JButton("Назад");
    JButton buttonClean3 = new JButton("Отчистить");
    TextArea text3 = new TextArea();
    text3.setPreferredSize(new Dimension(200, 100));
    panel3.add(new Label("Введите числа, разделяя их пробелами!"));
    panel3.add(text3);
    panel3.add(buttonOk3);
    panel3.add(buttonBack3);
    panel3.add(buttonClean3);
    frame3.pack();


    button1.addActionListener(e -> frame1.setVisible(true));
    button1.addActionListener(e -> frame.setVisible(false));
    button2.addActionListener(e -> frame2.setVisible(true));
    button2.addActionListener(e -> frame.setVisible(false));
    button3.addActionListener(e -> frame3.setVisible(true));
    button3.addActionListener(e -> frame.setVisible(false));

    buttonOk1.addActionListener(e1 -> JOptionPane.showMessageDialog(null, SayHello(text.getText())));
    buttonClean1.addActionListener(e -> text.setText(""));
    buttonBack1.addActionListener(e1 -> frame.setVisible(true));
    buttonBack1.addActionListener(e1 -> frame1.setVisible(false));

    buttonOk2.addActionListener(e1 -> JOptionPane.showMessageDialog(null, NameCheck(text2.getText())));
    buttonClean2.addActionListener(e -> text2.setText(""));
    buttonBack2.addActionListener(e1 -> frame.setVisible(true));
    buttonBack2.addActionListener(e1 -> frame2.setVisible(false));

    buttonOk3.addActionListener(e1 -> JOptionPane.showMessageDialog(null, MultiplesOfThree(text3.getText())));
    buttonClean3.addActionListener(e -> text3.setText(""));
    buttonBack3.addActionListener(e1 -> frame.setVisible(true));
    buttonBack3.addActionListener(e1 -> frame3.setVisible(false));

  }
}