/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.pp_bo_dao_2023;

/**
 *
 * @author nando
 */
import java.util.List;
//Interface DAO
public interface ProdutoDAO {
    List<Produto> listarProdutos();
    Produto buscarProdutoPorID(int id);
    void adicionarProduto(Produto produto);
    void atualizarProduto(Produto produto);
    boolean removerProduto(int id);
}
