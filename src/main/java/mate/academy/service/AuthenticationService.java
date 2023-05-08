package mate.academy.service;

import mate.academy.model.User;

public class AuthenticationService {

    /**
     * Imagine that some user wants to login to your site.
     * You should check if user credentials (login and password) are valid or not.
     * All users are stored in <code>UserService</code> class.
     *
     * @param email    - user's email
     * @param password - user's password
     * @return true if user by email exists and passed password is equal to user's password.
     * Return false in any other cases.
     */
    public boolean login(String email, String password) {

        User[] users = UserService.getUser();

        if (email == null || password == null) {
            return false;
        }

        for (User user : users) {
            String userEmail = user.getEmail();
            String userPassword = user.getPassword();
            if (email.equals(userEmail) && password.equals(userPassword)) {
                return true;
            }
        }
        return false;
    }
}
