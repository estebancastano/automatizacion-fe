package co.edu.udea.calidad.automatizacion.models;

public class UserData {

    private String email;
    private String password;
    private String name;
    private int age;
    private String location;
    private String interests;
    private String photo;
    private String bio;

    public UserData(String email, String password, String name, int age,
                    String location, String interests, String photo, String bio) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.age = age;
        this.location = location;
        this.interests = interests;
        this.photo = photo;
        this.bio = bio;
    }

    // Getters
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getLocation() { return location; }
    public String getInterests() { return interests; }
    public String getPhoto() { return photo; }
    public String getBio() { return bio; }

    // Setters (opcional, si quieres modificar los datos después)
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password = password; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setLocation(String location) { this.location = location; }
    public void setInterests(String interests) { this.interests = interests; }
    public void setPhoto(String photo) { this.photo = photo; }
    public void setBio(String bio) { this.bio = bio; }
}
