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
@Repository("livroDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface livroDAO extends JpaRepository<livro, java.lang.String> {

  /**
   * Obtém a instância de livro utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM livro entity WHERE entity.id = :id")
  public livro findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de livro utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM livro entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM emprestimo entity WHERE entity.livro.id = :id")
  public Page<emprestimo> findEmprestimo(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM livroautor entity WHERE entity.livro.id = :id")
  public Page<livroautor> findLivroautor(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.leitor FROM emprestimo entity WHERE entity.livro.id = :id")
  public Page<leitor> listLeitor(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM emprestimo entity WHERE entity.livro.id = :instanceId AND entity.leitor.id = :relationId")
  public int deleteLeitor(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.autor FROM livroautor entity WHERE entity.livro.id = :id")
  public Page<autor> listAutor(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM livroautor entity WHERE entity.livro.id = :instanceId AND entity.autor.id = :relationId")
  public int deleteAutor(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key categoria
   * @generated
   */
  @Query("SELECT entity FROM livro entity WHERE entity.categoria.id = :id")
  public Page<livro> findlivrosByCategoria(@Param(value="id") java.lang.String id, Pageable pageable);

}
