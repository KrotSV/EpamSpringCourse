package lab.dao.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AbstractJpaDao {

  protected EntityManagerFactory emf;

  public AbstractJpaDao() {
    emf = Persistence.createEntityManagerFactory("spring.lab.orm.jpa");
  }

  public void setEntityManagerFactory(EntityManagerFactory emf) {
    this.emf = emf;
  }
}