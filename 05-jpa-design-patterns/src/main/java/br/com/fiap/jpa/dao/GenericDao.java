package br.com.fiap.jpa.dao;

import br.com.fiap.jpa.exception.CommitException;
import br.com.fiap.jpa.exception.IdNotFoundException;

//T -> tipo da entidade
//K -> tipo da chave
public interface GenericDao<T,K> {

	void cadastrar(T entity);
	
	T procurar(K id) throws IdNotFoundException;
	
	void atualizar(T entity);
	
	void apagar(K id) throws IdNotFoundException;
	
	void commit() throws CommitException;
	
}