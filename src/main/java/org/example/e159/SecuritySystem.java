package org.example.e159;

public class SecuritySystem {

    private void authenticate() {
        System.out.println("Authenticating with password");
    }

    private void authenticate(int otp) {
        System.out.println("Authenticating with OTP: " + otp);
    }

    public void performAuthentication() {
        authenticate();
        authenticate(123456);
    }


        public static void main(String[] args) {
            SecuritySystem securitySystem = new SecuritySystem();
            securitySystem.performAuthentication();
        }
    }