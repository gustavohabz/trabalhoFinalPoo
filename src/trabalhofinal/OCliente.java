/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ocliente.JanelaPrincipal;
import trabalhofinal.TelaLogin;

/**
 *
 * @author old_adam
 */
public class OCliente {
    /**
     * Ponto de entrada da execucao do app.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelaLogin tela;
        tela = new TelaLogin();
        
        tela.setVisible(true);
        
        JanelaPrincipal janela;
        janela = new JanelaPrincipal();
        
        janela.setVisible(true);
        
    }
    
}
