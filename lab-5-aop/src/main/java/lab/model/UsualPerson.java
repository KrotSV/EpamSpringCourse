package lab.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Entity
@ToString(exclude = "id")
@EqualsAndHashCode(exclude = "id")
public class UsualPerson implements Person {

  @Id
  @Column
  private int id;

  @Column
  private String name;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "country_id")
  private Country country;

  private int age;
  private float height;
  private boolean isProgrammer;

  private List<String> contacts;

  @Override
  public void sayHello(Person person) {

  }
}