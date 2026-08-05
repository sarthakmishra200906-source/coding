package oops;

public class getset {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow ");
        System.out.println(p1.getColor());
        

    }
}

class Pen {
    // property + function
     private String color;
    private int tip;

    // to return the value ve use get funstion
    String getColor() {
        // this keword is used to reffer to the current object
        return this.color;
    }
    int getTip(){
       return this.tip;
    }

    // to modify the value ve use set function
    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}
