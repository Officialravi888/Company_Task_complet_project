package org.example.entity;
import lombok.*;
//import org.hibernate.annotations.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Student {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private int id;
   private String answer;
   private String question;
   private int value;
   private Date airdate;
   private Date created_at;
   private Date updated_at;
   private int category_id;
   private int game_id;
   private int invalid_count;
}
