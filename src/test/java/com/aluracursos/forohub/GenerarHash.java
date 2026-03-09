package com.aluracursos.forohub;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GenerarHash {
    public static void main(String[] args) {
        var encoder = new BCryptPasswordEncoder();
        System.out.println("Nuevo HASH: "+encoder.encode("123456"));
    }
}
