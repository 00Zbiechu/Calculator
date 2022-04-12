package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Window extends JFrame implements ActionListener {


    private int windowWidth;
    private int windowHeight;

    private JPanel panelWynik,panelInstrukcje,panelOther;

    private JLabel resultLabel, numberOneLabel, operationLabel, numberTwoLabel;

    private JButton one, two, three, four, five, six, seven, eight, nine,zero;
    private JButton add, sub, multi, divide, pow;
    private JButton result,clear;


    //Logika
    private int numberFirst, numberSecond;
    private String operation;


    private boolean flagFirstClicked = false;
    private boolean flagSecondClicked = false;
    private boolean flagOperationClicked = false;



    Window(){

        setTitle("Kalkulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Rozmiar i położenie okna
        setDimensionWindow(getResolution());
        setLocationWindow(getResolution());

        //Domyślny Layout
        setLayout(new GridLayout(3,1));

        initGUI();



    }

    private void initGUI(){

        createPanels();

        createLabels();

        createButtons();


    }


    private Dimension getResolution() {

        //klasa toolkit zawiera metodę, umożliwiającą pobranie rozmiaru okna
        Toolkit kit = getToolkit();
        //klasa Dimension zawiera pola height i width, dzięki czemu możemy w niej przechować wymiary okna
        Dimension size = kit.getScreenSize();

        return size;

    }

    //metoda ustawiająca rozmiar okna aplikacji na połowę rozmiaru okna i przypisująca te wartości do zmiennych
    private void setDimensionWindow(Dimension resolution){

        this.windowWidth = resolution.width/6;
        this.windowHeight = resolution.height/2;
        setSize(windowWidth,windowHeight);
        setResizable(false);

        //Pokazuje ile wynosi rozmiar okna
        //System.out.println(windowWidth+" "+windowHeight);


    }

    //metoda ustawiająca miejsce ukazywania się okna programu na podstawie rozdzielczości ekranu
    private void setLocationWindow(Dimension resolution){

        int X = resolution.width/4;
        int Y = resolution.height/4;

        setLocation(X,Y);


    }

    private JPanel createJPanel(int width,int height){

        JPanel jpanel = new JPanel();

        jpanel.setSize(width,height/3);


        return jpanel;


    }

    private void createPanels(){

        this.panelWynik = createJPanel(windowWidth,windowHeight);
            panelWynik.setLayout(new GridLayout(4,1));
        this.panelInstrukcje = createJPanel(windowWidth,windowHeight);
            panelInstrukcje.setLayout(new GridLayout(4,3));
        this.panelOther = createJPanel(windowWidth,windowHeight);
            panelOther.setLayout(new FlowLayout());


        add(panelWynik);
        add(panelInstrukcje);
        add(panelOther);

    }


    private JLabel createJLabel(String label){

        JLabel jLabel = new JLabel(label);
        jLabel.setHorizontalAlignment(0);

        return jLabel;


    }

    private void createLabels(){

        this.resultLabel = createJLabel("Wynik:");
            resultLabel.setHorizontalAlignment(SwingConstants.LEFT);
        this.numberOneLabel = createJLabel("L1:");
            numberOneLabel.setHorizontalAlignment(SwingConstants.LEFT);
        this.operationLabel = createJLabel("O:");
            operationLabel.setHorizontalAlignment(SwingConstants.LEFT);
        this.numberTwoLabel = createJLabel("L2:");
            numberTwoLabel.setHorizontalAlignment(SwingConstants.LEFT);


        //dodawanie do JFrame
        panelWynik.add(resultLabel);
        panelWynik.add(numberOneLabel);
        panelWynik.add(operationLabel);
        panelWynik.add(numberTwoLabel);

    }

    private JButton createJButton(String opis){

        JButton jButton = new JButton(opis);
        jButton.addActionListener(this);

        return jButton;

    }

    private void createButtons(){

        this.one = createJButton("1");
        this.two = createJButton("2");
        this.three = createJButton("3");
        this.four = createJButton("4");
        this.five = createJButton("5");
        this.six = createJButton("6");
        this.seven = createJButton("7");
        this.eight = createJButton("8");
        this.nine = createJButton("9");
        this.zero = createJButton("0");


        this.add = createJButton("+");
        this.sub = createJButton("-");
        this.multi = createJButton("*");
        this.divide = createJButton("/");
        this.pow = createJButton("^");
        this.result = createJButton("=");
            result.setBackground(Color.LIGHT_GRAY);
        this.clear = createJButton("CC");


        //dodawanie do paneluInstrukcje
        panelInstrukcje.add(one);
        panelInstrukcje.add(two);
        panelInstrukcje.add(three);
        panelInstrukcje.add(four);
        panelInstrukcje.add(five);
        panelInstrukcje.add(six);
        panelInstrukcje.add(seven);
        panelInstrukcje.add(eight);
        panelInstrukcje.add(nine);
        panelInstrukcje.add(zero);



        //dodawanie do paneluOther
        panelOther.add(add);
        panelOther.add(sub);
        panelOther.add(multi);
        panelOther.add(divide);
        panelOther.add(pow);
        panelOther.add(result);
        panelOther.add(clear);


    }





    @Override
    public void actionPerformed(ActionEvent e) {

        //Pierwsza faza-wybór L1
        if (flagFirstClicked == false) {

            if (e.getSource() == one) {
                numberFirst = 1;
                numberOneLabel.setText("L1: 1");
                flagFirstClicked = true;
                //Logic.operationActivation();
            } else if (e.getSource() == two) {
                numberFirst = 2;
                numberOneLabel.setText("L1: 2");
                flagFirstClicked = true;
            } else if (e.getSource() == three) {
                numberFirst = 3;
                numberOneLabel.setText("L1: 3");
                flagFirstClicked = true;
            } else if (e.getSource() == four) {
                numberFirst = 4;
                numberOneLabel.setText("L1: 4");
                flagFirstClicked = true;
            } else if (e.getSource() == five) {
                numberFirst = 5;
                numberOneLabel.setText("L1: 5");
                flagFirstClicked = true;
            } else if (e.getSource() == six) {
                numberFirst = 6;
                numberOneLabel.setText("L1: 6");
                flagFirstClicked = true;
            } else if (e.getSource() == seven) {
                numberFirst = 7;
                numberOneLabel.setText("L1: 7");
                flagFirstClicked = true;
            } else if (e.getSource() == eight) {
                numberFirst = 8;
                numberOneLabel.setText("L1: 8");
                flagFirstClicked = true;
            } else if (e.getSource() == nine) {
                numberFirst = 9;
                numberOneLabel.setText("L1: 9");
                flagFirstClicked = true;
            } else if (e.getSource() == zero) {
                numberFirst = 0;
                numberOneLabel.setText("L1: 0");
                flagFirstClicked = true;

            }

            //Druga faza-wybór operacji
        } else if (flagFirstClicked == true && flagSecondClicked == false && flagOperationClicked == false) {


            if (e.getSource() == add) {
                operation = "add";
                operationLabel.setText("O: +");
                flagOperationClicked = true;
            } else if (e.getSource() == sub) {
                operation = "sub";
                operationLabel.setText("O: -");
                flagOperationClicked = true;
            } else if (e.getSource() == multi) {
                operation = "multi";
                operationLabel.setText("O: *");
                flagOperationClicked = true;
            } else if (e.getSource() == divide) {
                operation = "div";
                operationLabel.setText("O: /");
                flagOperationClicked = true;
            } else if (e.getSource() == pow) {
                operation = "pow";
                operationLabel.setText("O: ^");
                flagOperationClicked = true;
            }

            //Trzecia faza-wybór L2
        } else if (flagFirstClicked == true && flagSecondClicked == false && flagOperationClicked == true) {

            if (e.getSource() == one) {
                numberSecond = 1;
                numberTwoLabel.setText("L2: 1");
                flagSecondClicked = true;
                result.setBackground(Color.GREEN);
            } else if (e.getSource() == two) {
                numberSecond = 2;
                numberTwoLabel.setText("L2: 2");
                flagSecondClicked = true;
                result.setBackground(Color.GREEN);
            } else if (e.getSource() == three) {
                numberSecond = 3;
                numberTwoLabel.setText("L2: 3");
                flagSecondClicked = true;
                result.setBackground(Color.GREEN);
            } else if (e.getSource() == four) {
                numberSecond = 4;
                numberTwoLabel.setText("L2: 4");
                flagSecondClicked = true;
                result.setBackground(Color.GREEN);
            } else if (e.getSource() == five) {
                numberSecond = 5;
                numberTwoLabel.setText("L2: 5");
                flagSecondClicked = true;
                result.setBackground(Color.GREEN);
            } else if (e.getSource() == six) {
                numberSecond = 6;
                numberTwoLabel.setText("L2: 6");
                flagSecondClicked = true;
                result.setBackground(Color.GREEN);
            } else if (e.getSource() == seven) {
                numberSecond = 7;
                numberTwoLabel.setText("L2: 7");
                flagSecondClicked = true;
                result.setBackground(Color.GREEN);
            } else if (e.getSource() == eight) {
                numberSecond = 8;
                numberTwoLabel.setText("L2: 8");
                flagSecondClicked = true;
                result.setBackground(Color.GREEN);
            } else if (e.getSource() == nine) {
                numberSecond = 9;
                numberTwoLabel.setText("L2: 9");
                flagSecondClicked = true;
                result.setBackground(Color.GREEN);
            } else if (e.getSource() == zero) {
                numberSecond = 0;
                numberTwoLabel.setText("L2: 0");
                flagSecondClicked = true;
                result.setBackground(Color.GREEN);
            }

        }else if(e.getSource()== result){


            //Obliczenia
            resultLabel.setText("Wynik: "+Logic.count(numberFirst, numberSecond,operation));


            //deaktywacja po wykonaniu operacji
            //deaktywacja flag (powrót do fazy 1-wprowadzenie L1)
            flagOperationClicked=false;
            flagSecondClicked=false;
            flagFirstClicked=false;

            result.setBackground(Color.LIGHT_GRAY);

            numberOneLabel.setText("L1:");
            operationLabel.setText("O:");
            numberTwoLabel.setText("L2:");



        }

        if(e.getSource()==clear){
            //deaktywacja flag (powrót do fazy 1-wprowadzenie L1)
            flagOperationClicked=false;
            flagSecondClicked=false;
            flagFirstClicked=false;

            numberFirst =0;
            numberSecond =0;

            result.setBackground(Color.LIGHT_GRAY);

            resultLabel.setText("Wynik:");
            numberOneLabel.setText("L1:");
            operationLabel.setText("O:");
            numberTwoLabel.setText("L2:");
        }

    }

}

