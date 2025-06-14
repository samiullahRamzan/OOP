public class User {
    private int id;
    private String name;
    private boolean status;

    public User(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public User(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Override equals to compare based on 'id'
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference, no need to compare further
        if (obj == null || getClass() != obj.getClass()) return false; // Check for null or different types
        User user = (User) obj; // Cast the object to a User
        return id == user.id; // Compare by id
    }


}
