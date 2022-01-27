package br.ueg.modelo.application.repository;

import br.ueg.modelo.application.model.Amigo;
import br.ueg.modelo.application.model.Cases;
import br.ueg.modelo.application.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Classe de persistência referente a entidade {@link Usuario}.
 *
 * @author UEG
 */
@Repository
public interface CasesRepository extends JpaRepository<Cases, Long>{

}
