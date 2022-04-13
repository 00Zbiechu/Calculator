package app;


public class Logic {


    public static float count(int l1, int l2, String operation){

        float wynik=0;

        switch (operation){

            case "add":
                wynik=l1+l2;
            break;

            case "sub":
                wynik=l1-l2;
            break;

            case "multi":
                wynik=(float)l1*l2;
            break;

            case "div":
                try{
                    wynik=(float)l1/l2;
                }catch(Exception e){
                    wynik=404;
                }

            break;

            case "pow":
                wynik = (float) Math.pow(l1,l2);
            break;


        }

        return wynik;
    }




}
