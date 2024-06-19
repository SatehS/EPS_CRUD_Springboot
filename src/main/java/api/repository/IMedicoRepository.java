package api.repository;


import api.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IMedicoRepository extends JpaRepository<Medico, Long> {
}
