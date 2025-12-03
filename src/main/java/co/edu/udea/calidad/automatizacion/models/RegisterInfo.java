package co.edu.udea.calidad.automatizacion.models;

public class RegisterInfo {
    private String email;
    private String password;
    private String confirmPassword;
    private String username; // opcional, si tu formulario lo pide

    public RegisterInfo(String email, String password, String confirmPassword, String username) {
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.username = username;
    }

    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getConfirmPassword() { return confirmPassword; }
    public String getUsername() { return username; }
}
