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
import java.util.ArrayList;
//Implementação do DAO usando uma lista em memória
public class ProdutoDAOImpl implements ProdutoDAO {
    private List<Produto> listaProdutos;
    
    public ProdutoDAOImpl(){
        listaProdutos = new ArrayList<>();        
    }
    
    @Override
    public List<Produto> listarProdutos(){
        return(listaProdutos);
    }
    
    @Override
    public Produto buscarProdutoPorID(int id){
        for(Produto produto : listaProdutos){
            if(produto.getId()==id){
                return(produto);
            }
        }
        return(null);
    }
    
    @Override
    public void adicionarProduto(Produto produto){
        listaProdutos.add(produto);
    }
    
    @Override
    public void atualizarProduto(Produto produto){
        for(Produto p : listaProdutos){
            if(p.getId()==produto.getId()){
                p.setNome(produto.getNome());
                p.setPreco(produto.getPreco());
                break;
            }
        }
    }
    
    @Override
    public boolean removerProduto(int id){
        for(Produto produto : listaProdutos){
            if(produto.getId()==id){
                listaProdutos.remove(produto);
                return true;
            }
        }
        return false;
    }
    
    
    
}



