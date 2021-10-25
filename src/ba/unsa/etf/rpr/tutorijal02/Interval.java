package ba.unsa.etf.rpr.tutorijal02;

public class Interval {
    private double odakle;
    private double dokle;
    boolean prviUkljucen;
    boolean drugiUkljucen;
    boolean isNull;

    public Interval(double odakle, double dokle, boolean prviUkljucen, boolean drugiUkljucen) {
        this.odakle = odakle;
        this.dokle = dokle;
        this.prviUkljucen = prviUkljucen;
        this.drugiUkljucen = drugiUkljucen;
        this.isNull = false;
    }

    public Interval (){
        this.odakle = 0;
        this.dokle = 0;
        this.prviUkljucen = false;
        this.drugiUkljucen = false;
        this.isNull = true;
    }

    @java.lang.Override
    public java.lang.String toString() {
        if(prviUkljucen == true && drugiUkljucen==false) {
            return "[" + Double.toString(odakle) + "," + Double.toString(dokle) + ")";
        }
        if(prviUkljucen == true && drugiUkljucen == true) {
            return "[" + Double.toString(odakle) + "," + Double.toString(dokle) + "]";
        }
        if(prviUkljucen == false && drugiUkljucen == false) {
            return "(" + Double.toString(odakle) + "," + Double.toString(dokle) + ")";
        }
        else return "(" + Double.toString(odakle) + "," + Double.toString(dokle) + "]";
    }

    public boolean isIn(double v) {
        if(prviUkljucen == true && drugiUkljucen==false) {
            if(v>= odakle && v < dokle) return true;
        }
        else if(prviUkljucen == true && drugiUkljucen == true) {
            if(v>= odakle && v <= dokle) return true;
        }
        else if(prviUkljucen == false && drugiUkljucen == false) {
            if(v> odakle && v < dokle) return true;
        }
        else if(prviUkljucen == false && drugiUkljucen == true) {
            if(v> odakle && v <= dokle) return true;
        }

        return false;
    }


    public boolean isNull() {
       return this.isNull;
    }


}
