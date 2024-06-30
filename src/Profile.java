import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {

    private final String name;
    private final String email;
    private String password;
    public int passwordAttempts;
    public boolean isLocked;
    private final List<Accounts> accountsOwned;
    private static final Map<String, Profile> profiles = new HashMap<>();

    public Profile(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.accountsOwned = new ArrayList<>();
        this.passwordAttempts = 0;
        this.isLocked = false;
        profiles.put(email, this);
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public List<Accounts> getAccountsOwned() {
        return this.accountsOwned;
    }

    public static Profile login(String email, String password) {
        if (profiles.containsKey(email)) {
            if (profiles.get(email).password.equals(password)) {
                return profiles.get(email);
            }
            return null;
        }
        return null;
    }
}