/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_bo_dao_2023;

/**
 *
 * @author nando
 */

//Classe BO
public class Produto {
    private int id;
    private String nome;
    private float preco;
    
    int getId(){
        return(id);
    }
    
    String getNome(){
        return(nome);
    }
    
    float getPreco(){
        return(preco);
    }
    
    void setId(int id){
        this.id = id;
    }
    
    void setNome(String nome){
        this.nome = nome;
    }
    
    void setPreco(float preco){
        this.preco = preco;
    }
}
