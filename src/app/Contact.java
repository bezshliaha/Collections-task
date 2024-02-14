package app;

public class Contact {

    private final String name;
    private final String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + ", e-mail: " + email;
    }

}
