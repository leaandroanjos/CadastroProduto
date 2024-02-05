package br.com.leandro;

import br.com.leandro.domain.Metodos;
import br.com.leandro.domain.Produto;

import java.util.Map;
import java.util.TreeMap;
import javax.swing.*;

public class App {

    public static void main(String args[]){

        Map<Integer, Produto> listadeprodutos = new TreeMap<>();
        metodoPrincipal(listadeprodutos);

    }

    public static void metodoPrincipal(Map<Integer,Produto> listadeprodutos) {

        String entrada = JOptionPane.showInputDialog(null,
                "Oque deseja fazer? Digite 1 para cadastrar novo produto,2 para alterar  um produto,3 para consultar um produto, 4 para excluir um produto e 5 para encerrar a aplicação",
                "Menu Principal", JOptionPane.INFORMATION_MESSAGE);

        if (!entrada.equals("1") && !entrada.equals("2") && !entrada.equals("3") && !entrada.equals("4") && !entrada.equals("5")){
            JOptionPane.showMessageDialog(null,"Entrada inválida", "Erro",JOptionPane.ERROR_MESSAGE);
            metodoPrincipal(listadeprodutos);
        } else if (entrada.equals("1")) {
            Metodos.CadastrandoProduto(listadeprodutos);
        }
        else if (entrada.equals("2")) {
            Metodos.AlterandoProdutos(listadeprodutos);
        }
        else if (entrada.equals("3")) {

            Metodos.ConsultandoProduto(listadeprodutos);

        } else if (entrada.equals("4")) {
            Metodos.ExcluindoProduto(listadeprodutos);
        }

        else if (entrada.equals("5")){
            JOptionPane.showMessageDialog(null, "Encerrando o Programa", "Fechando Programa", JOptionPane.INFORMATION_MESSAGE);
        }


    }

}
