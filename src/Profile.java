public class Profile {
    
    private String name;
    private String email;
    private String password;
    private List<Accounts> accountsOwned;

    public Profile(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.accountsOwned = new ArrayList<>();
    }
}
