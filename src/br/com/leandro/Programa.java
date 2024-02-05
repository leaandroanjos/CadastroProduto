package br.com.leandro;

import br.com.leandro.domain.Produto;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Programa {

    public static void main(String args[]){

        Map<Integer, Produto> listadeprodutos = new TreeMap<>();
        metodoPrincipal(listadeprodutos);

    }

    private static void metodoPrincipal(Map<Integer,Produto> listadeprodutos) {

        Scanner s = new Scanner(System.in);
        System.out.println("Oque deseja fazer? ");
        System.out.println("1 - Cadastrar produto ");
        System.out.println("2 - Alterar produto ");
        System.out.println("3 - Consultar produto ");
        System.out.println("4 - Excluir Produto ");
        System.out.println("5 - Fechar Programa ");
        String entrada = s.next();

        if (!entrada.equals("1") && !entrada.equals("2") && !entrada.equals("3") && !entrada.equals("4") && !entrada.equals("5")){
            System.out.println("Entrada não identificada");
            metodoPrincipal(listadeprodutos);
        } else if (entrada.equals("1")) {
            System.out.println("Digite os dados do produto separado por vírgulas");
            System.out.println("Formato: sku,nome,valor");
            String ent = s.next();
            String[] array = new String[3];
            array = ent.split(",");
            Integer sku = Integer.valueOf(array[0]);
            String nome = array[1];
            Double preco = Double.valueOf(array[2]);

            if (listadeprodutos.containsKey(sku)){
                System.out.println("Já existe um produto com esse SKU cadastrado");
                metodoPrincipal(listadeprodutos);
            } else {
                Produto produto = new Produto(sku, nome, preco);
                listadeprodutos.put(sku, produto);
                System.out.println("Produto cadastrado!");
                metodoPrincipal(listadeprodutos);
            }

        }
        else if (entrada.equals("2")) {
            System.out.println("Digite o SKU do produto a ser alterado");
            Integer ent = s.nextInt();
            if (!listadeprodutos.containsKey(ent)){
                System.out.println("Não existe nenhum produto com esse SKU cadastrado");
                metodoPrincipal(listadeprodutos);
            } else {
                System.out.println("alterando o produto: " +listadeprodutos.get(ent));
                System.out.println("Digite os dados do produto separado por vírgulas");
                System.out.println("Formato: nome,valor");
                String ent2 = s.next();
                String[] array = new String[2];
                array = ent2.split(",");
                String nome = array[0];
                Double preco = Double.valueOf(array[1]);
                Produto produto = new Produto(ent, nome, preco);
                listadeprodutos.put(ent, produto);
                metodoPrincipal(listadeprodutos);
            }
        }
        else if (entrada.equals("3")) {

            System.out.println("Digite o SKU do produto a ser consultado");
            Integer ent = s.nextInt();
            if (!listadeprodutos.containsKey(ent)){
                System.out.println("Não existe nenhum produto com esse SKU cadastrado");
                metodoPrincipal(listadeprodutos);
            } else {
                System.out.println(listadeprodutos.get(ent));
                metodoPrincipal(listadeprodutos);
            }

        } else if (entrada.equals("4")) {
            System.out.println("Digite o SKU do produto a ser excluido");
            Integer ent = s.nextInt();
            if (!listadeprodutos.containsKey(ent)){
                System.out.println("Não existe nenhum produto com esse SKU cadastrado");
                metodoPrincipal(listadeprodutos);
            } else {
                listadeprodutos.remove(ent);
                metodoPrincipal(listadeprodutos);
            }
        }

        else if (entrada.equals("5")){
            System.out.println("Encerrando o programa");
        }


    }

}
