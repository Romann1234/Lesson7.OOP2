package p1;

public class Phone {
    String number;
    String model;
    int weigth;







    public String getNumber(String number) {
            number = "89095673554";
            number = "89125463654";
            number = "89505674348";
        return number;

    }

    public void setNumber(String number) {
        this.number = number;
    }


    public Phone(String number, String model, int weigth) {
        this.number = number;
        this.model = model;
        this.weigth = weigth;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void printInfo() {
        System.out.printf("number: %s \n model: %s \n weith: %d \n--------\n", number, model, weigth);
    }

    public void receiveCall(String name) {
        name= "Ivan";
        name= "Bogdan";
        name= "Vasya";
        getNumber(number);
        if (number=="89095673554"){
            name= "Vasya";
        } else if (number=="89125463654"){
            name= "Bogdan";
        } else if (number=="89505674348"){
            name= "Ivan";}
        System.out.printf("Zvonit: %s \n", name );

    }
}