package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("emprestimoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface emprestimoDAO extends JpaRepository<emprestimo, java.lang.String> {

  /**
   * Obtém a instância de emprestimo utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM emprestimo entity WHERE entity.id = :id")
  public emprestimo findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de emprestimo utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM emprestimo entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key leitor
   * @generated
   */
  @Query("SELECT entity FROM emprestimo entity WHERE entity.leitor.id = :id")
  public Page<emprestimo> findemprestimosByLeitor(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key livro
   * @generated
   */
  @Query("SELECT entity FROM emprestimo entity WHERE entity.livro.id = :id")
  public Page<emprestimo> findemprestimosByLivro(@Param(value="id") java.lang.String id, Pageable pageable);

}
