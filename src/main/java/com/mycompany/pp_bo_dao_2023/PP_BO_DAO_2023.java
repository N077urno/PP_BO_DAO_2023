/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pp_bo_dao_2023;

/**
 *
 * @author nando
 */
import java.util.List;
import javax.swing.JOptionPane;
public class PP_BO_DAO_2023 {

    public static void main(String[] args) {
        int idBusca;
        String s;
                
        ProdutoDAO produtoDAO = new ProdutoDAOImpl();
        
        // Cria um BO
        ProdutoBO produtoBO = new ProdutoBO(new ProdutoDAOImpl());
          
        List<Produto> produtos = produtoBO.listarProdutos();
               
        
        for(int i=0; i<5;i++){
           Produto product = new Produto(); 
           s=JOptionPane.showInputDialog("Entre com o nome do produto");
           product.setNome(s);           
           s=JOptionPane.showInputDialog("Entre com o valor do ID do produto");
           product.setId(Integer.parseInt(s));           
           s=JOptionPane.showInputDialog("Entre com o valor do produto");
           product.setPreco(Float.parseFloat(s));
           
           produtoBO.adicionarProduto(product);
        }
        
        System.out.println("Produtos:");
        for(Produto produto:produtos){
            System.out.println(produto.getId()+" - "+produto.getNome()+" - R$ "+produto.getPreco());
        }
        
        s=JOptionPane.showInputDialog("Entre com um codigo de busca");
        idBusca = Integer.parseInt(s);
        
        Produto produtoBusca = produtoBO.buscarProdutoPorId(idBusca);
        
        if(produtoBusca != null){
            System.out.println("Produto Encontrado: "+produtoBusca.getNome()+ "Preco: R$ "+produtoBusca.getPreco());
        }else
            System.out.println("Produto Encontrado Nao Encontrado");
        
        JOptionPane.showMessageDialog(null,"Adicionar um novo Produto");
        
        Produto product = new Produto(); 
        s=JOptionPane.showInputDialog("Entre com o nome do produto");
        product.setNome(s);           
        s=JOptionPane.showInputDialog("Entre com o valor do ID do produto");
        product.setId(Integer.parseInt(s));           
        s=JOptionPane.showInputDialog("Entre com o valor do produto");
        product.setPreco(Float.parseFloat(s));
           
        produtoBO.adicionarProduto(product);
        
        System.out.println("Produtos:");
        for(Produto produto:produtos){
            System.out.println(produto.getId()+" - "+produto.getNome()+" - R$ "+produto.getPreco());
        }
        
        s=JOptionPane.showInputDialog("Entre com a ID a ser Atualizada");
        
        idBusca = Integer.parseInt(s);
                
        Produto produtoAtualizar = produtoBO.buscarProdutoPorId(idBusca);
        if(produtoAtualizar != null){
            s=JOptionPane.showInputDialog("Entre com o novo nome do produto");
            produtoAtualizar.setNome(s);
            s=JOptionPane.showInputDialog("Entre com o novo Valor do produto");
            produtoAtualizar.setPreco(Float.parseFloat(s));
            produtoBO.atualizarProduto(produtoAtualizar);
            System.out.println("Produto Atualizado com Sucesso");
        }else {
            System.out.println("Produto não encontrado!!!!");
        }
        
        System.out.println("Produtos:");
        for(Produto produto:produtos){
            System.out.println(produto.getId()+" - "+produto.getNome()+" - R$ "+produto.getPreco());
        }
        
        s=JOptionPane.showInputDialog("Entre com a ID do produto a ser removido");
        
        idBusca = Integer.parseInt(s);
        
        if(produtoBO.removerProduto(idBusca))
            System.out.println("Produto removido com sucesso.");
        else
            System.out.println("Falha ao remover produto");
        
        for(Produto produto:produtos){
            System.out.println(produto.getId()+" - "+produto.getNome()+" - R$ "+produto.getPreco());
        }
        
        
    }
}
