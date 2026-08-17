/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.biblioteca;

import java.util.ArrayList;
import java.util.Map;



/**
 *
 * @author Aluno
 */
public class Biblioteca {

    private ArrayList<Livro> livros = new ArrayList<>();
    
    public void adicionarLivro(Livro livro){
        livros.add(livro);
        System.out.println(" \n Livro adicionado com sucesso!");        
    }
    
    public void listarLivros(Livro livro){
        for (Livro lLivro : livros ){
            lLivro.descricao();
        }
      
    }
    
}
