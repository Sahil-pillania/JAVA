package com.company;

class MainEmployee{
    private int id;
    private String name;

    public MainEmployee(){            // Constructor
        id = 0;
        name = "Your name here";
    }
    public MainEmployee(String myName, int myId){            // Constructor with arguments
        id = myId;
        name = myName;
    }
    public String getName(){     // Getter
        return name;
    }
    public void setName(String n){       //Setter
        name = n;
    }
    public void setId(int i){          //Setter
        id = i;
    }
    public int getId(){             // Getter
        return id;
    }
}
public class Constructors {
    public static void main(String[] args) {
        MainEmployee Sahil = new MainEmployee("Sahil", 12);  //constructor using arguments
        MainEmployee Sahilp = new MainEmployee();  // without arguments
         //Sahil.setName("Sahil pillania");
        System.out.println(Sahil.getName());   // called the constructor data
        System.out.println(Sahil.getId());     // called the constructor data

        System.out.println(Sahilp.getName());   // called the constructor data
        System.out.println(Sahilp.getId());     // called the constructor data
    }
}
