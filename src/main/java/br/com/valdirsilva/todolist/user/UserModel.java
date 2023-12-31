package br.com.valdirsilva.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {
  // Informa que esse id será chave primária
  @Id
  @GeneratedValue(generator = "UUID") // Delega a geração do ID automatico
  private UUID id;

  @Column(unique = true)
  private String username;
  private String name;
  private String password;

  private LocalDateTime createdAt;

}
