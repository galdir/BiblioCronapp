package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela LIVRO
 * @generated
 */
@Entity
@Table(name = "\"LIVRO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.livro")
public class livro implements Serializable {

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
  @Column(name = "titulo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String titulo;

  /**
  * @generated
  */
  @Column(name = "tipo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String tipo;

  /**
  * @generated
  */
  @Column(name = "edicao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String edicao;

  /**
  * @generated
  */
  @Column(name = "editora", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String editora;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_categoria", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private categoria categoria;

  /**
   * Construtor
   * @generated
   */
  public livro(){
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
  public livro setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém titulo
   * return titulo
   * @generated
   */
  
  public java.lang.String getTitulo(){
    return this.titulo;
  }

  /**
   * Define titulo
   * @param titulo titulo
   * @generated
   */
  public livro setTitulo(java.lang.String titulo){
    this.titulo = titulo;
    return this;
  }

  /**
   * Obtém tipo
   * return tipo
   * @generated
   */
  
  public java.lang.String getTipo(){
    return this.tipo;
  }

  /**
   * Define tipo
   * @param tipo tipo
   * @generated
   */
  public livro setTipo(java.lang.String tipo){
    this.tipo = tipo;
    return this;
  }

  /**
   * Obtém edicao
   * return edicao
   * @generated
   */
  
  public java.lang.String getEdicao(){
    return this.edicao;
  }

  /**
   * Define edicao
   * @param edicao edicao
   * @generated
   */
  public livro setEdicao(java.lang.String edicao){
    this.edicao = edicao;
    return this;
  }

  /**
   * Obtém editora
   * return editora
   * @generated
   */
  
  public java.lang.String getEditora(){
    return this.editora;
  }

  /**
   * Define editora
   * @param editora editora
   * @generated
   */
  public livro setEditora(java.lang.String editora){
    this.editora = editora;
    return this;
  }

  /**
   * Obtém categoria
   * return categoria
   * @generated
   */
  
  public categoria getCategoria(){
    return this.categoria;
  }

  /**
   * Define categoria
   * @param categoria categoria
   * @generated
   */
  public livro setCategoria(categoria categoria){
    this.categoria = categoria;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    livro object = (livro)obj;
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
