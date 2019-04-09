package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela EMPRESTIMO
 * @generated
 */
@Entity
@Table(name = "\"EMPRESTIMO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.emprestimo")
public class emprestimo implements Serializable {

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
  @Temporal(TemporalType.DATE)
  @Column(name = "data_emp", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data_emp;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data_dev_prev", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data_dev_prev;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data_dev_real", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data_dev_real;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_leitor", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private leitor leitor;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_livro", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private livro livro;

  /**
   * Construtor
   * @generated
   */
  public emprestimo(){
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
  public emprestimo setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém data_emp
   * return data_emp
   * @generated
   */
  
  public java.util.Date getData_emp(){
    return this.data_emp;
  }

  /**
   * Define data_emp
   * @param data_emp data_emp
   * @generated
   */
  public emprestimo setData_emp(java.util.Date data_emp){
    this.data_emp = data_emp;
    return this;
  }

  /**
   * Obtém data_dev_prev
   * return data_dev_prev
   * @generated
   */
  
  public java.util.Date getData_dev_prev(){
    return this.data_dev_prev;
  }

  /**
   * Define data_dev_prev
   * @param data_dev_prev data_dev_prev
   * @generated
   */
  public emprestimo setData_dev_prev(java.util.Date data_dev_prev){
    this.data_dev_prev = data_dev_prev;
    return this;
  }

  /**
   * Obtém data_dev_real
   * return data_dev_real
   * @generated
   */
  
  public java.util.Date getData_dev_real(){
    return this.data_dev_real;
  }

  /**
   * Define data_dev_real
   * @param data_dev_real data_dev_real
   * @generated
   */
  public emprestimo setData_dev_real(java.util.Date data_dev_real){
    this.data_dev_real = data_dev_real;
    return this;
  }

  /**
   * Obtém leitor
   * return leitor
   * @generated
   */
  
  public leitor getLeitor(){
    return this.leitor;
  }

  /**
   * Define leitor
   * @param leitor leitor
   * @generated
   */
  public emprestimo setLeitor(leitor leitor){
    this.leitor = leitor;
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
  public emprestimo setLivro(livro livro){
    this.livro = livro;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    emprestimo object = (emprestimo)obj;
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
