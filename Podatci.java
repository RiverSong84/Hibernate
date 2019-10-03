package persistence;
// Generated Jun 10, 2019 7:54:26 AM by Hibernate Tools 4.3.1


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Podatci generated by hbm2java
 */
@Entity
@Table(name="podatci"
    ,catalog="zaposleni"
)
public class Podatci  implements java.io.Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)

     private int id;
@Column(name="name", nullable=false, length=45)
     private String name;
@Column(name="age", nullable=false)
     private int age;
@Column(name="adress", nullable=false, length=45)
     private String adress;
@Column(name="sallary", nullable=false)
     private int sallary;

    public Podatci() {
    }

    public Podatci(String name, int age, String adress, int sallary) {
       this.name = name;
       this.age = age;
       this.adress = adress;
       this.sallary = sallary;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    
    public String getAdress() {
        return this.adress;
    }
    
    public void setAdress(String adress) {
        String oldAdress = this.adress;
        this.adress = adress;
        changeSupport.firePropertyChange("adress", oldAdress, adress);
    }

    
    public int getSallary() {
        return this.sallary;
    }
    
    public void setSallary(int sallary) {
        int oldSallary = this.sallary;
        this.sallary = sallary;
        changeSupport.firePropertyChange("sallary", oldSallary, sallary);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

@Override
public String toString(){

return "ID:" + this.id +"\n"+ "Name:" + this.name+ "\n"+ "Age:" + this.age + "\n"+ "Adress:" + this.adress+ "\n"+ "Sallary:" + this.sallary;

}


}


