import java.text.SimpleDateFormat;
import java.util.Date;


class Administrator extends Pegawai implements Login {
    public Administrator(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean authenticate(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    @Override
    public void displayLoginMessage() {
        System.out.println("\nSelamat datang, " + getUsername() + "!");
        displayCurrentDateTime();
    }

    private void displayCurrentDateTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String currentDateAndTime = dateFormat.format(new Date());
        System.out.println("\nLogin pada: " + currentDateAndTime);
    }
}