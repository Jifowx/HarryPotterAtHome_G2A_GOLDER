import java.util.random;

public class House {
    private String name;
    private float reduceDamage;
    private float buffAccuracy;
    private float buffDamage;
    private float buffPotion;


    public House(String name, float reduceDamage, float buffAccuracy, float buffDamage, float buffPotion){
        this.name=name;
        this.reduceDamage=reduceDamage;
        this.buffAccuracy=buffAccuracy;
        this.buffDamage=buffDamage;
        this.buffPotion=buffPotion;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getreduceDamage() {
        return reduceDamage;
    }
    public void setreduceDamage(float reduceDamage) {
        this.reduceDamage = reduceDamage;
    }

    public float getbuffAccuracy() {
        return buffAccuracy;
    }
    public void setbuffAccuracy(float buffAccuracy) {
        this.buffAccuracy = buffAccuracy;
    }

    public float getbuffDamage() {
        return buffDamage;
    }
    public void setbuffDamage(float BuffDamage) {
        this.buffDamage = buffDamage;
    }


    public float getbuffPotion() {
        return buffPotion;
    }
    public void setbuffPotion(float buffPotion) {
        this.buffPotion = buffPotion;
    }

}
