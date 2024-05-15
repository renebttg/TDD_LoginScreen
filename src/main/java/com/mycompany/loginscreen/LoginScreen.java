/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginscreen;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rene
 * @version 1.0
 * @since release 1.0 da aplicação
 */
public class LoginScreen {
    
    // Banco de dados dos usuários
     private Map<String, String> userDatabase; 

    /**
     * Construtor da classe LoginScreen
     * Inicializa o banco de dados com alguns usuários de exemplo.
     */
    public LoginScreen() {
        userDatabase = new HashMap<>();
        userDatabase.put("john", "password123");
        userDatabase.put("alice", "securepass");
    }

    /**
     * Verifica se um usuário pode fazer o login com as credenciais fornecidas.
     * 
     * @param username Nome do usuário.
     * @param password Senha do usuário
     * @return  true se as credenciais estiverem corretas, false se estiverem incorretas
     */
    public boolean login(String username, String password) {
        if (userDatabase.containsKey(username)) {
            String storedPassword = userDatabase.get(username);
            if (storedPassword.equals(password)) {
                return true; // Autenticação bem-sucedida
            }
        }
        return false; // Autenticação mal-sucedida
    }

    /**
     * Adiciona um novo usuário no banco de dados.
     * 
     * @param username Nome do novo usuário
     * @param password Senha do novo usuário
     */
    public void addUser(String username, String password) {
        userDatabase.put(username, password);
    }

    
    
}
