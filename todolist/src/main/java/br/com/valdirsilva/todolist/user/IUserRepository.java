package br.com.valdirsilva.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/***
 * A interface é um modelo, representa um contrato que deve ser implementado
 * pelas classes
 */
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
  UserModel findByUsername(String username);
}
