package br.com.leandro.domain;

import br.com.leandro.App;

import javax.swing.*;
import java.util.Map;

public class Metodos {
    public static void CadastrandoProduto(Map<Integer, Produto> listadeprodutos){
        String ent = JOptionPane.showInputDialog(null,
                "Digite os dados do produto separado por vírgulas, Formato: sku,nome,valor",
                "Cadastro de produto", JOptionPane.INFORMATION_MESSAGE);
        String[] array = new String[3];
        array = ent.split(",");
        Integer sku = Integer.valueOf(array[0]);
        String nome = array[1];
        Double preco = Double.valueOf(array[2]);

        if (listadeprodutos.containsKey(sku)){
            JOptionPane.showMessageDialog(null,"Já existe um produto cadastrado com esse SKU", "Erro",JOptionPane.ERROR_MESSAGE);
            App.metodoPrincipal(listadeprodutos);
        } else {
            Produto produto = new Produto(sku, nome, preco);
            listadeprodutos.put(sku, produto);
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!", "Produto Cadastrado", JOptionPane.INFORMATION_MESSAGE);
            App.metodoPrincipal(listadeprodutos);
        }
    }

    public static void AlterandoProdutos(Map<Integer, Produto> listadeprodutos){
        String ent = JOptionPane.showInputDialog(null,
                "Digite o sku do produto a ser alterado",
                "Alteração de produto", JOptionPane.INFORMATION_MESSAGE);
        if (!listadeprodutos.containsKey(Integer.valueOf(ent))){
            JOptionPane.showMessageDialog(null,"Não existe nenhum produto com esse SKU cadastrado", "Erro",JOptionPane.ERROR_MESSAGE);
            App.metodoPrincipal(listadeprodutos);
        } else {
            String ent2 = JOptionPane.showInputDialog(null,
                    "Produto a ser alterado: "+ listadeprodutos.get(Integer.valueOf(ent)) +" Digite os dados do produto separado por vírgulas, Formato: Nome,valor",
                    "Cadastro de produto", JOptionPane.INFORMATION_MESSAGE);
            String[] array = new String[2];
            array = ent2.split(",");
            String nome = array[0];
            Double preco = Double.valueOf(array[1]);
            Produto produto = new Produto(Integer.valueOf(ent), nome, preco);
            listadeprodutos.put(Integer.valueOf(ent), produto);
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!", "Produto Alterado", JOptionPane.INFORMATION_MESSAGE);
            App.metodoPrincipal(listadeprodutos);
        }
    }


    public static void ConsultandoProduto(Map<Integer, Produto> listadeprodutos) {
        String ent = JOptionPane.showInputDialog(null,
                "Digite o sku do produto a ser consultado",
                "Consultando Produto", JOptionPane.INFORMATION_MESSAGE);
        if (!listadeprodutos.containsKey(Integer.valueOf(ent))){
            JOptionPane.showMessageDialog(null,"Não existe nenhum produto com esse SKU cadastrado", "Erro",JOptionPane.ERROR_MESSAGE);
            App.metodoPrincipal(listadeprodutos);
        } else {
            JOptionPane.showMessageDialog(null, "O produto é: " + listadeprodutos.get(Integer.valueOf(ent)), "Consultando Produto", JOptionPane.INFORMATION_MESSAGE);
            App.metodoPrincipal(listadeprodutos);
        }
    }

    public static void ExcluindoProduto(Map<Integer, Produto> listadeprodutos) {
        String ent = JOptionPane.showInputDialog(null,
                "Digite o sku do produto a ser excluído",
                "Encluindo Produto", JOptionPane.INFORMATION_MESSAGE);
        if (!listadeprodutos.containsKey(Integer.valueOf(ent))){
            JOptionPane.showMessageDialog(null,"Não existe nenhum produto com esse SKU cadastrado", "Erro",JOptionPane.ERROR_MESSAGE);
            App.metodoPrincipal(listadeprodutos);
        } else {
            listadeprodutos.remove(Integer.valueOf(ent));
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!", "Produto excluído", JOptionPane.INFORMATION_MESSAGE);
            App.metodoPrincipal(listadeprodutos);
        }
    }
}
