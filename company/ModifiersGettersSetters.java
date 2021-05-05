package com.company;

class MyEmployee{
    private int id;
    private String name;

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
public class ModifiersGettersSetters {
    public static void main(String[] args) {
        MyEmployee Sahil = new MyEmployee();
        // Sahil.id = 55; --> throws an error cause of private access modifier
        Sahil.setName("Sahil pillania");
        System.out.println(Sahil.getName());

        Sahil.setId(455);
        System.out.println(Sahil.getId());
    }
}
