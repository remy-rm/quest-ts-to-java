import java.util.ArrayList;
import java.util.Date;

public class User {

    private Date birthDate;
    private int size;
    private Address address;
    private   ArrayList<Photo> photos;

public User(Date birthDate, int size, Address address, ArrayList<Photo> photos) {
        this.birthDate = birthDate;
        this.size = size;
        this.address = address;
        this.photos = photos;
    }

    public Date getBirthDate() {
        return birthDate;
    }
public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
public int getSize() {
        return size;
    }
public void setSize(int size) {
        this.size = size;
    }
public Address getAddress() {
        return address;
    }
public void setAddress(Address address) {
        this.address = address;
    }
public ArrayList<Photo> getPhotos() {
        return photos;
    }
public void setPhotos(ArrayList<Photo> photos) {
        this.photos = photos;
    }
}
