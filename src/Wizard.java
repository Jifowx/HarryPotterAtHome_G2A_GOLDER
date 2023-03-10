import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Wizard extends Character{
    private Pet pet;
    private Wand wand;
    private House house;
    private List<Spell> knownSpells;
    private List<Potion> potions;

    public Wizard(String name, Pet pet, Wand wand, House house, List<Spell> knownSpells, List<Potion> potions){
        super(name, 1000);
        this.pet=pet;
        this.wand=wand;
        this.house=house;
        this.knownSpells=new ArrayList<Spell>();
        this.potions=new ArrayList<Potion>();
    }

    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }


    public Wand getWand() {
        return wand;
    }
    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public House getHouse() {
        return house;
    }
    public void setHouse(House house) {
        this.house = house;
    }

    public List<Spell> getKnownSpells() {
        return knownSpells;
    }
    public void setKnownSpells(Spell knownSpells) {
        this.knownSpells = knownSpells;
    }

    public List<Potion> getPotion() {
        return potions;
    }







}