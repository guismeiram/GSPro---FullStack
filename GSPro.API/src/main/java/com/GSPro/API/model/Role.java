package com.GSPro.API.model;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(length = 20)
  private PerfilEnum perfilEnum;

  public Role() {

}

  public PerfilEnum getPerfilEnum() {
    return perfilEnum;
}

public void setPerfilEnum(PerfilEnum perfilEnum) {
    this.perfilEnum = perfilEnum;
}


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
