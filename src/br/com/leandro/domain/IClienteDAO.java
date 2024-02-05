package br.com.leandro.domain;

import java.util.Map;

public interface IClienteDAO {

    public void CadastrandoProduto(Map<Integer, Produto> listadeprodutos);

    public void AlterandoProdutos(Map<Integer, Produto> listadeprodutos);

    public void ConsultandoProduto(Map<Integer, Produto> listadeprodutos);

    public void ExcluindoProduto(Map<Integer, Produto> listadeprodutos);

}
