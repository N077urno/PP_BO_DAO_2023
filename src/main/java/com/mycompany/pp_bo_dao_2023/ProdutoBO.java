/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_bo_dao_2023;

/**
 *
 * @author nando
 */
import java.util.List;
//Classe ProdutoBO
public class ProdutoBO {
    private ProdutoDAO produtoDAO;
    
    public ProdutoBO(ProdutoDAO produtoDAO){
        this.produtoDAO = produtoDAO;
    }
    
    public List<Produto> listarProdutos(){
        return(produtoDAO.listarProdutos());
    }
    
    public Produto buscarProdutoPorId(int id){
        return(produtoDAO.buscarProdutoPorID(id));
    }
    
    public void adicionarProduto(Produto produto){
        produtoDAO.adicionarProduto(produto);
    }
    
    public void atualizarProduto(Produto produto){
        produtoDAO.atualizarProduto(produto);
    }
    
    public boolean removerProduto(int id){
        if(produtoDAO.removerProduto(id))
            return true;
        else
            return false;
    }
}
