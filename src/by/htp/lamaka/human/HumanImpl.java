package by.htp.lamaka.human;

import by.htp.lamaka.human.jacket.Jacket;
import by.htp.lamaka.human.pants.Pants;
import by.htp.lamaka.human.shoes.Shoe;

public class HumanImpl implements Human {
    private String name;
    private Jacket jacket;
    private Pants pants;
    private Shoe shoe;

    public HumanImpl() {

    }

    public HumanImpl(String name, Jacket jacket, Pants pants, Shoe shoe) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoe = shoe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    @Override
    public void getDressed() {
        jacket.putOn();
        pants.putOn();
        shoe.putOn();
    }

    @Override
    public void undressed() {
        jacket.putOff();
        pants.putOff();
        shoe.putOff();
    }
}
