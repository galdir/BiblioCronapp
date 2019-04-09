package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela LIVROAUTOR
 * @generated
 */
@Entity
@Table(name = "\"LIVROAUTOR\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.livroautor")
public class livroautor implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_livro", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private livro livro;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_autor", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private autor autor;

  /**
   * Construtor
   * @generated
   */
  public livroautor(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public livroautor setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém livro
   * return livro
   * @generated
   */
  
  public livro getLivro(){
    return this.livro;
  }

  /**
   * Define livro
   * @param livro livro
   * @generated
   */
  public livroautor setLivro(livro livro){
    this.livro = livro;
    return this;
  }

  /**
   * Obtém autor
   * return autor
   * @generated
   */
  
  public autor getAutor(){
    return this.autor;
  }

  /**
   * Define autor
   * @param autor autor
   * @generated
   */
  public livroautor setAutor(autor autor){
    this.autor = autor;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    livroautor object = (livroautor)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
