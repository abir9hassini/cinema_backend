package org.sid.cinema.entities;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Ville {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Long id;
	@Column(length=25)
  private String name;
  private double longitude,latitude,altitude;
  @OneToMany(mappedBy="ville")
  private Collection<Cinema> cinemas;
}
