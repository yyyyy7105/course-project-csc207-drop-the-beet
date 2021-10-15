public class Setting {

    public boolean userRegister(String username, String email, String password, UserManager userManager) {
        if (userManager.containsUser(username)) {
            System.out.println("This username has been used!");
            return false;
        }
        userManager.addNewUser(username, email, password);
        return true;
    }

    public boolean userLogIn(String inputUsername, String inputPassword, UserManager userManager) {
        if (!userManager.containsUser(inputUsername)) {
            System.out.println("This username doesn't exist! Please double check.");
            return false;
        }
        String userPassword = userManager.getUser(inputUsername).getPassword();
        return userPassword.equals(inputPassword);  // check if user's password equals input password
    }

//    public boolean userLogOff() {
//
//    }
//
//    public boolean userChangePassword(UserManager userManager) {
////        userManager.
//    }
//
//    public boolean userChangeEmail() {
//
//    }
}
