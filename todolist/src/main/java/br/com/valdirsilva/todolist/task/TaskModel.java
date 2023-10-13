package br.com.valdirsilva.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {
  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;
  private UUID idUser;

  @Column(length = 50)
  private String title;
  private String description;
  private LocalDateTime startAt;
  private LocalDateTime endAt;
  private String priority;

  private LocalDateTime createdAt;

  // Throws Exception repassa para quem vai usar fazer a tratativa
  public void setTitle(String title) throws Exception {
    if (title.length() > 50) {
      throw new Exception("O campo title deve conter no máximo 50 caracteres");
    }

    this.title = title;
  }
}
