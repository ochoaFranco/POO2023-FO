package TP_1.password_ejerc08;
import java.util.Random;
public class Password {
    private String password;
    private int longitud = 8;
    private String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private boolean fuerte;
    public Password(int longitud) {
        this.longitud = longitud;
        generar();
        this.fuerte = esFuerte();
    }

    public Password() {
        generar();
        this.fuerte = esFuerte();
    }

    private void generar() {
        StringBuilder randomPassword = new StringBuilder(longitud); // genero la password.
        Random random = new Random();
        for (int i = 0; i < longitud; i++) {
            int randomIndex = random.nextInt(caracteres.length()); // obtengo un indice random.
            char randomChar = caracteres.charAt(randomIndex); // agarro un caracter en el indice random.
            randomPassword.append(randomChar);
        }
        password = randomPassword.toString();
    }

    public boolean isFuerte() {
        return fuerte;
    }

    public String getPassword() {
        return password;
    }

    public int getLongitud() {
        return longitud;
    }

    private boolean esFuerte() {
        int cantMayus = 0;
        int cantMinus = 0;
        int cantDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                cantMayus++;
            }
            if (Character.isLowerCase(ch)) {
                cantMinus++;
            }
            if (Character.isDigit(ch)) {
                cantDigits++;
            }
        }
        if (cantMayus >= 2 && cantMinus >= 1 && cantDigits >= 2) {
            fuerte = true;
            return true;
        }
        fuerte = false;
        return false;
    }
    public void regenerar() {
        while (!esFuerte()) {
            generar();
        }
    }
}
