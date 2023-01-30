package com.arens.tareas;

import java.security.SecureRandom;

class Main
{
    // Método para generar una contraseña alfanumérica aleatoria de una longitud específica
    public static String generateRandomPassword(int len)
    {
        // Rango ASCII – alfanumérico (0-9, a-z, A-Z)
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
 
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        // cada iteración del bucle elige aleatoriamente un carácter del dado
        // rango ASCII y lo agrega a la instancia `StringBuilder`
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
    }
 
    public static void main(String[] args)
    {
        int len = 10;
        System.out.println(generateRandomPassword(len));
    }
}